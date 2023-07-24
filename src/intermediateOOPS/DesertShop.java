package intermediateOOPS;

import java.util.*;

abstract class DesertItem {
	public abstract double getCost();
}

class Candy extends DesertItem {

	private double priceInDollars;

	public Candy(double priceInDollars) {
		this.priceInDollars = priceInDollars;
	}

	@Override
	public double getCost() {
		return priceInDollars * 60;
	}
}

class Cookie extends DesertItem {

	private double priceInEuros;

	public Cookie(double priceInEuros) {
		this.priceInEuros = priceInEuros;
	}

	@Override
	public double getCost() {
		return priceInEuros * 70;
	}
}

class IceCream extends DesertItem {

	private double priceInRupees;

	public IceCream(double priceInRupees) {
		this.priceInRupees = priceInRupees;
	}

	@Override
	public double getCost() {
		return priceInRupees;
	}
}

public class DesertShop {

	private static Map<String, Double> shopStorage = new HashMap<>();

	static void addItemsToStorage() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the type of desser (Candy/ Cookie/ IceCream):");
		String type = sc.next();
		
		System.out.println("Enter the price:");
		double price = sc.nextDouble();
		
		if(type.equalsIgnoreCase("candy")) {
			shopStorage.put("Candy", price);
		} else if(type.equalsIgnoreCase("Cookie")){
			shopStorage.put("Cookie", price);
		} else if(type.equalsIgnoreCase("IceCream")) {
			shopStorage.put("IceCream", price);
		} else {
			System.out.println("Invalid desert type");
		}
	
	}
	
	static void placeOrder() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the type of item you want to order (Candy/ Cookie/ IceCream): ");
		String order = sc.next();
		
		double cost = 0.0;
		
		if(shopStorage.containsKey(order)) {
			
		} else {
			System.out.println("The selected item in not available for now.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your role (owner/customer): ");
		String role = sc.next();

		if (role.equalsIgnoreCase("owner")) {
			addItemsToStorage();
		} else if (role.equalsIgnoreCase("customer")) {
			placeOrder();
		} else {
			System.out.println("Invalid role");
		}

	}

}
