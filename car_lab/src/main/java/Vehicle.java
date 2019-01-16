public abstract class Vehicle {
    int price;
    String colour;
    EngineType engine;

    public Vehicle(int price, String colour, EngineType engine){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public EngineType getEngine() {
        return engine;
    }
}
