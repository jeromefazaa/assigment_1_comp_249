package Vehicle;

public class GasolineCar extends Car {
    private static final String plateNumberPrefix = "GC";
    private static int plateNumberCounter = 1001;// Counter for unique plate numbers

    //Default constructor: Calls Car's default constructor
    public GasolineCar() {
        super(); // Calls Car's default constructor
    }

    //Parameterized constructor: Calls Car's parameterized constructor
    public GasolineCar(String make, String model, int yearOfProduction, int maxPassengers) {
        super(make, model, yearOfProduction, maxPassengers); // Calls Car's constructor
    }

    //Copy constructor: Calls Car's copy constructor but generates a new plate number
    public GasolineCar(GasolineCar other) {
        super(other); // Calls Car's copy constructor
        this.plateNumber = generatePlateNumber(); // Ensure a new plate number is assigned
    }

    //Generate plate number for Gasoline Cars (GC1001, GC1002, etc.)
    @Override
    protected String generatePlateNumber() {
        return plateNumberPrefix + plateNumberCounter++;
    }

    //toString() method
    @Override
    public String toString() {
        return "Gasoline Car: \nPlate Number = " + this.plateNumber + "\nMake = " + this.make + "\nModel = " + this.model + "\nYear Of Production = " + this.yearOfProduction + "\nMax Passengers = " + this.maxPassengers;

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
        GasolineCar gCar = (GasolineCar)obj;
        return this.maxPassengers == gCar.maxPassengers &&
                this.make.equals(gCar.make) &&
                this.model.equals(gCar.model) &&
                this.yearOfProduction == gCar.yearOfProduction;
    }
}
