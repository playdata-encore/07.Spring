package model.domain;

public class Car {
	private String carName;
	private int carNumber;
	
	public Car() {
		System.out.println("Car()");
	}

	public Car(String carName, int carNumber) {
		this.carName = carName;
		this.carNumber = carNumber;
		System.out.println("Car(String carName, int carNumber)");
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		System.out.println("setCarName(String carName)");
		this.carName = carName;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		System.out.println("setCarNumber(int carNumber)");
		this.carNumber = carNumber;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [carName=");
		builder.append(carName);
		builder.append(", carNumber=");
		builder.append(carNumber);
		builder.append("]");
		return builder.toString();
	}
	
	
}
