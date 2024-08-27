package interview_preaparation;

public class Vehicle {  //inheretence real time example. 
	String brand;
	String model;
	int year;
	
	public void startEngine() {
		System.out.println("engine started for "+brand+" "+model);
		
	}
	public void stopEngine() {
		System.out.println("engine stoped for "+brand+" "+model);
		
	}
	public void displayInfo() {
		System.out.println("brand : "+brand+", model: "+model+", year: "+year );
		
	}
}
 class Car extends Vehicle{
		
	int numberOfDoors;
	
	public void displayCarInfo() {
		displayInfo();
		System.out.println("number of doors: "+numberOfDoors);
		
	}
	
	
}
 class Truck extends Vehicle{
	 int loadCapacity;
	 
	 public void displayTruckInfo() {
			displayInfo();
			System.out.println("load capacity: "+loadCapacity+"turns ");
			
		}
	 
 }
 class VechicalManagementSystem{
	 public static void main(String[] args) {
		Car c = new Car();
		c.brand = "toyota";
		c.model = "velfire";
		c.year = 2024;
		c.numberOfDoors = 5;
		c.startEngine();
		c.displayCarInfo();
		c.stopEngine();
		
		
		Truck t = new Truck();
		t.brand = "Asoka leyland";
		t.model = "Chota Hatti";
		t.year = 2021;
		t.loadCapacity = 100;
		t.startEngine();
		t.displayTruckInfo();
		t.stopEngine();

	}
	 
 }
 
