import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    public MainTest() {
    }

    @Test
    public void testWeight() {
        Brick b = new Brick(8, 20, 12);
        Pallet instance = new Pallet(11, 3, b);
        double expResult = 133.22;
        double result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSurface() {
        Brick y = new Brick(2, 3, 4);
        Pallet x = new Pallet(11, 3, y);
        double result = x.getHeight();
        assertEquals(10, 9, 1.1);
        result = 33 * y.getSurfaceArea();
        assertEquals(1716, result, 0.0);
    }

    @Test
    public void testHeight() {
        Brick y = new Brick(8, 2, 3);
        Pallet x = new Pallet(11, 5, y);
        double result = y.getHeight();
        assertEquals(result, 8, 1.1);
        result = x.getHeight();
        assertEquals(55, result, 0.1);
    }

}
