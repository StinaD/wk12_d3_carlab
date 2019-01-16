import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void before(){
        electricCar = new ElectricCar(5, "Blue");

    }

    @Test
    public void getPrice() {
        assertEquals(5, electricCar.getPrice());
    }

    @Test
    public void getColour() {
        assertEquals("Blue", electricCar.getColour());
    }

    @Test
    public void getEngine() {
        assertEquals(EngineType.ELECTRIC, electricCar.getEngine());
    }
}
