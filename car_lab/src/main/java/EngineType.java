public enum EngineType {

    PETROL("Petrol"),
    ELECTRIC("Electric"),
    HYBRID("Hybrid");

    private final String engineType;

    EngineType(String engineType){
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }
}
