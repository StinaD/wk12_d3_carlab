public class HybridCar extends Vehicle implements ISell {

    public HybridCar(int price, String colour) {
        super(price, colour, EngineType.HYBRID);
    }

    public String sellCar() {
        return "I'm for sale!";
    }
}
