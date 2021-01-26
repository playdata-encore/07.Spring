package model.domain;

public class Customer {
	private String name;
	private int age;
	private Car car;
	
	public Customer() {
		System.out.println("Customer()");
	}
	
	public Customer(String name, int age, Car car) {
		System.out.println("Customer(String name, int age, Car car)");
		this.name = name;
		this.age = age;
		this.car = car;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		System.out.println("setName(String name)");
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		System.out.println("setAge(int age)");
		this.age = age;
	}
	
	public Car getCar() {
		return car;
	}
	
	public void setCar(Car car) {
		System.out.println("setCar(Car car)");
		this.car = car;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", car=");
		builder.append(car);
		builder.append("]");
		return builder.toString();
	}
}
