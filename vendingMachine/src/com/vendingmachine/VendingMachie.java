package com.vendingmachine;

import java.util.Scanner;

public class VendingMachie {
	public static void main(String [] args) {
		
		int food = selectProduct();
		int price = getPrice(food);
		int change = insertMoney(price);
		changeout(change);
	}

	private static int selectProduct() {
		
		 Scanner keyboard = new Scanner(System.in);
		    int choice = 0 ;
		    System.out.println("\n\nPlease enter your selection:"
		                + "\n1: Coke \t"
		                + "\n2: Pepsi \t"
		                + "\n3: Soda \t"
		                + "\n4: Exit ");
		    choice = keyboard.nextInt();
		    return choice;
	}
	
	private static int getPrice(int menu) {
		 if (menu == 1)
		        return 5;
		    if (menu == 2)
		        return 35;
		    if (menu == 3)
		        return 45;
		    else return 0;
	}
	
	private static int insertMoney(int price) {
		 
		Scanner keyboard = new Scanner(System.in);
	    int money = 0;
	    System.out.println("Your item costs: " + price + " Please enter the amount of money:");
	    money = keyboard.nextInt();
	    while (money < price){
	        System.out.println("Please insert sufficient funds");
	        money = money + keyboard.nextInt();
	    }
	    return money - price ;
	}
	
	public static void changeout(int change){
	    int quarters = 0;
	    int dimes = 0;
	    int nickels = 0;
	    int pennies = 0;
	    while (change >= 25){
	        quarters = quarters + 1;
	        change = change - 25;
	    }
	    while (change >= 10){
	        dimes = dimes + 1;
	        change = change - 10;
	    }
	    while (change >= 5){
	        nickels = nickels + 1;
	        change = change - 5;
	    }
	    while (change >= 1){
	        pennies = pennies + 1;
	        change = change - 1;
	    }

	    // to see the change, print it to the console perhaps
	    System.out.printf("\nHere's your change:\n%d quarters, %d dimes, %d nickels and %d pennies!",
	        quarters, dimes, nickels, change);
	}

}
