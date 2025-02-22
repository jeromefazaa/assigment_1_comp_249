package Vehicle;

public class DieselTruck extends Truck {
    private double fuelTankCapacity; // Fuel tank capacity in liters
    private static final String plateNumberPrefix = "DT";
    private static int plateNumberCounter = 1001;// Counter for unique plate numbers

    //Default Constructor
    public DieselTruck() {
        super();
        this.fuelTankCapacity = 0.0;
    }

    //Parameterized Constructor
    public DieselTruck(String make, String model, int yearOfProduction, double maxCapacity, double fuelTankCapacity) {
        super(make, model, yearOfProduction, maxCapacity);
        this.fuelTankCapacity = fuelTankCapacity;
        this.plateNumber = generatePlateNumber(); // Assign unique plate number
    }

    //Copy Constructor (Generates a new plate number)
    public DieselTruck(DieselTruck other) {
        super(other);
        this.fuelTankCapacity = other.fuelTankCapacity;
        this.plateNumber = generatePlateNumber(); // New plate number
    }

    //Generate plate number (DT1001, DT1002, etc.)
    @Override
    protected String generatePlateNumber() {
        return plateNumberPrefix + plateNumberCounter++;
    }

    //Getter & Setter
    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    //toString()
    @Override
    public String toString() {
        return "Diesel Truck: \nPlate Number = " + this.plateNumber + "\nMake = " + this.make + "\nModel = " + this.model + "\nYear Of Production = " + this.yearOfProduction + "\nMax Capacity = " + this.maxCapacity + "\nFuel Tank Capacity = " + this.fuelTankCapacity;

    }

    //equals() (Excludes plate number)
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        DieselTruck dTruck = (DieselTruck)obj;
        return this.maxCapacity == dTruck.maxCapacity &&
                this.fuelTankCapacity == dTruck.fuelTankCapacity &&
                this.make.equals(dTruck.make) &&
                this.model.equals(dTruck.model) &&
                this.yearOfProduction == dTruck.yearOfProduction;
    }
}
