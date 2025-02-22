package Vehicle;

public abstract class Car extends Vehicle {
    protected int maxPassengers; // Maximum number of passengers

    //Default constructor: Calls Vehicle's default constructor
    public Car() {
        super(); // Calls Vehicle's default constructor
        this.maxPassengers = 0;
    }

    //Parameterized constructor: Calls Vehicle's parameterized constructor
    public Car(String make, String model, int yearOfProduction, int maxPassengers) {
        super(make, model, yearOfProduction); //Calls Vehicle's constructor
        this.maxPassengers = maxPassengers;
    }

    //Copy constructor: Calls Vehicle's copy constructor
    public Car(Car other) {
        super(other); // Calls Vehicle's copy constructor
        this.maxPassengers = other.maxPassengers;
    }
    

    //Getter and Setter for maxPassengers
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    // Abstract method for plate number (Subclasses must implement)
    @Override
    protected abstract String generatePlateNumber();

    //equals and toString

    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract String toString();
}
