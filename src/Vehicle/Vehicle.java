package Vehicle;

abstract class Vehicle {

	//instance variables
	protected String plateNumber;
	protected String make;
	protected String model;
	protected int yearOfProduction;

	//methods:
	//default constructor
	public Vehicle(){
		this.plateNumber = null;
		this.make = null;
		this.model = null;
		this.yearOfProduction = 0;
	}

	//parametrized constructor

	public Vehicle(String make, String model, int yearOfProduction) {
		this.make = make;
		this.model = model;
		this.yearOfProduction = yearOfProduction;
		this.plateNumber = generatePlateNumber();
	}

	//copy constructor

	public Vehicle(Vehicle vehicle){
		this.make = vehicle.make;
		this.model = vehicle.model;
		this.yearOfProduction = vehicle.yearOfProduction;
		this.plateNumber = generatePlateNumber();
	}

	//generate plate number method, method will not set the plate number, but will only return one

	protected abstract String generatePlateNumber();

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

	//equals method
	@Override
	public abstract boolean equals(Object obj);

	@Override
	public abstract String toString();
}
