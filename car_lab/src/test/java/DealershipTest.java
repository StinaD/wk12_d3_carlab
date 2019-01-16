import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    PetrolCar petrolCar;
    HybridCar hybridCar;
    ElectricCar electricCar;

    @Before
    public void before(){
        dealership = new Dealership();
        petrolCar = new PetrolCar(7, "Purple");
        hybridCar = new HybridCar(9, "Pink");
        electricCar = new ElectricCar(4, "Yellow");
    }

    @Test
    public void countTheVehicles() {
        assertEquals(0, dealership.countTheVehicles());
    }

    @Test
    public void addVehicleStock() {
        dealership.addVehicleStock(petrolCar);
        assertEquals(1, dealership.countTheVehicles());
    }

    @Test
    public void findVehicle() {
        dealership.addVehicleStock(petrolCar);
        assertEquals(0, dealership.findVehicle(petrolCar));

    }

    @Test
    public void removeVehicle() {
        dealership.addVehicleStock(petrolCar);
        dealership.addVehicleStock(hybridCar);
        assertEquals(2, dealership.countTheVehicles());
        dealership.findAndRemoveSpecificVehicle(hybridCar);
        assertEquals(1, dealership.countTheVehicles());

    }

    @Test
    public void getAllVehiclesForSale(){
        dealership.addVehicleStock(petrolCar);
        dealership.addVehicleStock(hybridCar);
        dealership.addVehicleStock(petrolCar);
        dealership.addVehicleStock(electricCar);
        assertEquals(2, dealership.getAllCarsForSale().size());


    }

    @Test
    public void getAllVehiclesForRent(){
        dealership.addVehicleStock(petrolCar);
        dealership.addVehicleStock(hybridCar);
        dealership.addVehicleStock(petrolCar);
        dealership.addVehicleStock(electricCar);
        assertEquals(3, dealership.getAllVehiclesForRent().size());


    }



}
