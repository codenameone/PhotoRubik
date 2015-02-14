//The MIT License (MIT)
//
//Copyright (c) 2014 Codrut Constantin Gusoi
//
//Permission is hereby granted, free of charge, to any person obtaining a copy
//of this software and associated documentation files (the "Software"), to deal
//in the Software without restriction, including without limitation the rights
//to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//copies of the Software, and to permit persons to whom the Software is
//furnished to do so, subject to the following conditions:
//
//The above copyright notice and this permission notice shall be included in all
//copies or substantial portions of the Software.
//
//THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//SOFTWARE.

package cntest;

import com.codename1.testing.AbstractTest;
import com.codename1.testing.TestUtils;

public abstract class CNTest extends AbstractTest {

  // Fails a test
  public static void fail() {
    TestUtils.assertBool(false);
  }

  public static void fail(String message) {
    TestUtils.assertBool(false, message);
  }

  // Checks for true
  public static void assertTrue(boolean value) {
    TestUtils.assertBool(value);
  }

  public static void assertTrue(boolean value, String message) {
    TestUtils.assertBool(value, message);
  }

  // Checks for false
  public static void assertFalse(boolean value) {
    TestUtils.assertBool(!value);
  }

  public static void assertFalse(boolean value, String message) {
    TestUtils.assertBool(!value, message);
  }

  // Checks for null
  public static void assertNull(Object object) {
    TestUtils.assertBool(object == null);
  }

  public static void assertNull(Object object, String message) {
    TestUtils.assertBool(object == null, message);
  }

  public static void assertNotNull(Object object) {
    TestUtils.assertBool(object != null);
  }

  public static void assertNotNull(Object object, String message) {
    TestUtils.assertBool(object != null, message);
  }

  // Checks for reference equality
  public static void assertSame(Object expected, Object actual) {
    TestUtils.assertBool(expected == actual);
  }

  public static void assertSame(Object expected, Object actual, String message) {
    TestUtils.assertBool(expected == actual, message);
  }

  public static void assertNotSame(Object expected, Object actual) {
    TestUtils.assertBool(expected != actual);
  }

  public static void assertNotSame(Object expected, Object actual, String message) {
    TestUtils.assertBool(expected != actual, message);
  }

  // Checks for value equality
  public static void assertEqual(int expected, int actual) {
    TestUtils.assertBool(expected == actual);
  }

  public static void assertEqual(int expected, int actual, String message) {
    TestUtils.assertBool(expected == actual, message);
  }

  public static void assertEqual(long expected, long actual, long max_relative_error) {
    if (expected == actual) {
      TestUtils.assertBool(true);
    }
    else {
      float relative_error = Math.abs((expected - actual) / actual);
      if (relative_error <= max_relative_error) {
        TestUtils.assertBool(true);
      }
      else {
        TestUtils.assertBool(false);
      }
    }
  }

  public static void assertEqual(long expected, long actual, long max_relative_error, String message) {
    if (expected == actual) {
      TestUtils.assertBool(true, message);
    }
    else {
      float relative_error = Math.abs((expected - actual) / actual);
      if (relative_error <= max_relative_error) {
        TestUtils.assertBool(true, message);
      }
      else {
        TestUtils.assertBool(false, message);
      }
    }
  }

  public static void assertEqual(double expected, double actual, double max_relative_error) {
    if (expected == actual) {
      TestUtils.assertBool(true);
    }
    else {
      double relative_error = Math.abs((expected - actual) / actual);
      if (relative_error <= max_relative_error) {
        TestUtils.assertBool(true);
      }
      else {
        TestUtils.assertBool(false);
      }
    }
  }

  public static void assertEqual(double expected, double actual, double max_relative_error, String message) {
    if (expected == actual) {
      TestUtils.assertBool(true, message);
    }
    else {
      double relative_error = Math.abs((expected - actual) / actual);
      if (relative_error <= max_relative_error) {
        TestUtils.assertBool(true, message);
      }
      else {
        TestUtils.assertBool(false, message);
      }
    }
  }

  public static void assertEqual(Object expected, Object actual) {
    TestUtils.assertBool(expected.equals(actual));
  }

  public static void assertEqual(Object expected, Object actual, String message) {
    TestUtils.assertBool(expected.equals(actual), message);
  }

  // Check for value inequality
  public static void assertNotEqual(int expected, int actual) {
    TestUtils.assertBool(expected != actual);
  }

  public static void assertNotEqual(int expected, int actual, String message) {
    TestUtils.assertBool(expected != actual, message);
  }

  public static void assertNotEqual(long expected, long actual, long max_relative_error) {
    if (expected == actual) {
      TestUtils.assertBool(false);
    }
    else {
      float relative_error = Math.abs((expected - actual) / actual);
      if (relative_error <= max_relative_error) {
        TestUtils.assertBool(false);
      }
      else {
        TestUtils.assertBool(true);
      }
    }
  }

  public static void assertNotEqual(long expected, long actual, long max_relative_error, String message) {
    if (expected == actual) {
      TestUtils.assertBool(false, message);
    }
    else {
      float relative_error = Math.abs((expected - actual) / actual);
      if (relative_error <= max_relative_error) {
        TestUtils.assertBool(false, message);
      }
      else {
        TestUtils.assertBool(true, message);
      }
    }
  }

  public static void assertNotEqual(double expected, double actual, double max_relative_error) {
    if (expected == actual) {
      TestUtils.assertBool(false);
    }
    else {
      double relative_error = Math.abs((expected - actual) / actual);
      if (relative_error <= max_relative_error) {
        TestUtils.assertBool(false);
      }
      else {
        TestUtils.assertBool(true);
      }
    }
  }

  public static void assertNotEqual(double expected, double actual, double max_relative_error, String message) {
    if (expected == actual) {
      TestUtils.assertBool(false, message);
    }
    else {
      double relative_error = Math.abs((expected - actual) / actual);
      if (relative_error <= max_relative_error) {
        TestUtils.assertBool(false, message);
      }
      else {
        TestUtils.assertBool(true, message);
      }
    }
  }

  public static void assertNotEqual(Object expected, Object actual) {
    TestUtils.assertBool(!expected.equals(actual));
  }

  public static void assertNotEqual(Object expected, Object actual, String message) {
    TestUtils.assertBool(!expected.equals(actual), message);
  }

  // Check for array equality
  public static void assertArrayEqual(int[] expected, int[] actual) {
    if (expected.length != actual.length) {
      TestUtils.assertBool(false);
    }
    for (int index = 0; index < expected.length; ++index) {
      assertEqual(expected[index], actual[index]);
    }
  }

  public static void assertArrayEqual(int[] expected, int[] actual, String message) {
    if (expected.length != actual.length) {
      TestUtils.assertBool(false);
    }
    for (int index = 0; index < expected.length; ++index) {
      assertEqual(expected[index], actual[index], message);
    }
  }
  
  public static void assertArrayEqual(long[] expected, long[] actual, long max_relative_error) {
    if (expected.length != actual.length) {
      TestUtils.assertBool(false);
    }
    for (int index = 0; index < expected.length; ++index) {
      assertEqual(expected[index], actual[index], max_relative_error);
    }
  }

  public static void assertArrayEqual(long[] expected, long[] actual, long max_relative_error, String message) {
    if (expected.length != actual.length) {
      TestUtils.assertBool(false);
    }
    for (int index = 0; index < expected.length; ++index) {
      assertEqual(expected[index], actual[index], max_relative_error, message);
    }
  }
  
  public static void assertArrayEqual(double[] expected, double[] actual, double max_relative_error) {
    if (expected.length != actual.length) {
      TestUtils.assertBool(false);
    }
    for (int index = 0; index < expected.length; ++index) {
      assertEqual(expected[index], actual[index], max_relative_error);
    }
  }

  public static void assertArrayEqual(double[] expected, double[] actual, double max_relative_error, String message) {
    if (expected.length != actual.length) {
      TestUtils.assertBool(false);
    }
    for (int index = 0; index < expected.length; ++index) {
      assertEqual(expected[index], actual[index], max_relative_error, message);
    }
  }
  
  public static void assertArrayEqual(Object[] expected, Object[] actual) {
    if (expected.length != actual.length) {
      TestUtils.assertBool(false);
    }
    for (int index = 0; index < expected.length; ++index) {
      assertEqual(expected[index], actual[index]);
    }
  }

  public static void assertArrayEqual(Object[] expected, Object[] actual, String message) {
    if (expected.length != actual.length) {
      TestUtils.assertBool(false);
    }
    for (int index = 0; index < expected.length; ++index) {
      assertEqual(expected[index], actual[index], message);
    }
  }
}
