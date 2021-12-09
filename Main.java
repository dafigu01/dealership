import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;


public class Main {
	private static String make;
    private static String model;
    private static String color;
    private static int year;
    private static int index=0;
    private static int miles;
    private static String type;
    private static String trimLevel;
    private static long vin;
    private static ArrayList <String> CarMake = new ArrayList<>();
    private static ArrayList <String> CarModel = new ArrayList<>();
    private static ArrayList <String> CarColor = new ArrayList<>();
	private static ArrayList <Integer> CarMiles = new ArrayList<>();
	private static ArrayList <String> CarType = new ArrayList<>();
	private static ArrayList <Integer> CarYear = new ArrayList<>();
	private static ArrayList <String> TrimLevels = new ArrayList<>();
	private static ArrayList <Long> CarVin = new ArrayList<>();
    private static Scanner scnr= new Scanner(System.in);
    
    
    public static void main(String[] args) {
    menu();
    }
    

    public static void menu(){
    int select;  
    
    System.out.println("------------------------------------------");
	System.out.println("         Dealer Inventory Program         ");
	System.out.println("------------------------------------------");
	System.out.println("");
	System.out.println("         Select Menu Option               ");
	System.out.println("");
	System.out.println("1. Add New Vehicle to Inventory");
	System.out.println("2. Remove a Vehicle from Inventory");
	System.out.println("3. Update Existing Vehicle in Inventory");
	System.out.println("4. View All Vehicles in Inventory");
	System.out.println("5. Print All Vehicles");
	System.out.println("6. Exit");
	System.out.println("------------------------------------------");   
	select = scnr.nextInt();
	
	if (select == 1) {
		addVehicle();
	}
	else if (select == 2) {
		removeVehicle();
	}
	else if (select == 3) {
		updateVehicle();
	}
	else if (select == 4) {
		VehicleList();
	}
	else if (select == 5) {
		printfile();
	}
	else if (select == 6) {
		exit();
    }
	else {
		System.out.println("Please Enter a Valid Number Between 1-6.");
		menu();
	}
    }
    
    public static void exit(){
        System.exit(0);
    }
    
    public static void printfile(){ 
        try {
    	System.out.println("Printing all cars to a txt.file......");
		System.out.println("");
		PrintWriter printWriter = new PrintWriter ("c:\\Users\\Public\\Documents\\DanielFigueroa_DealerProgram.txt");
		for (int i = 0; i < CarMake.size() && i < CarModel.size() && i < CarMiles.size() && i < CarType.size() && i < CarYear.size() && i < TrimLevels.size() && i < CarVin.size(); ++i) {
			printWriter.println(i + ". ");
			printWriter.println("");
			printWriter.println("Make: " + CarMake.get(i));
			printWriter.println("Model: " + CarModel.get(i));
			printWriter.println("Color: " + CarColor.get(i));
			printWriter.println("Mileage: " + CarMiles.get(i));
			printWriter.println("Vehicle Type: " + CarType.get(i));
			printWriter.println("Year: " + CarYear.get(i));
			printWriter.println("Trim Level: " + TrimLevels.get(i));
			printWriter.println("VIN: " + CarVin.get(i));
			printWriter.println("");
			printWriter.println("");
		}
		printWriter.close();
         }
        catch (Exception e) {
        	e.printStackTrace();
    }
}
    public static void addVehicle(){    
    
    	try {
    	System.out.println("Add a New Vehicle");
    	System.out.println("Enter the Vehicle Make: ");
    	make = scnr.next();
    	CarMake.add(make);
    	System.out.println("Enter the Vehicle Model: ");
    	model = scnr.next();
    	CarModel.add(model);
    	System.out.println("Enter the Vehicle Color: ");
    	color = scnr.next();
    	CarColor.add(color);
    	System.out.println("Enter the Vehicle Mileage: ");
    	miles = scnr.nextInt();
    	CarMiles.add(miles);
    	System.out.println("Enter the Vehicle Type ie. SUV, Sedan: ");
    	type = scnr.next();
    	CarType.add(type);
    	System.out.println("Enter the Vehicle Year:");
    	year = scnr.nextInt();
    	CarYear.add(year);
    	System.out.println("Enter the Vehicles Trim Level: ");
    	trimLevel = scnr.next();
    	TrimLevels.add(trimLevel);
    	System.out.print("Enter the Vehicle Identification Number:");
    	vin = scnr.nextLong();
    	CarVin.add(vin);
    	System.out.println("Vehicle Added Successfully.");
        	menu();
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public static void removeVehicle(){
    
    	VehicleListother();
    
    	try {	
    		System.out.println("Enter the Number Of the Vehicle to Remove: ");
    		int removeCar = scnr.nextInt();
    		CarMake.remove(removeCar);
    		CarModel.remove(removeCar);
    		CarColor.remove(removeCar);
    		CarMiles.remove(removeCar);
    		CarType.remove(removeCar);
    		CarYear.remove(removeCar);
    		TrimLevels.remove(removeCar);
    		CarVin.remove(removeCar);
    		System.out.println("vehicle was removed successfully");
    			menu();
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public static void updateVehicle(){
    
    	VehicleListother();
    	
    	
    	try {	
    	System.out.println("Enter the ID of the vehicle to update:");
    	int updateCar = scnr.nextInt();
    	System.out.println("Update Car Make: ");
    	CarMake.set(updateCar, scnr.next());
    	System.out.println("Update Car Model: ");
    	CarModel.set(updateCar, scnr.next());
    	System.out.println("Update Car Color: ");
    	CarColor.set(updateCar, scnr.next());
    	System.out.println("Update Car Miles: ");
    	CarMiles.set(updateCar, scnr.nextInt());
    	System.out.println("Update Car Type: ");
    	CarType.set(updateCar, scnr.next());
    	System.out.println("Update Car Year: ");
    	CarYear.set(updateCar, scnr.nextInt());
    	System.out.println("Update Car Trim Levels: ");
    	TrimLevels.set(updateCar, scnr.next());
    	System.out.println("Update Car VIN Number: ");
    	CarVin.set(updateCar, scnr.nextLong());
    	System.out.println("Vehicle Updated Successfully.");
        	menu();
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public static void VehicleList () {
    	System.out.println("Listing All Vehicles Entered....");
    	try {
    	for (int i = 0; i < CarMake.size() && i < CarModel.size() && i < CarMiles.size() && i < CarType.size() && i < CarYear.size() && i < TrimLevels.size() && i < CarVin.size(); ++i) {
    		System.out.println(i + ". ");
			System.out.println("");
			System.out.println("Make: " + CarMake.get(i));
			System.out.println("Model: " + CarModel.get(i));
			System.out.println("Color: " + CarColor.get(i));
			System.out.println("Mileage: " + CarMiles.get(i));
			System.out.println("Vehicle Type: " + CarType.get(i));
			System.out.println("Year: " + CarYear.get(i));
			System.out.println("Trim Level: " + TrimLevels.get(i));
			System.out.println("VIN: " + CarVin.get(i));
			System.out.println("");
			System.out.println("");
    	}
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    	finally {
    		System.out.println("List View Successful.");
    			menu();
    	}
    }
    public static void VehicleListother () {
    	System.out.println("Listing All Vehicles Entered....");
    	try {
    	for (int i = 0; i < CarMake.size() && i < CarModel.size() && i < CarMiles.size() && i < CarType.size() && i < CarYear.size() && i < TrimLevels.size() && i < CarVin.size(); ++i) {
    		System.out.println(i + ". ");
			System.out.println("");
			System.out.println("Make: " + CarMake.get(i));
			System.out.println("Model: " + CarModel.get(i));
			System.out.println("Color: " + CarColor.get(i));
			System.out.println("Mileage: " + CarMiles.get(i));
			System.out.println("Vehicle Type: " + CarType.get(i));
			System.out.println("Year: " + CarYear.get(i));
			System.out.println("Trim Level: " + TrimLevels.get(i));
			System.out.println("VIN: " + CarVin.get(i));
			System.out.println("");
			System.out.println("");
    	}
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    
    }

}
    	

    



