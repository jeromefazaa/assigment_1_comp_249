package Vehicle;

abstract class Vehicle {

    //instance variables
    private String plateNumber;
    private String make;
    private String model;
    private int yearOfProduction;

    //methods:
    //default constructor is automatically defined, no need to redefine it
    //parametrized constructor

    public Vehicle(String make, String model, int yearOfProduction) {
        this.make = make;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        //plate number will be automatically added within the child constructors
    }

    //copy constructor

    public Vehicle(Vehicle vehicle){
        this.make = vehicle.make;
        this.model = vehicle.model;
        this.yearOfProduction = vehicle.yearOfProduction;
        //plate number will be assigned automatically

    }

    //getter methods

    public String getPlateNumber(){
        return this.plateNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    //setter methods


    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}
