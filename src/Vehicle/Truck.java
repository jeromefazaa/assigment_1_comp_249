package Vehicle;
public abstract class Truck extends Vehicle {
    //instance variables:

    protected double maxCapacity; // Maximum weight it can transport

    //defaults constructor
    public Truck(){
        super();
        this.maxCapacity = 0;
    }

    // ✅ Parameterized Constructor
    public Truck(String make, String model, int yearOfProduction, double maxCapacity) {
        super(make, model, yearOfProduction);
        this.maxCapacity = maxCapacity;
    }

    // Copy Constructor
    public Truck(Truck other) {
        super(other);
        this.maxCapacity = other.maxCapacity;
    }
    
    //Getters & Setters
    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
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
