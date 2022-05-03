import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomTest {

    public CustomTest() {
    }
    @Test
    public void testSurfaceArea() {
        Brick testBrick = new Brick(6, 15, 9);
        double expResult = 558.0;
        double result = testBrick.getSurfaceArea();
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testWeight() {
        Brick testBrick = new Brick(6, 15, 9);
        double expResult = 1.62;
        double result = testBrick.getWeight();
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testVolume() {
        Brick testBrick = new Brick(6, 15, 9);
        double expResult = 810.0;
        double result = testBrick.getVolume();
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testHeight() {
        Brick testBrick = new Brick(6, 15, 9);
        double expResult = 6.0;
        double result = testBrick.getHeight();
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testPalletWeight() {
        Brick testBrick = new Brick(6, 15, 9);
        Pallet testPallet = new Pallet(30, 5, testBrick);
        double expResult = 249.5;
        double result = testPallet.getWeight();
        assertEquals(expResult, result, 0.1);
    }
    @Test
    public void testPalletHeight() {
        Brick testBrick = new Brick(6, 15, 9);
        Pallet testPallet = new Pallet(30, 5, testBrick);
        double expResult = 45.0;
        double result = testPallet.getHeight();
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void RandomTest1() {
        Brick testBrick = new Brick(5, 7, 6);
        Pallet testPallet = new Pallet(50, 7, testBrick);
        double expResult = 214.0;
        double result = testBrick.getSurfaceArea();
        assertEquals(expResult, result, 0.0);
        expResult = 5.0;
        result = testBrick.getHeight();
        assertEquals(expResult, result, 0.0);
        expResult = 0.42;
        result = testBrick.getWeight();
        assertEquals(expResult, result, 0.0);
        expResult = 210.0;
        result = testBrick.getVolume();
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void RandomTest2() {
        Brick testBrick = new Brick(11, 22, 4);
        Pallet testPallet = new Pallet(45, 8, testBrick);
        double expResult = 103.0;
        double result = testPallet.getHeight();
        assertEquals(expResult, result, 0.0);
        expResult = 11.0;
        result = testBrick.getHeight();
        assertEquals(expResult, result, 0.0);
        expResult = 1.936;
        result = testBrick.getWeight();
        assertEquals(expResult, result, 0.0);
        expResult = 968.0;
        result = testBrick.getVolume();
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void RandomTest3() {
        Brick testBrick = new Brick(14, 5, 18);
        Pallet testPallet = new Pallet(16, 28, testBrick);
        double expResult = 407.0;
        double result = testPallet.getHeight();
        assertEquals(expResult, result, 0.0);
        expResult = 14.0;
        result = testBrick.getHeight();
        assertEquals(expResult, result, 0.0);
        expResult = 2.52;
        result = testBrick.getWeight();
        assertEquals(expResult, result, 0.0);
        expResult = 1260.0;
        result = testBrick.getVolume();
        assertEquals(expResult, result, 0.0);
    }
}
