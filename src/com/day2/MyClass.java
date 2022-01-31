package com.day2;

//CLASS BIKE
class Bike
{
	private String brand;
	private int mileage;
	private String color;
	
	Bike(){
		
	}
	
	Bike(String brand, int mileage,String color)
	{
		this.brand = brand;
		this.mileage = mileage;
		this.color = color;
	}
	
	//setter
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public void setMileage(int mileage)
	{
		this.mileage=mileage;
	}
	public void setcolor(String color)
	{
		this.color=color;
	}
	
	
	//getter
	public String getBrand() {
        return this.brand;
    }
 
    public int getMileage() {
        return this.mileage;
    }
 
    public String getcolor() {
        return this.color;
    }
    
    Bike(int mileage,String brand,String color)
    {
    	this.brand=brand;
    	this.mileage=mileage;
    	this.color=color;
    }
	
	
	//PRINTING
	public void printdetails()
	{
		System.out.println("\nBrand: "+this.brand);
		System.out.println("Mileage: "+this.mileage);
		System.out.println("Color: "+this.color);
	}
	
}

//CLASS CAR
/*class Car
{
	private String model;
	private int amount;
	private int engineLitre;
	
	public void setmodel(String model)
	{
		this.model=model;
	}
	public void setMileage(int amount)
	{
		this.amount=amount;
	}
	public void setengineLitre(int engineLitre)
	{
		this.engineLitre=engineLitre;
	}
	
	public void printdetails()
	{
		System.out.println("Brand "+this.model);
		System.out.println("Mileage "+this.amount);
		System.out.println("Color "+this.engineLitre);
	}
}*/

public class MyClass 
{
	public static void main(String args[])
	{
		//BIKE
		Bike Panigale=new Bike("Ducati",12,"red");
		Panigale.printdetails();
		
		//BIKE 2
		Bike Tigor=new Bike();
		Tigor.setBrand("Triumph");
		Tigor.setMileage(25);
		Tigor.setcolor("red");
		
		System.out.println("\nBrand Name: " + Tigor.getBrand());
        System.out.println("Mileage: " + Tigor.getMileage());
        System.out.println("Color: " + Tigor.getcolor());
        
        //BIKE 3
        Bike Hayabusa=new Bike("Suzuki",15,"blue");
        Hayabusa.printdetails();
	}
}
