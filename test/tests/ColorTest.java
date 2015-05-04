package tests;

import com.codename1.testing.AbstractTest;
import com.mycompany.myapp.Color;

public class ColorTest extends AbstractTest {

  public boolean runTest() throws Exception {
    color_conversion_is_reversible();
    colors_are_converted_like_on_colormine();
    return true;
  }

  private void color_conversion_is_reversible() {
    //Arrange
    int expected_color;
    int resulted_color;
    Color color;
    //Act
    for (int index = 0; index < 0xFFFFFF; ++index) {
      expected_color = (int) (index | 0xFF000000);
      color = new Color(expected_color);
      color.create_ARGB();
      resulted_color = color.argb;
      //Assert
      assertEqual(expected_color, resulted_color, "Failed for color: " + resulted_color);
    }
  }

  private void colors_are_converted_like_on_colormine() {
    //Arrange
    int number_of_colors = 1157;
    int counter = 0;
    Color[] expected = new Color[number_of_colors];
    Color[] actual = new Color[number_of_colors];

    //Acid green
    expected[counter] = new Color(0xB0BF1A);
    actual[counter] = new Color(73.91149216199302d, -23.384431641325254d, 71.14805456107274d);
    ++counter;

    //Aero
    expected[counter] = new Color(0x7CB9E8);
    actual[counter] = new Color(72.76608557964833d, -7.211733195211956d, -29.560577304029678d);
    ++counter;

    //Aero blue
    expected[counter] = new Color(0xC9FFE5);
    actual[counter] = new Color(95.82837522633754d, -22.063834840557238d, 6.848799326397703d);
    ++counter;

    //African violet
    expected[counter] = new Color(0xB284BE);
    actual[counter] = new Color(61.38165910299422d, 27.90542693053061d, -23.46590389723677d);
    ++counter;

    //Air Force blue (RAF)
    expected[counter] = new Color(0x5D8AA8);
    actual[counter] = new Color(55.41192892871888d, -7.127665665440985d, -20.662310657392567d);
    ++counter;

    //Air Force blue (USAF)
    expected[counter] = new Color(0x00308F);
    actual[counter] = new Color(23.989805666316137d, 26.88067156404464d, -55.85996113022495d);
    ++counter;

    //Air superiority blue
    expected[counter] = new Color(0x72A0C1);
    actual[counter] = new Color(63.810619985551554d, -6.879362287053937d, -21.872241543476378d);
    ++counter;

    //Alabama crimson
    expected[counter] = new Color(0xAF002A);
    actual[counter] = new Color(36.52002189431107d, 61.26790059663134d, 29.957237720749717d);
    ++counter;

    //Alice blue
    expected[counter] = new Color(0xF0F8FF);
    actual[counter] = new Color(97.17890760827636d, -1.3430979525985154d, -4.273119139608905d);
    ++counter;

    //Alizarin crimson
    expected[counter] = new Color(0xE32636);
    actual[counter] = new Color(49.476042283622505d, 69.33046824098543d, 40.23492072035363d);
    ++counter;

    //Alloy orange
    expected[counter] = new Color(0xC46210);
    actual[counter] = new Color(52.40736930214352d, 34.73973071326147d, 57.444890136245405d);
    ++counter;

    //Almond
    expected[counter] = new Color(0xEFDECD);
    actual[counter] = new Color(89.39348739189694d, 3.061714391510151d, 10.423734275566666d);
    ++counter;

    //Amaranth
    expected[counter] = new Color(0xE52B50);
    actual[counter] = new Color(50.64617927364695d, 69.82955165268024d, 26.435378303259117d);
    ++counter;

    //Amaranth pink
    expected[counter] = new Color(0xF19CBB);
    actual[counter] = new Color(73.5880563905509d, 35.82089656462717d, -2.7593707081293717d);
    ++counter;

    //Amaranth purple
    expected[counter] = new Color(0xAB274F);
    actual[counter] = new Color(39.024990631067475d, 54.82455086525648d, 9.529487196224007d);
    ++counter;

    //Amaranth red
    expected[counter] = new Color(0xD3212D);
    actual[counter] = new Color(45.80637137139158d, 65.81579856069908d, 40.45158364091763d);
    ++counter;

    //Amazon
    expected[counter] = new Color(0x3B7A57);
    actual[counter] = new Color(46.3610837422509d, -29.01085065701109d, 13.08136429584772d);
    ++counter;

    //Amber
    expected[counter] = new Color(0xFFBF00);
    actual[counter] = new Color(81.02792148118404d, 10.386126365583504d, 83.035714705514d);
    ++counter;

    //Amber (SAE/ECE)
    expected[counter] = new Color(0xFF7E00);
    actual[counter] = new Color(66.65853069488475d, 43.81400558841014d, 73.79454532305026d);
    ++counter;

    //American rose
    expected[counter] = new Color(0xFF033E);
    actual[counter] = new Color(53.678239212364744d, 80.92968829944186d, 41.89108765748588d);
    ++counter;

    //Amethyst
    expected[counter] = new Color(0x9966CC);
    actual[counter] = new Color(52.54733429606691d, 40.31952152925011d, -45.41126169224157d);
    ++counter;

    //Android green
    expected[counter] = new Color(0xA4C639);
    actual[counter] = new Color(75.18684027909529d, -30.472972828165744d, 63.12930433019377d);
    ++counter;

    //Anti-flash white
    expected[counter] = new Color(0xF2F3F4);
    actual[counter] = new Color(95.79317991911023d, -0.14914546644650972d, -0.6072114072163792d);
    ++counter;

    //Antique brass
    expected[counter] = new Color(0xCD9575);
    actual[counter] = new Color(66.33489650540463d, 17.082507918611878d, 25.18890604889601d);
    ++counter;

    //Antique bronze
    expected[counter] = new Color(0x665D1E);
    actual[counter] = new Color(39.15141969323164d, -4.641465483666174d, 36.08885537094114d);
    ++counter;

    //Antique fuchsia
    expected[counter] = new Color(0x915C83);
    actual[counter] = new Color(46.059582094972214d, 27.905632580128128d, -12.790427142278492d);
    ++counter;

    //Antique ruby
    expected[counter] = new Color(0x841B2D);
    actual[counter] = new Color(29.104761000749477d, 44.58841435207692d, 16.892774971557923d);
    ++counter;

    //Antique white
    expected[counter] = new Color(0xFAEBD7);
    actual[counter] = new Color(93.73077088204487d, 1.8427318819214111d, 11.516868127356773d);
    ++counter;

    //Ao (English)
    expected[counter] = new Color(0x008000);
    actual[counter] = new Color(46.22881784262658d, -51.69964732808236d, 49.89795230983843d);
    ++counter;

    //Apple green
    expected[counter] = new Color(0x8DB600);
    actual[counter] = new Color(68.83710125246533d, -34.12729212857507d, 69.78457891364562d);
    ++counter;

    //Apricot
    expected[counter] = new Color(0xFBCEB1);
    actual[counter] = new Color(85.91945261117658d, 11.775107461686197d, 20.39256807381731d);
    ++counter;

    //Aqua
    expected[counter] = new Color(0x00FFFF);
    actual[counter] = new Color(91.11652110946342d, -48.079618466228716d, -14.138127754846131d);
    ++counter;

    //Aquamarine
    expected[counter] = new Color(0x7FFFD4);
    actual[counter] = new Color(92.03615371984776d, -45.52073061551781d, 9.711681469210287d);
    ++counter;

    //Army green
    expected[counter] = new Color(0x4B5320);
    actual[counter] = new Color(33.53455517379234d, -11.636909563358111d, 28.259878514127614d);
    ++counter;

    //Arsenic
    expected[counter] = new Color(0x3B444B);
    actual[counter] = new Color(28.306048269622956d, -1.8853938876364218d, -5.4527966017740575d);
    ++counter;

    //Artichoke
    expected[counter] = new Color(0x8F9779);
    actual[counter] = new Color(61.09220433778424d, -8.363268124708112d, 14.864085296582118d);
    ++counter;

    //Arylide yellow
    expected[counter] = new Color(0xE9D66B);
    actual[counter] = new Color(85.23980774382127d, -6.73567605068931d, 54.47594283733248d);
    ++counter;

    //Ash grey
    expected[counter] = new Color(0xB2BEB5);
    actual[counter] = new Color(75.84041291712849d, -5.837049587504028d, 3.107222956402955d);
    ++counter;

    //Asparagus
    expected[counter] = new Color(0x87A96B);
    actual[counter] = new Color(65.42692066725424d, -22.9712809811482d, 28.293181049319195d);
    ++counter;

    //Atomic tangerine
    expected[counter] = new Color(0xFF9966);
    actual[counter] = new Color(72.8930628093705d, 33.571178995476956d, 42.778646734800496d);
    ++counter;

    //Auburn
    expected[counter] = new Color(0xA52A2A);
    actual[counter] = new Color(37.521829744034335d, 49.699782879003926d, 30.540267189480907d);
    ++counter;

    //Aureolin
    expected[counter] = new Color(0xFDEE00);
    actual[counter] = new Color(92.58885613347921d, -14.206261112381712d, 91.10096152226888d);
    ++counter;

    //AuroMetalSaurus
    expected[counter] = new Color(0x6E7F80);
    actual[counter] = new Color(51.89623867285272d, -5.971371123746517d, -2.6469047591880956d);
    ++counter;

    //Avocado
    expected[counter] = new Color(0x568203);
    actual[counter] = new Color(49.43573667783642d, -32.359981318993036d, 52.907504861357154d);
    ++counter;

    //Azure
    expected[counter] = new Color(0x007FFF);
    actual[counter] = new Color(54.44754715922328d, 19.4140731865301d, -71.36367783765967d);
    ++counter;

    //Azure (web color)
    expected[counter] = new Color(0xF0FFFF);
    actual[counter] = new Color(98.93278063011066d, -4.8751827020712675d, -1.6983367236276026d);
    ++counter;

    //Azure mist
    expected[counter] = new Color(0xF0FFFF);
    actual[counter] = new Color(98.93278063011066d, -4.8751827020712675d, -1.6983367236276026d);
    ++counter;

    //Azureish white
    expected[counter] = new Color(0xDBE9F4);
    actual[counter] = new Color(91.62629771037356d, -2.5235756461020054d, -6.92480016087047d);
    ++counter;

    //Baby blue
    expected[counter] = new Color(0x89CFF0);
    actual[counter] = new Color(79.74753841069568d, -13.546546797912118d, -23.1307912031697d);
    ++counter;

    //Baby blue eyes
    expected[counter] = new Color(0xA1CAF1);
    actual[counter] = new Color(79.70990546566279d, -4.40326944211189d, -23.60427231761353d);
    ++counter;

    //Baby pink
    expected[counter] = new Color(0xF4C2C2);
    actual[counter] = new Color(82.75987230135719d, 17.828120077149514d, 6.805936202571172d);
    ++counter;

    //Baby powder
    expected[counter] = new Color(0xFEFEFA);
    actual[counter] = new Color(99.5561817784475d, -0.6901499948042122d, 1.8973506551413166d);
    ++counter;

    //Baker-Miller pink
    expected[counter] = new Color(0xFF91AF);
    actual[counter] = new Color(72.63166310143234d, 44.73742952063275d, 2.685804411192527d);
    ++counter;

    //Ball blue
    expected[counter] = new Color(0x21ABCD);
    actual[counter] = new Color(64.84885096078095d, -23.041820712946638d, -27.18411468556594d);
    ++counter;

    //Banana Mania
    expected[counter] = new Color(0xFAE7B5);
    actual[counter] = new Color(92.04797664895176d, -0.9491394057404845d, 26.728350710936976d);
    ++counter;

    //Banana yellow
    expected[counter] = new Color(0xFFE135);
    actual[counter] = new Color(89.56484132333415d, -6.065542621484399d, 80.37325762138789d);
    ++counter;

    //Bangladesh green
    expected[counter] = new Color(0x006A4E);
    actual[counter] = new Color(39.34048455123527d, -33.76165714661744d, 8.424469088149522d);
    ++counter;

    //Barbie pink
    expected[counter] = new Color(0xE0218A);
    actual[counter] = new Color(50.41700602855562d, 75.05322922091557d, -9.212076328272921d);
    ++counter;

    //Barn red
    expected[counter] = new Color(0x7C0A02);
    actual[counter] = new Color(25.279975575252173d, 45.064115413499806d, 36.679262264862224d);
    ++counter;

    //Battleship grey
    expected[counter] = new Color(0x848482);
    actual[counter] = new Color(55.092693252505214d, -0.3896142291815452d, 1.0705956951766904d);
    ++counter;

    //Bazaar
    expected[counter] = new Color(0x98777B);
    actual[counter] = new Color(53.27531181612929d, 13.522154604812819d, 2.7399643331229573d);
    ++counter;

    //Beau blue
    expected[counter] = new Color(0xBCD4E6);
    actual[counter] = new Color(83.70031440778298d, -4.270695016843629d, -11.555395178369432d);
    ++counter;

    //Beaver
    expected[counter] = new Color(0x9F8170);
    actual[counter] = new Color(56.328577353418595d, 8.909445402387195d, 13.559898639315238d);
    ++counter;

    //Beige
    expected[counter] = new Color(0xF5F5DC);
    actual[counter] = new Color(95.9488798865349d, -4.189085125627601d, 12.039919825248301d);
    ++counter;

    //B'dazzled blue
    expected[counter] = new Color(0x2E5894);
    actual[counter] = new Color(37.295613494747144d, 6.018732082190753d, -37.32651143001381d);
    ++counter;

    //Big dip o’ruby
    expected[counter] = new Color(0x9C2542);
    actual[counter] = new Color(35.56583719662069d, 50.05127463527134d, 12.628310300936874d);
    ++counter;

    //Bisque
    expected[counter] = new Color(0xFFE4C4);
    actual[counter] = new Color(92.0124490871158d, 4.434438789171768d, 19.00326863160735d);
    ++counter;

    //Bistre
    expected[counter] = new Color(0x3D2B1F);
    actual[counter] = new Color(19.30301948047942d, 6.4703179641038275d, 11.072778846074694d);
    ++counter;

    //Bistre brown
    expected[counter] = new Color(0x967117);
    actual[counter] = new Color(49.9252566654166d, 6.321548478211147d, 50.861272755219d);
    ++counter;

    //Bitter lemon
    expected[counter] = new Color(0xCAE00D);
    actual[counter] = new Color(84.9438125577022d, -28.575516586261173d, 82.5958321588837d);
    ++counter;

    //Bitter lime
    expected[counter] = new Color(0xBFFF00);
    actual[counter] = new Color(92.83743607221825d, -46.874711675708724d, 89.3569815345749d);
    ++counter;

    //Bittersweet
    expected[counter] = new Color(0xFE6F5E);
    actual[counter] = new Color(64.36110417704167d, 53.379630867991025d, 36.5456751725757d);
    ++counter;

    //Bittersweet shimmer
    expected[counter] = new Color(0xBF4F51);
    actual[counter] = new Color(48.588987574423285d, 45.201832799941336d, 21.85735005231406d);
    ++counter;

    //Black
    expected[counter] = new Color(0x000000);
    actual[counter] = new Color(0.0d, 0.0d, 0.0d);
    ++counter;

    //Black bean
    expected[counter] = new Color(0x3D0C02);
    actual[counter] = new Color(10.988718367351598d, 23.23013502065778d, 16.205700344158913d);
    ++counter;

    //Black leather jacket
    expected[counter] = new Color(0x253529);
    actual[counter] = new Color(20.43851154393394d, -9.638986711574537d, 5.4717595697378d);
    ++counter;

    //Black olive
    expected[counter] = new Color(0x3B3C36);
    actual[counter] = new Color(25.038310728133084d, -1.7433028923770633d, 3.560559787379458d);
    ++counter;

    //Blanched almond
    expected[counter] = new Color(0xFFEBCD);
    actual[counter] = new Color(93.91948969581235d, 2.133801912078459d, 17.01721419751825d);
    ++counter;

    //Blast-off bronze
    expected[counter] = new Color(0xA57164);
    actual[counter] = new Color(52.65237611948396d, 18.891001622557024d, 15.516232937217179d);
    ++counter;

    //Bleu de France
    expected[counter] = new Color(0x318CE7);
    actual[counter] = new Color(57.24907996901396d, 4.9227807114252675d, -53.5301506997099d);
    ++counter;

    //Blizzard Blue
    expected[counter] = new Color(0xACE5EE);
    actual[counter] = new Color(87.47642048210189d, -15.99541544049049d, -10.259761786452204d);
    ++counter;

    //Blond
    expected[counter] = new Color(0xFAF0BE);
    actual[counter] = new Color(94.4668603455285d, -4.303638265640231d, 25.42849615161229d);
    ++counter;

    //Blue
    expected[counter] = new Color(0x0000FF);
    actual[counter] = new Color(32.302586667249486d, 79.19666178930935d, -107.86368104495168d);
    ++counter;

    //Blue (Crayola)
    expected[counter] = new Color(0x1F75FE);
    actual[counter] = new Color(52.028473501859835d, 26.344093537212785d, -74.72176484213571d);
    ++counter;

    //Blue (Munsell)
    expected[counter] = new Color(0x0093AF);
    actual[counter] = new Color(56.05031128657566d, -22.52037591763434d, -23.890326648329463d);
    ++counter;

    //Blue (NCS)
    expected[counter] = new Color(0x0087BD);
    actual[counter] = new Color(52.95175898340399d, -10.877668358499848d, -36.700421499229584d);
    ++counter;

    //Blue (Pantone)
    expected[counter] = new Color(0x0018A8);
    actual[counter] = new Color(21.873483862751876d, 50.20106862823326d, -74.67711071038828d);
    ++counter;

    //Blue (pigment)
    expected[counter] = new Color(0x333399);
    actual[counter] = new Color(27.767622693733692d, 33.16418923617473d, -55.736669421444226d);
    ++counter;

    //Blue (RYB)
    expected[counter] = new Color(0x0247FE);
    actual[counter] = new Color(40.69507701524859d, 53.84854592008379d, -93.33117747044834d);
    ++counter;

    //Blue Bell
    expected[counter] = new Color(0xA2A2D0);
    actual[counter] = new Color(68.07667182134949d, 9.798462539772569d, -23.40576365610081d);
    ++counter;

    //Blue-gray
    expected[counter] = new Color(0x6699CC);
    actual[counter] = new Color(61.62563447911687d, -2.8148222106305076d, -31.43912376322242d);
    ++counter;

    //Blue-green
    expected[counter] = new Color(0x0D98BA);
    actual[counter] = new Color(58.119735466184366d, -20.817356782201312d, -26.940533929148636d);
    ++counter;

    //Blue-magenta violet
    expected[counter] = new Color(0x553592);
    actual[counter] = new Color(30.766422593867624d, 36.08646013784142d, -46.43149908783315d);
    ++counter;

    //Blue sapphire
    expected[counter] = new Color(0x126180);
    actual[counter] = new Color(38.26358432534738d, -10.998922715117821d, -23.719749214938158d);
    ++counter;

    //Blue-violet
    expected[counter] = new Color(0x8A2BE2);
    actual[counter] = new Color(42.18810476642369d, 69.85811353659844d, -74.77416881134309d);
    ++counter;

    //Blue yonder
    expected[counter] = new Color(0x5072A7);
    actual[counter] = new Color(47.662448355469564d, 3.3884763094028103d, -32.14027617297963d);
    ++counter;

    //Blueberry
    expected[counter] = new Color(0x4F86F7);
    actual[counter] = new Color(57.48994517527407d, 18.043147403743742d, -61.958250696294435d);
    ++counter;

    //Bluebonnet
    expected[counter] = new Color(0x1C1CF0);
    actual[counter] = new Color(32.63184258424922d, 69.99108839514273d, -98.83938490174206d);
    ++counter;

    //Blush
    expected[counter] = new Color(0xDE5D83);
    actual[counter] = new Color(57.07248849920866d, 53.81139327179962d, 4.693238136583799d);
    ++counter;

    //Bole
    expected[counter] = new Color(0x79443B);
    actual[counter] = new Color(35.03312666076893d, 21.769429419647047d, 15.355791689464349d);
    ++counter;

    //Bondi blue
    expected[counter] = new Color(0x0095B6);
    actual[counter] = new Color(56.95077673770099d, -21.1133449545427d, -26.485560218975856d);
    ++counter;

    //Bone
    expected[counter] = new Color(0xE3DAC9);
    actual[counter] = new Color(87.33454050017009d, 0.22778905663900506d, 9.453645432369328d);
    ++counter;

    //Boston University Red
    expected[counter] = new Color(0xCC0000);
    actual[counter] = new Color(42.51717251948692d, 67.71017131244395d, 56.81589777312727d);
    ++counter;

    //Bottle green
    expected[counter] = new Color(0x006A4E);
    actual[counter] = new Color(39.34048455123527d, -33.76165714661744d, 8.424469088149522d);
    ++counter;

    //Boysenberry
    expected[counter] = new Color(0x873260);
    actual[counter] = new Color(34.552482594925294d, 41.31579945528679d, -8.638892076679783d);
    ++counter;

    //Brandeis blue
    expected[counter] = new Color(0x0070FF);
    actual[counter] = new Color(50.46221619707414d, 28.868954640475287d, -77.83996827449866d);
    ++counter;

    //Brass
    expected[counter] = new Color(0xB5A642);
    actual[counter] = new Color(67.6426974229908d, -6.7250649226882615d, 52.161431292906904d);
    ++counter;

    //Brick red
    expected[counter] = new Color(0xCB4154);
    actual[counter] = new Color(48.40736582056192d, 55.54586595420147d, 20.186315285837686d);
    ++counter;

    //Bright cerulean
    expected[counter] = new Color(0x1DACD6);
    actual[counter] = new Color(65.45275374927753d, -20.80314609176265d, -31.23348305648217d);
    ++counter;

    //Bright green
    expected[counter] = new Color(0x66FF00);
    actual[counter] = new Color(89.08518273613139d, -74.42803208501452d, 84.82432855359349d);
    ++counter;

    //Bright lavender
    expected[counter] = new Color(0xBF94E4);
    actual[counter] = new Color(67.91553975149186d, 31.084093765868793d, -34.48396064368276d);
    ++counter;

    //Bright lilac
    expected[counter] = new Color(0xD891EF);
    actual[counter] = new Color(70.2331409222531d, 42.48329321745919d, -36.72755051994254d);
    ++counter;

    //Bright maroon
    expected[counter] = new Color(0xC32148);
    actual[counter] = new Color(42.999897393449d, 62.67895035164178d, 20.12747924644461d);
    ++counter;

    //Bright navy blue
    expected[counter] = new Color(0x1974D2);
    actual[counter] = new Color(48.69878786630342d, 9.734480951606617d, -55.422729557918984d);
    ++counter;

    //Bright pink
    expected[counter] = new Color(0xFF007F);
    actual[counter] = new Color(54.857758849253244d, 84.48066810163257d, 4.62720489978099d);
    ++counter;

    //Bright turquoise
    expected[counter] = new Color(0x08E8DE);
    actual[counter] = new Color(83.46277678644866d, -47.45343222770426d, -8.268833464269987d);
    ++counter;

    //Bright ube
    expected[counter] = new Color(0xD19FE8);
    actual[counter] = new Color(72.34716445400565d, 31.403846539487855d, -29.68692530754964d);
    ++counter;

    //Brilliant azure
    expected[counter] = new Color(0x3399FF);
    actual[counter] = new Color(62.258891324049216d, 6.133261278566227d, -58.76872230102723d);
    ++counter;

    //Brilliant lavender
    expected[counter] = new Color(0xF4BBFF);
    actual[counter] = new Color(82.91009339883898d, 31.8258716708793d, -25.618006411506734d);
    ++counter;

    //Brilliant rose
    expected[counter] = new Color(0xFF55A3);
    actual[counter] = new Color(61.998977942335884d, 70.36159921195429d, -6.114095516618323d);
    ++counter;

    //Brink pink
    expected[counter] = new Color(0xFB607F);
    actual[counter] = new Color(62.0040532507184d, 61.38656098798767d, 14.643113933619656d);
    ++counter;

    //British racing green
    expected[counter] = new Color(0x004225);
    actual[counter] = new Color(23.77037680882568d, -27.177679008215023d, 12.432103095545976d);
    ++counter;

    //Bronze
    expected[counter] = new Color(0xCD7F32);
    actual[counter] = new Color(60.23781656606222d, 24.019966026792126d, 52.32962262891097d);
    ++counter;

    //Bronze Yellow
    expected[counter] = new Color(0x737000);
    actual[counter] = new Color(45.951929244018075d, -10.317710280179359d, 51.83112127542518d);
    ++counter;

    //Brown (traditional)
    expected[counter] = new Color(0x964B00);
    actual[counter] = new Color(40.43660215861212d, 27.50197305101504d, 50.14704845772216d);
    ++counter;

    //Brown (web)
    expected[counter] = new Color(0xA52A2A);
    actual[counter] = new Color(37.521829744034335d, 49.699782879003926d, 30.540267189480907d);
    ++counter;

    //Brown-nose
    expected[counter] = new Color(0x6B4423);
    actual[counter] = new Color(32.65985062863615d, 13.273889941160633d, 26.523357971015926d);
    ++counter;

    //Brown Yellow
    expected[counter] = new Color(0xcc9966);
    actual[counter] = new Color(66.96008128980247d, 12.976235196092423d, 34.10523342153584d);
    ++counter;

    //Brunswick green
    expected[counter] = new Color(0x1B4D3E);
    actual[counter] = new Color(29.12956899313444d, -20.963931167645335d, 3.9473409112831925d);
    ++counter;

    //Bubble gum
    expected[counter] = new Color(0xFFC1CC);
    actual[counter] = new Color(83.84042715969788d, 23.771549954926087d, 3.1508768714689106d);
    ++counter;

    //Bubbles
    expected[counter] = new Color(0xE7FEFF);
    actual[counter] = new Color(98.07053575374206d, -7.243130205616676d, -3.0343044139627295d);
    ++counter;

    //Buff
    expected[counter] = new Color(0xF0DC82);
    actual[counter] = new Color(87.64187809199774d, -4.960104555228773d, 46.51434935237908d);
    ++counter;

    //Bud green
    expected[counter] = new Color(0x7BB661);
    actual[counter] = new Color(68.40937511743356d, -34.93063585959716d, 37.166714911399936d);
    ++counter;

    //Bulgarian rose
    expected[counter] = new Color(0x480607);
    actual[counter] = new Color(12.755471148927828d, 30.033080216479004d, 17.004154339107863d);
    ++counter;

    //Burgundy
    expected[counter] = new Color(0x800020);
    actual[counter] = new Color(25.843012314771876d, 48.90480428407529d, 21.29358216148206d);
    ++counter;

    //Burlywood
    expected[counter] = new Color(0xDEB887);
    actual[counter] = new Color(77.01689872654846d, 7.052373961934255d, 30.012511337447645d);
    ++counter;

    //Burnt orange
    expected[counter] = new Color(0xCC5500);
    actual[counter] = new Color(51.076128147956155d, 44.16578531193965d, 60.78002015986711d);
    ++counter;

    //Burnt sienna
    expected[counter] = new Color(0xE97451);
    actual[counter] = new Color(62.00509964608041d, 42.5880521768624d, 40.0203302511987d);
    ++counter;

    //Burnt umber
    expected[counter] = new Color(0x8A3324);
    actual[counter] = new Color(33.77018124734374d, 36.191086149950316d, 28.499947530939274d);
    ++counter;

    //Byzantine
    expected[counter] = new Color(0xBD33A4);
    actual[counter] = new Color(46.799255004658825d, 65.42048755248031d, -30.86548891880554d);
    ++counter;

    //Byzantium
    expected[counter] = new Color(0x702963);
    actual[counter] = new Color(29.238915195527873d, 38.88080616398901d, -19.040297722845047d);
    ++counter;

    //Cadet
    expected[counter] = new Color(0x536872);
    actual[counter] = new Color(42.69465951112997d, -5.302182523234167d, -8.182802372187181d);
    ++counter;

    //Cadet blue
    expected[counter] = new Color(0x5F9EA0);
    actual[counter] = new Color(61.15461539950293d, -19.6751614711701d, -7.426657720333263d);
    ++counter;

    //Cadet grey
    expected[counter] = new Color(0x91A3B0);
    actual[counter] = new Color(66.01926532525533d, -3.4969683350316028d, -8.852050083032758d);
    ++counter;

    //Cadmium green
    expected[counter] = new Color(0x006B3C);
    actual[counter] = new Color(39.31245183012996d, -38.52212577145281d, 19.058497755344906d);
    ++counter;

    //Cadmium orange
    expected[counter] = new Color(0xED872D);
    actual[counter] = new Color(66.15301698005554d, 32.86531834621381d, 61.459212527569505d);
    ++counter;

    //Cadmium red
    expected[counter] = new Color(0xE30022);
    actual[counter] = new Color(47.55477044689705d, 73.7739170332068d, 49.15069312921217d);
    ++counter;

    //Cadmium yellow
    expected[counter] = new Color(0xFFF600);
    actual[counter] = new Color(94.81100303054771d, -17.25314492462554d, 92.7857124271131d);
    ++counter;

    //Café au lait
    expected[counter] = new Color(0xA67B5B);
    actual[counter] = new Color(55.10141383842924d, 12.58881169464454d, 24.00366729605986d);
    ++counter;

    //Café noir
    expected[counter] = new Color(0x4B3621);
    actual[counter] = new Color(24.462209726486904d, 6.413071238578344d, 16.807678530174684d);
    ++counter;

    //Cal Poly green
    expected[counter] = new Color(0x1E4D2B);
    actual[counter] = new Color(28.794019124011086d, -24.768843081379554d, 15.473276099652312d);
    ++counter;

    //Cambridge Blue
    expected[counter] = new Color(0xA3C1AD);
    actual[counter] = new Color(75.41622000542803d, -14.054573464847786d, 6.696232872956087d);
    ++counter;

    //Camel
    expected[counter] = new Color(0xC19A6B);
    actual[counter] = new Color(66.14396786846372d, 8.369210596896659d, 30.14844295160646d);
    ++counter;

    //Cameo pink
    expected[counter] = new Color(0xEFBBCC);
    actual[counter] = new Color(80.87814025262435d, 21.273370238125644d, -1.3563454854957024d);
    ++counter;

    //Camouflage green
    expected[counter] = new Color(0x78866B);
    actual[counter] = new Color(54.138023862282736d, -10.352389392513373d, 12.856321500937273d);
    ++counter;

    //Canary yellow
    expected[counter] = new Color(0xFFEF00);
    actual[counter] = new Color(93.01137491066302d, -13.858591401622656d, 91.48191717490975d);
    ++counter;

    //Candy apple red
    expected[counter] = new Color(0xFF0800);
    actual[counter] = new Color(53.42088440323104d, 79.56443664435785d, 67.28481935930594d);
    ++counter;

    //Candy pink
    expected[counter] = new Color(0xE4717A);
    actual[counter] = new Color(61.40265021929976d, 45.423009737434626d, 16.157344450988198d);
    ++counter;

    //Capri
    expected[counter] = new Color(0x00BFFF);
    actual[counter] = new Color(72.54923231908798d, -17.648035256172754d, -42.54831832987773d);
    ++counter;

    //Caput mortuum
    expected[counter] = new Color(0x592720);
    actual[counter] = new Color(22.581098568009956d, 22.3646965266113d, 15.4993534743617d);
    ++counter;

    //Cardinal
    expected[counter] = new Color(0xC41E3A);
    actual[counter] = new Color(42.71770214921033d, 62.90497654022026d, 28.481017056177883d);
    ++counter;

    //Caribbean green
    expected[counter] = new Color(0x00CC99);
    actual[counter] = new Color(73.2105238010994d, -54.459689357692966d, 13.650710188436221d);
    ++counter;

    //Carmine
    expected[counter] = new Color(0x960018);
    actual[counter] = new Color(30.75965240401549d, 54.35310760705095d, 33.13998044773774d);
    ++counter;

    //Carmine (M&P)
    expected[counter] = new Color(0xD70040);
    actual[counter] = new Color(45.382854217245914d, 71.83122443383743d, 28.95209732755323d);
    ++counter;

    //Carmine pink
    expected[counter] = new Color(0xEB4C42);
    actual[counter] = new Color(55.302727666344296d, 60.448950321253804d, 40.43293660744188d);
    ++counter;

    //Carmine red
    expected[counter] = new Color(0xFF0038);
    actual[counter] = new Color(53.5414392874566d, 80.95077216700763d, 45.1305396417777d);
    ++counter;

    //Carnation pink
    expected[counter] = new Color(0xFFA6C9);
    actual[counter] = new Color(77.72685769876246d, 37.46503183283001d, -4.165374137011724d);
    ++counter;

    //Carnelian
    expected[counter] = new Color(0xB31B1B);
    actual[counter] = new Color(38.6325006277535d, 57.78983220368497d, 41.05356489930063d);
    ++counter;

    //Carolina blue
    expected[counter] = new Color(0x56A0D3);
    actual[counter] = new Color(63.196485672769185d, -8.013647380699817d, -32.95986043563439d);
    ++counter;

    //Carrot orange
    expected[counter] = new Color(0xED9121);
    actual[counter] = new Color(68.28886532098599d, 27.319611081436324d, 67.34037828071406d);
    ++counter;

    //Castleton green
    expected[counter] = new Color(0x00563F);
    actual[counter] = new Color(31.839801737951838d, -29.086764852965157d, 7.083993062926819d);
    ++counter;

    //Catalina blue
    expected[counter] = new Color(0x062A78);
    actual[counter] = new Color(20.245861150676177d, 21.83563759037166d, -47.540438340726745d);
    ++counter;

    //Catawba
    expected[counter] = new Color(0x703642);
    actual[counter] = new Color(30.583964894784387d, 26.9739177336239d, 4.503520362954694d);
    ++counter;

    //Cedar Chest
    expected[counter] = new Color(0xC95A49);
    actual[counter] = new Color(52.07479820375771d, 42.972736994129015d, 31.298122488254364d);
    ++counter;

    //Ceil
    expected[counter] = new Color(0x92A1CF);
    actual[counter] = new Color(66.6006270254356d, 5.261463720343029d, -25.215607167739385d);
    ++counter;

    //Celadon
    expected[counter] = new Color(0xACE1AF);
    actual[counter] = new Color(84.85146237506622d, -26.616006885019804d, 19.050241355371522d);
    ++counter;

    //Celadon blue
    expected[counter] = new Color(0x007BA7);
    actual[counter] = new Color(48.204469904343796d, -12.320857899204452d, -31.44906521441775d);
    ++counter;

    //Celadon green
    expected[counter] = new Color(0x2F847C);
    actual[counter] = new Color(50.17089991235737d, -27.19754605580832d, -3.206083442023955d);
    ++counter;

    //Celeste
    expected[counter] = new Color(0xB2FFFF);
    actual[counter] = new Color(95.24718239458254d, -23.361668255793887d, -7.5472253511913445d);
    ++counter;

    //Celestial blue
    expected[counter] = new Color(0x4997D0);
    actual[counter] = new Color(59.982355698209204d, -6.301356447127593d, -36.32994313940954d);
    ++counter;

    //Cerise
    expected[counter] = new Color(0xDE3163);
    actual[counter] = new Color(50.24801411452434d, 67.5467044937037d, 14.159328594387599d);
    ++counter;

    //Cerise pink
    expected[counter] = new Color(0xEC3B83);
    actual[counter] = new Color(54.6573808300211d, 70.92432480012717d, 1.4930393714281953d);
    ++counter;

    //Cerulean
    expected[counter] = new Color(0x007BA7);
    actual[counter] = new Color(48.204469904343796d, -12.320857899204452d, -31.44906521441775d);
    ++counter;

    //Cerulean blue
    expected[counter] = new Color(0x2A52BE);
    actual[counter] = new Color(38.27777558438047d, 25.407208109875125d, -60.71106542553433d);
    ++counter;

    //Cerulean frost
    expected[counter] = new Color(0x6D9BC3);
    actual[counter] = new Color(62.197469826579436d, -4.847932911283492d, -25.48735979030461d);
    ++counter;

    //CG Blue
    expected[counter] = new Color(0x007AA5);
    actual[counter] = new Color(47.79767321868507d, -12.506086540222395d, -30.91855365247391d);
    ++counter;

    //CG Red
    expected[counter] = new Color(0xE03C31);
    actual[counter] = new Color(51.037242264209766d, 62.150764493238086d, 44.45894291170228d);
    ++counter;

    //Chamoisee
    expected[counter] = new Color(0xA0785A);
    actual[counter] = new Color(53.64798877048527d, 11.637750184630868d, 22.530070201320996d);
    ++counter;

    //Champagne
    expected[counter] = new Color(0xF7E7CE);
    actual[counter] = new Color(92.30150532400324d, 1.4497498504169037d, 14.124335354118344d);
    ++counter;

    //Charcoal
    expected[counter] = new Color(0x36454F);
    actual[counter] = new Color(28.39327821556661d, -3.2477358819143767d, -7.961408528185398d);
    ++counter;

    //Charleston green
    expected[counter] = new Color(0x232B2B);
    actual[counter] = new Color(16.79406340116236d, -3.475013183243253d, -1.1734163954328913d);
    ++counter;

    //Charm pink
    expected[counter] = new Color(0xE68FAC);
    actual[counter] = new Color(69.07345083307982d, 36.66746851567304d, -1.2002544960622474d);
    ++counter;

    //Chartreuse (traditional)
    expected[counter] = new Color(0xDFFF00);
    actual[counter] = new Color(94.82644191370333d, -34.508998837706585d, 91.73634275405178d);
    ++counter;

    //Chartreuse (web)
    expected[counter] = new Color(0x7FFF00);
    actual[counter] = new Color(89.87420853068858d, -68.06912800112325d, 85.78236967052449d);
    ++counter;

    //Cherry
    expected[counter] = new Color(0xDE3163);
    actual[counter] = new Color(50.24801411452434d, 67.5467044937037d, 14.159328594387599d);
    ++counter;

    //Cherry blossom pink
    expected[counter] = new Color(0xFFB7C5);
    actual[counter] = new Color(81.37847053331744d, 28.007381042494337d, 3.3401945853288595d);
    ++counter;

    //Chestnut
    expected[counter] = new Color(0x954535);
    actual[counter] = new Color(39.4163544831277d, 32.3258504351136d, 25.520607399714635d);
    ++counter;

    //China pink
    expected[counter] = new Color(0xDE6FA1);
    actual[counter] = new Color(61.195675130471756d, 48.827074937279114d, -6.695732956624401d);
    ++counter;

    //China rose
    expected[counter] = new Color(0xA8516E);
    actual[counter] = new Color(46.090302055604326d, 38.92358983121169d, 0.3008339032674501d);
    ++counter;

    //Chinese red
    expected[counter] = new Color(0xAA381E);
    actual[counter] = new Color(40.357996822897924d, 45.40658047103038d, 40.46676394114276d);
    ++counter;

    //Chinese violet
    expected[counter] = new Color(0x856088);
    actual[counter] = new Color(45.811550307829705d, 22.287419169017664d, -16.300846733888697d);
    ++counter;

    //Chocolate (traditional)
    expected[counter] = new Color(0x7B3F00);
    actual[counter] = new Color(33.49065204051319d, 22.294354142186112d, 43.800337082825216d);
    ++counter;

    //Chocolate (web)
    expected[counter] = new Color(0xD2691E);
    actual[counter] = new Color(55.98605299432204d, 37.05823514749024d, 56.74360722848544d);
    ++counter;

    //Chrome yellow
    expected[counter] = new Color(0xFFA700);
    actual[counter] = new Color(75.38747461938554d, 22.893126775896555d, 79.25424171339472d);
    ++counter;

    //Cinereous
    expected[counter] = new Color(0x98817B);
    actual[counter] = new Color(55.89300602660933d, 7.780304158951312d, 6.506662681508812d);
    ++counter;

    //Cinnabar
    expected[counter] = new Color(0xE34234);
    actual[counter] = new Color(52.370344868584624d, 61.09238608164025d, 44.41743162254442d);
    ++counter;

    //Cinnamon
    expected[counter] = new Color(0xD2691E);
    actual[counter] = new Color(55.98605299432204d, 37.05823514749024d, 56.74360722848544d);
    ++counter;

    //Citrine
    expected[counter] = new Color(0xE4D00A);
    actual[counter] = new Color(82.7150070563268d, -9.837683641048201d, 82.10548516345543d);
    ++counter;

    //Citron
    expected[counter] = new Color(0x9FA91F);
    actual[counter] = new Color(66.40192932132207d, -19.6084879317715d, 63.10998844136281d);
    ++counter;

    //Claret
    expected[counter] = new Color(0x7F1734);
    actual[counter] = new Color(27.77138057018415d, 44.816753978504735d, 10.248440536124303d);
    ++counter;

    //Classic rose
    expected[counter] = new Color(0xFBCCE7);
    actual[counter] = new Color(86.73354105880611d, 20.858603121909624d, -7.038204361611933d);
    ++counter;

    //Cobalt blue
    expected[counter] = new Color(0x0047AB);
    actual[counter] = new Color(32.803046040979005d, 22.526286167447008d, -58.44809274395356d);
    ++counter;

    //Cocoa brown
    expected[counter] = new Color(0xD2691E);
    actual[counter] = new Color(55.98605299432204d, 37.05823514749024d, 56.74360722848544d);
    ++counter;

    //Coconut
    expected[counter] = new Color(0x965A3E);
    actual[counter] = new Color(44.43896781840167d, 21.76986591233382d, 26.499085606154637d);
    ++counter;

    //Coffee
    expected[counter] = new Color(0x6F4E37);
    actual[counter] = new Color(36.183996450213854d, 10.871618872692862d, 19.094335268349884d);
    ++counter;

    //Columbia blue
    expected[counter] = new Color(0xC4D8E2);
    actual[counter] = new Color(85.16877722817772d, -4.670779284262405d, -7.19131716272805d);
    ++counter;

    //Congo pink
    expected[counter] = new Color(0xF88379);
    actual[counter] = new Color(67.7021458472602d, 43.59124858610469d, 25.738986808505327d);
    ++counter;

    //Cool black
    expected[counter] = new Color(0x000000);
    actual[counter] = new Color(0.0d, 0.0d, 0.0d);
    ++counter;

    //Cool grey
    expected[counter] = new Color(0x8C92AC);
    actual[counter] = new Color(60.88014959096597d, 3.4397709671458165d, -14.347015476857528d);
    ++counter;

    //Copper
    expected[counter] = new Color(0xB87333);
    actual[counter] = new Color(54.752445665678394d, 21.656171266954736d, 45.39523426596843d);
    ++counter;

    //Copper (Crayola)
    expected[counter] = new Color(0xDA8A67);
    actual[counter] = new Color(65.01148219943127d, 26.9071572458397d, 31.40391528250599d);
    ++counter;

    //Copper penny
    expected[counter] = new Color(0xAD6F69);
    actual[counter] = new Color(53.24702994325462d, 23.866569637259804d, 13.569959558974155d);
    ++counter;

    //Copper red
    expected[counter] = new Color(0xCB6D51);
    actual[counter] = new Color(56.31522328194525d, 34.61236139895968d, 32.11141125892567d);
    ++counter;

    //Copper rose
    expected[counter] = new Color(0x996666);
    actual[counter] = new Color(48.553978062430346d, 20.55863395350055d, 8.403267360020262d);
    ++counter;

    //Coquelicot
    expected[counter] = new Color(0xFF3800);
    actual[counter] = new Color(56.176140296286306d, 71.7010422594866d, 68.35435528786833d);
    ++counter;

    //Coral
    expected[counter] = new Color(0xFF7F50);
    actual[counter] = new Color(67.29048083264607d, 45.36151184134313d, 47.48988839669253d);
    ++counter;

    //Coral pink
    expected[counter] = new Color(0xF88379);
    actual[counter] = new Color(67.7021458472602d, 43.59124858610469d, 25.738986808505327d);
    ++counter;

    //Coral red
    expected[counter] = new Color(0xFF4040);
    actual[counter] = new Color(57.36361970420954d, 70.56358657768091d, 44.8182445872709d);
    ++counter;

    //Cordovan
    expected[counter] = new Color(0x893F45);
    actual[counter] = new Color(36.56134125079604d, 32.16416497197391d, 11.539092131397478d);
    ++counter;

    //Corn
    expected[counter] = new Color(0xFBEC5D);
    actual[counter] = new Color(92.26078266031232d, -11.365697231189353d, 68.82847284605664d);
    ++counter;

    //Cornell Red
    expected[counter] = new Color(0xB31B1B);
    actual[counter] = new Color(38.6325006277535d, 57.78983220368497d, 41.05356489930063d);
    ++counter;

    //Cornflower blue
    expected[counter] = new Color(0x6495ED);
    actual[counter] = new Color(61.92818670495679d, 9.342771843650732d, -49.30613443535423d);
    ++counter;

    //Cornsilk
    expected[counter] = new Color(0xFFF8DC);
    actual[counter] = new Color(97.45526614880224d, -2.2139150314787193d, 14.284340428869946d);
    ++counter;

    //Cosmic latte
    expected[counter] = new Color(0xFFF8E7);
    actual[counter] = new Color(97.69816490188055d, -0.4917742172108053d, 8.980315132126936d);
    ++counter;

    //Coyote brown
    expected[counter] = new Color(0x81613e);
    actual[counter] = new Color(43.601513504719264d, 8.390893961759073d, 24.888301234991317d);
    ++counter;

    //Cotton candy
    expected[counter] = new Color(0xFFBCD9);
    actual[counter] = new Color(83.03886704268302d, 28.368515474637423d, -4.986948834938643d);
    ++counter;

    //Cream
    expected[counter] = new Color(0xFFFDD0);
    actual[counter] = new Color(98.45791256096271d, -6.489839960689414d, 21.823916301204992d);
    ++counter;

    //Crimson
    expected[counter] = new Color(0xDC143C);
    actual[counter] = new Color(47.02980511087301d, 70.93577651695688d, 33.59489365485291d);
    ++counter;

    //Crimson glory
    expected[counter] = new Color(0xBE0032);
    actual[counter] = new Color(39.87773037085703d, 65.26081284123889d, 29.713917588331505d);
    ++counter;

    //Crimson red
    expected[counter] = new Color(0x990000);
    actual[counter] = new Color(31.282832098372488d, 54.710925420263266d, 45.14223821546162d);
    ++counter;

    //Cyan
    expected[counter] = new Color(0x00FFFF);
    actual[counter] = new Color(91.11652110946342d, -48.079618466228716d, -14.138127754846131d);
    ++counter;

    //Cyan azure
    expected[counter] = new Color(0x4E82b4);
    actual[counter] = new Color(52.818188514782136d, -2.4277936866598515d, -31.624752321555395d);
    ++counter;

    //Cyan-blue azure
    expected[counter] = new Color(0x4682BF);
    actual[counter] = new Color(52.98115601101337d, -0.37231683862348763d, -37.69749618920457d);
    ++counter;

    //Cyan cobalt blue
    expected[counter] = new Color(0x28589C);
    actual[counter] = new Color(37.53714511707155d, 8.1209173843593d, -41.77055370618892d);
    ++counter;

    //Cyan cornflower blue
    expected[counter] = new Color(0x188BC2);
    actual[counter] = new Color(54.61043098679664d, -10.233141583599558d, -36.93107972195207d);
    ++counter;

    //Cyan (process)
    expected[counter] = new Color(0x00B7EB);
    actual[counter] = new Color(69.37336276731244d, -20.41103829396762d, -36.67662526828212d);
    ++counter;

    //Cyber grape
    expected[counter] = new Color(0x58427C);
    actual[counter] = new Color(32.75848834619972d, 22.773968555898556d, -29.6148346969627d);
    ++counter;

    //Cyber yellow
    expected[counter] = new Color(0xFFD300);
    actual[counter] = new Color(85.93065289470253d, 0.10505883727629506d, 86.4348021523995d);
    ++counter;

    //Daffodil
    expected[counter] = new Color(0xFFFF31);
    actual[counter] = new Color(97.22831152575944d, -20.8281750629985d, 88.01622251434208d);
    ++counter;

    //Dandelion
    expected[counter] = new Color(0xF0E130);
    actual[counter] = new Color(88.25137182628997d, -12.501980685942659d, 80.0981318157814d);
    ++counter;

    //Dark blue
    expected[counter] = new Color(0x00008B);
    actual[counter] = new Color(14.757156815274186d, 50.42926919587942d, -68.6832814032651d);
    ++counter;

    //Dark blue-gray
    expected[counter] = new Color(0x666699);
    actual[counter] = new Color(45.11962365976219d, 12.519084162994965d, -27.756644379323458d);
    ++counter;

    //Dark brown
    expected[counter] = new Color(0x654321);
    actual[counter] = new Color(31.557047663700253d, 10.87788982866758d, 26.1862382551975d);
    ++counter;

    //Dark brown-tangelo
    expected[counter] = new Color(0x88654E);
    actual[counter] = new Color(45.759483454237916d, 10.91633550490273d, 18.50487747544367d);
    ++counter;

    //Dark byzantium
    expected[counter] = new Color(0x5D3954);
    actual[counter] = new Color(29.14217929557215d, 20.61739297731985d, -9.693586756765793d);
    ++counter;

    //Dark candy apple red
    expected[counter] = new Color(0xA40000);
    actual[counter] = new Color(33.75802028185585d, 57.57496359432887d, 47.95523937096288d);
    ++counter;

    //Dark cerulean
    expected[counter] = new Color(0x08457E);
    actual[counter] = new Color(28.938850001165243d, 5.319518822776676d, -37.23205103591323d);
    ++counter;

    //Dark chestnut
    expected[counter] = new Color(0x986960);
    actual[counter] = new Color(49.035714719480595d, 17.62185147910289d, 12.628860062135061d);
    ++counter;

    //Dark coral
    expected[counter] = new Color(0xCD5B45);
    actual[counter] = new Color(52.82996983557183d, 43.72166383296905d, 34.62066089241949d);
    ++counter;

    //Dark cyan
    expected[counter] = new Color(0x008B8B);
    actual[counter] = new Color(52.207519815998296d, -30.615179575610828d, -9.002594735263369d);
    ++counter;

    //Dark electric blue
    expected[counter] = new Color(0x536878);
    actual[counter] = new Color(42.90708135275119d, -3.7214122749534284d, -11.495581740131232d);
    ++counter;

    //Dark goldenrod
    expected[counter] = new Color(0xB8860B);
    actual[counter] = new Color(59.2185428516686d, 9.865752940643402d, 62.73421565950203d);
    ++counter;

    //Dark gray (X11)
    expected[counter] = new Color(0xA9A9A9);
    actual[counter] = new Color(69.23779560557699d, 0.0038654605191701386d, -0.007648023320605546d);
    ++counter;

    //Dark green
    expected[counter] = new Color(0x013220);
    actual[counter] = new Color(17.422699674172613d, -21.096043786174718d, 7.117413245366821d);
    ++counter;

    //Dark green (X11)
    expected[counter] = new Color(0x006400);
    actual[counter] = new Color(36.20351872497333d, -43.37063760702395d, 41.859202505373034d);
    ++counter;

    //Dark imperial blue
    expected[counter] = new Color(0x00416A);
    actual[counter] = new Color(26.2191743877492d, -1.2071953404108882d, -28.93942230441714d);
    ++counter;

    //Dark jungle green
    expected[counter] = new Color(0x1A2421);
    actual[counter] = new Color(13.176298397143547d, -5.230643867806528d, 0.555020119027555d);
    ++counter;

    //Dark khaki
    expected[counter] = new Color(0xBDB76B);
    actual[counter] = new Color(73.38127833356914d, -8.787208024487015d, 39.287611414138766d);
    ++counter;

    //Dark lava
    expected[counter] = new Color(0x483C32);
    actual[counter] = new Color(26.27317414728777d, 3.4218627459425277d, 8.13115687690188d);
    ++counter;

    //Dark lavender
    expected[counter] = new Color(0x734F96);
    actual[counter] = new Color(40.30992460103436d, 29.69714966532566d, -33.419062652234935d);
    ++counter;

    //Dark liver
    expected[counter] = new Color(0x534B4F);
    actual[counter] = new Color(32.77882120896829d, 4.15435550819121d, -1.1651365969197913d);
    ++counter;

    //Dark liver (horses)
    expected[counter] = new Color(0x543D37);
    actual[counter] = new Color(28.10927591327554d, 9.120037621595218d, 7.633860255381042d);
    ++counter;

    //Dark magenta
    expected[counter] = new Color(0x8B008B);
    actual[counter] = new Color(32.59748369188066d, 62.56435980770186d, -38.74238081231827d);
    ++counter;

    //Dark medium gray
    expected[counter] = new Color(0xA9A9A9);
    actual[counter] = new Color(69.23779560557699d, 0.0038654605191701386d, -0.007648023320605546d);
    ++counter;

    //Dark midnight blue
    expected[counter] = new Color(0x003366);
    actual[counter] = new Color(21.3084561073249d, 6.824640672861149d, -34.21719682357717d);
    ++counter;

    //Dark moss green
    expected[counter] = new Color(0x4A5D23);
    actual[counter] = new Color(36.75432341303358d, -17.39010541300734d, 30.3186301655874d);
    ++counter;

    //Dark olive green
    expected[counter] = new Color(0x556B2F);
    actual[counter] = new Color(42.2340254244788d, -18.82842997910361d, 30.596825942752716d);
    ++counter;

    //Dark orange
    expected[counter] = new Color(0xFF8C00);
    actual[counter] = new Color(69.48104411888188d, 36.830887986405436d, 75.49475690652436d);
    ++counter;

    //Dark orchid
    expected[counter] = new Color(0x9932CC);
    actual[counter] = new Color(43.37926695780136d, 65.16646285944505d, -60.10938783790765d);
    ++counter;

    //Dark pastel blue
    expected[counter] = new Color(0x779ECB);
    actual[counter] = new Color(63.90703665221034d, -1.6872158800217418d, -27.27977098079297d);
    ++counter;

    //Dark pastel green
    expected[counter] = new Color(0x03C03C);
    actual[counter] = new Color(68.05367721139781d, -66.38564782445971d, 52.97316578666628d);
    ++counter;

    //Dark pastel purple
    expected[counter] = new Color(0x966FD6);
    actual[counter] = new Color(54.77023288734152d, 36.893633927191416d, -47.584303842315535d);
    ++counter;

    //Dark pastel red
    expected[counter] = new Color(0xC23B22);
    actual[counter] = new Color(45.23823589096777d, 52.51354195058489d, 44.624869421649706d);
    ++counter;

    //Dark pink
    expected[counter] = new Color(0xE75480);
    actual[counter] = new Color(56.96621419313679d, 60.25229263684429d, 6.49170969833075d);
    ++counter;

    //Dark powder blue
    expected[counter] = new Color(0x003399);
    actual[counter] = new Color(25.765848836459647d, 28.893196922698454d, -59.09703272477203d);
    ++counter;

    //Dark puce
    expected[counter] = new Color(0x4F3A3C);
    actual[counter] = new Color(26.77638004929461d, 9.63441557029951d, 2.3711061527777466d);
    ++counter;

    //Dark raspberry
    expected[counter] = new Color(0x872657);
    actual[counter] = new Color(32.31427598179d, 45.37287912380902d, -6.199832038866848d);
    ++counter;

    //Dark red
    expected[counter] = new Color(0x8B0000);
    actual[counter] = new Color(28.084732284208997d, 51.010406803797395d, 41.2946561989777d);
    ++counter;

    //Dark salmon
    expected[counter] = new Color(0xE9967A);
    actual[counter] = new Color(69.85346453844176d, 28.17906140547305d, 27.704657031827185d);
    ++counter;

    //Dark scarlet
    expected[counter] = new Color(0x560319);
    actual[counter] = new Color(16.073194686127565d, 36.332212581837524d, 11.874452484449083d);
    ++counter;

    //Dark sea green
    expected[counter] = new Color(0x8FBC8F);
    actual[counter] = new Color(72.08740631745533d, -23.81796002269082d, 18.032376508741343d);
    ++counter;

    //Dark sienna
    expected[counter] = new Color(0x3C1414);
    actual[counter] = new Color(12.680839947273018d, 19.726519773027793d, 9.912884034371267d);
    ++counter;

    //Dark sky blue
    expected[counter] = new Color(0x8CBED6);
    actual[counter] = new Color(74.35411377887161d, -10.544542885420338d, -17.289855693999034d);
    ++counter;

    //Dark slate blue
    expected[counter] = new Color(0x483D8B);
    actual[counter] = new Color(30.829287209616794d, 26.05839931922399d, -42.088827482424705d);
    ++counter;

    //Dark slate gray
    expected[counter] = new Color(0x2F4F4F);
    actual[counter] = new Color(31.25607829935253d, -11.717361159440998d, -3.727239403217475d);
    ++counter;

    //Dark spring green
    expected[counter] = new Color(0x177245);
    actual[counter] = new Color(42.22564118226889d, -37.040627717321364d, 17.758219238717544d);
    ++counter;

    //Dark tan
    expected[counter] = new Color(0x918151);
    actual[counter] = new Color(54.35894512619521d, -0.9399509234143677d, 28.205001423862562d);
    ++counter;

    //Dark tangerine
    expected[counter] = new Color(0xFFA812);
    actual[counter] = new Color(75.64312010547418d, 22.529496755538503d, 77.23232069577614d);
    ++counter;

    //Dark taupe
    expected[counter] = new Color(0x483C32);
    actual[counter] = new Color(26.27317414728777d, 3.4218627459425277d, 8.13115687690188d);
    ++counter;

    //Dark terra cotta
    expected[counter] = new Color(0xCC4E5C);
    actual[counter] = new Color(50.75599203390229d, 51.01090908377653d, 18.55620491540878d);
    ++counter;

    //Dark turquoise
    expected[counter] = new Color(0x00CED1);
    actual[counter] = new Color(75.29307531314078d, -40.036341602166345d, -13.519327285314976d);
    ++counter;

    //Dark vanilla
    expected[counter] = new Color(0xD1BEA8);
    actual[counter] = new Color(77.99845306120291d, 3.1845746648717643d, 13.54781502424618d);
    ++counter;

    //Dark violet
    expected[counter] = new Color(0x9400D3);
    actual[counter] = new Color(39.57886745488795d, 76.3363721986832d, -70.37832879888671d);
    ++counter;

    //Dark yellow
    expected[counter] = new Color(0x9B870C);
    actual[counter] = new Color(56.40980018544437d, -3.96731941485734d, 59.08642110053282d);
    ++counter;

    //Dartmouth green
    expected[counter] = new Color(0x00703C);
    actual[counter] = new Color(41.080044104873366d, -40.42056959160181d, 21.361223610224954d);
    ++counter;

    //Davy's grey
    expected[counter] = new Color(0x555555);
    actual[counter] = new Color(36.14585083971984d, 0.0023647693635220346d, -0.00467882446352208d);
    ++counter;

    //Debian red
    expected[counter] = new Color(0xD70A53);
    actual[counter] = new Color(46.02708935706389d, 71.91366355540252d, 18.02163302395683d);
    ++counter;

    //Deep aquamarine
    expected[counter] = new Color(0x40826D);
    actual[counter] = new Color(49.688849202463615d, -26.47236214284604d, 4.941955382562946d);
    ++counter;

    //Deep carmine
    expected[counter] = new Color(0xA9203E);
    actual[counter] = new Color(37.509860617590846d, 55.140715666324226d, 18.25216641053544d);
    ++counter;

    //Deep carmine pink
    expected[counter] = new Color(0xEF3038);
    actual[counter] = new Color(52.67495911494035d, 70.27412226790413d, 43.252138448836774d);
    ++counter;

    //Deep carrot orange
    expected[counter] = new Color(0xE9692C);
    actual[counter] = new Color(59.533506967539466d, 46.32057344890805d, 55.6300642939514d);
    ++counter;

    //Deep cerise
    expected[counter] = new Color(0xDA3287);
    actual[counter] = new Color(50.61212801271347d, 69.29529439168824d, -7.230066347514352d);
    ++counter;

    //Deep champagne
    expected[counter] = new Color(0xFAD6A5);
    actual[counter] = new Color(87.54994475400268d, 5.761013685243343d, 28.87340254036641d);
    ++counter;

    //Deep chestnut
    expected[counter] = new Color(0xB94E48);
    actual[counter] = new Color(47.27603608043307d, 42.85577477091107d, 25.315521679576293d);
    ++counter;

    //Deep coffee
    expected[counter] = new Color(0x704241);
    actual[counter] = new Color(33.39884245642248d, 19.80060941083642d, 9.120001664722155d);
    ++counter;

    //Deep fuchsia
    expected[counter] = new Color(0xC154C1);
    actual[counter] = new Color(53.52296758790244d, 57.9902413834551d, -37.23531171401191d);
    ++counter;

    //Deep Green
    expected[counter] = new Color(0x056608);
    actual[counter] = new Color(37.02706568972191d, -43.011056371485026d, 40.312374578069424d);
    ++counter;

    //Deep green-cyan turquoise
    expected[counter] = new Color(0x0E7C61);
    actual[counter] = new Color(46.139191447432026d, -35.42280562137842d, 6.739452773082433d);
    ++counter;

    //Deep jungle green
    expected[counter] = new Color(0x004B49);
    actual[counter] = new Color(28.149493920336873d, -20.558597571603997d, -4.649496295919853d);
    ++counter;

    //Deep koamaru
    expected[counter] = new Color(0x333366);
    actual[counter] = new Color(23.7729048578585d, 15.252229612343543d, -30.129027914154406d);
    ++counter;

    //Deep lemon
    expected[counter] = new Color(0xF5C71A);
    actual[counter] = new Color(82.01934688908878d, 2.2486195224217242d, 80.13188434849468d);
    ++counter;

    //Deep lilac
    expected[counter] = new Color(0x9955BB);
    actual[counter] = new Color(48.07955071825961d, 45.663526424852606d, -42.71080556179905d);
    ++counter;

    //Deep magenta
    expected[counter] = new Color(0xCC00CC);
    actual[counter] = new Color(48.507306495073536d, 83.04665236109265d, -51.42584437610736d);
    ++counter;

    //Deep maroon
    expected[counter] = new Color(0x820000);
    actual[counter] = new Color(25.99799952984364d, 48.59585008142134d, 38.66179243851719d);
    ++counter;

    //Deep mauve
    expected[counter] = new Color(0xD473D4);
    actual[counter] = new Color(62.51774743427063d, 51.737261530153845d, -33.794263123622905d);
    ++counter;

    //Deep moss green
    expected[counter] = new Color(0x355E3B);
    actual[counter] = new Color(36.13415137405786d, -22.791511163547106d, 15.687047102832564d);
    ++counter;

    //Deep peach
    expected[counter] = new Color(0xFFCBA4);
    actual[counter] = new Color(85.32800748877085d, 13.25761105083928d, 26.465928498075698d);
    ++counter;

    //Deep pink
    expected[counter] = new Color(0xFF1493);
    actual[counter] = new Color(55.95428053659428d, 84.55626603780291d, -5.71470820760005d);
    ++counter;

    //Deep puce
    expected[counter] = new Color(0xA95C68);
    actual[counter] = new Color(48.37171048997175d, 32.698320743408225d, 7.236391918780716d);
    ++counter;

    //Deep Red
    expected[counter] = new Color(0x850101);
    actual[counter] = new Color(26.76450258874832d, 49.241732492521564d, 39.206373752188874d);
    ++counter;

    //Deep ruby
    expected[counter] = new Color(0x843F5B);
    actual[counter] = new Color(36.39665496683406d, 32.961366432683434d, -2.7571932309076064d);
    ++counter;

    //Deep saffron
    expected[counter] = new Color(0xFF9933);
    actual[counter] = new Color(72.41623922190195d, 31.03038375024991d, 65.73003541156572d);
    ++counter;

    //Deep sky blue
    expected[counter] = new Color(0x00BFFF);
    actual[counter] = new Color(72.54923231908798d, -17.648035256172754d, -42.54831832987773d);
    ++counter;

    //Deep Space Sparkle
    expected[counter] = new Color(0x4A646C);
    actual[counter] = new Color(40.65905283389285d, -7.487121011492653d, -7.642345351669766d);
    ++counter;

    //Deep spring bud
    expected[counter] = new Color(0x556B2F);
    actual[counter] = new Color(42.2340254244788d, -18.82842997910361d, 30.596825942752716d);
    ++counter;

    //Deep Taupe
    expected[counter] = new Color(0x7E5E60);
    actual[counter] = new Color(43.190393418356145d, 13.367692689669031d, 3.937808696388634d);
    ++counter;

    //Deep Tuscan red
    expected[counter] = new Color(0x66424D);
    actual[counter] = new Color(32.38502825098519d, 17.35888568960209d, -0.204198482339224d);
    ++counter;

    //Deep violet
    expected[counter] = new Color(0x330066);
    actual[counter] = new Color(13.609578399716938d, 42.79295511742076d, -46.64985708085442d);
    ++counter;

    //Deer
    expected[counter] = new Color(0xBA8759);
    actual[counter] = new Color(60.327363026219615d, 14.125406396949035d, 32.28777039860971d);
    ++counter;

    //Denim
    expected[counter] = new Color(0x1560BD);
    actual[counter] = new Color(41.531129029685225d, 14.035577585411712d, -54.87987878217005d);
    ++counter;

    //Desaturated cyan
    expected[counter] = new Color(0x669999);
    actual[counter] = new Color(59.804764808211644d, -16.890124238282787d, -5.427918568274626d);
    ++counter;

    //Desert
    expected[counter] = new Color(0xC19A6B);
    actual[counter] = new Color(66.14396786846372d, 8.369210596896659d, 30.14844295160646d);
    ++counter;

    //Desert sand
    expected[counter] = new Color(0xEDC9AF);
    actual[counter] = new Color(83.37549127323764d, 8.872024812140111d, 17.71487948388153d);
    ++counter;

    //Desire
    expected[counter] = new Color(0xEA3C53);
    actual[counter] = new Color(53.329005430460086d, 66.60840508490202d, 28.261248437570696d);
    ++counter;

    //Diamond
    expected[counter] = new Color(0xB9F2FF);
    actual[counter] = new Color(92.14884231860381d, -15.034919988861695d, -12.110369424053413d);
    ++counter;

    //Dim gray
    expected[counter] = new Color(0x696969);
    actual[counter] = new Color(44.41356014781601d, 0.0027397028503628462d, -0.005420650705589836d);
    ++counter;

    //Dirt
    expected[counter] = new Color(0x9B7653);
    actual[counter] = new Color(52.45339624891972d, 9.864351323168098d, 24.835571259807708d);
    ++counter;

    //Dodger blue
    expected[counter] = new Color(0x1E90FF);
    actual[counter] = new Color(59.381725677880596d, 9.96958543131904d, -63.39488915058189d);
    ++counter;

    //Dogwood rose
    expected[counter] = new Color(0xD71868);
    actual[counter] = new Color(47.10517413545707d, 71.6114116081803d, 6.485496128631896d);
    ++counter;

    //Dollar bill
    expected[counter] = new Color(0x85BB65);
    actual[counter] = new Color(70.5017223816838d, -33.20782077857637d, 37.879876278197d);
    ++counter;

    //Donkey brown
    expected[counter] = new Color(0x664C28);
    actual[counter] = new Color(34.28689502365828d, 6.3755956489923165d, 25.40361311329398d);
    ++counter;

    //Drab
    expected[counter] = new Color(0x967117);
    actual[counter] = new Color(49.9252566654166d, 6.321548478211147d, 50.861272755219d);
    ++counter;

    //Duke blue
    expected[counter] = new Color(0x00009C);
    actual[counter] = new Color(17.461584577090136d, 54.86343443555133d, -74.72249283347648d);
    ++counter;

    //Dust storm
    expected[counter] = new Color(0xE5CCC9);
    actual[counter] = new Color(83.99741069048063d, 8.243413562316004d, 4.677790745668209d);
    ++counter;

    //Dutch white
    expected[counter] = new Color(0xEFDFBB);
    actual[counter] = new Color(89.25882513586477d, -0.12660020070837108d, 19.63918220108416d);
    ++counter;

    //Earth yellow
    expected[counter] = new Color(0xE1A95F);
    actual[counter] = new Color(73.02976489809464d, 12.491755297316109d, 45.67956649422902d);
    ++counter;

    //Ebony
    expected[counter] = new Color(0x555D50);
    actual[counter] = new Color(38.44442340601431d, -5.864293152494565d, 6.410934971409333d);
    ++counter;

    //Ecru
    expected[counter] = new Color(0xC2B280);
    actual[counter] = new Color(72.8053122317831d, -1.7477082434693703d, 27.67094617697987d);
    ++counter;

    //Eerie black
    expected[counter] = new Color(0x1B1B1B);
    actual[counter] = new Color(9.766934231515162d, 0.0011685082452611573d, -0.0023119569494189918d);
    ++counter;

    //Eggplant
    expected[counter] = new Color(0x614051);
    actual[counter] = new Color(31.35244343494287d, 17.26176794629286d, -4.377229243835867d);
    ++counter;

    //Eggshell
    expected[counter] = new Color(0xF0EAD6);
    actual[counter] = new Color(92.67448928156459d, -1.317700617416262d, 10.422696921408559d);
    ++counter;

    //Egyptian blue
    expected[counter] = new Color(0x1034A6);
    actual[counter] = new Color(27.625784349278746d, 34.004972141475854d, -63.92506527698403d);
    ++counter;

    //Electric blue
    expected[counter] = new Color(0x7DF9FF);
    actual[counter] = new Color(91.38400100862438d, -33.03304956368552d, -13.532925740774093d);
    ++counter;

    //Electric crimson
    expected[counter] = new Color(0xFF003F);
    actual[counter] = new Color(53.62027412278074d, 81.16487996222399d, 41.254681554034036d);
    ++counter;

    //Electric cyan
    expected[counter] = new Color(0x00FFFF);
    actual[counter] = new Color(91.11652110946342d, -48.079618466228716d, -14.138127754846131d);
    ++counter;

    //Electric green
    expected[counter] = new Color(0x00FF00);
    actual[counter] = new Color(87.73703347354422d, -86.18463649762525d, 83.18116474777854d);
    ++counter;

    //Electric indigo
    expected[counter] = new Color(0x6F00FF);
    actual[counter] = new Color(38.89758199606652d, 82.03785508758565d, -96.69843143251764d);
    ++counter;

    //Electric lavender
    expected[counter] = new Color(0xF4BBFF);
    actual[counter] = new Color(82.91009339883898d, 31.8258716708793d, -25.618006411506734d);
    ++counter;

    //Electric lime
    expected[counter] = new Color(0xCCFF00);
    actual[counter] = new Color(93.6054959860619d, -41.94815274238556d, 90.2776433871823d);
    ++counter;

    //Electric purple
    expected[counter] = new Color(0xBF00FF);
    actual[counter] = new Color(49.8536121349416d, 89.38771339402868d, -78.2749584509531d);
    ++counter;

    //Electric ultramarine
    expected[counter] = new Color(0x3F00FF);
    actual[counter] = new Color(34.55275219968334d, 79.989679359187d, -104.04837069440612d);
    ++counter;

    //Electric violet
    expected[counter] = new Color(0x8F00FF);
    actual[counter] = new Color(42.852970394010676d, 84.38545756790572d, -90.02806472509847d);
    ++counter;

    //Electric yellow
    expected[counter] = new Color(0xFFFF33);
    actual[counter] = new Color(97.23531786540661d, -20.771711893283584d, 87.54611379013137d);
    ++counter;

    //Emerald
    expected[counter] = new Color(0x50C878);
    actual[counter] = new Color(72.47517570451704d, -51.24956261121649d, 30.251909270553345d);
    ++counter;

    //Eminence
    expected[counter] = new Color(0x6C3082);
    actual[counter] = new Color(31.609760940800015d, 40.42924261066128d, -35.02324586605465d);
    ++counter;

    //English green
    expected[counter] = new Color(0x1B4D3E);
    actual[counter] = new Color(29.12956899313444d, -20.963931167645335d, 3.9473409112831925d);
    ++counter;

    //English lavender
    expected[counter] = new Color(0xB48395);
    actual[counter] = new Color(59.984223399017125d, 21.629389203491666d, -2.176224297416507d);
    ++counter;

    //English red
    expected[counter] = new Color(0xAB4B52);
    actual[counter] = new Color(44.659107715064515d, 40.00942636228583d, 15.43116463198323d);
    ++counter;

    //English violet
    expected[counter] = new Color(0x563C5C);
    actual[counter] = new Color(29.36917480157073d, 17.804076527522d, -14.616078555139488d);
    ++counter;

    //Eton blue
    expected[counter] = new Color(0x96C8A2);
    actual[counter] = new Color(76.31487107045295d, -23.98567520869377d, 13.788683093789444d);
    ++counter;

    //Eucalyptus
    expected[counter] = new Color(0x44D7A8);
    actual[counter] = new Color(77.67203510332153d, -49.686999500668904d, 12.054502442394167d);
    ++counter;

    //Fallow
    expected[counter] = new Color(0xC19A6B);
    actual[counter] = new Color(66.14396786846372d, 8.369210596896659d, 30.14844295160646d);
    ++counter;

    //Falu red
    expected[counter] = new Color(0x801818);
    actual[counter] = new Color(27.59594966688651d, 43.257987810490754d, 28.381385828944644d);
    ++counter;

    //Fandango
    expected[counter] = new Color(0xB53389);
    actual[counter] = new Color(44.22942170951067d, 59.70070866301713d, -18.728717129055482d);
    ++counter;

    //Fandango pink
    expected[counter] = new Color(0xDE5285);
    actual[counter] = new Color(55.336728108788904d, 58.826355930122865d, 1.0022340553154097d);
    ++counter;

    //Fashion fuchsia
    expected[counter] = new Color(0xF400A1);
    actual[counter] = new Color(53.82088575046764d, 85.07779160541907d, -17.429578658478228d);
    ++counter;

    //Fawn
    expected[counter] = new Color(0xE5AA70);
    actual[counter] = new Color(73.91858760722978d, 15.001649499236603d, 38.200211978258444d);
    ++counter;

    //Feldgrau
    expected[counter] = new Color(0x4D5D53);
    actual[counter] = new Color(37.89803775580648d, -8.405976274855675d, 3.6963825570237585d);
    ++counter;

    //Feldspar
    expected[counter] = new Color(0xFDD5B1);
    actual[counter] = new Color(87.79766170011624d, 8.891506741993238d, 23.015920220729647d);
    ++counter;

    //Fern green
    expected[counter] = new Color(0x4F7942);
    actual[counter] = new Color(46.618718854967454d, -25.91289125167215d, 25.58605776491727d);
    ++counter;

    //Ferrari Red
    expected[counter] = new Color(0xFF2800);
    actual[counter] = new Color(54.84249895919224d, 75.47876748861154d, 67.81012439784367d);
    ++counter;

    //Field drab
    expected[counter] = new Color(0x6C541E);
    actual[counter] = new Color(37.15625989809828d, 3.6418150222987666d, 34.20229823223262d);
    ++counter;

    //Firebrick
    expected[counter] = new Color(0xB22222);
    actual[counter] = new Color(39.11257274771978d, 55.927797038098056d, 37.64861155320936d);
    ++counter;

    //Fire engine red
    expected[counter] = new Color(0xCE2029);
    actual[counter] = new Color(44.68123421352037d, 64.55173684246817d, 41.207359512735366d);
    ++counter;

    //Flame
    expected[counter] = new Color(0xE25822);
    actual[counter] = new Color(55.342917349659714d, 51.355395389589496d, 55.690054631851915d);
    ++counter;

    //Flamingo pink
    expected[counter] = new Color(0xFC8EAC);
    actual[counter] = new Color(71.56854760444197d, 44.846819953588025d, 2.7644899621241947d);
    ++counter;

    //Flattery
    expected[counter] = new Color(0x6B4423);
    actual[counter] = new Color(32.65985062863615d, 13.273889941160633d, 26.523357971015926d);
    ++counter;

    //Flavescent
    expected[counter] = new Color(0xF7E98E);
    actual[counter] = new Color(91.68709434260252d, -7.576402737196009d, 45.82749013171541d);
    ++counter;

    //Flax
    expected[counter] = new Color(0xEEDC82);
    actual[counter] = new Color(87.47298118621529d, -5.754182104846073d, 46.26746352933411d);
    ++counter;

    //Flirt
    expected[counter] = new Color(0xA2006D);
    actual[counter] = new Color(35.568001146349594d, 63.039888976454435d, -14.915305585465333d);
    ++counter;

    //Floral white
    expected[counter] = new Color(0xFFFAF0);
    actual[counter] = new Color(98.40143252802201d, -0.031841635011520264d, 5.366211904742801d);
    ++counter;

    //Fluorescent orange
    expected[counter] = new Color(0xFFBF00);
    actual[counter] = new Color(81.02792148118404d, 10.386126365583504d, 83.035714705514d);
    ++counter;

    //Fluorescent pink
    expected[counter] = new Color(0xFF1493);
    actual[counter] = new Color(55.95428053659428d, 84.55626603780291d, -5.71470820760005d);
    ++counter;

    //Fluorescent yellow
    expected[counter] = new Color(0xCCFF00);
    actual[counter] = new Color(93.6054959860619d, -41.94815274238556d, 90.2776433871823d);
    ++counter;

    //Folly
    expected[counter] = new Color(0xFF004F);
    actual[counter] = new Color(53.84031308992945d, 81.76061600214291d, 32.14122187174836d);
    ++counter;

    //Forest green (traditional)
    expected[counter] = new Color(0x014421);
    actual[counter] = new Color(24.4828822801234d, -28.74734648543356d, 15.864912022730016d);
    ++counter;

    //Forest green (web)
    expected[counter] = new Color(0x228B22);
    actual[counter] = new Color(50.59443111773345d, -49.586362838919904d, 45.01596496396723d);
    ++counter;

    //French beige
    expected[counter] = new Color(0xA67B5B);
    actual[counter] = new Color(55.10141383842924d, 12.58881169464454d, 24.00366729605986d);
    ++counter;

    //French bistre
    expected[counter] = new Color(0x856D4D);
    actual[counter] = new Color(47.5718451776171d, 4.80021042469303d, 21.434691244294445d);
    ++counter;

    //French blue
    expected[counter] = new Color(0x0072BB);
    actual[counter] = new Color(46.47525194718554d, 0.8331809594224748d, -45.79774150394557d);
    ++counter;

    //French fuchsia
    expected[counter] = new Color(0xFD3F92);
    actual[counter] = new Color(58.52080216856412d, 75.50159291314068d, -1.381676034091961d);
    ++counter;

    //French lilac
    expected[counter] = new Color(0x86608E);
    actual[counter] = new Color(46.15984929069696d, 23.89328054120188d, -19.349177127479255d);
    ++counter;

    //French lime
    expected[counter] = new Color(0x9EFD38);
    actual[counter] = new Color(90.69092988475239d, -56.40988085177051d, 78.13106748769911d);
    ++counter;

    //French mauve
    expected[counter] = new Color(0xD473D4);
    actual[counter] = new Color(62.51774743427063d, 51.737261530153845d, -33.794263123622905d);
    ++counter;

    //French pink
    expected[counter] = new Color(0xFD6C9E);
    actual[counter] = new Color(65.02316339611974d, 59.81143332229804d, 1.1657748811352509d);
    ++counter;

    //French plum
    expected[counter] = new Color(0x811453);
    actual[counter] = new Color(28.881442737167745d, 49.204899123324985d, -8.855896232155903d);
    ++counter;

    //French puce
    expected[counter] = new Color(0x4E1609);
    actual[counter] = new Color(16.56874565232436d, 25.61616437905806d, 21.381813982681823d);
    ++counter;

    //French raspberry
    expected[counter] = new Color(0xC72C48);
    actual[counter] = new Color(44.81718131593745d, 60.857882856492736d, 22.647496956399117d);
    ++counter;

    //French rose
    expected[counter] = new Color(0xF64A8A);
    actual[counter] = new Color(58.34460662806174d, 69.36893733183986d, 2.915542599548271d);
    ++counter;

    //French sky blue
    expected[counter] = new Color(0x77B5FE);
    actual[counter] = new Color(72.3122630409327d, 0.24522020880884954d, -42.18783069310792d);
    ++counter;

    //French violet
    expected[counter] = new Color(0x8806CE);
    actual[counter] = new Color(37.51872784209874d, 73.30012515989748d, -70.92820263904662d);
    ++counter;

    //French wine
    expected[counter] = new Color(0xAC1E44);
    actual[counter] = new Color(38.05081448725963d, 56.89776031979013d, 15.2452785025324d);
    ++counter;

    //Fresh Air
    expected[counter] = new Color(0xA6E7FF);
    actual[counter] = new Color(88.19855386763427d, -14.681304061665845d, -18.136067294754234d);
    ++counter;

    //Fuchsia
    expected[counter] = new Color(0xFF00FF);
    actual[counter] = new Color(60.319933664076004d, 98.25421868616114d, -60.84298422386232d);
    ++counter;

    //Fuchsia (Crayola)
    expected[counter] = new Color(0xC154C1);
    actual[counter] = new Color(53.52296758790244d, 57.9902413834551d, -37.23531171401191d);
    ++counter;

    //Fuchsia pink
    expected[counter] = new Color(0xFF77FF);
    actual[counter] = new Color(70.64533292535617d, 69.03904855852939d, -44.484106223587986d);
    ++counter;

    //Fuchsia purple
    expected[counter] = new Color(0xCC397B);
    actual[counter] = new Color(48.503157514746874d, 62.17494040284727d, -3.3786178334497485d);
    ++counter;

    //Fuchsia rose
    expected[counter] = new Color(0xC74375);
    actual[counter] = new Color(48.810684154599315d, 56.363181470723056d, 0.6122244829133372d);
    ++counter;

    //Fulvous
    expected[counter] = new Color(0xE48400);
    actual[counter] = new Color(64.15808238617407d, 29.952509849491214d, 70.37232778895797d);
    ++counter;

    //Fuzzy Wuzzy
    expected[counter] = new Color(0xCC6666);
    actual[counter] = new Color(55.379422722570155d, 40.351979407429575d, 18.91311555441608d);
    ++counter;

    //Gainsboro
    expected[counter] = new Color(0xDCDCDC);
    actual[counter] = new Color(87.76088811005116d, 0.004705466789434176d, -0.009310021292741055d);
    ++counter;

    //Gamboge
    expected[counter] = new Color(0xE49B0F);
    actual[counter] = new Color(69.44898432370614d, 17.895331339600528d, 71.82145517950572d);
    ++counter;

    //Gamboge orange (brown)
    expected[counter] = new Color(0x996600);
    actual[counter] = new Color(47.333293311657755d, 13.548027030121757d, 54.73364491593038d);
    ++counter;

    //Generic viridian
    expected[counter] = new Color(0x007F66);
    actual[counter] = new Color(47.1550915213948d, -36.27479374191361d, 5.230898301842002d);
    ++counter;

    //Ghost white
    expected[counter] = new Color(0xF8F8FF);
    actual[counter] = new Color(97.7572735023453d, 1.2526707614989308d, -3.3559267412847316d);
    ++counter;

    //Giants orange
    expected[counter] = new Color(0xFE5A1D);
    actual[counter] = new Color(60.31266880575562d, 60.043811273719605d, 63.46863640720027d);
    ++counter;

    //Grussrel
    expected[counter] = new Color(0xB06500);
    actual[counter] = new Color(50.14161379867318d, 24.4765960370229d, 58.04551570749425d);
    ++counter;

    //Glaucous
    expected[counter] = new Color(0x6082B6);
    actual[counter] = new Color(53.84558827422694d, 2.4075241975050066d, -31.10067047833638d);
    ++counter;

    //Glitter
    expected[counter] = new Color(0xE6E8FA);
    actual[counter] = new Color(92.32639897095922d, 2.679703811945655d, -8.931232458273008d);
    ++counter;

    //GO green
    expected[counter] = new Color(0x00AB66);
    actual[counter] = new Color(61.72760444989774d, -53.53438821818723d, 25.307429650431246d);
    ++counter;

    //Gold (metallic)
    expected[counter] = new Color(0xD4AF37);
    actual[counter] = new Color(72.84764248615137d, 1.3808416693149028d, 62.914236728059535d);
    ++counter;

    //Gold (web) (Golden)
    expected[counter] = new Color(0xFFD700);
    actual[counter] = new Color(86.9285847161576d, -1.9242149651027551d, 87.1371576065337d);
    ++counter;

    //Gold Fusion
    expected[counter] = new Color(0x85754E);
    actual[counter] = new Color(49.8089718414341d, 0.29659646910923376d, 23.789749811130324d);
    ++counter;

    //Golden brown
    expected[counter] = new Color(0x996515);
    actual[counter] = new Color(47.14955389587915d, 14.540983413133922d, 49.296681247915075d);
    ++counter;

    //Golden poppy
    expected[counter] = new Color(0xFCC200);
    actual[counter] = new Color(81.44472346551441d, 7.551082179752145d, 83.17499941667327d);
    ++counter;

    //Golden yellow
    expected[counter] = new Color(0xFFDF00);
    actual[counter] = new Color(88.939189421875d, -5.95030019658227d, 88.5617283249729d);
    ++counter;

    //Goldenrod
    expected[counter] = new Color(0xDAA520);
    actual[counter] = new Color(70.81571317667877d, 8.524971687770776d, 68.76466736413396d);
    ++counter;

    //Granny Smith Apple
    expected[counter] = new Color(0xA8E4A0);
    actual[counter] = new Color(85.17447975680722d, -31.832827628889447d, 27.23159706081635d);
    ++counter;

    //Grape
    expected[counter] = new Color(0x6F2DA8);
    actual[counter] = new Color(34.15604313721582d, 51.35445376449358d, -54.13577014530172d);
    ++counter;

    //Gray
    expected[counter] = new Color(0x808080);
    actual[counter] = new Color(53.585013452169036d, 0.003155620347972121d, -0.006243566036245873d);
    ++counter;

    //Gray (HTML/CSS gray)
    expected[counter] = new Color(0x808080);
    actual[counter] = new Color(53.585013452169036d, 0.003155620347972121d, -0.006243566036245873d);
    ++counter;

    //Gray (X11 gray)
    expected[counter] = new Color(0xBEBEBE);
    actual[counter] = new Color(76.97594183318154d, 0.004216378777066598d, -0.008342334129429751d);
    ++counter;

    //Gray-asparagus
    expected[counter] = new Color(0x465945);
    actual[counter] = new Color(35.74545654893331d, -11.751432420498336d, 9.227675582080042d);
    ++counter;

    //Gray-blue
    expected[counter] = new Color(0x8C92AC);
    actual[counter] = new Color(60.88014959096597d, 3.4397709671458165d, -14.347015476857528d);
    ++counter;

    //Green (Color Wheel) (X11 green)
    expected[counter] = new Color(0x00FF00);
    actual[counter] = new Color(87.73703347354422d, -86.18463649762525d, 83.18116474777854d);
    ++counter;

    //Green (Crayola)
    expected[counter] = new Color(0x1CAC78);
    actual[counter] = new Color(62.5986897279068d, -48.38784826227527d, 16.76344181513807d);
    ++counter;

    //Green (HTML/CSS color)
    expected[counter] = new Color(0x008000);
    actual[counter] = new Color(46.22881784262658d, -51.69964732808236d, 49.89795230983843d);
    ++counter;

    //Green (Munsell)
    expected[counter] = new Color(0x00A877);
    actual[counter] = new Color(61.07805437155278d, -48.69572760327567d, 15.175985707304275d);
    ++counter;

    //Green (NCS)
    expected[counter] = new Color(0x009F6B);
    actual[counter] = new Color(57.90183826424878d, -48.029242902777156d, 17.432661534263573d);
    ++counter;

    //Green (Pantone)
    expected[counter] = new Color(0x00AD43);
    actual[counter] = new Color(61.90568657996447d, -59.97251311462071d, 43.14357659616172d);
    ++counter;

    //Green (pigment)
    expected[counter] = new Color(0x00A550);
    actual[counter] = new Color(59.42466002165804d, -55.48796133768663d, 33.861223522898264d);
    ++counter;

    //Green (RYB)
    expected[counter] = new Color(0x66B032);
    actual[counter] = new Color(65.04641444855372d, -44.30649873467135d, 54.381444941499005d);
    ++counter;

    //Green-blue
    expected[counter] = new Color(0x1164B4);
    actual[counter] = new Color(42.04451156052986d, 7.5987406036572835d, -48.80105528219212d);
    ++counter;

    //Green-cyan
    expected[counter] = new Color(0x009966);
    actual[counter] = new Color(55.828321294921665d, -46.876585579928246d, 17.3731134030392d);
    ++counter;

    //Green-yellow
    expected[counter] = new Color(0xADFF2F);
    actual[counter] = new Color(91.95763180408608d, -52.48377737417426d, 81.86600466545895d);
    ++counter;

    //Grizzly
    expected[counter] = new Color(0x885818);
    actual[counter] = new Color(41.65714636733292d, 14.323060470896515d, 42.51417923048745d);
    ++counter;

    //Grullo
    expected[counter] = new Color(0xA99A86);
    actual[counter] = new Color(64.37688216828923d, 2.1818019556024693d, 12.501548044918742d);
    ++counter;

    //Guppie green
    expected[counter] = new Color(0x00FF7F);
    actual[counter] = new Color(88.47265520282772d, -76.90097301637367d, 47.0252935988744d);
    ++counter;

    //Halayà úbe
    expected[counter] = new Color(0x663854);
    actual[counter] = new Color(30.14050119455105d, 24.660727781711607d, -8.06450054223814d);
    ++counter;

    //Han blue
    expected[counter] = new Color(0x446CCF);
    actual[counter] = new Color(47.57109319441948d, 18.38609836739846d, -55.454930028613525d);
    ++counter;

    //Han purple
    expected[counter] = new Color(0x5218FA);
    actual[counter] = new Color(36.64817587166468d, 75.63494228299939d, -97.71144594593564d);
    ++counter;

    //Hansa yellow
    expected[counter] = new Color(0xE9D66B);
    actual[counter] = new Color(85.23980774382127d, -6.73567605068931d, 54.47594283733248d);
    ++counter;

    //Harlequin
    expected[counter] = new Color(0x3FFF00);
    actual[counter] = new Color(88.24546826873629d, -81.60675745220597d, 83.80179167539532d);
    ++counter;

    //Harlequin green
    expected[counter] = new Color(0x46CB18);
    actual[counter] = new Color(72.28187706315053d, -64.29146136599579d, 68.07803182620079d);
    ++counter;

    //Harvard crimson
    expected[counter] = new Color(0xC90016);
    actual[counter] = new Color(41.961980625574704d, 67.2093497438934d, 48.151387355062944d);
    ++counter;

    //Harvest gold
    expected[counter] = new Color(0xDA9100);
    actual[counter] = new Color(65.87011443730012d, 18.78043230966142d, 70.85724470337858d);
    ++counter;

    //Heart Gold
    expected[counter] = new Color(0x808000);
    actual[counter] = new Color(51.86833136334822d, -12.930760098732952d, 56.677284661941485d);
    ++counter;

    //Heliotrope
    expected[counter] = new Color(0xDF73FF);
    actual[counter] = new Color(65.88037415665411d, 62.74210683469455d, -52.26776079014939d);
    ++counter;

    //Heliotrope gray
    expected[counter] = new Color(0xAA98A9);
    actual[counter] = new Color(64.85693907501036d, 9.749129548733526d, -6.44520141137479d);
    ++counter;

    //Heliotrope magenta
    expected[counter] = new Color(0xAA00BB);
    actual[counter] = new Color(41.42815166429737d, 75.14457471841027d, -53.21063215640086d);
    ++counter;

    //Hollywood cerise
    expected[counter] = new Color(0xF400A1);
    actual[counter] = new Color(53.82088575046764d, 85.07779160541907d, -17.429578658478228d);
    ++counter;

    //Honeydew
    expected[counter] = new Color(0xF0FFF0);
    actual[counter] = new Color(98.56580137512647d, -7.560558156024966d, 5.465827430380532d);
    ++counter;

    //Honolulu blue
    expected[counter] = new Color(0x006DB0);
    actual[counter] = new Color(44.33582236186645d, -0.453040342144162d, -42.80877992079852d);
    ++counter;

    //Hooker's green
    expected[counter] = new Color(0x49796B);
    actual[counter] = new Color(47.17425578049191d, -19.816643413482826d, 2.546502694429087d);
    ++counter;

    //Hot magenta
    expected[counter] = new Color(0xFF1DCE);
    actual[counter] = new Color(58.59752900308726d, 89.53592499361474d, -36.02514845127593d);
    ++counter;

    //Hot pink
    expected[counter] = new Color(0xFF69B4);
    actual[counter] = new Color(65.48186958181394d, 64.25072356291078d, -10.659820587587543d);
    ++counter;

    //Hunter green
    expected[counter] = new Color(0x355E3B);
    actual[counter] = new Color(36.13415137405786d, -22.791511163547106d, 15.687047102832564d);
    ++counter;

    //Iceberg
    expected[counter] = new Color(0x71A6D2);
    actual[counter] = new Color(66.08694103499653d, -5.701089628040168d, -27.83634591906705d);
    ++counter;

    //Icterine
    expected[counter] = new Color(0xFCF75E);
    actual[counter] = new Color(95.17152000641295d, -16.27646652345316d, 71.52874222110637d);
    ++counter;

    //Illuminating Emerald
    expected[counter] = new Color(0x319177);
    actual[counter] = new Color(54.276171881160636d, -34.39402891425281d, 5.669654983930261d);
    ++counter;

    //Imperial
    expected[counter] = new Color(0x602F6B);
    actual[counter] = new Color(28.330717581970497d, 32.464426300952894d, -25.793436204230492d);
    ++counter;

    //Imperial blue
    expected[counter] = new Color(0x002395);
    actual[counter] = new Color(21.47601488369444d, 37.837027841349126d, -63.720158209266664d);
    ++counter;

    //Imperial purple
    expected[counter] = new Color(0x66023C);
    actual[counter] = new Color(20.8063680832434d, 43.88205513164078d, -5.987899007610498d);
    ++counter;

    //Imperial red
    expected[counter] = new Color(0xED2939);
    actual[counter] = new Color(51.70785822581662d, 71.44197847782047d, 41.538410121040584d);
    ++counter;

    //Inchworm
    expected[counter] = new Color(0xB2EC5D);
    actual[counter] = new Color(87.11747264638174d, -39.95495623654738d, 61.75657889104706d);
    ++counter;

    //Independence
    expected[counter] = new Color(0x4C516D);
    actual[counter] = new Color(35.054147712241246d, 5.130053806126772d, -16.753473550690813d);
    ++counter;

    //India green
    expected[counter] = new Color(0x138808);
    actual[counter] = new Color(49.20896939632678d, -52.196928310722534d, 50.850342000463634d);
    ++counter;

    //Indian red
    expected[counter] = new Color(0xCD5C5C);
    actual[counter] = new Color(53.3911485087161d, 44.83604976051514d, 22.109998759143334d);
    ++counter;

    //Indian yellow
    expected[counter] = new Color(0xE3A857);
    actual[counter] = new Color(72.90787661985591d, 13.286732214864038d, 49.518123795139445d);
    ++counter;

    //Indigo
    expected[counter] = new Color(0x6F00FF);
    actual[counter] = new Color(38.89758199606652d, 82.03785508758565d, -96.69843143251764d);
    ++counter;

    //Indigo dye
    expected[counter] = new Color(0x091F92);
    actual[counter] = new Color(20.492338328618892d, 39.452001691918426d, -63.48810308193437d);
    ++counter;

    //Indigo (web)
    expected[counter] = new Color(0x4B0082);
    actual[counter] = new Color(20.46961954096429d, 51.694842434682556d, -53.319818613674784d);
    ++counter;

    //International Klein Blue
    expected[counter] = new Color(0x002FA7);
    actual[counter] = new Color(26.224573318872977d, 37.043114151099424d, -66.85088130649005d);
    ++counter;

    //International orange (aerospace)
    expected[counter] = new Color(0xFF4F00);
    actual[counter] = new Color(58.83705295069808d, 64.32147669714483d, 69.56374584954908d);
    ++counter;

    //International orange (engineering)
    expected[counter] = new Color(0xBA160C);
    actual[counter] = new Color(39.646862572752234d, 60.497104191824555d, 49.16914431674981d);
    ++counter;

    //International orange (Golden Gate Bridge)
    expected[counter] = new Color(0xC0362C);
    actual[counter] = new Color(44.27112685985624d, 54.0835679736627d, 38.26540254619388d);
    ++counter;

    //Iris
    expected[counter] = new Color(0x5A4FCF);
    actual[counter] = new Color(41.64302948681484d, 40.12493650068488d, -64.98084745257687d);
    ++counter;

    //Irresistible
    expected[counter] = new Color(0xB3446C);
    actual[counter] = new Color(45.35995247726232d, 48.731666024536715d, 0.6664978481353279d);
    ++counter;

    //Isabelline
    expected[counter] = new Color(0xF4F0EC);
    actual[counter] = new Color(94.9962298392079d, 0.6474678350554264d, 2.391162276294212d);
    ++counter;

    //Islamic green
    expected[counter] = new Color(0x009000);
    actual[counter] = new Color(51.776689405435235d, -56.30881416046643d, 54.34649303838348d);
    ++counter;

    //Italian sky blue
    expected[counter] = new Color(0xB2FFFF);
    actual[counter] = new Color(95.24718239458254d, -23.361668255793887d, -7.5472253511913445d);
    ++counter;

    //Ivory
    expected[counter] = new Color(0xFFFFF0);
    actual[counter] = new Color(99.63977381109996d, -2.546922587948308d, 7.152814753830206d);
    ++counter;

    //Jade
    expected[counter] = new Color(0x00A86B);
    actual[counter] = new Color(60.84053837589674d, -51.406739028562356d, 21.427035270846705d);
    ++counter;

    //Japanese carmine
    expected[counter] = new Color(0x9D2933);
    actual[counter] = new Color(35.97079703129346d, 47.949824809940395d, 22.77904624583551d);
    ++counter;

    //Japanese indigo
    expected[counter] = new Color(0x264348);
    actual[counter] = new Color(26.43135961061703d, -9.321939607095125d, -6.448296290969669d);
    ++counter;

    //Japanese violet
    expected[counter] = new Color(0x5B3256);
    actual[counter] = new Color(27.233857745383155d, 24.56620033087864d, -13.937839585830758d);
    ++counter;

    //Jasmine
    expected[counter] = new Color(0xF8DE7E);
    actual[counter] = new Color(88.78304880169912d, -3.1513043740321045d, 50.014848552135675d);
    ++counter;

    //Jasper
    expected[counter] = new Color(0xD73B3E);
    actual[counter] = new Color(49.40234161720247d, 60.24872855762309d, 34.95336992196688d);
    ++counter;

    //Jazzberry jam
    expected[counter] = new Color(0xA50B5E);
    actual[counter] = new Color(36.07430127435711d, 60.83867787110128d, -4.494995664430701d);
    ++counter;

    //Jelly Bean
    expected[counter] = new Color(0xDA614E);
    actual[counter] = new Color(56.09267279648027d, 46.14118474134582d, 34.00392612224834d);
    ++counter;

    //Jet
    expected[counter] = new Color(0x343434);
    actual[counter] = new Color(21.704275932542863d, 0.0017098563963036106d, -0.003383043631877136d);
    ++counter;

    //Jonquil
    expected[counter] = new Color(0xF4CA16);
    actual[counter] = new Color(82.66395706904346d, 0.21604072061670587d, 81.25308483030012d);
    ++counter;

    //Jordy blue
    expected[counter] = new Color(0x8AB9F1);
    actual[counter] = new Color(73.83791887070373d, -1.3021897709256103d, -32.72175952716068d);
    ++counter;

    //June bud
    expected[counter] = new Color(0xBDDA57);
    actual[counter] = new Color(82.7268048604586d, -27.989246039857363d, 59.649095775457894d);
    ++counter;

    //Jungle green
    expected[counter] = new Color(0x29AB87);
    actual[counter] = new Color(62.7990602003233d, -42.99867097614507d, 8.789638876248507d);
    ++counter;

    //Kelly green
    expected[counter] = new Color(0x4CBB17);
    actual[counter] = new Color(67.3811909145557d, -57.58458423333601d, 64.11115086830121d);
    ++counter;

    //Kenyan copper
    expected[counter] = new Color(0x7C1C05);
    actual[counter] = new Color(27.092307625633723d, 40.06550279762888d, 37.10365359594876d);
    ++counter;

    //Keppel
    expected[counter] = new Color(0x3AB09E);
    actual[counter] = new Color(65.29366316026055d, -36.843525532390956d, -0.3475602015310608d);
    ++counter;

    //Jawad/Chicken Color (HTML/CSS) (Khaki)
    expected[counter] = new Color(0xC3B091);
    actual[counter] = new Color(72.69200055927301d, 1.9653558243358238d, 18.38243326147333d);
    ++counter;

    //Khaki (X11) (Light khaki)
    expected[counter] = new Color(0xF0E68C);
    actual[counter] = new Color(90.32729582034386d, -9.009040601133389d, 44.974148443850545d);
    ++counter;

    //Kobe
    expected[counter] = new Color(0x882D17);
    actual[counter] = new Color(32.19726507948835d, 37.721136651547944d, 34.08733909394583d);
    ++counter;

    //Kobi
    expected[counter] = new Color(0xE79FC4);
    actual[counter] = new Color(73.39651168413384d, 32.12544670252987d, -8.127820819088715d);
    ++counter;

    //Kombu green
    expected[counter] = new Color(0x354230);
    actual[counter] = new Color(26.35160964490042d, -9.36126747060942d, 9.262410205645978d);
    ++counter;

    //KU Crimson
    expected[counter] = new Color(0xE8000D);
    actual[counter] = new Color(48.49212461371508d, 74.68117105525445d, 58.95673460839157d);
    ++counter;

    //La Salle Green
    expected[counter] = new Color(0x087830);
    actual[counter] = new Color(43.79662634047437d, -44.72336392381132d, 31.226165653525218d);
    ++counter;

    //Languid lavender
    expected[counter] = new Color(0xD6CADD);
    actual[counter] = new Color(82.78437680871089d, 7.611324294906852d, -7.917743253307341d);
    ++counter;

    //Lapis lazuli
    expected[counter] = new Color(0x26619C);
    actual[counter] = new Color(40.1832028994604d, 2.04403995010366d, -37.55912049144268d);
    ++counter;

    //Laser Lemon
    expected[counter] = new Color(0xFFFF66);
    actual[counter] = new Color(97.52684594655604d, -18.441087386482813d, 70.89858531051054d);
    ++counter;

    //Laurel green
    expected[counter] = new Color(0xA9BA9D);
    actual[counter] = new Color(73.5371947551198d, -11.220262328463736d, 12.745060725636726d);
    ++counter;

    //Lava
    expected[counter] = new Color(0xCF1020);
    actual[counter] = new Color(43.8581128602111d, 67.30537754158617d, 45.32513636589029d);
    ++counter;

    //Lavender (floral)
    expected[counter] = new Color(0xB57EDC);
    actual[counter] = new Color(61.57888757322144d, 38.530640107752426d, -40.004858677625535d);
    ++counter;

    //Lavender (web)
    expected[counter] = new Color(0xE6E6FA);
    actual[counter] = new Color(91.82769059829121d, 3.7138573364230987d, -9.671676095098757d);
    ++counter;

    //Lavender blue
    expected[counter] = new Color(0xCCCCFF);
    actual[counter] = new Color(83.57012223117405d, 10.303455437196241d, -24.920516101721457d);
    ++counter;

    //Lavender blush
    expected[counter] = new Color(0xFFF0F5);
    actual[counter] = new Color(96.06837944039779d, 5.8927807204830485d, -0.6041986429437207d);
    ++counter;

    //Lavender gray
    expected[counter] = new Color(0xC4C3D0);
    actual[counter] = new Color(79.22525785195374d, 2.8045342488636216d, -6.372729327997018d);
    ++counter;

    //Lavender indigo
    expected[counter] = new Color(0x9457EB);
    actual[counter] = new Color(50.81617547001828d, 54.747241688930416d, -65.77449338432866d);
    ++counter;

    //Lavender magenta
    expected[counter] = new Color(0xEE82EE);
    actual[counter] = new Color(69.69362286537107d, 56.36844996271595d, -36.823650913525505d);
    ++counter;

    //Lavender mist
    expected[counter] = new Color(0xE6E6FA);
    actual[counter] = new Color(91.82769059829121d, 3.7138573364230987d, -9.671676095098757d);
    ++counter;

    //Lavender pink
    expected[counter] = new Color(0xFBAED2);
    actual[counter] = new Color(79.29087319048548d, 33.25922687929367d, -6.797675690974758d);
    ++counter;

    //Lavender purple
    expected[counter] = new Color(0x967BB6);
    actual[counter] = new Color(56.11516413104229d, 22.26335087386816d, -27.25476135500442d);
    ++counter;

    //Lavender rose
    expected[counter] = new Color(0xFBA0E3);
    actual[counter] = new Color(76.79812247158513d, 43.262136412546894d, -19.767975703989006d);
    ++counter;

    //Lawn green
    expected[counter] = new Color(0x7CFC00);
    actual[counter] = new Color(88.87798766318886d, -67.85902674080634d, 84.9548216436359d);
    ++counter;

    //Lemon
    expected[counter] = new Color(0xFFF700);
    actual[counter] = new Color(95.06887397025419d, -17.73469013206541d, 92.9731446532294d);
    ++counter;

    //Lemon chiffon
    expected[counter] = new Color(0xFFFACD);
    actual[counter] = new Color(97.6476983766357d, -5.423835002735022d, 22.225440133492658d);
    ++counter;

    //Lemon curry
    expected[counter] = new Color(0xCCA01D);
    actual[counter] = new Color(68.07047363400495d, 4.979662531337303d, 66.6896860937307d);
    ++counter;

    //Lemon glacier
    expected[counter] = new Color(0xFDFF00);
    actual[counter] = new Color(96.9846538858103d, -22.37556922166295d, 94.30066556892267d);
    ++counter;

    //Lemon lime
    expected[counter] = new Color(0xE3FF00);
    actual[counter] = new Color(95.09812173981939d, -32.91391014808759d, 92.06013059256215d);
    ++counter;

    //Lemon meringue
    expected[counter] = new Color(0xF6EABE);
    actual[counter] = new Color(92.64374380395499d, -2.742409508760313d, 22.867671939537736d);
    ++counter;

    //Lemon yellow
    expected[counter] = new Color(0xFFF44F);
    actual[counter] = new Color(94.53674326041285d, -14.409520379234763d, 76.61658564842591d);
    ++counter;

    //Lenurple
    expected[counter] = new Color(0xBA93D8);
    actual[counter] = new Color(66.72145925348538d, 27.511061528093407d, -29.73972737089301d);
    ++counter;

    //Licorice
    expected[counter] = new Color(0x1A1110);
    actual[counter] = new Color(5.942940507364206d, 3.8769781312940896d, 1.9611036189519426d);
    ++counter;

    //Liberty
    expected[counter] = new Color(0x545AA7);
    actual[counter] = new Color(41.195716934750926d, 19.31958567005526d, -42.34609927453088d);
    ++counter;

    //Light apricot
    expected[counter] = new Color(0xFDD5B1);
    actual[counter] = new Color(87.79766170011624d, 8.891506741993238d, 23.015920220729647d);
    ++counter;

    //Light blue
    expected[counter] = new Color(0xADD8E6);
    actual[counter] = new Color(83.81410256512628d, -10.886223598149225d, -11.485313939631814d);
    ++counter;

    //Light brilliant red
    expected[counter] = new Color(0xfe2e2e);
    actual[counter] = new Color(55.300352973822115d, 74.54339102465329d, 52.106782754996374d);
    ++counter;

    //Light brown
    expected[counter] = new Color(0xB5651D);
    actual[counter] = new Color(50.94340654140332d, 27.17940361812432d, 51.163654815114d);
    ++counter;

    //Light carmine pink
    expected[counter] = new Color(0xE66771);
    actual[counter] = new Color(59.631057291520094d, 50.14174492278023d, 18.9513451831526d);
    ++counter;

    //Light cobalt blue
    expected[counter] = new Color(0x88ACE0);
    actual[counter] = new Color(69.55570136119837d, 0.728698058839794d, -30.09057565287796d);
    ++counter;

    //Light coral
    expected[counter] = new Color(0xF08080);
    actual[counter] = new Color(66.15316216626996d, 42.81731812990014d, 19.548079681142163d);
    ++counter;

    //Light cornflower blue
    expected[counter] = new Color(0x93CCEA);
    actual[counter] = new Color(79.23056278524328d, -10.990384885870231d, -20.659504565618736d);
    ++counter;

    //Light crimson
    expected[counter] = new Color(0xF56991);
    actual[counter] = new Color(62.977517596093705d, 57.249651635543074d, 5.50858386425539d);
    ++counter;

    //Light cyan
    expected[counter] = new Color(0xE0FFFF);
    actual[counter] = new Color(97.86814756512815d, -9.939293235181834d, -3.384738583465685d);
    ++counter;

    //Light deep pink
    expected[counter] = new Color(0xFF5CCD);
    actual[counter] = new Color(64.42084799405075d, 72.74082762109052d, -26.427715423435917d);
    ++counter;

    //Light French beige
    expected[counter] = new Color(0xC8AD7F);
    actual[counter] = new Color(72.02671893093729d, 3.1987462110415477d, 27.264818894848354d);
    ++counter;

    //Light fuchsia pink
    expected[counter] = new Color(0xF984EF);
    actual[counter] = new Color(71.4695454027027d, 58.69179937497254d, -34.50906197684957d);
    ++counter;

    //Light goldenrod yellow
    expected[counter] = new Color(0xFAFAD2);
    actual[counter] = new Color(97.36879732328356d, -6.477957388611289d, 19.228690126879265d);
    ++counter;

    //Light gray
    expected[counter] = new Color(0xD3D3D3);
    actual[counter] = new Color(84.5561167363605d, 0.0045601331715716675d, -0.009022470846042907d);
    ++counter;

    //Light grayish magenta
    expected[counter] = new Color(0xCC99CC);
    actual[counter] = new Color(69.45490455863937d, 27.585696176911256d, -18.751339686987876d);
    ++counter;

    //Light green
    expected[counter] = new Color(0x90EE90);
    actual[counter] = new Color(86.54957590580997d, -46.32762381560207d, 36.94493467106661d);
    ++counter;

    //Light hot pink
    expected[counter] = new Color(0xFFB3DE);
    actual[counter] = new Color(81.16728061464063d, 33.87754246745145d, -10.450508302244899d);
    ++counter;

    //Light khaki
    expected[counter] = new Color(0xF0E68C);
    actual[counter] = new Color(90.32729582034386d, -9.009040601133389d, 44.974148443850545d);
    ++counter;

    //Light medium orchid
    expected[counter] = new Color(0xD39BCB);
    actual[counter] = new Color(70.59659733105262d, 28.64960473062744d, -16.402128575324415d);
    ++counter;

    //Light moss green
    expected[counter] = new Color(0xADDFAD);
    actual[counter] = new Color(84.31687231726518d, -25.664640634899595d, 19.360084427838096d);
    ++counter;

    //Light orchid
    expected[counter] = new Color(0xE6A8D7);
    actual[counter] = new Color(75.9060426649497d, 30.137545926453345d, -14.798355493726367d);
    ++counter;

    //Light pastel purple
    expected[counter] = new Color(0xB19CD9);
    actual[counter] = new Color(68.11911253845312d, 19.893782517270033d, -28.20664434923412d);
    ++counter;

    //Light pink
    expected[counter] = new Color(0xFFB6C1);
    actual[counter] = new Color(81.05253594361857d, 27.968883126962606d, 5.025499401878575d);
    ++counter;

    //Light red ochre
    expected[counter] = new Color(0xE97451);
    actual[counter] = new Color(62.00509964608041d, 42.5880521768624d, 40.0203302511987d);
    ++counter;

    //Light salmon
    expected[counter] = new Color(0xFFA07A);
    actual[counter] = new Color(74.70287844017d, 31.48268612541899d, 34.54191310557049d);
    ++counter;

    //Light salmon pink
    expected[counter] = new Color(0xFF9999);
    actual[counter] = new Color(73.76714502598203d, 38.097558367735765d, 16.46822578338558d);
    ++counter;

    //Light sea green
    expected[counter] = new Color(0x20B2AA);
    actual[counter] = new Color(65.78768757989991d, -37.50865970550865d, -6.33612044723717d);
    ++counter;

    //Light sky blue
    expected[counter] = new Color(0x87CEFA);
    actual[counter] = new Color(79.72503275959482d, -10.823352153876087d, -28.51031741869916d);
    ++counter;

    //Light slate gray
    expected[counter] = new Color(0x778899);
    actual[counter] = new Color(55.917349372007195d, -2.243288012291844d, -11.114675380183225d);
    ++counter;

    //Light steel blue
    expected[counter] = new Color(0xB0C4DE);
    actual[counter] = new Color(78.45233742822654d, -1.2757061180387885d, -15.219946715313526d);
    ++counter;

    //Light taupe
    expected[counter] = new Color(0xB38B6D);
    actual[counter] = new Color(60.91648372504429d, 11.088271433908615d, 21.875204520858603d);
    ++counter;

    //Light Thulian pink
    expected[counter] = new Color(0xE68FAC);
    actual[counter] = new Color(69.07345083307982d, 36.66746851567304d, -1.2002544960622474d);
    ++counter;

    //Light yellow
    expected[counter] = new Color(0xFFFFE0);
    actual[counter] = new Color(99.28483637693047d, -5.103648893401425d, 14.828623965127829d);
    ++counter;

    //Lilac
    expected[counter] = new Color(0xC8A2C8);
    actual[counter] = new Color(71.07050647552694d, 20.546147068489674d, -14.138385054778313d);
    ++counter;

    //Lime (color wheel)
    expected[counter] = new Color(0xBFFF00);
    actual[counter] = new Color(92.83743607221825d, -46.874711675708724d, 89.3569815345749d);
    ++counter;

    //Lime (web) (X11 green)
    expected[counter] = new Color(0x00FF00);
    actual[counter] = new Color(87.73703347354422d, -86.18463649762525d, 83.18116474777854d);
    ++counter;

    //Lime green
    expected[counter] = new Color(0x32CD32);
    actual[counter] = new Color(72.60854102811317d, -67.1269060980072d, 61.43743050358851d);
    ++counter;

    //Limerick
    expected[counter] = new Color(0x9DC209);
    actual[counter] = new Color(73.39695052193386d, -33.039947041834d, 72.73202685845999d);
    ++counter;

    //Lincoln green
    expected[counter] = new Color(0x195905);
    actual[counter] = new Color(32.618051064329464d, -35.63305289848892d, 37.4906898227933d);
    ++counter;

    //Linen
    expected[counter] = new Color(0xFAF0E6);
    actual[counter] = new Color(95.31120096478845d, 1.6820338439236249d, 6.012338786257043d);
    ++counter;

    //Lion
    expected[counter] = new Color(0xC19A6B);
    actual[counter] = new Color(66.14396786846372d, 8.369210596896659d, 30.14844295160646d);
    ++counter;

    //Liseran Purple
    expected[counter] = new Color(0xDE6FA1);
    actual[counter] = new Color(61.195675130471756d, 48.827074937279114d, -6.695732956624401d);
    ++counter;

    //Little boy blue
    expected[counter] = new Color(0x6CA0DC);
    actual[counter] = new Color(64.56138099765184d, -0.5992264404480196d, -35.75109821823874d);
    ++counter;

    //Liver
    expected[counter] = new Color(0x674C47);
    actual[counter] = new Color(35.01798021401003d, 10.62237586602935d, 7.4153301620533245d);
    ++counter;

    //Liver (dogs)
    expected[counter] = new Color(0xB86D29);
    actual[counter] = new Color(53.26295965417172d, 24.506067904903617d, 48.49529117427015d);
    ++counter;

    //Liver (organ)
    expected[counter] = new Color(0x6C2E1F);
    actual[counter] = new Color(27.410803028982713d, 26.469302882713848d, 22.812334206495755d);
    ++counter;

    //Liver chestnut
    expected[counter] = new Color(0x987456);
    actual[counter] = new Color(51.653631661536465d, 10.055098183281984d, 22.01509666333161d);
    ++counter;

    //Livid
    expected[counter] = new Color(0x6699CC);
    actual[counter] = new Color(61.62563447911687d, -2.8148222106305076d, -31.43912376322242d);
    ++counter;

    //Lumber
    expected[counter] = new Color(0xFFE4CD);
    actual[counter] = new Color(92.20043485847427d, 5.709772323664319d, 14.594108776661518d);
    ++counter;

    //Lust
    expected[counter] = new Color(0xE62020);
    actual[counter] = new Color(49.44792338173545d, 70.76916133612693d, 51.953566449794295d);
    ++counter;

    //Magenta
    expected[counter] = new Color(0xFF00FF);
    actual[counter] = new Color(60.319933664076004d, 98.25421868616114d, -60.84298422386232d);
    ++counter;

    //Magenta (Crayola)
    expected[counter] = new Color(0xFF55A3);
    actual[counter] = new Color(61.998977942335884d, 70.36159921195429d, -6.114095516618323d);
    ++counter;

    //Magenta (dye)
    expected[counter] = new Color(0xCA1F7B);
    actual[counter] = new Color(45.58840306299025d, 68.88947028475961d, -7.7477484166476485d);
    ++counter;

    //Magenta (Pantone)
    expected[counter] = new Color(0xD0417E);
    actual[counter] = new Color(50.330630390414d, 60.7227088352949d, -2.421470608317633d);
    ++counter;

    //Magenta (process)
    expected[counter] = new Color(0xFF0090);
    actual[counter] = new Color(55.35306190906536d, 85.78511468456446d, -4.821641136174848d);
    ++counter;

    //Magenta haze
    expected[counter] = new Color(0x9F4576);
    actual[counter] = new Color(42.66541184158695d, 43.01354290930459d, -9.821329622011765d);
    ++counter;

    //Magenta-pink
    expected[counter] = new Color(0xCC338B);
    actual[counter] = new Color(48.34698705102589d, 65.87298586207679d, -13.296029792866037d);
    ++counter;

    //Magic mint
    expected[counter] = new Color(0xAAF0D1);
    actual[counter] = new Color(89.61253800509348d, -28.112053270695547d, 8.036956090533431d);
    ++counter;

    //Magnolia
    expected[counter] = new Color(0xF8F4FF);
    actual[counter] = new Color(96.77034065770096d, 3.2895063375911193d, -4.807625495736523d);
    ++counter;

    //Mahogany
    expected[counter] = new Color(0xC04000);
    actual[counter] = new Color(45.46011545511821d, 49.223630622430406d, 56.68964944835234d);
    ++counter;

    //Maize
    expected[counter] = new Color(0xFBEC5D);
    actual[counter] = new Color(92.26078266031232d, -11.365697231189353d, 68.82847284605664d);
    ++counter;

    //Majorelle Blue
    expected[counter] = new Color(0x6050DC);
    actual[counter] = new Color(43.3472027487597d, 44.58539959454083d, -69.63828195480333d);
    ++counter;

    //Malachite
    expected[counter] = new Color(0x0BDA51);
    actual[counter] = new Color(76.56258140862863d, -71.53661652935827d, 53.64650853936408d);
    ++counter;

    //Manatee
    expected[counter] = new Color(0x979AAA);
    actual[counter] = new Color(63.82982440056237d, 2.1902363813927628d, -8.706009770128432d);
    ++counter;

    //Mango Tango
    expected[counter] = new Color(0xFF8243);
    actual[counter] = new Color(67.74740559860484d, 43.28048095810488d, 54.38020696340947d);
    ++counter;

    //Mantis
    expected[counter] = new Color(0x74C365);
    actual[counter] = new Color(72.0159715804537d, -42.514937068148406d, 39.576271002816135d);
    ++counter;

    //Mardi Gras
    expected[counter] = new Color(0x880085);
    actual[counter] = new Color(31.641736651799654d, 61.116929137753516d, -36.570513630492265d);
    ++counter;

    //Maroon (Crayola)
    expected[counter] = new Color(0xC32148);
    actual[counter] = new Color(42.999897393449d, 62.67895035164178d, 20.12747924644461d);
    ++counter;

    //Maroon (HTML/CSS)
    expected[counter] = new Color(0x800000);
    actual[counter] = new Color(25.530784572416174d, 48.05523604548828d, 38.05963258349509d);
    ++counter;

    //Maroon (X11)
    expected[counter] = new Color(0xB03060);
    actual[counter] = new Color(41.51421680339138d, 54.71396813946636d, 2.458849199114399d);
    ++counter;

    //Mauve
    expected[counter] = new Color(0xE0B0FF);
    actual[counter] = new Color(78.53046607544944d, 31.50596575654008d, -32.49478836595561d);
    ++counter;

    //Mauve taupe
    expected[counter] = new Color(0x915F6D);
    actual[counter] = new Color(46.05358176390693d, 22.44825415169399d, 0.47699437785069243d);
    ++counter;

    //Mauvelous
    expected[counter] = new Color(0xEF98AA);
    actual[counter] = new Color(72.03388168268238d, 34.865176462657466d, 4.349794933498674d);
    ++counter;

    //May green
    expected[counter] = new Color(0x4C9141);
    actual[counter] = new Color(54.205807548149295d, -38.176061972821806d, 35.436824564009186d);
    ++counter;

    //Maya blue
    expected[counter] = new Color(0x73C2FB);
    actual[counter] = new Color(75.57151581296391d, -8.576826830105134d, -35.51775787112672d);
    ++counter;

    //Meat brown
    expected[counter] = new Color(0xE5B73B);
    actual[counter] = new Color(76.58244529195478d, 4.661890438233063d, 65.59947296435803d);
    ++counter;

    //Medium aquamarine
    expected[counter] = new Color(0x66DDAA);
    actual[counter] = new Color(80.4264191942531d, -45.38690537884443d, 15.012881902242082d);
    ++counter;

    //Medium blue
    expected[counter] = new Color(0x0000CD);
    actual[counter] = new Color(24.97615723043893d, 67.18428741632908d, -91.50315664044204d);
    ++counter;

    //Medium candy apple red
    expected[counter] = new Color(0xE2062C);
    actual[counter] = new Color(47.59913191988269d, 73.2796590128888d, 43.81937167689489d);
    ++counter;

    //Medium carmine
    expected[counter] = new Color(0xAF4035);
    actual[counter] = new Color(42.82013509851914d, 44.62733285286624d, 30.65236794564006d);
    ++counter;

    //Medium champagne
    expected[counter] = new Color(0xF3E5AB);
    actual[counter] = new Color(90.79522618837458d, -3.8310479670478625d, 30.058406066721723d);
    ++counter;

    //Medium electric blue
    expected[counter] = new Color(0x035096);
    actual[counter] = new Color(33.89670097444853d, 7.742679434834587d, -44.0364261190561d);
    ++counter;

    //Medium jungle green
    expected[counter] = new Color(0x1C352D);
    actual[counter] = new Color(19.97385187331583d, -12.01364632028215d, 2.015948142555457d);
    ++counter;

    //Medium lavender magenta
    expected[counter] = new Color(0xDDA0DD);
    actual[counter] = new Color(73.37274280928348d, 32.53910156838102d, -21.997129268948832d);
    ++counter;

    //Medium orchid
    expected[counter] = new Color(0xBA55D3);
    actual[counter] = new Color(53.64213313573549d, 59.07257828449175d, -47.41488617791036d);
    ++counter;

    //Medium Persian blue
    expected[counter] = new Color(0x0067A5);
    actual[counter] = new Color(41.87150967553842d, -1.134575329843207d, -40.26350109112325d);
    ++counter;

    //Medium purple
    expected[counter] = new Color(0x9370DB);
    actual[counter] = new Color(54.97523587308039d, 36.80772335871158d, -50.09944015501455d);
    ++counter;

    //Medium red-violet
    expected[counter] = new Color(0xBB3385);
    actual[counter] = new Color(45.11749672768821d, 60.76660161981179d, -14.843995741238935d);
    ++counter;

    //Medium ruby
    expected[counter] = new Color(0xAA4069);
    actual[counter] = new Color(43.11188431718962d, 47.29035036419532d, -0.9479649600845796d);
    ++counter;

    //Medium sea green
    expected[counter] = new Color(0x3CB371);
    actual[counter] = new Color(65.27341001550978d, -48.21688068872271d, 24.28693825219328d);
    ++counter;

    //Medium sky blue
    expected[counter] = new Color(0x80DAEB);
    actual[counter] = new Color(82.23346527742883d, -22.586670657941397d, -16.743470736625166d);
    ++counter;

    //Medium slate blue
    expected[counter] = new Color(0x7B68EE);
    actual[counter] = new Color(52.15750471109439d, 41.0796614910427d, -65.4054237721159d);
    ++counter;

    //Medium spring bud
    expected[counter] = new Color(0xC9DC87);
    actual[counter] = new Color(84.6653996278131d, -19.64939882977468d, 39.64403966564986d);
    ++counter;

    //Medium spring green
    expected[counter] = new Color(0x00FA9A);
    actual[counter] = new Color(87.3411479783456d, -70.68432399982389d, 32.45916926757219d);
    ++counter;

    //Medium taupe
    expected[counter] = new Color(0x674C47);
    actual[counter] = new Color(35.01798021401003d, 10.62237586602935d, 7.4153301620533245d);
    ++counter;

    //Medium turquoise
    expected[counter] = new Color(0x48D1CC);
    actual[counter] = new Color(76.8834686242291d, -37.35439643481242d, -8.361003975747261d);
    ++counter;

    //Medium Tuscan red
    expected[counter] = new Color(0x79443B);
    actual[counter] = new Color(35.03312666076893d, 21.769429419647047d, 15.355791689464349d);
    ++counter;

    //Medium vermilion
    expected[counter] = new Color(0xD9603B);
    actual[counter] = new Color(55.515799140895666d, 45.237306404440126d, 43.60284158676511d);
    ++counter;

    //Medium violet-red
    expected[counter] = new Color(0xC71585);
    actual[counter] = new Color(44.76162545138306d, 71.00675283550362d, -15.182364137182415d);
    ++counter;

    //Mellow apricot
    expected[counter] = new Color(0xF8B878);
    actual[counter] = new Color(79.38190792651326d, 15.975346030774995d, 41.36998769970135d);
    ++counter;

    //Mellow yellow
    expected[counter] = new Color(0xF8DE7E);
    actual[counter] = new Color(88.78304880169912d, -3.1513043740321045d, 50.014848552135675d);
    ++counter;

    //Melon
    expected[counter] = new Color(0xFDBCB4);
    actual[counter] = new Color(81.91660002722129d, 22.334434748493226d, 13.223928689072473d);
    ++counter;

    //Metallic Seaweed
    expected[counter] = new Color(0x0A7E8C);
    actual[counter] = new Color(48.10808422357533d, -23.287453739487653d, -15.767182369851373d);
    ++counter;

    //Metallic Sunburst
    expected[counter] = new Color(0x9C7C38);
    actual[counter] = new Color(53.780776563123084d, 4.493397595706772d, 40.94993550210763d);
    ++counter;

    //Mexican pink
    expected[counter] = new Color(0xE4007C);
    actual[counter] = new Color(49.43445476590652d, 78.48486586047898d, -2.0996545875779926d);
    ++counter;

    //Midnight blue
    expected[counter] = new Color(0x191970);
    actual[counter] = new Color(15.859552026439893d, 31.71998372383503d, -49.57833156167393d);
    ++counter;

    //Midnight green (eagle green)
    expected[counter] = new Color(0x004953);
    actual[counter] = new Color(27.81714234436572d, -15.766495007682513d, -11.62621949513668d);
    ++counter;

    //Mikado yellow
    expected[counter] = new Color(0xFFC40C);
    actual[counter] = new Color(82.25300114909119d, 7.892520315653629d, 82.73643582773906d);
    ++counter;

    //Mindaro
    expected[counter] = new Color(0xE3F988);
    actual[counter] = new Color(94.25238630352762d, -23.696340891521782d, 51.5691150058222d);
    ++counter;

    //Mint
    expected[counter] = new Color(0x3EB489);
    actual[counter] = new Color(66.11511663177556d, -43.16700791943895d, 12.440042282051822d);
    ++counter;

    //Mint cream
    expected[counter] = new Color(0xF5FFFA);
    actual[counter] = new Color(99.15659662605985d, -4.157988956613345d, 1.2363909888613467d);
    ++counter;

    //Mint green
    expected[counter] = new Color(0x98FF98);
    actual[counter] = new Color(91.89193467456052d, -49.97572640665721d, 40.00531198524582d);
    ++counter;

    //Misty rose
    expected[counter] = new Color(0xFFE4E1);
    actual[counter] = new Color(92.65558901260384d, 8.752081989750193d, 4.82561763130902d);
    ++counter;

    //Moccasin
    expected[counter] = new Color(0xFAEBD7);
    actual[counter] = new Color(93.73077088204487d, 1.8427318819214111d, 11.516868127356773d);
    ++counter;

    //Mode beige
    expected[counter] = new Color(0x967117);
    actual[counter] = new Color(49.9252566654166d, 6.321548478211147d, 50.861272755219d);
    ++counter;

    //Moonstone blue
    expected[counter] = new Color(0x73A9C2);
    actual[counter] = new Color(66.45555003433802d, -11.253620844636657d, -18.39737420024006d);
    ++counter;

    //Mordant red 19
    expected[counter] = new Color(0xAE0C00);
    actual[counter] = new Color(36.48318975174712d, 58.698329301994676d, 50.590654748415766d);
    ++counter;

    //Moss green
    expected[counter] = new Color(0x8A9A5B);
    actual[counter] = new Color(61.01901168990153d, -16.277838648838305d, 31.16294619790594d);
    ++counter;

    //Mountain Meadow
    expected[counter] = new Color(0x30BA8F);
    actual[counter] = new Color(67.82067118887639d, -46.43063750660487d, 11.521417072725516d);
    ++counter;

    //Mountbatten pink
    expected[counter] = new Color(0x997A8D);
    actual[counter] = new Color(54.67297792359814d, 15.324230950113538d, -5.713129841021081d);
    ++counter;

    //MSU Green
    expected[counter] = new Color(0x18453B);
    actual[counter] = new Color(26.058014480220635d, -18.264225814358355d, 1.4521007817903664d);
    ++counter;

    //Mughal green
    expected[counter] = new Color(0x306030);
    actual[counter] = new Color(36.38081187476922d, -27.411495086540782d, 22.411599632630995d);
    ++counter;

    //Mulberry
    expected[counter] = new Color(0xC54B8C);
    actual[counter] = new Color(50.44758308341386d, 55.059980520163975d, -10.842114079349653d);
    ++counter;

    //Mustard
    expected[counter] = new Color(0xFFDB58);
    actual[counter] = new Color(88.2698109915024d, -1.5186582994773934d, 66.75415939478033d);
    ++counter;

    //Myrtle green
    expected[counter] = new Color(0x317873);
    actual[counter] = new Color(46.07441999602461d, -23.328321640277426d, -3.934585669343016d);
    ++counter;

    //Nadeshiko pink
    expected[counter] = new Color(0xF6ADC6);
    actual[counter] = new Color(78.20282141839822d, 30.23284721258085d, -1.9457405564559105d);
    ++counter;

    //Napier green
    expected[counter] = new Color(0x2A8000);
    actual[counter] = new Color(46.8832844611529d, -45.937349323084106d, 50.69600145273512d);
    ++counter;

    //Naples yellow
    expected[counter] = new Color(0xFADA5E);
    actual[counter] = new Color(87.61842075934568d, -2.7164374201131825d, 63.390705944858695d);
    ++counter;

    //Navajo white
    expected[counter] = new Color(0xFFDEAD);
    actual[counter] = new Color(90.10007935356519d, 4.512981096042312d, 28.26448480810637d);
    ++counter;

    //Navy
    expected[counter] = new Color(0x000080);
    actual[counter] = new Color(12.975311577716514d, 47.50776531013767d, -64.70427324580548d);
    ++counter;

    //Navy purple
    expected[counter] = new Color(0x9457EB);
    actual[counter] = new Color(50.81617547001828d, 54.747241688930416d, -65.77449338432866d);
    ++counter;

    //Neon Carrot
    expected[counter] = new Color(0xFFA343);
    actual[counter] = new Color(74.73630955472835d, 26.434388211665492d, 61.546373171644184d);
    ++counter;

    //Neon fuchsia
    expected[counter] = new Color(0xFE4164);
    actual[counter] = new Color(57.81954380214921d, 71.69368323176356d, 24.777424752292255d);
    ++counter;

    //Neon green
    expected[counter] = new Color(0x39FF14);
    actual[counter] = new Color(88.18012249873242d, -82.09271975092392d, 81.99488502802055d);
    ++counter;

    //New Car
    expected[counter] = new Color(0x214FC6);
    actual[counter] = new Color(37.828992524194966d, 29.60158555708664d, -66.12145266303855d);
    ++counter;

    //New York pink
    expected[counter] = new Color(0xD7837F);
    actual[counter] = new Color(63.517696044548074d, 31.856370263966262d, 15.969349923923627d);
    ++counter;

    //Non-photo blue
    expected[counter] = new Color(0xA4DDED);
    actual[counter] = new Color(84.85331003357247d, -14.42044839861284d, -13.694211885867148d);
    ++counter;

    //North Texas Green
    expected[counter] = new Color(0x059033);
    actual[counter] = new Color(52.08257103060792d, -52.53479738780092d, 39.32290080059173d);
    ++counter;

    //Nyanza
    expected[counter] = new Color(0xE9FFDB);
    actual[counter] = new Color(97.61510702063364d, -13.44228477731807d, 14.800114781600548d);
    ++counter;

    //Ocean Boat Blue
    expected[counter] = new Color(0x0077BE);
    actual[counter] = new Color(48.14815103378709d, -1.0512963840492162d, -44.86576403898308d);
    ++counter;

    //Ochre
    expected[counter] = new Color(0xCC7722);
    actual[counter] = new Color(58.17585957500238d, 27.33990270688047d, 56.82401407673046d);
    ++counter;

    //Office green
    expected[counter] = new Color(0x008000);
    actual[counter] = new Color(46.22881784262658d, -51.69964732808236d, 49.89795230983843d);
    ++counter;

    //Old burgundy
    expected[counter] = new Color(0x43302E);
    actual[counter] = new Color(21.96045561461677d, 8.313600258432668d, 4.659089171178898d);
    ++counter;

    //Old gold
    expected[counter] = new Color(0xCFB53B);
    actual[counter] = new Color(73.9517774574382d, -3.751221593291998d, 62.31176237932979d);
    ++counter;

    //Old heliotrope
    expected[counter] = new Color(0x563C5C);
    actual[counter] = new Color(29.36917480157073d, 17.804076527522d, -14.616078555139488d);
    ++counter;

    //Old lace
    expected[counter] = new Color(0xFDF5E6);
    actual[counter] = new Color(96.77967120416257d, 0.17534145176512084d, 8.156541509383164d);
    ++counter;

    //Old lavender
    expected[counter] = new Color(0x796878);
    actual[counter] = new Color(46.071622961212d, 9.818813716782893d, -6.425328748279413d);
    ++counter;

    //Old mauve
    expected[counter] = new Color(0x673147);
    actual[counter] = new Color(28.20795232376807d, 27.000087764486924d, -2.410890579569269d);
    ++counter;

    //Old moss green
    expected[counter] = new Color(0x867E36);
    actual[counter] = new Color(52.12585366176782d, -6.7363720508605285d, 39.48023137274276d);
    ++counter;

    //Old rose
    expected[counter] = new Color(0xC08081);
    actual[counter] = new Color(60.09577366388078d, 24.906686421575674d, 9.62565509924158d);
    ++counter;

    //Old silver
    expected[counter] = new Color(0x848482);
    actual[counter] = new Color(55.092693252505214d, -0.3896142291815452d, 1.0705956951766904d);
    ++counter;

    //Olive
    expected[counter] = new Color(0x808000);
    actual[counter] = new Color(51.86833136334822d, -12.930760098732952d, 56.677284661941485d);
    ++counter;

    //Olive Drab (0x3)
    expected[counter] = new Color(0x6B8E23);
    actual[counter] = new Color(54.650773976467136d, -28.223405639870858d, 49.690975204748526d);
    ++counter;

    //Olive Drab 0x7
    expected[counter] = new Color(0x3C341F);
    actual[counter] = new Color(22.000554670427995d, -0.04333396787456478d, 14.579541531981144d);
    ++counter;

    //Olivine
    expected[counter] = new Color(0x9AB973);
    actual[counter] = new Color(71.422932421179d, -22.68939362388417d, 32.134432086866525d);
    ++counter;

    //Onyx
    expected[counter] = new Color(0x353839);
    actual[counter] = new Color(23.272846702300903d, -1.0396071872373902d, -1.071257803529413d);
    ++counter;

    //Opera mauve
    expected[counter] = new Color(0xB784A7);
    actual[counter] = new Color(61.097890170471075d, 25.224777569957112d, -10.78157646731408d);
    ++counter;

    //Orange (color wheel)
    expected[counter] = new Color(0xFF7F00);
    actual[counter] = new Color(66.853804382266d, 43.32394349110946d, 73.90977076096985d);
    ++counter;

    //Orange (Crayola)
    expected[counter] = new Color(0xFF7538);
    actual[counter] = new Color(65.17482203230536d, 49.1501123689182d, 56.86048533647116d);
    ++counter;

    //Orange (Pantone)
    expected[counter] = new Color(0xFF5800);
    actual[counter] = new Color(60.10445008779915d, 60.879691266747194d, 70.18861700468287d);
    ++counter;

    //Orange (RYB)
    expected[counter] = new Color(0xFB9902);
    actual[counter] = new Color(71.75546573356215d, 28.53703001506852d, 76.41264589200215d);
    ++counter;

    //Orange (web)
    expected[counter] = new Color(0xFFA500);
    actual[counter] = new Color(74.93219484533535d, 23.936049070113096d, 78.95630717524574d);
    ++counter;

    //Orange peel
    expected[counter] = new Color(0xFF9F00);
    actual[counter] = new Color(73.58203480378546d, 27.0592325378633d, 78.08011354635482d);
    ++counter;

    //Orange-red
    expected[counter] = new Color(0xFF4500);
    actual[counter] = new Color(57.57499421872107d, 67.79549870675844d, 68.97142722529851d);
    ++counter;

    //Orchid
    expected[counter] = new Color(0xDA70D6);
    actual[counter] = new Color(62.8009876658991d, 55.293737808598195d, -34.41750911448498d);
    ++counter;

    //Orchid pink
    expected[counter] = new Color(0xF2BDCD);
    actual[counter] = new Color(81.66406207314014d, 21.42845011400657d, -0.7100832970448279d);
    ++counter;

    //Orioles orange
    expected[counter] = new Color(0xFB4F14);
    actual[counter] = new Color(58.180764144292226d, 63.21513257823508d, 64.55713083536816d);
    ++counter;

    //Otter brown
    expected[counter] = new Color(0x654321);
    actual[counter] = new Color(31.557047663700253d, 10.87788982866758d, 26.1862382551975d);
    ++counter;

    //Outer Space
    expected[counter] = new Color(0x414A4C);
    actual[counter] = new Color(30.74346677569467d, -3.1352836345728274d, -2.4273101906719385d);
    ++counter;

    //Outrageous Orange
    expected[counter] = new Color(0xFF6E4A);
    actual[counter] = new Color(64.08494623380322d, 53.12210179447319d, 46.95607365644997d);
    ++counter;

    //Oxford Blue
    expected[counter] = new Color(0x002147);
    actual[counter] = new Color(12.876641467906431d, 5.80716306727698d, -27.033833979150884d);
    ++counter;

    //OU Crimson Red
    expected[counter] = new Color(0x990000);
    actual[counter] = new Color(31.282832098372488d, 54.710925420263266d, 45.14223821546162d);
    ++counter;

    //Pakistan green
    expected[counter] = new Color(0x006600);
    actual[counter] = new Color(36.934763135957596d, -43.9781548228278d, 42.44554818911081d);
    ++counter;

    //Palatinate blue
    expected[counter] = new Color(0x273BE2);
    actual[counter] = new Color(36.08086615219621d, 52.3257070560407d, -85.1295811209589d);
    ++counter;

    //Palatinate purple
    expected[counter] = new Color(0x682860);
    actual[counter] = new Color(27.58707265789687d, 36.41127189704604d, -19.765594828592093d);
    ++counter;

    //Pale aqua
    expected[counter] = new Color(0xBCD4E6);
    actual[counter] = new Color(83.70031440778298d, -4.270695016843629d, -11.555395178369432d);
    ++counter;

    //Pale blue
    expected[counter] = new Color(0xAFEEEE);
    actual[counter] = new Color(90.06142407788806d, -19.633178620875324d, -6.408390544116638d);
    ++counter;

    //Pale brown
    expected[counter] = new Color(0x987654);
    actual[counter] = new Color(52.143760042982336d, 8.68041166423561d, 23.80174056602907d);
    ++counter;

    //Pale carmine
    expected[counter] = new Color(0xAF4035);
    actual[counter] = new Color(42.82013509851914d, 44.62733285286624d, 30.65236794564006d);
    ++counter;

    //Pale cerulean
    expected[counter] = new Color(0x9BC4E2);
    actual[counter] = new Color(77.24459032344001d, -6.570808350883695d, -19.327702500210542d);
    ++counter;

    //Pale chestnut
    expected[counter] = new Color(0xDDADAF);
    actual[counter] = new Color(75.04793528852727d, 17.797913554712718d, 5.696306291094011d);
    ++counter;

    //Pale copper
    expected[counter] = new Color(0xDA8A67);
    actual[counter] = new Color(65.01148219943127d, 26.9071572458397d, 31.40391528250599d);
    ++counter;

    //Pale cornflower blue
    expected[counter] = new Color(0xABCDEF);
    actual[counter] = new Color(81.04502986916337d, -3.6560987672591416d, -20.451824520585227d);
    ++counter;

    //Pale cyan
    expected[counter] = new Color(0x87D3F8);
    actual[counter] = new Color(81.02523293799192d, -13.969062534545106d, -25.45747641119145d);
    ++counter;

    //Pale gold
    expected[counter] = new Color(0xE6BE8A);
    actual[counter] = new Color(79.31974739006816d, 7.39038606800052d, 31.619225303355236d);
    ++counter;

    //Pale goldenrod
    expected[counter] = new Color(0xEEE8AA);
    actual[counter] = new Color(91.14038954621267d, -7.347233923247709d, 30.964442634340152d);
    ++counter;

    //Pale green
    expected[counter] = new Color(0x98FB98);
    actual[counter] = new Color(90.75103714758299d, -48.29645958674339d, 38.523397284130986d);
    ++counter;

    //Pale lavender
    expected[counter] = new Color(0xDCD0FF);
    actual[counter] = new Color(85.77962720845164d, 13.088290290271642d, -21.45066504768409d);
    ++counter;

    //Pale magenta
    expected[counter] = new Color(0xF984E5);
    actual[counter] = new Color(71.07685853505538d, 57.04032799497488d, -29.62397056388124d);
    ++counter;

    //Pale magenta-pink
    expected[counter] = new Color(0xff99cc);
    actual[counter] = new Color(75.07783971210465d, 44.59362871465422d, -9.732723201907234d);
    ++counter;

    //Pale pink
    expected[counter] = new Color(0xFADADD);
    actual[counter] = new Color(89.7139372398668d, 11.546332007344006d, 2.6040487946612068d);
    ++counter;

    //Pale plum
    expected[counter] = new Color(0xDDA0DD);
    actual[counter] = new Color(73.37274280928348d, 32.53910156838102d, -21.997129268948832d);
    ++counter;

    //Pale red-violet
    expected[counter] = new Color(0xDB7093);
    actual[counter] = new Color(60.564787867661266d, 45.52751277278544d, 0.39179081977875896d);
    ++counter;

    //Pale robin egg blue
    expected[counter] = new Color(0x96DED1);
    actual[counter] = new Color(83.61572300611053d, -25.193029044671576d, -0.779928140724917d);
    ++counter;

    //Pale silver
    expected[counter] = new Color(0xC9C0BB);
    actual[counter] = new Color(78.28919288465998d, 2.2750631521347153d, 3.6309303881375543d);
    ++counter;

    //Pale spring bud
    expected[counter] = new Color(0xECEBBD);
    actual[counter] = new Color(92.0977065792326d, -7.031233235085088d, 22.506378836927322d);
    ++counter;

    //Pale taupe
    expected[counter] = new Color(0xBC987E);
    actual[counter] = new Color(65.47854585110139d, 9.66682289267512d, 18.760825243749114d);
    ++counter;

    //Pale turquoise
    expected[counter] = new Color(0xAFEEEE);
    actual[counter] = new Color(90.06142407788806d, -19.633178620875324d, -6.408390544116638d);
    ++counter;

    //Pale violet
    expected[counter] = new Color(0xCC99FF);
    actual[counter] = new Color(71.44612815525062d, 38.067954851905895d, -43.64502689759644d);
    ++counter;

    //Pale violet-red
    expected[counter] = new Color(0xDB7093);
    actual[counter] = new Color(60.564787867661266d, 45.52751277278544d, 0.39179081977875896d);
    ++counter;

    //Pansy purple
    expected[counter] = new Color(0x78184A);
    actual[counter] = new Color(27.132054704089008d, 44.55652489769313d, -5.679174896816564d);
    ++counter;

    //Paolo Veronese green
    expected[counter] = new Color(0x009B7D);
    actual[counter] = new Color(57.00066921661481d, -41.940162047035265d, 6.065750814430926d);
    ++counter;

    //Papaya whip
    expected[counter] = new Color(0xFFEFD5);
    actual[counter] = new Color(95.07544110280504d, 1.2745662248987988d, 14.516263841670728d);
    ++counter;

    //Paradise pink
    expected[counter] = new Color(0xE63E62);
    actual[counter] = new Color(53.113363392764626d, 65.72838135909409d, 18.915857003898353d);
    ++counter;

    //Paris Green
    expected[counter] = new Color(0x50C878);
    actual[counter] = new Color(72.47517570451704d, -51.24956261121649d, 30.251909270553345d);
    ++counter;

    //Pastel blue
    expected[counter] = new Color(0xAEC6CF);
    actual[counter] = new Color(78.398618202509d, -6.212085671808476d, -7.233532972478596d);
    ++counter;

    //Pastel brown
    expected[counter] = new Color(0x836953);
    actual[counter] = new Color(46.38246219450709d, 7.0317788587152545d, 16.298250426210025d);
    ++counter;

    //Pastel gray
    expected[counter] = new Color(0xCFCFC4);
    actual[counter] = new Color(82.8477360878429d, -1.9481883382121423d, 5.45319678678704d);
    ++counter;

    //Pastel green
    expected[counter] = new Color(0x77DD77);
    actual[counter] = new Color(80.1608895136069d, -50.082903737155405d, 40.910046348921455d);
    ++counter;

    //Pastel magenta
    expected[counter] = new Color(0xF49AC2);
    actual[counter] = new Color(73.7005695433987d, 38.91877560592272d, -6.41512011286216d);
    ++counter;

    //Pastel orange
    expected[counter] = new Color(0xFFB347);
    actual[counter] = new Color(78.43556312431681d, 18.257419035105805d, 63.6046664507018d);
    ++counter;

    //Pastel pink
    expected[counter] = new Color(0xDEA5A4);
    actual[counter] = new Color(72.97096946476562d, 20.884247194255522d, 8.762519791504907d);
    ++counter;

    //Pastel purple
    expected[counter] = new Color(0xB39EB5);
    actual[counter] = new Color(67.55639923605557d, 11.888955183807559d, -9.06211176317484d);
    ++counter;

    //Pastel red
    expected[counter] = new Color(0xFF6961);
    actual[counter] = new Color(63.52941164673247d, 56.61136402103828d, 33.881153313010756d);
    ++counter;

    //Pastel violet
    expected[counter] = new Color(0xCB99C9);
    actual[counter] = new Color(69.25247268908137d, 26.689351997480404d, -17.405165623856366d);
    ++counter;

    //Pastel yellow
    expected[counter] = new Color(0xFDFD96);
    actual[counter] = new Color(97.3634790903245d, -14.321778783010108d, 49.1837645836017d);
    ++counter;

    //Patriarch
    expected[counter] = new Color(0x800080);
    actual[counter] = new Color(29.782100092098077d, 58.93983731904206d, -36.49792996282386d);
    ++counter;

    //Payne's grey
    expected[counter] = new Color(0x536878);
    actual[counter] = new Color(42.90708135275119d, -3.7214122749534284d, -11.495581740131232d);
    ++counter;

    //Peach
    expected[counter] = new Color(0xFFE5B4);
    actual[counter] = new Color(91.95068405324938d, 1.806032882201214d, 27.177786271896043d);
    ++counter;

    //Peach
    expected[counter] = new Color(0xFFCBA4);
    actual[counter] = new Color(85.32800748877085d, 13.25761105083928d, 26.465928498075698d);
    ++counter;

    //Peach-orange
    expected[counter] = new Color(0xFFCC99);
    actual[counter] = new Color(85.37533156544693d, 11.502399197500402d, 32.25857471908529d);
    ++counter;

    //Peach puff
    expected[counter] = new Color(0xFFDAB9);
    actual[counter] = new Color(89.34875285782702d, 8.088803829765679d, 21.01392564732589d);
    ++counter;

    //Peach-yellow
    expected[counter] = new Color(0xFADFAD);
    actual[counter] = new Color(89.91339286699d, 2.111335231350986d, 27.93869191135403d);
    ++counter;

    //Pear
    expected[counter] = new Color(0xD1E231);
    actual[counter] = new Color(86.09126979910437d, -25.817205003596968d, 76.99646259843209d);
    ++counter;

    //Pearl
    expected[counter] = new Color(0xEAE0C8);
    actual[counter] = new Color(89.38075097302972d, -0.52699913350851d, 12.967918064131556d);
    ++counter;

    //Pearl Aqua
    expected[counter] = new Color(0x88D8C0);
    actual[counter] = new Color(80.82308280434462d, -29.897099671784165d, 4.102756130251861d);
    ++counter;

    //Pearly purple
    expected[counter] = new Color(0xB768A2);
    actual[counter] = new Color(54.63345891695867d, 39.72046338052848d, -17.665395499026037d);
    ++counter;

    //Peridot
    expected[counter] = new Color(0xE6E200);
    actual[counter] = new Color(87.5897024255467d, -17.996033053822302d, 86.61907998790328d);
    ++counter;

    //Periwinkle
    expected[counter] = new Color(0xCCCCFF);
    actual[counter] = new Color(83.57012223117405d, 10.303455437196241d, -24.920516101721457d);
    ++counter;

    //Persian blue
    expected[counter] = new Color(0x1C39BB);
    actual[counter] = new Color(31.25647961391529d, 39.316387856761864d, -70.46666070583622d);
    ++counter;

    //Persian green
    expected[counter] = new Color(0x00A693);
    actual[counter] = new Color(61.11468572058895d, -40.53733582223562d, -0.39981120623675537d);
    ++counter;

    //Persian indigo
    expected[counter] = new Color(0x32127A);
    actual[counter] = new Color(17.99019438820924d, 41.39252216116321d, -52.43221395069779d);
    ++counter;

    //Persian orange
    expected[counter] = new Color(0xD99058);
    actual[counter] = new Color(66.06108261744677d, 22.072462664515957d, 40.6855283716107d);
    ++counter;

    //Persian pink
    expected[counter] = new Color(0xF77FBE);
    actual[counter] = new Color(68.51198759842262d, 52.9893392669934d, -11.880757464624203d);
    ++counter;

    //Persian plum
    expected[counter] = new Color(0x701C1C);
    actual[counter] = new Color(24.82473345151257d, 36.634215822665354d, 21.865087727123385d);
    ++counter;

    //Persian red
    expected[counter] = new Color(0xCC3333);
    actual[counter] = new Color(46.23646947050827d, 59.13272141466691d, 37.11362156302701d);
    ++counter;

    //Persian rose
    expected[counter] = new Color(0xFE28A2);
    actual[counter] = new Color(57.266911332173436d, 82.79035248243449d, -12.62154355553966d);
    ++counter;

    //Persimmon
    expected[counter] = new Color(0xEC5800);
    actual[counter] = new Color(56.8920916243855d, 54.416461154171756d, 66.76876863229697d);
    ++counter;

    //Peru
    expected[counter] = new Color(0xCD853F);
    actual[counter] = new Color(61.751663684265665d, 21.398558365867572d, 47.916570468789146d);
    ++counter;

    //Phlox
    expected[counter] = new Color(0xDF00FF);
    actual[counter] = new Color(54.97742256346518d, 93.56179957488459d, -69.7190666430323d);
    ++counter;

    //Phthalo blue
    expected[counter] = new Color(0x000F89);
    actual[counter] = new Color(16.24447400883688d, 44.35786734366931d, -64.94072656183228d);
    ++counter;

    //Phthalo green
    expected[counter] = new Color(0x123524);
    actual[counter] = new Color(19.233567682274533d, -17.589855264264653d, 7.002668967282988d);
    ++counter;

    //Picton blue
    expected[counter] = new Color(0x45B1E8);
    actual[counter] = new Color(68.41358626784691d, -13.348694397369687d, -36.46326084110449d);
    ++counter;

    //Pictorial carmine
    expected[counter] = new Color(0xC30B4E);
    actual[counter] = new Color(41.83170614700686d, 66.75706988052066d, 14.790972298556893d);
    ++counter;

    //Piggy pink
    expected[counter] = new Color(0xFDDDE6);
    actual[counter] = new Color(90.92059466045218d, 12.490738399769164d, -0.3327459785566589d);
    ++counter;

    //Pine green
    expected[counter] = new Color(0x01796F);
    actual[counter] = new Color(45.39894586543132d, -30.83885830332253d, -2.649220340646097d);
    ++counter;

    //Pineapple
    expected[counter] = new Color(0x563C5C);
    actual[counter] = new Color(29.36917480157073d, 17.804076527522d, -14.616078555139488d);
    ++counter;

    //Pink
    expected[counter] = new Color(0xFFC0CB);
    actual[counter] = new Color(83.58479885775868d, 24.149661012571322d, 3.315387151150806d);
    ++counter;

    //Pink (Pantone)
    expected[counter] = new Color(0xD74894);
    actual[counter] = new Color(53.189348698409404d, 62.48198562223939d, -11.184385792789264d);
    ++counter;

    //Pink lace
    expected[counter] = new Color(0xFFDDF4);
    actual[counter] = new Color(91.46210143334545d, 15.530894503598457d, -6.856050260122815d);
    ++counter;

    //Pink lavender
    expected[counter] = new Color(0xD8B2D1);
    actual[counter] = new Color(76.70515078785218d, 18.945415486781194d, -10.474747203815692d);
    ++counter;

    //Pink-orange
    expected[counter] = new Color(0xFF9966);
    actual[counter] = new Color(72.8930628093705d, 33.571178995476956d, 42.778646734800496d);
    ++counter;

    //Pink pearl
    expected[counter] = new Color(0xE7ACCF);
    actual[counter] = new Color(76.67838261694891d, 26.973693723357616d, -9.27185769386487d);
    ++counter;

    //Pink raspberry
    expected[counter] = new Color(0x980036);
    actual[counter] = new Color(31.67391408713361d, 56.12264946053544d, 15.093755732471159d);
    ++counter;

    //Pink Sherbet
    expected[counter] = new Color(0xF78FA7);
    actual[counter] = new Color(71.01484458678011d, 41.984204894021936d, 4.669492260239827d);
    ++counter;

    //Pistachio
    expected[counter] = new Color(0x93C572);
    actual[counter] = new Color(74.41337981760837d, -31.207249923621283d, 36.40816784257843d);
    ++counter;

    //Platinum
    expected[counter] = new Color(0xE5E4E2);
    actual[counter] = new Color(90.6134531659295d, -0.013567573197592608d, 1.0822435970740507d);
    ++counter;

    //Plum
    expected[counter] = new Color(0x8E4585);
    actual[counter] = new Color(40.736068738377355d, 39.98875466594262d, -22.19065314122305d);
    ++counter;

    //Plum (web)
    expected[counter] = new Color(0xDDA0DD);
    actual[counter] = new Color(73.37274280928348d, 32.53910156838102d, -21.997129268948832d);
    ++counter;

    //Pomp and Power
    expected[counter] = new Color(0x86608E);
    actual[counter] = new Color(46.15984929069696d, 23.89328054120188d, -19.349177127479255d);
    ++counter;

    //Popstar
    expected[counter] = new Color(0xBE4F62);
    actual[counter] = new Color(48.786121788491386d, 46.30264145204915d, 11.884968129809103d);
    ++counter;

    //Portland Orange
    expected[counter] = new Color(0xFF5A36);
    actual[counter] = new Color(60.63898328480035d, 60.97307488775444d, 53.35411028007564d);
    ++counter;

    //Powder blue
    expected[counter] = new Color(0xB0E0E6);
    actual[counter] = new Color(86.13359115282357d, -14.087699737247327d, -8.016131723508835d);
    ++counter;

    //Princeton orange
    expected[counter] = new Color(0xF58025);
    actual[counter] = new Color(65.7365116586376d, 39.422130007019106d, 64.42310461325602d);
    ++counter;

    //Prune
    expected[counter] = new Color(0x701C1C);
    actual[counter] = new Color(24.82473345151257d, 36.634215822665354d, 21.865087727123385d);
    ++counter;

    //Prussian blue
    expected[counter] = new Color(0x003153);
    actual[counter] = new Color(19.312936634389438d, -0.41324827279839993d, -24.88657164896193d);
    ++counter;

    //Psychedelic purple
    expected[counter] = new Color(0xDF00FF);
    actual[counter] = new Color(54.97742256346518d, 93.56179957488459d, -69.7190666430323d);
    ++counter;

    //Puce
    expected[counter] = new Color(0xCC8899);
    actual[counter] = new Color(63.95438523422446d, 28.35632044634212d, 1.66504583204925d);
    ++counter;

    //Puce red
    expected[counter] = new Color(0x722F37);
    actual[counter] = new Color(29.123709862851626d, 30.365877798119694d, 9.718102707508114d);
    ++counter;

    //Pullman Brown (UPS Brown)
    expected[counter] = new Color(0x644117);
    actual[counter] = new Color(30.763940651769538d, 10.971464232480688d, 30.73393224714994d);
    ++counter;

    //Pullman Green
    expected[counter] = new Color(0x3B331C);
    actual[counter] = new Color(21.510474592399234d, -0.2816175464150916d, 15.86252338647739d);
    ++counter;

    //Pumpkin
    expected[counter] = new Color(0xFF7518);
    actual[counter] = new Color(65.00107210283021d, 48.382016175279205d, 68.4278660129298d);
    ++counter;

    //Purple (HTML)
    expected[counter] = new Color(0x800080);
    actual[counter] = new Color(29.782100092098077d, 58.93983731904206d, -36.49792996282386d);
    ++counter;

    //Purple (Munsell)
    expected[counter] = new Color(0x9F00C5);
    actual[counter] = new Color(40.24969689453505d, 75.21625257277057d, -61.072514917910404d);
    ++counter;

    //Purple (X11)
    expected[counter] = new Color(0xA020F0);
    actual[counter] = new Color(45.356107138614085d, 78.74992240455131d, -77.4057921793247d);
    ++counter;

    //Purple Heart
    expected[counter] = new Color(0x69359C);
    actual[counter] = new Color(33.8780419174213d, 43.27965601699457d, -47.384763880634594d);
    ++counter;

    //Purple mountain majesty
    expected[counter] = new Color(0x9678B6);
    actual[counter] = new Color(55.37426541771646d, 24.002605282597678d, -28.401864558362576d);
    ++counter;

    //Purple navy
    expected[counter] = new Color(0x4E5180);
    actual[counter] = new Color(36.105450166562015d, 11.297455099152975d, -26.888343046117747d);
    ++counter;

    //Purple pizzazz
    expected[counter] = new Color(0xFE4EDA);
    actual[counter] = new Color(62.99553361363475d, 79.29711397397415d, -35.970351333837435d);
    ++counter;

    //Purple taupe
    expected[counter] = new Color(0x50404D);
    actual[counter] = new Color(29.179381725993153d, 9.533533455791721d, -5.238398115035148d);
    ++counter;

    //Purpureus
    expected[counter] = new Color(0x9A4EAE);
    actual[counter] = new Color(46.14331837212128d, 46.80730516038473d, -38.17071131586898d);
    ++counter;

    //Quartz
    expected[counter] = new Color(0x51484F);
    actual[counter] = new Color(31.68954742461736d, 5.235285233697845d, -2.7919053422959084d);
    ++counter;

    //Queen blue
    expected[counter] = new Color(0x436B95);
    actual[counter] = new Color(44.05833558231217d, -1.2750073046789434d, -27.208395194887025d);
    ++counter;

    //Queen pink
    expected[counter] = new Color(0xE8CCD7);
    actual[counter] = new Color(84.61128284829364d, 11.622988795444321d, -1.8535225411487d);
    ++counter;

    //Quinacridone magenta
    expected[counter] = new Color(0x8E3A59);
    actual[counter] = new Color(36.92626045887503d, 38.85995071670642d, -0.5260832690270556d);
    ++counter;

    //Rackley
    expected[counter] = new Color(0x5D8AA8);
    actual[counter] = new Color(55.41192892871888d, -7.127665665440985d, -20.662310657392567d);
    ++counter;

    //Radical Red
    expected[counter] = new Color(0xFF355E);
    actual[counter] = new Color(56.69772626513847d, 74.99425531171016d, 26.87500757103355d);
    ++counter;

    //Rajah
    expected[counter] = new Color(0xFBAB60);
    actual[counter] = new Color(76.3626873608562d, 22.19080184644684d, 49.81814760319663d);
    ++counter;

    //Raspberry
    expected[counter] = new Color(0xE30B5D);
    actual[counter] = new Color(48.71115613772649d, 75.22055870211037d, 15.877091665051445d);
    ++counter;

    //Raspberry glace
    expected[counter] = new Color(0x915F6D);
    actual[counter] = new Color(46.05358176390693d, 22.44825415169399d, 0.47699437785069243d);
    ++counter;

    //Raspberry pink
    expected[counter] = new Color(0xE25098);
    actual[counter] = new Color(56.26066133491314d, 62.91410836943562d, -8.755670385800274d);
    ++counter;

    //Raspberry rose
    expected[counter] = new Color(0xB3446C);
    actual[counter] = new Color(45.35995247726232d, 48.731666024536715d, 0.6664978481353279d);
    ++counter;

    //Raw umber
    expected[counter] = new Color(0x826644);
    actual[counter] = new Color(45.17319052307081d, 6.527953828621758d, 23.453898158676147d);
    ++counter;

    //Razzle dazzle rose
    expected[counter] = new Color(0xFF33CC);
    actual[counter] = new Color(59.87725061838307d, 85.32056144565414d, -32.88871566072311d);
    ++counter;

    //Razzmatazz
    expected[counter] = new Color(0xE3256B);
    actual[counter] = new Color(50.35275776055708d, 72.35842486229238d, 9.57422704726536d);
    ++counter;

    //Razzmic Berry
    expected[counter] = new Color(0x8D4E85);
    actual[counter] = new Color(42.467877498600416d, 34.809240218662886d, -19.528282805841357d);
    ++counter;

    //Rebecca Purple
    expected[counter] = new Color(0x663399);
    actual[counter] = new Color(32.90243720302775d, 42.89220259872703d, -47.15692817856151d);
    ++counter;

    //Red
    expected[counter] = new Color(0xFF0000);
    actual[counter] = new Color(53.23288178584245d, 80.10930952982204d, 67.22006831026425d);
    ++counter;

    //Red (Crayola)
    expected[counter] = new Color(0xEE204D);
    actual[counter] = new Color(51.548796522584794d, 74.30497635195765d, 29.7431515512688d);
    ++counter;

    //Red (Munsell)
    expected[counter] = new Color(0xF2003C);
    actual[counter] = new Color(50.92443440375996d, 78.03564781422983d, 39.24301104731042d);
    ++counter;

    //Red (NCS)
    expected[counter] = new Color(0xC40233);
    actual[counter] = new Color(41.245023994862244d, 66.55731423196009d, 31.019269773219595d);
    ++counter;

    //Red (Pantone)
    expected[counter] = new Color(0xED2939);
    actual[counter] = new Color(51.70785822581662d, 71.44197847782047d, 41.538410121040584d);
    ++counter;

    //Red (pigment)
    expected[counter] = new Color(0xED1C24);
    actual[counter] = new Color(50.643195798705406d, 73.36158100594875d, 51.616317876138815d);
    ++counter;

    //Red (RYB)
    expected[counter] = new Color(0xFE2712);
    actual[counter] = new Color(54.62198285793936d, 75.54753315835889d, 63.22778652882365d);
    ++counter;

    //Red-brown
    expected[counter] = new Color(0xA52A2A);
    actual[counter] = new Color(37.521829744034335d, 49.699782879003926d, 30.540267189480907d);
    ++counter;

    //Red devil
    expected[counter] = new Color(0x860111);
    actual[counter] = new Color(27.103401825485804d, 49.80714017580676d, 32.48134928041437d);
    ++counter;

    //Red-orange
    expected[counter] = new Color(0xFF5349);
    actual[counter] = new Color(59.82322992539176d, 64.4143341711772d, 42.67031697991301d);
    ++counter;

    //Red-purple
    expected[counter] = new Color(0xE40078);
    actual[counter] = new Color(49.31372277053687d, 78.16715674842028d, 0.1662712431377944d);
    ++counter;

    //Red-violet
    expected[counter] = new Color(0xC71585);
    actual[counter] = new Color(44.76162545138306d, 71.00675283550362d, -15.182364137182415d);
    ++counter;

    //Redwood
    expected[counter] = new Color(0xA45A52);
    actual[counter] = new Color(46.7295611621184d, 29.413364845989665d, 18.054126957511308d);
    ++counter;

    //Regalia
    expected[counter] = new Color(0x522D80);
    actual[counter] = new Color(27.3778093378113d, 34.98249175802126d, -40.75165700431427d);
    ++counter;

    //Resolution blue
    expected[counter] = new Color(0x002387);
    actual[counter] = new Color(19.847929038465907d, 32.507544515540474d, -57.69870932704959d);
    ++counter;

    //Rhythm
    expected[counter] = new Color(0x777696);
    actual[counter] = new Color(50.78162026338866d, 7.503126356313561d, -17.14138225353288d);
    ++counter;

    //Rich black
    expected[counter] = new Color(0x004040);
    actual[counter] = new Color(23.793246228452887d, -17.861335267241817d, -5.252243007248025d);
    ++counter;

    //Rich brilliant lavender
    expected[counter] = new Color(0xF1A7FE);
    actual[counter] = new Color(78.1657374608724d, 41.26901036397995d, -32.38016149115359d);
    ++counter;

    //Rich carmine
    expected[counter] = new Color(0xD70040);
    actual[counter] = new Color(45.382854217245914d, 71.83122443383743d, 28.95209732755323d);
    ++counter;

    //Rich electric blue
    expected[counter] = new Color(0x0892D0);
    actual[counter] = new Color(57.23433961423622d, -9.77096625845636d, -40.72918052834438d);
    ++counter;

    //Rich lavender
    expected[counter] = new Color(0xA76BCF);
    actual[counter] = new Color(55.31447008804598d, 42.091841093732874d, -42.64124718877509d);
    ++counter;

    //Rich lilac
    expected[counter] = new Color(0xB666D2);
    actual[counter] = new Color(56.18874498659859d, 49.51527878247441d, -42.84745503789953d);
    ++counter;

    //Rich maroon
    expected[counter] = new Color(0xB03060);
    actual[counter] = new Color(41.51421680339138d, 54.71396813946636d, 2.458849199114399d);
    ++counter;

    //Rifle green
    expected[counter] = new Color(0x444C38);
    actual[counter] = new Color(31.074898417637463d, -7.402477168385547d, 10.847384021031935d);
    ++counter;

    //Roast coffee
    expected[counter] = new Color(0x704241);
    actual[counter] = new Color(33.39884245642248d, 19.80060941083642d, 9.120001664722155d);
    ++counter;

    //Robin egg blue
    expected[counter] = new Color(0x00CCCC);
    actual[counter] = new Color(74.53726760701616d, -40.63796357866983d, -11.94986023392799d);
    ++counter;

    //Rocket metallic
    expected[counter] = new Color(0x8A7F80);
    actual[counter] = new Color(54.17579277066338d, 4.359118786139815d, 0.9602417979860389d);
    ++counter;

    //Roman silver
    expected[counter] = new Color(0x838996);
    actual[counter] = new Color(56.996046320025d, 0.5585112468216025d, -7.680759681809546d);
    ++counter;

    //Rose
    expected[counter] = new Color(0xFF007F);
    actual[counter] = new Color(54.857758849253244d, 84.48066810163257d, 4.62720489978099d);
    ++counter;

    //Rose bonbon
    expected[counter] = new Color(0xF9429E);
    actual[counter] = new Color(58.513123724275204d, 74.73326344305175d, -8.502464670953259d);
    ++counter;

    //Rose ebony
    expected[counter] = new Color(0x674846);
    actual[counter] = new Color(33.90046618464174d, 12.946611654397866d, 6.4694756910862905d);
    ++counter;

    //Rose gold
    expected[counter] = new Color(0xB76E79);
    actual[counter] = new Color(54.657512719306524d, 30.32037836864382d, 6.3684254371963345d);
    ++counter;

    //Rose madder
    expected[counter] = new Color(0xE32636);
    actual[counter] = new Color(49.476042283622505d, 69.33046824098543d, 40.23492072035363d);
    ++counter;

    //Rose pink
    expected[counter] = new Color(0xFF66CC);
    actual[counter] = new Color(65.84383116604573d, 68.6013880782329d, -23.681044673048923d);
    ++counter;

    //Rose quartz
    expected[counter] = new Color(0xAA98A9);
    actual[counter] = new Color(64.85693907501036d, 9.749129548733526d, -6.44520141137479d);
    ++counter;

    //Rose red
    expected[counter] = new Color(0xC21E56);
    actual[counter] = new Color(42.86817802854806d, 63.9991953516042d, 11.137747286124466d);
    ++counter;

    //Rose taupe
    expected[counter] = new Color(0x905D5D);
    actual[counter] = new Color(45.00922053075875d, 20.88963374884073d, 8.644502579423419d);
    ++counter;

    //Rose vale
    expected[counter] = new Color(0xAB4E52);
    actual[counter] = new Color(45.242599244559614d, 38.4958326002654d, 16.22373951751268d);
    ++counter;

    //Rosewood
    expected[counter] = new Color(0x65000B);
    actual[counter] = new Color(19.186077393112328d, 40.873979579190475d, 24.937194947200584d);
    ++counter;

    //Rosso corsa
    expected[counter] = new Color(0xD40000);
    actual[counter] = new Color(44.22869865188672d, 69.6905767667903d, 58.47766456033969d);
    ++counter;

    //Rosy brown
    expected[counter] = new Color(0xBC8F8F);
    actual[counter] = new Color(63.6060381979233d, 17.01700134777101d, 6.601742985829917d);
    ++counter;

    //Royal azure
    expected[counter] = new Color(0x0038A8);
    actual[counter] = new Color(28.52613435145045d, 31.51529167948608d, -63.65869576312725d);
    ++counter;

    //Royal blue
    expected[counter] = new Color(0x002366);
    actual[counter] = new Color(16.31230078111175d, 18.72538381885777d, -42.338842867634696d);
    ++counter;

    //Royal blue
    expected[counter] = new Color(0x4169E1);
    actual[counter] = new Color(47.83284750656463d, 26.274040223758842d, -65.27058223311909d);
    ++counter;

    //Royal fuchsia
    expected[counter] = new Color(0xCA2C92);
    actual[counter] = new Color(47.537836142858716d, 68.24162040403664d, -18.777569017312025d);
    ++counter;

    //Royal purple
    expected[counter] = new Color(0x7851A9);
    actual[counter] = new Color(42.37266948441725d, 34.72350969066096d, -41.45998353085836d);
    ++counter;

    //Royal yellow
    expected[counter] = new Color(0xFADA5E);
    actual[counter] = new Color(87.61842075934568d, -2.7164374201131825d, 63.390705944858695d);
    ++counter;

    //Ruber
    expected[counter] = new Color(0xCE4676);
    actual[counter] = new Color(50.46432950789546d, 57.370179627654785d, 2.5559516228728762d);
    ++counter;

    //Rubine red
    expected[counter] = new Color(0xD10056);
    actual[counter] = new Color(44.55700945197792d, 71.56888205292516d, 13.945831729247848d);
    ++counter;

    //Ruby
    expected[counter] = new Color(0xE0115F);
    actual[counter] = new Color(48.3536616264939d, 74.05816676536664d, 14.056974887457063d);
    ++counter;

    //Ruby red
    expected[counter] = new Color(0x9B111E);
    actual[counter] = new Color(32.838947947104316d, 53.24577722458385d, 32.026922956134804d);
    ++counter;

    //Ruddy
    expected[counter] = new Color(0xFF0028);
    actual[counter] = new Color(53.39878314409127d, 80.56242377318024d, 53.46280765119897d);
    ++counter;

    //Ruddy brown
    expected[counter] = new Color(0xBB6528);
    actual[counter] = new Color(51.86586916840854d, 30.0828064722104d, 47.723020187783526d);
    ++counter;

    //Ruddy pink
    expected[counter] = new Color(0xE18E96);
    actual[counter] = new Color(67.69176832132791d, 32.47439050420747d, 9.05479057062102d);
    ++counter;

    //Rufous
    expected[counter] = new Color(0xA81C07);
    actual[counter] = new Color(36.3108550009992d, 54.01959640416126d, 47.00668924531936d);
    ++counter;

    //Russet
    expected[counter] = new Color(0x80461B);
    actual[counter] = new Color(36.077783103877394d, 21.31223570935442d, 35.4116557942873d);
    ++counter;

    //Russian green
    expected[counter] = new Color(0x679267);
    actual[counter] = new Color(56.50647655734234d, -23.70145798082046d, 18.211078581250796d);
    ++counter;

    //Russian violet
    expected[counter] = new Color(0x32174D);
    actual[counter] = new Color(14.55031072854177d, 25.650736297089193d, -28.26944838401596d);
    ++counter;

    //Rust
    expected[counter] = new Color(0xB7410E);
    actual[counter] = new Color(44.059736619573314d, 45.76390624491389d, 51.12283076953447d);
    ++counter;

    //Rusty red
    expected[counter] = new Color(0xDA2C43);
    actual[counter] = new Color(48.40089489840878d, 65.94317424048762d, 30.96011787016516d);
    ++counter;

    //Sacramento State green
    expected[counter] = new Color(0x00563F);
    actual[counter] = new Color(31.839801737951838d, -29.086764852965157d, 7.083993062926819d);
    ++counter;

    //Saddle brown
    expected[counter] = new Color(0x8B4513);
    actual[counter] = new Color(37.46692024400534d, 26.446533617811046d, 40.98539645347435d);
    ++counter;

    //Safety orange
    expected[counter] = new Color(0xFF7800);
    actual[counter] = new Color(65.50889979025912d, 46.72034705662664d, 73.12411489098032d);
    ++counter;

    //Safety orange (blaze orange)
    expected[counter] = new Color(0xFF6700);
    actual[counter] = new Color(62.47427123000318d, 54.568791461269306d, 71.42705312942546d);
    ++counter;

    //Safety yellow
    expected[counter] = new Color(0xEED202);
    actual[counter] = new Color(84.10859597639725d, -6.631951079058007d, 84.23899614869815d);
    ++counter;

    //Saffron
    expected[counter] = new Color(0xF4C430);
    actual[counter] = new Color(81.25109694490547d, 3.8904245723105912d, 74.14567317380677d);
    ++counter;

    //Sage
    expected[counter] = new Color(0xBCB88A);
    actual[counter] = new Color(74.0663561490787d, -5.972797186311496d, 23.939715997864774d);
    ++counter;

    //St. Patrick's blue
    expected[counter] = new Color(0x23297A);
    actual[counter] = new Color(21.388202257446395d, 26.177740094674384d, -46.89661071070383d);
    ++counter;

    //Salmon
    expected[counter] = new Color(0xFA8072);
    actual[counter] = new Color(67.25995258561211d, 45.234049450998846d, 29.086704529704544d);
    ++counter;

    //Salmon pink
    expected[counter] = new Color(0xFF91A4);
    actual[counter] = new Color(72.35606605567791d, 43.41457328827231d, 8.396045090885917d);
    ++counter;

    //Sand
    expected[counter] = new Color(0xC2B280);
    actual[counter] = new Color(72.8053122317831d, -1.7477082434693703d, 27.67094617697987d);
    ++counter;

    //Sand dune
    expected[counter] = new Color(0x967117);
    actual[counter] = new Color(49.9252566654166d, 6.321548478211147d, 50.861272755219d);
    ++counter;

    //Sandstorm
    expected[counter] = new Color(0xECD540);
    actual[counter] = new Color(84.88996912444655d, -7.59890903980015d, 71.99527303836697d);
    ++counter;

    //Sandy brown
    expected[counter] = new Color(0xF4A460);
    actual[counter] = new Color(73.95154071958171d, 23.03047362571753d, 46.78722426265524d);
    ++counter;

    //Sandy taupe
    expected[counter] = new Color(0x967117);
    actual[counter] = new Color(49.9252566654166d, 6.321548478211147d, 50.861272755219d);
    ++counter;

    //Sangria
    expected[counter] = new Color(0x92000A);
    actual[counter] = new Color(29.745331476953467d, 53.017889357705265d, 39.223500763298006d);
    ++counter;

    //Sap green
    expected[counter] = new Color(0x507D2A);
    actual[counter] = new Color(47.67496328210673d, -30.358143574855085d, 39.13209785359067d);
    ++counter;

    //Sapphire
    expected[counter] = new Color(0x0F52BA);
    actual[counter] = new Color(37.2642859639835d, 21.78222972927321d, -60.04779104133876d);
    ++counter;

    //Sapphire blue
    expected[counter] = new Color(0x0067A5);
    actual[counter] = new Color(41.87150967553842d, -1.134575329843207d, -40.26350109112325d);
    ++counter;

    //Satin sheen gold
    expected[counter] = new Color(0xCBA135);
    actual[counter] = new Color(68.34606724842543d, 4.833712026917847d, 59.003012700128956d);
    ++counter;

    //Scarlet
    expected[counter] = new Color(0xFF2400);
    actual[counter] = new Color(54.57627244687694d, 76.23926723544355d, 67.70719251095299d);
    ++counter;

    //Scarlet
    expected[counter] = new Color(0xFD0E35);
    actual[counter] = new Color(53.44257604207084d, 79.41233355826155d, 46.55743152740115d);
    ++counter;

    //Schauss pink
    expected[counter] = new Color(0xFF91AF);
    actual[counter] = new Color(72.63166310143234d, 44.73742952063275d, 2.685804411192527d);
    ++counter;

    //School bus yellow
    expected[counter] = new Color(0xFFD800);
    actual[counter] = new Color(87.17886331616711d, -2.429895994379261d, 87.3138096668541d);
    ++counter;

    //Screamin' Green
    expected[counter] = new Color(0x76FF7A);
    actual[counter] = new Color(90.21873437008765d, -63.17066512463509d, 51.89257349080791d);
    ++counter;

    //Sea blue
    expected[counter] = new Color(0x006994);
    actual[counter] = new Color(41.59703605771757d, -9.138213272804647d, -30.592963798847162d);
    ++counter;

    //Sea green
    expected[counter] = new Color(0x2E8B57);
    actual[counter] = new Color(51.53535112854968d, -39.714256583856525d, 20.04946707204722d);
    ++counter;

    //Seal brown
    expected[counter] = new Color(0x321414);
    actual[counter] = new Color(10.769083339447128d, 15.165414022039567d, 6.983635282722261d);
    ++counter;

    //Seashell
    expected[counter] = new Color(0xFFF5EE);
    actual[counter] = new Color(97.12111642889012d, 2.1670284447041777d, 4.544048646620058d);
    ++counter;

    //Selective yellow
    expected[counter] = new Color(0xFFBA00);
    actual[counter] = new Color(79.82836082858125d, 12.983357102841097d, 82.21870582062645d);
    ++counter;

    //Sepia
    expected[counter] = new Color(0x704214);
    actual[counter] = new Color(32.68244589049633d, 15.98509103759116d, 34.67360044035965d);
    ++counter;

    //Shadow
    expected[counter] = new Color(0x8A795D);
    actual[counter] = new Color(51.68801649361828d, 2.097066599243802d, 17.783904801633277d);
    ++counter;

    //Shadow blue
    expected[counter] = new Color(0x778BA5);
    actual[counter] = new Color(57.17640650220595d, -1.0100897770322081d, -16.108801606901245d);
    ++counter;

    //Shampoo
    expected[counter] = new Color(0xFFCFF1);
    actual[counter] = new Color(88.08231173334283d, 22.330841235492837d, -10.29105221276685d);
    ++counter;

    //Shamrock green
    expected[counter] = new Color(0x009E60);
    actual[counter] = new Color(57.36486743825634d, -50.060261899549765d, 22.754796819950364d);
    ++counter;

    //Sheen Green
    expected[counter] = new Color(0x8FD400);
    actual[counter] = new Color(77.83164694643527d, -46.50469645723665d, 76.71270825402836d);
    ++counter;

    //Shimmering Blush
    expected[counter] = new Color(0xD98695);
    actual[counter] = new Color(64.9402090394329d, 33.65848368813229d, 5.552655354290548d);
    ++counter;

    //Shocking pink
    expected[counter] = new Color(0xFC0FC0);
    actual[counter] = new Color(56.921997025534964d, 88.85075111631168d, -30.641225753496283d);
    ++counter;

    //Shocking pink (Crayola)
    expected[counter] = new Color(0xFF6FFF);
    actual[counter] = new Color(69.36175953764969d, 72.51959547953768d, -46.498793008379245d);
    ++counter;

    //Sienna
    expected[counter] = new Color(0x882D17);
    actual[counter] = new Color(32.19726507948835d, 37.721136651547944d, 34.08733909394583d);
    ++counter;

    //Silver
    expected[counter] = new Color(0xC0C0C0);
    actual[counter] = new Color(77.7043635899527d, 0.0042494120755520726d, -0.008407692302325742d);
    ++counter;

    //Silver chalice
    expected[counter] = new Color(0xACACAC);
    actual[counter] = new Color(70.35369546800982d, 0.003916065615561237d, -0.007748148248887254d);
    ++counter;

    //Silver Lake blue
    expected[counter] = new Color(0x5D89BA);
    actual[counter] = new Color(55.85037187355121d, -1.2106473595712708d, -30.280975782194265d);
    ++counter;

    //Silver pink
    expected[counter] = new Color(0xC4AEAD);
    actual[counter] = new Color(72.90835017949203d, 7.749214054235287d, 3.40388255674553d);
    ++counter;

    //Silver sand
    expected[counter] = new Color(0xBFC1C2);
    actual[counter] = new Color(77.94068698506307d, -0.5014259988001535d, -0.7531551507003353d);
    ++counter;

    //Sinopia
    expected[counter] = new Color(0xCB410B);
    actual[counter] = new Color(47.62538252907274d, 52.72052160885321d, 56.057060578385396d);
    ++counter;

    //Skobeloff
    expected[counter] = new Color(0x007474);
    actual[counter] = new Color(43.8747671231825d, -26.874994904801692d, -7.902768854994369d);
    ++counter;

    //Sky blue
    expected[counter] = new Color(0x87CEEB);
    actual[counter] = new Color(79.20897459092869d, -14.832183746447015d, -21.284638024171045d);
    ++counter;

    //Sky magenta
    expected[counter] = new Color(0xCF71AF);
    actual[counter] = new Color(60.042730876451074d, 44.96258695359345d, -16.66524240874978d);
    ++counter;

    //Slate blue
    expected[counter] = new Color(0x6A5ACD);
    actual[counter] = new Color(45.33730589003685d, 36.0494772684547d, -57.780204808133995d);
    ++counter;

    //Slate gray
    expected[counter] = new Color(0x708090);
    actual[counter] = new Color(52.83625796271889d, -2.1385958505868996d, -10.57740141476744d);
    ++counter;

    //Smalt (Dark powder blue)
    expected[counter] = new Color(0x003399);
    actual[counter] = new Color(25.765848836459647d, 28.893196922698454d, -59.09703272477203d);
    ++counter;

    //Smitten
    expected[counter] = new Color(0xC84186);
    actual[counter] = new Color(49.229625065297924d, 59.31864734693182d, -9.023129714785117d);
    ++counter;

    //Smoke
    expected[counter] = new Color(0x738276);
    actual[counter] = new Color(52.8597513794535d, -7.970766266833906d, 4.635110772094442d);
    ++counter;

    //Smoky black
    expected[counter] = new Color(0x100C08);
    actual[counter] = new Color(3.5285707972576645d, 0.7250826943950434d, 2.0126126063083394d);
    ++counter;

    //Smoky Topaz
    expected[counter] = new Color(0x933D41);
    actual[counter] = new Color(37.7024081045031d, 36.640933862031375d, 15.8798355570408d);
    ++counter;

    //Snow
    expected[counter] = new Color(0xFFFAFA);
    actual[counter] = new Color(98.64376394836441d, 1.6619790971080795d, 0.577087179763347d);
    ++counter;

    //Soap
    expected[counter] = new Color(0xCEC8EF);
    actual[counter] = new Color(82.1968950680152d, 9.640367680914308d, -18.47480107871513d);
    ++counter;

    //Solid pink
    expected[counter] = new Color(0x893843);
    actual[counter] = new Color(35.10693887777892d, 35.62332988350092d, 10.804286979809596d);
    ++counter;

    //Sonic silver
    expected[counter] = new Color(0x757575);
    actual[counter] = new Color(49.23898744619521d, 0.0029585318166991392d, -0.0058536156860578d);
    ++counter;

    //Spartan Crimson
    expected[counter] = new Color(0x9E1316);
    actual[counter] = new Color(33.547528389068525d, 53.464555267481146d, 37.48078165107025d);
    ++counter;

    //Space cadet
    expected[counter] = new Color(0x1D2951);
    actual[counter] = new Color(17.650424945410023d, 9.09803715096058d, -26.127807491865905d);
    ++counter;

    //Spanish bistre
    expected[counter] = new Color(0x807532);
    actual[counter] = new Color(48.935902199808154d, -4.747491571090556d, 37.71991001770878d);
    ++counter;

    //Spanish blue
    expected[counter] = new Color(0x0070B8);
    actual[counter] = new Color(45.70128150492005d, 0.8787047602833997d, -45.293147403780566d);
    ++counter;

    //Spanish carmine
    expected[counter] = new Color(0xD10047);
    actual[counter] = new Color(44.247616043303665d, 70.73893212795413d, 22.9254272061755d);
    ++counter;

    //Spanish crimson
    expected[counter] = new Color(0xE51A4C);
    actual[counter] = new Color(49.39723536077538d, 73.00622103736914d, 27.260704236741006d);
    ++counter;

    //Spanish gray
    expected[counter] = new Color(0x989898);
    actual[counter] = new Color(62.8429141926609d, 0.0035754581622637893d, -0.0070742379261190536d);
    ++counter;

    //Spanish green
    expected[counter] = new Color(0x009150);
    actual[counter] = new Color(52.76291965328369d, -48.56766175705232d, 25.408539774790604d);
    ++counter;

    //Spanish orange
    expected[counter] = new Color(0xE86100);
    actual[counter] = new Color(57.75615714607322d, 48.9792746883902d, 66.87820810262417d);
    ++counter;

    //Spanish pink
    expected[counter] = new Color(0xF7BFBE);
    actual[counter] = new Color(82.2460296567445d, 19.920841776263686d, 8.249627730772403d);
    ++counter;

    //Spanish red
    expected[counter] = new Color(0xE60026);
    actual[counter] = new Color(48.21329969015612d, 74.57975424083479d, 47.92144259921848d);
    ++counter;

    //Spanish sky blue
    expected[counter] = new Color(0x00FFFF);
    actual[counter] = new Color(91.11652110946342d, -48.079618466228716d, -14.138127754846131d);
    ++counter;

    //Spanish violet
    expected[counter] = new Color(0x4C2882);
    actual[counter] = new Color(25.760563939229108d, 36.98628165772019d, -44.661126006580965d);
    ++counter;

    //Spanish viridian
    expected[counter] = new Color(0x007F5C);
    actual[counter] = new Color(46.91072885314129d, -38.95377210242537d, 10.742037366385915d);
    ++counter;

    //Spicy mix
    expected[counter] = new Color(0x8b5f4d);
    actual[counter] = new Color(44.5314772978541d, 15.620570411745971d, 17.514073136659157d);
    ++counter;

    //Spiro Disco Ball
    expected[counter] = new Color(0x0FC0FC);
    actual[counter] = new Color(72.77922534843702d, -18.84948897090627d, -40.56977422888368d);
    ++counter;

    //Spring bud
    expected[counter] = new Color(0xA7FC00);
    actual[counter] = new Color(90.70514933582375d, -54.30920769401737d, 87.1635952285469d);
    ++counter;

    //Spring green
    expected[counter] = new Color(0x00FF7F);
    actual[counter] = new Color(88.47265520282772d, -76.90097301637367d, 47.0252935988744d);
    ++counter;

    //Star command blue
    expected[counter] = new Color(0x007BB8);
    actual[counter] = new Color(49.04005751372625d, -5.80236736249412d, -39.992608830182895d);
    ++counter;

    //Steel blue
    expected[counter] = new Color(0x4682B4);
    actual[counter] = new Color(52.46747241512048d, -4.070162109182873d, -32.19815980641454d);
    ++counter;

    //Steel pink
    expected[counter] = new Color(0xCC33CC);
    actual[counter] = new Color(51.34138709418167d, 74.76781109589542d, -46.90401672506683d);
    ++counter;

    //Stil de grain yellow
    expected[counter] = new Color(0xFADA5E);
    actual[counter] = new Color(87.61842075934568d, -2.7164374201131825d, 63.390705944858695d);
    ++counter;

    //Stizza
    expected[counter] = new Color(0x990000);
    actual[counter] = new Color(31.282832098372488d, 54.710925420263266d, 45.14223821546162d);
    ++counter;

    //Stormcloud
    expected[counter] = new Color(0x4F666A);
    actual[counter] = new Color(41.54106189403257d, -7.5213025226902595d, -5.07193235844543d);
    ++counter;

    //Straw
    expected[counter] = new Color(0xE4D96F);
    actual[counter] = new Color(85.63879470255583d, -9.951283731701622d, 52.97144273238965d);
    ++counter;

    //Strawberry
    expected[counter] = new Color(0xFC5A8D);
    actual[counter] = new Color(61.5945232938824d, 65.38928321741905d, 5.975965216740309d);
    ++counter;

    //Sunglow
    expected[counter] = new Color(0xFFCC33);
    actual[counter] = new Color(84.32102298289159d, 4.523032351779477d, 76.35298628384616d);
    ++counter;

    //Sunray
    expected[counter] = new Color(0xE3AB57);
    actual[counter] = new Color(73.63941554127456d, 11.689662365760078d, 50.35637163880533d);
    ++counter;

    //Sunset
    expected[counter] = new Color(0xFAD6A5);
    actual[counter] = new Color(87.54994475400268d, 5.761013685243343d, 28.87340254036641d);
    ++counter;

    //Sunset orange
    expected[counter] = new Color(0xFD5E53);
    actual[counter] = new Color(61.231372111575894d, 59.874408267578616d, 38.75105584273666d);
    ++counter;

    //Super pink
    expected[counter] = new Color(0xCF6BA9);
    actual[counter] = new Color(58.644622202748636d, 47.086418767283476d, -15.33547540677036d);
    ++counter;

    //Tan
    expected[counter] = new Color(0xD2B48C);
    actual[counter] = new Color(74.97454643298407d, 5.023785176497153d, 24.421485241390606d);
    ++counter;

    //Tangelo
    expected[counter] = new Color(0xF94D00);
    actual[counter] = new Color(57.5088532735147d, 63.14374349800389d, 68.32462952481303d);
    ++counter;

    //Tangerine
    expected[counter] = new Color(0xF28500);
    actual[counter] = new Color(66.25339882884809d, 35.173175903661814d, 72.61921394480673d);
    ++counter;

    //Tangerine yellow
    expected[counter] = new Color(0xFFCC00);
    actual[counter] = new Color(84.19730517203196d, 3.6799110684865854d, 85.22284819051876d);
    ++counter;

    //Tango pink
    expected[counter] = new Color(0xE4717A);
    actual[counter] = new Color(61.40265021929976d, 45.423009737434626d, 16.157344450988198d);
    ++counter;

    //Taupe
    expected[counter] = new Color(0x483C32);
    actual[counter] = new Color(26.27317414728777d, 3.4218627459425277d, 8.13115687690188d);
    ++counter;

    //Taupe gray
    expected[counter] = new Color(0x8B8589);
    actual[counter] = new Color(56.157979248474945d, 3.0176015358959196d, -1.3513843323473163d);
    ++counter;

    //Tea green
    expected[counter] = new Color(0xD0F0C0);
    actual[counter] = new Color(91.4761962686915d, -18.965109463467023d, 19.795431608761895d);
    ++counter;

    //Tea rose
    expected[counter] = new Color(0xF88379);
    actual[counter] = new Color(67.7021458472602d, 43.59124858610469d, 25.738986808505327d);
    ++counter;

    //Tea rose
    expected[counter] = new Color(0xF4C2C2);
    actual[counter] = new Color(82.75987230135719d, 17.828120077149514d, 6.805936202571172d);
    ++counter;

    //Teal
    expected[counter] = new Color(0x008080);
    actual[counter] = new Color(48.25607381337552d, -28.841559463342104d, -8.481050086288366d);
    ++counter;

    //Teal blue
    expected[counter] = new Color(0x367588);
    actual[counter] = new Color(46.021319774666885d, -14.245606961966306d, -16.49574095762729d);
    ++counter;

    //Teal deer
    expected[counter] = new Color(0x99E6B3);
    actual[counter] = new Color(85.31199094496947d, -34.2217194196493d, 17.454031472125763d);
    ++counter;

    //Teal green
    expected[counter] = new Color(0x00827F);
    actual[counter] = new Color(48.88095477705686d, -30.133482901317564d, -6.959208130377004d);
    ++counter;

    //Telemagenta
    expected[counter] = new Color(0xCF3476);
    actual[counter] = new Color(48.29704179323521d, 64.15830867018407d, -0.577175489212256d);
    ++counter;

    //Tenné
    expected[counter] = new Color(0xCD5700);
    actual[counter] = new Color(51.60523656909554d, 43.5919129783352d, 61.15971961020278d);
    ++counter;

    //Terra cotta
    expected[counter] = new Color(0xE2725B);
    actual[counter] = new Color(60.745170850304945d, 41.60180826699656d, 32.79417748576989d);
    ++counter;

    //Thistle
    expected[counter] = new Color(0xD8BFD8);
    actual[counter] = new Color(80.07734471203901d, 13.22352288154599d, -9.238900197222666d);
    ++counter;

    //Thulian pink
    expected[counter] = new Color(0xDE6FA1);
    actual[counter] = new Color(61.195675130471756d, 48.827074937279114d, -6.695732956624401d);
    ++counter;

    //Tickle Me Pink
    expected[counter] = new Color(0xFC89AC);
    actual[counter] = new Color(70.5701924537952d, 47.35451787217371d, 1.3139764752355898d);
    ++counter;

    //Tiffany Blue
    expected[counter] = new Color(0x0ABAB5);
    actual[counter] = new Color(68.40106308951695d, -39.12053924085374d, -8.553760268473587d);
    ++counter;

    //Tiger's eye
    expected[counter] = new Color(0xE08D3C);
    actual[counter] = new Color(65.92214185849535d, 24.92699698510259d, 54.419942015135305d);
    ++counter;

    //Timberwolf
    expected[counter] = new Color(0xDBD7D2);
    actual[counter] = new Color(86.16326203681416d, 0.488262780444948d, 2.9355990778980434d);
    ++counter;

    //Titanium yellow
    expected[counter] = new Color(0xEEE600);
    actual[counter] = new Color(89.28551114588105d, -16.585802867938536d, 88.14657115466544d);
    ++counter;

    //Tomato
    expected[counter] = new Color(0xFF6347);
    actual[counter] = new Color(62.20136881808274d, 57.861325307863645d, 46.41666460154521d);
    ++counter;

    //Toolbox
    expected[counter] = new Color(0x746CC0);
    actual[counter] = new Color(49.79060453574921d, 23.784004534595116d, -43.12570943016425d);
    ++counter;

    //Topaz
    expected[counter] = new Color(0xFFC87C);
    actual[counter] = new Color(83.9781540772946d, 10.775023499948633d, 45.23443203802697d);
    ++counter;

    //Tractor red
    expected[counter] = new Color(0xFD0E35);
    actual[counter] = new Color(53.44257604207084d, 79.41233355826155d, 46.55743152740115d);
    ++counter;

    //Trolley Grey
    expected[counter] = new Color(0x808080);
    actual[counter] = new Color(53.585013452169036d, 0.003155620347972121d, -0.006243566036245873d);
    ++counter;

    //Tropical rain forest
    expected[counter] = new Color(0x00755E);
    actual[counter] = new Color(43.55228311226873d, -34.13756756967359d, 4.804964389557065d);
    ++counter;

    //True Blue
    expected[counter] = new Color(0x0073CF);
    actual[counter] = new Color(47.96441932678487d, 8.159785486771487d, -54.906567627826306d);
    ++counter;

    //Tufts Blue
    expected[counter] = new Color(0x417DC1);
    actual[counter] = new Color(51.42921390769348d, 2.422769209479647d, -41.30092346828596d);
    ++counter;

    //Tulip
    expected[counter] = new Color(0xFF878D);
    actual[counter] = new Color(69.83197312371962d, 45.96172670840038d, 17.649234827531203d);
    ++counter;

    //Tumbleweed
    expected[counter] = new Color(0xDEAA88);
    actual[counter] = new Color(73.58225888421062d, 14.631985933597546d, 24.887209424024313d);
    ++counter;

    //Turkish rose
    expected[counter] = new Color(0xB57281);
    actual[counter] = new Color(55.526114045909495d, 28.4433486841259d, 2.9059445400170025d);
    ++counter;

    //Turquoise
    expected[counter] = new Color(0x40E0D0);
    actual[counter] = new Color(81.26705459794431d, -44.07625420413397d, -4.034478714864265d);
    ++counter;

    //Turquoise blue
    expected[counter] = new Color(0x00FFEF);
    actual[counter] = new Color(90.66661251171905d, -52.5686152067526d, -6.5046713529075095d);
    ++counter;

    //Turquoise green
    expected[counter] = new Color(0xA0D6B4);
    actual[counter] = new Color(81.21568490939192d, -24.257709291143737d, 11.20652568569911d);
    ++counter;

    //Tuscan
    expected[counter] = new Color(0xFAD6A5);
    actual[counter] = new Color(87.54994475400268d, 5.761013685243343d, 28.87340254036641d);
    ++counter;

    //Tuscan brown
    expected[counter] = new Color(0x6F4E37);
    actual[counter] = new Color(36.183996450213854d, 10.871618872692862d, 19.094335268349884d);
    ++counter;

    //Tuscan red
    expected[counter] = new Color(0x7C4848);
    actual[counter] = new Color(36.72027281923813d, 22.183560332211083d, 9.570234764358187d);
    ++counter;

    //Tuscan tan
    expected[counter] = new Color(0xA67B5B);
    actual[counter] = new Color(55.10141383842924d, 12.58881169464454d, 24.00366729605986d);
    ++counter;

    //Tuscany
    expected[counter] = new Color(0xC09999);
    actual[counter] = new Color(66.74003266917272d, 14.523567739989252d, 5.5311143009366015d);
    ++counter;

    //Twilight lavender
    expected[counter] = new Color(0x8A496B);
    actual[counter] = new Color(39.96501015919931d, 32.04586814672161d, -7.39484403330577d);
    ++counter;

    //Tyrian purple
    expected[counter] = new Color(0x66023C);
    actual[counter] = new Color(20.8063680832434d, 43.88205513164078d, -5.987899007610498d);
    ++counter;

    //UA blue
    expected[counter] = new Color(0x0033AA);
    actual[counter] = new Color(27.490360344885133d, 35.60574980718575d, -66.56844621090687d);
    ++counter;

    //UA red
    expected[counter] = new Color(0xD9004C);
    actual[counter] = new Color(46.00656422487581d, 72.85906149660309d, 22.41892627156178d);
    ++counter;

    //Ube
    expected[counter] = new Color(0x8878C3);
    actual[counter] = new Color(54.665532312755715d, 22.95153637166758d, -37.04242939597919d);
    ++counter;

    //UCLA Blue
    expected[counter] = new Color(0x536895);
    actual[counter] = new Color(44.10294268413168d, 4.631347969922706d, -27.0686547098127d);
    ++counter;

    //UCLA Gold
    expected[counter] = new Color(0xFFB300);
    actual[counter] = new Color(78.169396868549d, 16.630296444973215d, 81.09962253487612d);
    ++counter;

    //UFO Green
    expected[counter] = new Color(0x3CD070);
    actual[counter] = new Color(74.3444644967133d, -59.34193461690745d, 36.6435125079297d);
    ++counter;

    //Ultramarine
    expected[counter] = new Color(0x120A8F);
    actual[counter] = new Color(17.12622008851139d, 48.42725149919003d, -67.21318670771859d);
    ++counter;

    //Ultramarine blue
    expected[counter] = new Color(0x4166F5);
    actual[counter] = new Color(48.53496430110003d, 35.26272436859607d, -75.36428509390736d);
    ++counter;

    //Ultra pink
    expected[counter] = new Color(0xFF6FFF);
    actual[counter] = new Color(69.36175953764969d, 72.51959547953768d, -46.498793008379245d);
    ++counter;

    //Ultra red
    expected[counter] = new Color(0xFC6C85);
    actual[counter] = new Color(64.25313108252138d, 57.01072300972254d, 14.350848086299472d);
    ++counter;

    //Umber
    expected[counter] = new Color(0x635147);
    actual[counter] = new Color(35.96973611726687d, 5.77565326847354d, 8.686656508324253d);
    ++counter;

    //Unbleached silk
    expected[counter] = new Color(0xFFDDCA);
    actual[counter] = new Color(90.43066483637955d, 8.878814044121498d, 13.654361792572423d);
    ++counter;

    //United Nations blue
    expected[counter] = new Color(0x5B92E5);
    actual[counter] = new Color(60.283344389135195d, 6.775468585363987d, -47.510127118078806d);
    ++counter;

    //University of California Gold
    expected[counter] = new Color(0xB78727);
    actual[counter] = new Color(59.4724214137255d, 9.57842604144682d, 55.17515298365227d);
    ++counter;

    //Unmellow yellow
    expected[counter] = new Color(0xFFFF66);
    actual[counter] = new Color(97.52684594655604d, -18.441087386482813d, 70.89858531051054d);
    ++counter;

    //UP Forest green
    expected[counter] = new Color(0x014421);
    actual[counter] = new Color(24.4828822801234d, -28.74734648543356d, 15.864912022730016d);
    ++counter;

    //UP Maroon
    expected[counter] = new Color(0x7B1113);
    actual[counter] = new Color(25.73990705306739d, 43.562767773376834d, 29.15234650614985d);
    ++counter;

    //Upsdell red
    expected[counter] = new Color(0xAE2029);
    actual[counter] = new Color(38.18446737135389d, 55.544279765588875d, 32.37277303759329d);
    ++counter;

    //Urobilin
    expected[counter] = new Color(0xE1AD21);
    actual[counter] = new Color(73.54845259704052d, 7.343613961117046d, 71.04798523939937d);
    ++counter;

    //USAFA blue
    expected[counter] = new Color(0x004F98);
    actual[counter] = new Color(33.687414927758404d, 9.105142263710563d, -45.58737367064091d);
    ++counter;

    //USC Cardinal
    expected[counter] = new Color(0x990000);
    actual[counter] = new Color(31.282832098372488d, 54.710925420263266d, 45.14223821546162d);
    ++counter;

    //USC Gold
    expected[counter] = new Color(0xFFCC00);
    actual[counter] = new Color(84.19730517203196d, 3.6799110684865854d, 85.22284819051876d);
    ++counter;

    //University of Tennessee Orange
    expected[counter] = new Color(0xF77F00);
    actual[counter] = new Color(65.71197919751d, 40.20618066783771d, 72.64327873203432d);
    ++counter;

    //Utah Crimson
    expected[counter] = new Color(0xD3003F);
    actual[counter] = new Color(44.529429445121195d, 70.84132907528601d, 28.330593824222085d);
    ++counter;

    //Vanilla
    expected[counter] = new Color(0xF3E5AB);
    actual[counter] = new Color(90.79522618837458d, -3.8310479670478625d, 30.058406066721723d);
    ++counter;

    //Vanilla ice
    expected[counter] = new Color(0xF38FA9);
    actual[counter] = new Color(70.56939788422967d, 40.83384950276026d, 2.847181561706691d);
    ++counter;

    //Vegas gold
    expected[counter] = new Color(0xC5B358);
    actual[counter] = new Color(72.76997575421687d, -5.122320116034085d, 48.11629763304861d);
    ++counter;

    //Venetian red
    expected[counter] = new Color(0xC80815);
    actual[counter] = new Color(42.01108620296666d, 66.16423113066993d, 48.5430919423993d);
    ++counter;

    //Verdigris
    expected[counter] = new Color(0x43B3AE);
    actual[counter] = new Color(66.89224356781776d, -32.40817162106369d, -6.84059847462668d);
    ++counter;

    //Vermilion
    expected[counter] = new Color(0xE34234);
    actual[counter] = new Color(52.370344868584624d, 61.09238608164025d, 44.41743162254442d);
    ++counter;

    //Vermilion
    expected[counter] = new Color(0xD9381E);
    actual[counter] = new Color(49.09804566278518d, 60.832318081899594d, 51.53362094710376d);
    ++counter;

    //Veronica
    expected[counter] = new Color(0xA020F0);
    actual[counter] = new Color(45.356107138614085d, 78.74992240455131d, -77.4057921793247d);
    ++counter;

    //Very light azure
    expected[counter] = new Color(0x74BBFB);
    actual[counter] = new Color(73.68721155189264d, -4.583545730717454d, -38.437976525261064d);
    ++counter;

    //Very light blue
    expected[counter] = new Color(0x6666FF);
    actual[counter] = new Color(51.32172454825418d, 43.621491694107064d, -76.29774276503942d);
    ++counter;

    //Very light malachite green
    expected[counter] = new Color(0x64E986);
    actual[counter] = new Color(83.28870704440953d, -57.386062705437226d, 37.364102975539936d);
    ++counter;

    //Very light tangelo
    expected[counter] = new Color(0xFFB077);
    actual[counter] = new Color(78.25285951914753d, 22.882195693761208d, 40.62832120654267d);
    ++counter;

    //Very pale orange
    expected[counter] = new Color(0xFFDFBF);
    actual[counter] = new Color(90.68716182074203d, 6.314340015223907d, 19.75063826566792d);
    ++counter;

    //Very pale yellow
    expected[counter] = new Color(0xFFFFBF);
    actual[counter] = new Color(98.64702827442756d, -9.808044743166377d, 30.68414269766153d);
    ++counter;

    //Violet
    expected[counter] = new Color(0x8F00FF);
    actual[counter] = new Color(42.852970394010676d, 84.38545756790572d, -90.02806472509847d);
    ++counter;

    //Violet (color wheel)
    expected[counter] = new Color(0x7F00FF);
    actual[counter] = new Color(40.78700884794503d, 83.10852255459103d, -93.50954337949518d);
    ++counter;

    //Violet (RYB)
    expected[counter] = new Color(0x8601AF);
    actual[counter] = new Color(34.36561883665119d, 67.78908001540276d, -57.83328768172701d);
    ++counter;

    //Violet (web)
    expected[counter] = new Color(0xEE82EE);
    actual[counter] = new Color(69.69362286537107d, 56.36844996271595d, -36.823650913525505d);
    ++counter;

    //Violet-blue
    expected[counter] = new Color(0x324AB2);
    actual[counter] = new Color(35.57682768949446d, 27.117907978310374d, -58.029679611641804d);
    ++counter;

    //Violet-red
    expected[counter] = new Color(0xF75394);
    actual[counter] = new Color(59.97788259937131d, 67.32485609102795d, -0.5391764559680379d);
    ++counter;

    //Viridian
    expected[counter] = new Color(0x40826D);
    actual[counter] = new Color(49.688849202463615d, -26.47236214284604d, 4.941955382562946d);
    ++counter;

    //Viridian green
    expected[counter] = new Color(0x009698);
    actual[counter] = new Color(56.16749437447592d, -31.72776725120424d, -10.56448242761836d);
    ++counter;

    //Vista blue
    expected[counter] = new Color(0x7C9ED9);
    actual[counter] = new Color(64.76249684393785d, 3.5324357289892028d, -33.71049612305035d);
    ++counter;

    //Vivid amber
    expected[counter] = new Color(0xcc9900);
    actual[counter] = new Color(66.2284220287071d, 8.309648408715342d, 70.33297848167432d);
    ++counter;

    //Vivid auburn
    expected[counter] = new Color(0x922724);
    actual[counter] = new Color(33.327477140558265d, 44.32143906159089d, 28.40448262909834d);
    ++counter;

    //Vivid burgundy
    expected[counter] = new Color(0x9F1D35);
    actual[counter] = new Color(35.01662028286934d, 52.565148638130225d, 20.386287493866806d);
    ++counter;

    //Vivid cerise
    expected[counter] = new Color(0xDA1D81);
    actual[counter] = new Color(48.72181976693881d, 73.56380792663315d, -6.416398536196266d);
    ++counter;

    //Vivid cerulean
    expected[counter] = new Color(0x00aaee);
    actual[counter] = new Color(65.68828040836128d, -12.402516576307255d, -44.07425471808273d);
    ++counter;

    //Vivid crimson
    expected[counter] = new Color(0xCC0033);
    actual[counter] = new Color(42.878114782799564d, 68.69325854196362d, 33.34251246979978d);
    ++counter;

    //Vivid gamboge
    expected[counter] = new Color(0xFF9900);
    actual[counter] = new Color(72.25687185375375d, 30.16930966117387d, 77.23151194030326d);
    ++counter;

    //Vivid lime green
    expected[counter] = new Color(0xa6d608);
    actual[counter] = new Color(79.73753408698155d, -38.541923155489265d, 78.00065908595856d);
    ++counter;

    //Vivid malachite
    expected[counter] = new Color(0x00cc33);
    actual[counter] = new Color(71.84231185918321d, -70.75244407669202d, 60.19319472331206d);
    ++counter;

    //Vivid mulberry
    expected[counter] = new Color(0xB80CE3);
    actual[counter] = new Color(46.973625653608025d, 82.67410208719811d, -67.25143120062876d);
    ++counter;

    //Vivid orange
    expected[counter] = new Color(0xFF5F00);
    actual[counter] = new Color(61.171862244892594d, 58.01715893950826d, 70.73587465053046d);
    ++counter;

    //Vivid orange peel
    expected[counter] = new Color(0xFFA000);
    actual[counter] = new Color(73.80537771397746d, 26.539443499071723d, 78.2242706833888d);
    ++counter;

    //Vivid orchid
    expected[counter] = new Color(0xCC00FF);
    actual[counter] = new Color(51.90201240950391d, 91.01242406492499d, -74.84958786784743d);
    ++counter;

    //Vivid raspberry
    expected[counter] = new Color(0xFF006C);
    actual[counter] = new Color(54.38875278504318d, 83.23375068536187d, 15.417704254002572d);
    ++counter;

    //Vivid red
    expected[counter] = new Color(0xF70D1A);
    actual[counter] = new Color(51.991288125335245d, 77.48669051116191d, 58.018463534209005d);
    ++counter;

    //Vivid red-tangelo
    expected[counter] = new Color(0xDF6124);
    actual[counter] = new Color(56.45114297057748d, 46.17668353951648d, 55.63499882348369d);
    ++counter;

    //Vivid sky blue
    expected[counter] = new Color(0x00CCFF);
    actual[counter] = new Color(76.31762628133008d, -24.344878375718025d, -36.683542335299954d);
    ++counter;

    //Vivid tangelo
    expected[counter] = new Color(0xF07427);
    actual[counter] = new Color(62.64459778176885d, 43.49821747467997d, 60.81208886428207d);
    ++counter;

    //Vivid tangerine
    expected[counter] = new Color(0xFFA089);
    actual[counter] = new Color(74.9557772915086d, 32.84102144633372d, 26.826363995933256d);
    ++counter;

    //Vivid vermilion
    expected[counter] = new Color(0xe56024);
    actual[counter] = new Color(57.22237751098632d, 48.85743592987052d, 56.67279045125463d);
    ++counter;

    //Vivid violet
    expected[counter] = new Color(0x9F00FF);
    actual[counter] = new Color(45.06874049850472d, 85.86476549494704d, -86.30056496064016d);
    ++counter;

    //Vivid yellow
    expected[counter] = new Color(0xFFE302);
    actual[counter] = new Color(89.95330212462491d, -7.930927937891131d, 89.12508713982905d);
    ++counter;

    //Warm black
    expected[counter] = new Color(0x004242);
    actual[counter] = new Color(24.607185889466272d, -18.226674880129938d, -5.359673521168329d);
    ++counter;

    //Waterspout
    expected[counter] = new Color(0xA4F4F9);
    actual[counter] = new Color(91.4300474635357d, -23.088766603205023d, -10.175774267924664d);
    ++counter;

    //Wenge
    expected[counter] = new Color(0x645452);
    actual[counter] = new Color(37.22364030758d, 6.227249522737677d, 3.6146183951831667d);
    ++counter;

    //Wheat
    expected[counter] = new Color(0xF5DEB3);
    actual[counter] = new Color(89.35068099788126d, 1.514403426330302d, 23.99998118436706d);
    ++counter;

    //White
    expected[counter] = new Color(0xFFFFFF);
    actual[counter] = new Color(100.0d, 0.00526049995830391d, -0.010408184525267927d);
    ++counter;

    //White smoke
    expected[counter] = new Color(0xF5F5F5);
    actual[counter] = new Color(96.53748961423615d, 0.005103478098456016d, -0.010097508257911336d);
    ++counter;

    //Wild blue yonder
    expected[counter] = new Color(0xA2ADD0);
    actual[counter] = new Color(70.95535674507622d, 3.685759083490392d, -19.02318639258771d);
    ++counter;

    //Wild orchid
    expected[counter] = new Color(0xD470A2);
    actual[counter] = new Color(60.06362405509539d, 45.162658112445406d, -9.102040350626783d);
    ++counter;

    //Wild Strawberry
    expected[counter] = new Color(0xFF43A4);
    actual[counter] = new Color(59.84774144877221d, 76.55739532103783d, -9.897486949721145d);
    ++counter;

    //Wild watermelon
    expected[counter] = new Color(0xFC6C85);
    actual[counter] = new Color(64.25313108252138d, 57.01072300972254d, 14.350848086299472d);
    ++counter;

    //Willpower orange
    expected[counter] = new Color(0xFD5800);
    actual[counter] = new Color(59.763943648221215d, 60.2142175143649d, 69.82765324660578d);
    ++counter;

    //Windsor tan
    expected[counter] = new Color(0xA75502);
    actual[counter] = new Color(45.24394515157327d, 29.371911383104077d, 53.84223862005778d);
    ++counter;

    //Wine
    expected[counter] = new Color(0x722F37);
    actual[counter] = new Color(29.123709862851626d, 30.365877798119694d, 9.718102707508114d);
    ++counter;

    //Wine dregs
    expected[counter] = new Color(0x673147);
    actual[counter] = new Color(28.20795232376807d, 27.000087764486924d, -2.410890579569269d);
    ++counter;

    //Wisteria
    expected[counter] = new Color(0xC9A0DC);
    actual[counter] = new Color(71.36889516494486d, 25.8943410227776d, -24.684154307419703d);
    ++counter;

    //Wood brown
    expected[counter] = new Color(0xC19A6B);
    actual[counter] = new Color(66.14396786846372d, 8.369210596896659d, 30.14844295160646d);
    ++counter;

    //Xanadu
    expected[counter] = new Color(0x738678);
    actual[counter] = new Color(54.08117865405117d, -9.794901447754523d, 5.230392861428279d);
    ++counter;

    //Yale Blue
    expected[counter] = new Color(0x0F4D92);
    actual[counter] = new Color(32.88566607379447d, 8.76572258261546d, -43.22228597174033d);
    ++counter;

    //Yankees blue
    expected[counter] = new Color(0x1C2841);
    actual[counter] = new Color(16.236081125313788d, 3.3689477476900045d, -17.443886717578728d);
    ++counter;

    //Yellow
    expected[counter] = new Color(0xFFFF00);
    actual[counter] = new Color(97.13824698129729d, -21.555908334832285d, 94.48248544644461d);
    ++counter;

    //Yellow (Crayola)
    expected[counter] = new Color(0xFCE883);
    actual[counter] = new Color(91.70610922869592d, -6.151318793002735d, 51.26141270345828d);
    ++counter;

    //Yellow (Munsell)
    expected[counter] = new Color(0xEFCC00);
    actual[counter] = new Color(82.66629277244104d, -3.1722645966151264d, 83.43568171336896d);
    ++counter;

    //Yellow (NCS)
    expected[counter] = new Color(0xFFD300);
    actual[counter] = new Color(85.93065289470253d, 0.10505883727629506d, 86.4348021523995d);
    ++counter;

    //Yellow (Pantone)
    expected[counter] = new Color(0xFEDF00);
    actual[counter] = new Color(88.84973568574617d, -6.373533626375605d, 88.45682004621698d);
    ++counter;

    //Yellow (process)
    expected[counter] = new Color(0xFFEF00);
    actual[counter] = new Color(93.01137491066302d, -13.858591401622656d, 91.48191717490975d);
    ++counter;

    //Yellow (RYB)
    expected[counter] = new Color(0xFEFE33);
    actual[counter] = new Color(96.89933263549285d, -20.702925314594335d, 87.22772681088624d);
    ++counter;

    //Yellow-green
    expected[counter] = new Color(0x9ACD32);
    actual[counter] = new Color(76.5351984302265d, -37.99014732918848d, 66.5862485910128d);
    ++counter;

    //Yellow Orange
    expected[counter] = new Color(0xFFAE42);
    actual[counter] = new Color(77.23623961218983d, 20.650859421096847d, 64.45512391568646d);
    ++counter;

    //Yellow rose
    expected[counter] = new Color(0xFFF000);
    actual[counter] = new Color(93.26785482279269d, -14.346044162274364d, 91.66726531374532d);
    ++counter;

    //Zaffre
    expected[counter] = new Color(0x0014A8);
    actual[counter] = new Color(21.31033562055505d, 51.89001259457868d, -75.61618356136172d);
    ++counter;

    //Zinnwaldite brown
    expected[counter] = new Color(0x2C1608);
    actual[counter] = new Color(10.006180460457532d, 9.571181835051817d, 11.887549174550871d);
    ++counter;

    //Zomp
    expected[counter] = new Color(0x39A78E);
    actual[counter] = new Color(62.04935285141431d, -37.1109706019967d, 3.855824248934736d);
    ++counter;

    //Act
    for (int index = 0; index < counter; ++index) {
      //Assert
      assertEqual(expected[index].current_L, actual[index].current_L, "Failed L on color number: " + index);
      assertEqual(expected[index].current_L, actual[index].current_L, "Failed A on color number: " + index);
      assertEqual(expected[index].current_L, actual[index].current_L, "Failed B on color number: " + index);
    }
  }
}
