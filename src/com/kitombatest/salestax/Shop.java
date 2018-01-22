package com.kitombatest.salestax;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		//Input helpers
		Scanner sc = new Scanner(System.in);
		
		//Variable Declarations
		int productID = 1, choice = 0;
		
		Product productsList = new Product();
		CartManipulations cm = new CartManipulations();
		
		//ArrayList declarations and adding products into array list
		ArrayList<Product> productList = new ArrayList<Product>();
		
		productList= productsList.addToList();
		
		//Assigning the objects stored in ArrayList for cart operations
		Product[] prod = new Product[productList.size()];
		for(int i=0;i<productList.size();i++) {
			prod[i] = productList.get(i);
		}
		
		//Displaying the list of products
		for(Product product:productList) {
			System.out.println(productID+". "+product.toString());
			productID++;
		}
		
		System.out.println("Enter the ID number between 1 and 8 to add products into cart.\nEnter 0 to exit and calculate the bill amount:");
		
		ArrayList<Integer> choices = new ArrayList<>();
		do { 
			try {
				choice = sc.nextInt();
		    } catch (InputMismatchException e) {
		        System.out.print("Invalid entry. Please enter a number between 1 to 9.");
		        sc.nextLine();
		    }
			if (choice>=1 && choice <= 9) {
				System.out.println("1 "+productList.get(choice-1).getProductType() +" "+productList.get(choice-1).getProductName()+" at $"+String.format("%.2f",productList.get(choice-1).getPrice()));
				choices.add(choice);
			}
		} while(choice>=1 && choice <= 9);
		
		if(choices.isEmpty()) {
			System.out.println("Oops! You haven't selected any product, Thank you for visiting");
		}
		else {
			//Getting the cart after computing the sales tax and price for each product
			ArrayList<Cart> cart = cm.getCart(choices);
			
			//Printing the total price of items in cart and the sum of sales taxes using checkout method of CartManipulations class
			cm.checkout(cart);
			
			System.out.println("Thank you for shopping");
		}
		
		
		sc.close();
	}

}
