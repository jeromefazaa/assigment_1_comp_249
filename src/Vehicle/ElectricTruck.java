package Vehicle;

public class ElectricTruck extends Truck {
    private double maxAutonomyRange; // Maximum autonomy range in km
    private static final String plateNumberPrefix = "ET";
    private static int plateNumberCounter = 1001; // Counter for unique plate numbers

    //Default Constructor
    public ElectricTruck() {
        super();
        this.maxAutonomyRange = 0.0;
    }

    //Parameterized Constructor
    public ElectricTruck(String make, String model, int yearOfProduction, double maxCapacity, double autonomyRange) {
        super(make, model, yearOfProduction, maxCapacity);
        this.maxAutonomyRange = autonomyRange;
        this.plateNumber = generatePlateNumber(); // Assign unique plate number
    }

    // Copy Constructor (Generates a new plate number)
    public ElectricTruck(ElectricTruck other) {
        super(other);
        this.maxAutonomyRange = other.maxAutonomyRange;
        this.plateNumber = generatePlateNumber(); // New plate number
    }

    //Generate plate number (ET1001, ET1002, etc.)
    @Override
    protected String generatePlateNumber() {
        return plateNumberPrefix + plateNumberCounter++;
    }

    // ✅ Getter & Setter
    public double getAutonomyRange() {
        return maxAutonomyRange;
    }

    public void setAutonomyRange(double autonomyRange) {
        this.maxAutonomyRange = autonomyRange;
    }

    //toString()
    @Override
    public String toString() {
        return "Electric Truck: \nPlate Number = " + this.plateNumber + "\nMake = " + this.make + "\nModel = " + this.model + "\nYear Of Production = " + this.yearOfProduction + "\nMax Capacity = " + this.maxCapacity + "\nMax Autonomy Range=" + this.maxAutonomyRange;
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
        ElectricTruck eTruck = (ElectricTruck)obj;
        return this.maxCapacity == eTruck.maxCapacity &&
               this.maxAutonomyRange == eTruck.maxAutonomyRange &&
               this.make.equals(eTruck.make) &&
               this.model.equals(eTruck.model) &&
               this.yearOfProduction == eTruck.yearOfProduction;
    }
}
