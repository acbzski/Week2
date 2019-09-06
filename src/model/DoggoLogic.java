package model;

public class DoggoLogic {
	
	final double TAX_RATE = 0.07;
	
	public double calculateTotalCost(Doggo doggo) {
		double totalCost = 0;
		totalCost = calculateTotalTax(doggo) + doggo.getCost();
		return totalCost;
	}
	
	public double calculateTotalTax(Doggo doggo) {
		double totalTax = doggo.getCost() * TAX_RATE;
		return totalTax;
	}
	
	public int happyBirthday(Doggo doggo) {
		doggo.setAge(doggo.getAge() + 1);
		int newAge = doggo.getAge();
		return newAge;
	}
	
	public boolean isSold(Doggo doggo) {
		return doggo.getIsSold();
	}
}