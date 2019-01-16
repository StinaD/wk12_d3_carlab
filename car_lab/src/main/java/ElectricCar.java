public class ElectricCar extends Vehicle implements ISell, IRent{

    public ElectricCar(int price, String colour) {
        super(price, colour, EngineType.ELECTRIC);
    }

    public String sellCar() {
        return "I'm for sale!";
    }

    public String rentCar(){
        return "I am for rent!";
    }
}
