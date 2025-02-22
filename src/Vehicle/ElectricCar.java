package Vehicle;

public class ElectricCar extends Car {
    private double maxAutonomyRange; // Maximum autonomy range in kilometers
    private static final String plateNumberPrefix = "EC";
    private static int plateNumberCounter = 1001;// Counter for unique plate numbers

    //Default constructor: Calls Car's default constructor
    public ElectricCar() {
        super(); // Calls Car's default constructor
        this.maxAutonomyRange = 0.0;
    }

    //Parameterized constructor: Calls Car's parameterized constructor
    public ElectricCar(String make, String model, int yearOfProduction, int maxPassengers, double autonomyRange) {
        super(make, model, yearOfProduction, maxPassengers); // Calls Car's constructor
        this.maxAutonomyRange = autonomyRange;
        this.plateNumber =generatePlateNumber(); // Assign unique plate number
    }

    //Copy constructor: Calls Car's copy constructor but generates a new plate number
    public ElectricCar(ElectricCar other) {
        super(other); // Calls Car's copy constructor
        this.maxAutonomyRange = other.maxAutonomyRange;
        this.plateNumber = generatePlateNumber(); // Ensure a new plate number is assigned
    }

    //Generate plate number for Electric Cars (EC1001, EC1002, etc.)
    @Override
    protected String generatePlateNumber() {
        return plateNumberPrefix + plateNumberCounter++;
    }

    //toString() method
    @Override
    public String toString() {

        return "Electric Car: \nPlate Number = " + this.plateNumber + "\nMake = " + this.make + "\nModel = " + this.model + "\nYear Of Production = " + this.yearOfProduction + "\nMax Passengers = " + this.maxPassengers + "\nMax Autonomy Range = " + this.maxAutonomyRange;

    }

    //equals() method (excluding plate number)
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        ElectricCar eCar = (ElectricCar)obj;
        return this.maxAutonomyRange == eCar.maxAutonomyRange &&
                this.maxPassengers == eCar.maxPassengers &&
                this.make.equals(eCar.make) &&
                this.model.equals(eCar.model) &&
                this.yearOfProduction == eCar.yearOfProduction;
    }
}
