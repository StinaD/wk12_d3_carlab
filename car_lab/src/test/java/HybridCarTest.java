import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;


    @Before
    public void before() {
        hybridCar = new HybridCar(5, "White");
    }

    @Test
    public void getPrice() {
        assertEquals(5, hybridCar.getPrice());
    }

    @Test
    public void getColour() {
        assertEquals("White", hybridCar.getColour());
    }

    @Test
    public void getEngine() {
        assertEquals(EngineType.HYBRID, hybridCar.getEngine());
    }
}
