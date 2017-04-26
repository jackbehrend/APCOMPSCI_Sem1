/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
public static void testKeepOnlyBlue()
{
	Picture beach = new Picture("beach.jpg");
	beach.explore();
	beach.keepOnlyBlue();
	beach.explore();
}
  
public static void testNegate()
{
	Picture beach = new Picture("beach.jpg");
	beach.explore();
	beach.negate();
	beach.explore(); 
}

public static void testGrayscale()
{
	Picture beach = new Picture("beach.jpg");
	beach.explore();
	beach.grayscale();
	beach.explore(); 
}

public static void testFixUnderwater()
{
	Picture water = new Picture("water.jpg");
	water.explore();
	water.fixUnderwater();
	water.explore();
}

public static void testMirrorVerticalRightToLeft()
{
	Picture caterpillar = new Picture("caterpillar.jpg");
	caterpillar.explore();
	caterpillar.mirrorVerticalRightToLeft();
	caterpillar.explore();
}

public static void testMirrorHorizontal()
{
	Picture caterpillar = new Picture("caterpillar.jpg");
	caterpillar.explore();
	caterpillar.mirrorHorizontal();
	caterpillar.explore();
}

public static void testMirrorHotizontalBotToTop()
{
	Picture caterpillar = new Picture("caterpillar.jpg");
	caterpillar.explore();
	caterpillar.mirrorHorizontalBotToTop();
	caterpillar.explore();
}

public static void testMirrorArms()
{
	Picture caterpillar = new Picture("snowman.jpg");
	caterpillar.explore();
	caterpillar.mirrorArms();
	caterpillar.explore();
}

public static void testMirrorGull()
{
	Picture seagull = new Picture("seagull.jpg");
	seagull.explore();
	seagull.mirrorGull();
	seagull.explore();
}

public static void testCopy()
{
	Picture motorcycle = new Picture("blueMotorcycle.jpg");
	motorcycle.explore();
	motorcycle.copy(motorcycle, 100, 150);
	motorcycle.explore();
}

public static void testCopyPart()
{
	Picture motorcycle = new Picture("blueMotorcycle.jpg");
	motorcycle.explore();
	motorcycle.copyPart(motorcycle, 100, 200, 250, 450, 50, 250);
	motorcycle.explore();
}

public static void testMyCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
	Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHotizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
	//testMyCollage();
    //testCopy();
	//testCopyPart();
    //testEdgeDetection();
    testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}