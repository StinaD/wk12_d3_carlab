import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    PetrolCar petrolCar;

    @Before
    public void before(){
        petrolCar = new PetrolCar(5, "Red", EngineType.PETROL);

    }

    @Test
    public void carHasPrice(){
        assertEquals(5, petrolCar.getPrice());
    }

    @Test
    public void carHasColour(){
        assertEquals("Red", petrolCar.getColour());
    }

    @Test
    public void carHasEngineType(){
        assertEquals(EngineType.PETROL, petrolCar.getEngine());
    }
}
