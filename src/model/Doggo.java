package model;

public class Doggo {

	private String name;
	private int age;
	private double cost;
	private boolean isSold;
	
	public Doggo() { }
	
	public Doggo(String name) {
		this.name = name;
	}
	
	public Doggo(String name, int age, double cost, boolean isSold) {
		this.name = name;
		this.age = age;
		this.cost = cost;
		this.isSold = isSold;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public boolean getIsSold() {
		return isSold;
	}
	public void setSold(boolean isSold) {
		this.isSold = isSold;
	}
}
