class Vehicle{
    private String licensePlate;
    private String ownerName;
    private int hoursParked;

    public Vehicle(String licensePlate, String ownerName, int hoursParked){
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.hoursParked = hoursParked;
    }

    public String getLicensePlate(){
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
     public int getHoursParked(){
        return hoursParked;
    }
    public void setHoursParked(int hoursParked){
        this.hoursParked = hoursParked;
    }

    public String displayDetails(){
        return "License plate: " + licensePlate + ", Owner: " + ownerName + ", Hours Parked: " + hoursParked;
    }

}

class ParkingLot {
    private Vehicle[] vehicles;
    private int vehicleCount;

    public ParkingLot(){
        vehicles = new Vehicle[5];
        vehicleCount = 0;
    }

    public void parkVehicle(Vehicle vehicle){
        if(vehicleCount < vehicles.length){
            vehicles[vehicleCount] = vehicle;
            vehicleCount++;
            System.out.println("Vehicle parked: " + vehicle.displayDetails());
        }
        else{
            System.out.println("Parking lot is full. cannot park more vehicles.");
        }
    }
    public void removeVehicle(String licensePlate){
        for (int i = 0; i < vehicleCount; i++){
            if (vehicles[i].getLicensePlate().equals(licensePlate)){
                for(int j = i; j < vehicleCount - 1; j++){
                    vehicles[j] = vehicles[j + 1];
                }
                vehicles[vehicleCount - 1] = null;
                vehicleCount--;
                System.out.println("Vehicle Removed: " + licensePlate);
                return;
            }
        }
        System.out.println("Vehicle with license plate " + licensePlate + " not found.");
    }
    public void displayAllVehicles(){
        if (vehicleCount == 0){
            System.out.println("No vehicles parked.");
            return;
        }
        for(int i = 0; i < vehicleCount; i++){
            System.out.println(vehicles[i].displayDetails());
        }
    }
}

class ParkingLotVehicleTracker{
        public static void main (String[] args){
        ParkingLot parkingLot = new ParkingLot();

        Vehicle vehicle1 = new Vehicle("ABC123", "John Doe", 2);
        Vehicle vehicle2 = new Vehicle("XYZ789", "Jane Smith", 4);
        Vehicle vehicle3 = new Vehicle("LMN456", "Bob Brown", 1);

        parkingLot.parkVehicle(vehicle1);
        parkingLot.parkVehicle(vehicle2);
        parkingLot.parkVehicle(vehicle3);

        parkingLot.removeVehicle("XYZ789");
        parkingLot.displayAllVehicles();
    }
}