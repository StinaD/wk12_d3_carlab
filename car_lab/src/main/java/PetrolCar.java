public class PetrolCar extends Vehicle implements IRent{

    public PetrolCar(int price, String colour) {
        super(price, colour, EngineType.PETROL);
    }


    public String rentCar() {
        return "I am for rent!";
    }
}
