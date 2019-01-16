import java.util.ArrayList;

public class Dealership {
    private ArrayList<Vehicle> vehicleStock;

    public Dealership(){
        this.vehicleStock = new ArrayList<>();

    }

    public int countTheVehicles(){
        return vehicleStock.size();
    }

    public void addVehicleStock(Vehicle vehicle){
        vehicleStock.add(vehicle);
    }

    public int findVehicle(Vehicle vehicle){
        return vehicleStock.indexOf(vehicle);
    }

    public void removeVehicle(int index){
        vehicleStock.remove(index);
    }

    public void findAndRemoveSpecificVehicle(Vehicle vehicle){
        int indexOfSpecificVehicle = findVehicle(vehicle);
        removeVehicle(indexOfSpecificVehicle);
    }

    public ArrayList<ISell> getAllCarsForSale(){
        ArrayList<ISell> result = new ArrayList<ISell>();
        for (Vehicle vehicle : vehicleStock){
            if (vehicle instanceof ISell){
                result.add((ISell) vehicle);
            }
        }
        return result;
    }

   public ArrayList<IRent> getAllVehiclesForRent(){
        ArrayList<IRent> result = new ArrayList<IRent>();
        for (Vehicle vehicle : vehicleStock){
            if (vehicle instanceof IRent){
                result.add((IRent) vehicle);
            }
        }
        return result;
   }

}
