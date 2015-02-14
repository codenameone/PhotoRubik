package com.mycompany.myapp;

import com.codename1.util.MathUtil;
import java.util.ArrayList;
import java.util.Comparator;

public class Color {

  public double original_L, original_A, original_B;
  public int current_L, current_A, current_B;
  public int argb = 0;

  private static final double ref_X = 95.047d;
  private static final double ref_Y = 100.000d;
  private static final double ref_Z = 108.883d;
  private static final double epsilon = 0.008856d; // Intent is 216/24389
  private static final double kappa = 903.3d; // Intent is 24389/27

  public Color(int color) {
    lab_conversion(color);
  }

  public Color(Color color) {
    this.original_L = color.original_L;
    this.original_A = color.original_A;
    this.original_B = color.original_B;
    this.current_L = color.current_L;
    this.current_A = color.current_A;
    this.current_B = color.current_B;
  }

  public Color(int r, int g, int b) {
    int color = (r << 16) | (g << 8) | b;
    lab_conversion(color);
  }

  public Color(double l, double a, double b) {
    this.original_L = l;
    this.original_A = a;
    this.original_B = b;
    this.current_L = (int) this.original_L;
    this.current_A = (int) this.original_A;
    this.current_B = (int) this.original_B;
  }

  private void lab_conversion(int color) {
    int red = (color >> 16) & 0xFF;
    int green = (color >> 8) & 0xFF;
    int blue = color & 0xFF;

    double var_r = pivot_rgb(red / 255d);
    double var_g = pivot_rgb(green / 255d);
    double var_b = pivot_rgb(blue / 255d);

    double x = var_r * 0.4124d + var_g * 0.3576d + var_b * 0.1805d;
    double y = var_r * 0.2126d + var_g * 0.7152d + var_b * 0.0722d;
    double z = var_r * 0.0193d + var_g * 0.1192d + var_b * 0.9505d;

    double double_X = x / ref_X;
    double double_Y = y / ref_Y;
    double double_Z = z / ref_Z;

    if (double_X > 0.008856d) {
      double_X = MathUtil.pow(double_X, (1d / 3d));
    }
    else {
      double_X = (7.787d * double_X) + (16d / 116d);
    }
    if (double_Y > 0.008856d) {
      double_Y = MathUtil.pow(double_Y, (1d / 3d));
    }
    else {
      double_Y = (7.787d * double_Y) + (16d / 116d);
    }
    if (double_Z > 0.008856d) {
      double_Z = MathUtil.pow(double_Z, (1d / 3d));
    }
    else {
      double_Z = (7.787d * double_Z) + (16d / 116d);
    }

    this.original_L = ((116d * double_Y) - 16d);
    this.original_A = (500d * (double_X - double_Y));
    this.original_B = (200d * (double_Y - double_Z));
    this.current_L = (int) this.original_L;
    this.current_A = (int) this.original_A;
    this.current_B = (int) this.original_B;
  }

  public void create_ARGB() {
    double var_y = (this.current_L + 16d) / 116d;
    double var_x = this.current_A / 500d + var_y;
    double var_z = var_y - this.current_B / 200d;
    double x3 = var_x * var_x * var_x;
    double z3 = var_z * var_z * var_z;

    double x = ref_X * (x3 > epsilon ? x3 : (var_x - 16d / 116d) / 7.787d);
    double y = ref_Y * (this.current_L > (kappa * epsilon) ? MathUtil.pow(((this.current_L + 16d) / 116d), 3d) : this.current_L / kappa);
    double z = ref_Z * (z3 > epsilon ? z3 : (var_z - 16d / 116d) / 7.787d);

    x /= 100d;
    y /= 100d;
    z /= 100d;

    double var_r = x * 3.2406d + y * -1.5372d + z * -0.4986d;
    double var_g = x * -0.9689d + y * 1.8758d + z * 0.0415d;
    double var_b = x * 0.0557d + y * -0.2040d + z * 1.0570d;
    var_r = var_r > 0.0031308d ? 1.055d * MathUtil.pow(var_r, 1d / 2.4d) - 0.055d : 12.92d * var_r;
    var_g = var_g > 0.0031308d ? 1.055d * MathUtil.pow(var_g, 1d / 2.4d) - 0.055d : 12.92d * var_g;
    var_b = var_b > 0.0031308d ? 1.055d * MathUtil.pow(var_b, 1d / 2.4d) - 0.055d : 12.92d * var_b;

    int red = (int) Math.round(fix_rgb(var_r));
    int green = (int) Math.round(fix_rgb(var_g));
    int blue = (int) Math.round(fix_rgb(var_b));
    this.argb = (int) (0xFF000000 | (red << 16) | (green << 8) | blue);
  }

  private static double fix_rgb(double value) {
    double result = 255d * value;
    if (result < 0d) {
      return 0d;
    }
    if (result > 255d) {
      return 255d;
    }
    return result;
  }

  private static double pivot_rgb(double value) {
    return (value > 0.04045d ? MathUtil.pow((value + 0.055d) / 1.055d, 2.4d) : value / 12.92d) * 100d;
  }

  public Color closest_for(ColorScheme color_scheme) {
    double max_delta = Defaults.MAX_DELTA;
    Color closest_color = null;
    for (Color color : color_scheme.colors) {
      double delta = cie_de_2000(color);
      if (delta < max_delta) {
        max_delta = delta;
        closest_color = color;
      }
    }
    return closest_color;
  }

  public Color closest_for(ArrayList<Color> colors) {
    double max_delta = Defaults.MAX_DELTA;
    Color closest_color = null;
    for (Color color : colors) {
      double delta = cie_de_2000(color);
      if (delta < max_delta) {
        max_delta = delta;
        closest_color = color;
      }
    }
    return closest_color;
  }

  public double cie_de_1976(Color color) {
    double deltaL = MathUtil.pow(this.current_L - color.current_L, 2d);
    double delataA = MathUtil.pow(this.current_A - color.current_A, 2d);
    double deltaB = MathUtil.pow(this.current_B - color.current_B, 2d);
    return (deltaL + delataA + deltaB);
  }

  public double cie_de_1994(Color color) {
    final double sl = 1d;
    final double kc = 1d;
    final double kh = 1d;
    final double Kl = 1d;
    final double K1 = 0.045d;
    final double K2 = 0.015d;
    double deltaL = this.current_L - color.current_L;
    double deltaA = this.current_A - color.current_A;
    double deltaB = this.current_B - color.current_B;
    double c1 = Math.sqrt(this.current_A * this.current_A + this.current_B * this.current_B);
    double c2 = Math.sqrt(color.current_A * color.current_A + color.current_B * color.current_B);
    double deltaC = c1 - c2;
    double deltaH = deltaA * deltaA + deltaB * deltaB - deltaC * deltaC;
    deltaH = deltaH < 0d ? 0d : Math.sqrt(deltaH);
    double sc = 1d + K1 * c1;
    double sh = 1d + K2 * c1;
    double deltaLKlsl = deltaL / (Kl * sl);
    double deltaCkcsc = deltaC / (kc * sc);
    double deltaHkhsh = deltaH / (kh * sh);
    double i = deltaLKlsl * deltaLKlsl + deltaCkcsc * deltaCkcsc + deltaHkhsh * deltaHkhsh;
    return i < 0d ? 0d : Math.sqrt(i);
  }

  public double cie_de_2000(Color color) {
    //Set weighting factors to 1
    final double k_L = 1d;
    final double k_C = 1d;
    final double k_H = 1d;
    //Calculate Cprime1, Cprime2, Cabbar
    double c_star_1_ab = Math.sqrt(this.current_A * this.current_A + this.current_B * this.current_B);
    double c_star_2_ab = Math.sqrt(color.current_A * color.current_A + color.current_B * color.current_B);
    double c_star_average_ab = (c_star_1_ab + c_star_2_ab) / 2d;
    double c_star_average_ab_pot7 = c_star_average_ab * c_star_average_ab * c_star_average_ab;
    c_star_average_ab_pot7 *= c_star_average_ab_pot7 * c_star_average_ab;
    double G = 0.5d * (1d - Math.sqrt(c_star_average_ab_pot7 / (c_star_average_ab_pot7 + 6103515625l))); //25^7
    double a1_prime = (1d + G) * this.current_A;
    double a2_prime = (1d + G) * color.current_A;
    double C_prime_1 = Math.sqrt(a1_prime * a1_prime + this.current_B * this.current_B);
    double C_prime_2 = Math.sqrt(a2_prime * a2_prime + color.current_B * color.current_B);
    //Angles in Degree.
    double h_prime_1 = ((MathUtil.atan2(this.current_B, a1_prime) * 180d / Math.PI) + 360d) % 360d;
    double h_prime_2 = ((MathUtil.atan2(color.current_B, a2_prime) * 180d / Math.PI) + 360d) % 360d;
    double delta_L_prime = color.current_L - this.current_L;
    double delta_C_prime = C_prime_2 - C_prime_1;
    double h_bar = Math.abs(h_prime_1 - h_prime_2);
    double delta_h_prime;
    if (C_prime_1 * C_prime_2 == 0d) {
      delta_h_prime = 0d;
    }
    else {
      if (h_bar <= 180d) {
        delta_h_prime = h_prime_2 - h_prime_1;
      }
      else if (h_bar > 180d && h_prime_2 <= h_prime_1) {
        delta_h_prime = h_prime_2 - h_prime_1 + 360d;
      }
      else {
        delta_h_prime = h_prime_2 - h_prime_1 - 360d;
      }
    }
    double delta_H_prime = 2d * Math.sqrt(C_prime_1 * C_prime_2) * Math.sin(delta_h_prime * Math.PI / 360d);
    // Calculate CIEDE2000
    double L_prime_average = (this.current_L + color.current_L) / 2d;
    double C_prime_average = (C_prime_1 + C_prime_2) / 2d;
    //Calculate h_prime_average
    double h_prime_average;
    if (C_prime_1 * C_prime_2 == 0d) {
      h_prime_average = 0d;
    }
    else {
      if (h_bar <= 180d) {
        h_prime_average = (h_prime_1 + h_prime_2) / 2d;
      }
      else if (h_bar > 180d && (h_prime_1 + h_prime_2) < 360d) {
        h_prime_average = (h_prime_1 + h_prime_2 + 360d) / 2d;
      }
      else {
        h_prime_average = (h_prime_1 + h_prime_2 - 360d) / 2d;
      }
    }
    double L_prime_average_minus_50_square = (L_prime_average - 50d);
    L_prime_average_minus_50_square *= L_prime_average_minus_50_square;
    double S_L = 1d + ((.015d * L_prime_average_minus_50_square) / Math.sqrt(20d + L_prime_average_minus_50_square));
    double S_C = 1d + .045d * C_prime_average;
    double T = 1d
      - 0.17d * Math.cos(degrees_to_radians(h_prime_average - 30d))
      + 0.24d * Math.cos(degrees_to_radians(h_prime_average * 2d))
      + 0.32d * Math.cos(degrees_to_radians(h_prime_average * 3d + 6d))
      - 0.2d * Math.cos(degrees_to_radians(h_prime_average * 4d - 63d));
    double S_H = 1d + 0.015d * T * C_prime_average;
    double h_prime_average_minus_275_div_25_square = (h_prime_average - 275d) / 25d;
    h_prime_average_minus_275_div_25_square *= h_prime_average_minus_275_div_25_square;
    double delta_theta = 30d * MathUtil.exp(-h_prime_average_minus_275_div_25_square);
    double C_prime_average_pot_7 = C_prime_average * C_prime_average * C_prime_average;
    C_prime_average_pot_7 *= C_prime_average_pot_7 * C_prime_average;
    double R_C = 2d * Math.sqrt(C_prime_average_pot_7 / (C_prime_average_pot_7 + 6103515625l));
    double R_T = -Math.sin(degrees_to_radians(2d * delta_theta)) * R_C;
    double delta_L_prime_div_k_L_S_L = delta_L_prime / (S_L * k_L);
    double delta_C_prime_div_k_C_S_C = delta_C_prime / (S_C * k_C);
    double delta_H_prime_div_k_H_S_H = delta_H_prime / (S_H * k_H);
    double CIEDE2000 = Math.sqrt(
      delta_L_prime_div_k_L_S_L * delta_L_prime_div_k_L_S_L
      + delta_C_prime_div_k_C_S_C * delta_C_prime_div_k_C_S_C
      + delta_H_prime_div_k_H_S_H * delta_H_prime_div_k_H_S_H
      + R_T * delta_C_prime_div_k_C_S_C * delta_H_prime_div_k_H_S_H
    );
    return CIEDE2000;
  }

  private double degrees_to_radians(double degrees) {
    return degrees * Math.PI / 180d;
  }

  public void reset_state() {
    this.current_L = (int) this.original_L;
    this.current_A = (int) this.original_A;
    this.current_B = (int) this.original_B;
  }

  public void truncate(int value) {
    this.current_L = (this.current_L / value) * value;
    this.current_A = (this.current_A / value) * value;
    this.current_B = (this.current_B / value) * value;
  }

  public void saturate(double degrees) {
    saturate_L(degrees);
    saturate_A(degrees);
    saturate_B(degrees);
  }

  public void saturate_L(double degrees) {
    double slope = Math.tan(Math.toRadians(degrees));
    this.current_L -= 50;
    this.current_L *= slope;
    if (this.current_L < -50) {
      this.current_L = -50;
    }
    else if (this.current_L > 50) {
      this.current_L = 50;
    }
    this.current_L += 50;

  }

  public void saturate_A(double degrees) {
    double slope = Math.tan(Math.toRadians(degrees));
    this.current_A *= slope;
    if (this.current_A < -128) {
      this.current_A = -128;
    }
    else if (this.current_A > 128) {
      this.current_A = 128;
    }
  }

  public void saturate_B(double degrees) {
    double slope = Math.tan(Math.toRadians(degrees));
    this.current_B *= slope;
    if (this.current_B < -128) {
      this.current_B = -128;
    }
    else if (this.current_B > 128) {
      this.current_B = 128;
    }
  }

  public void mutate_to(Color color) {
    this.original_L = color.original_L;
    this.original_A = color.original_A;
    this.original_B = color.original_B;
    this.current_L = color.current_L;
    this.current_A = color.current_A;
    this.current_B = color.current_B;
  }

  public void mutate_to(int color) {
    lab_conversion(color);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Color other = (Color) obj;
    if (this.current_L != other.current_L) {
      return false;
    }
    if (this.current_A != other.current_A) {
      return false;
    }
    if (this.current_B != other.current_B) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return (this.current_L + 1) * (this.current_A + 129) * (this.current_B + 129);
  }

  public static Comparator<Color> color_L_comparator = new Comparator<Color>() {
    public int compare(Color first, Color second) {
      return first.current_L - second.current_L;
    }
  };

  public static Comparator<Color> color_A_comparator = new Comparator<Color>() {
    public int compare(Color first, Color second) {
      return first.current_A - second.current_A;
    }
  };

  public static Comparator<Color> color_B_comparator = new Comparator<Color>() {
    public int compare(Color first, Color second) {
      return first.current_B - second.current_B;
    }
  };
}
