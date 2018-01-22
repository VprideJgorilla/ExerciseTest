package com.kitombatest.salestax;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
public class CartManipulations {
	
	static DecimalFormat df = new DecimalFormat();
	
	static double salesTax = 0;
	static double finalPrice = 0;
	
	Cart ct;
	
	/*Returning the objects to getCart() method by passing input values for 
	 * productName, productType, price and taxPercent which are computed from getCart().
	 */
	public Cart addToCart(String productName, String productType, double price, double taxPercent) {
		salesTax = CartManipulations.salesTax(price, taxPercent);
		finalPrice = CartManipulations.finalPrice(price, salesTax);
		ct = new Cart(productName, productType, finalPrice, salesTax);
		return ct;
	}
	//Computes the sales tax of a product based on the sales tax percent
	public static double salesTax(double price, double taxPercent) {
		salesTax = Math.ceil((price * taxPercent)*20)/20;
		return salesTax;
	}
	//Computes the price of a product on bill including the sales tax
	public static double finalPrice(double price, double salesTax) {
		finalPrice = Double.valueOf(df.format(price + salesTax));
		return finalPrice;
	}
	
	//Adding products to the cart after computing the sales tax and price for each product
	public ArrayList<Cart> getCart (ArrayList<Integer> choices){
		
		double salesTax = 0;
		double finalPrice = 0;
		DecimalFormat df = new DecimalFormat();
		
		ArrayList<Product> productList = new Product().addToList();
		
		Cart cartItem;
		
		ArrayList<Cart> cart = new ArrayList<>();
		
		for (Integer choice : choices) {
			--choice;
			if(productList.get(choice).getSalesTax() == "Taxable" && productList.get(choice).getProductType() == "imported") {
				cartItem = addToCart(productList.get(choice).getProductName(), productList.get(choice).getProductType(), productList.get(choice).getPrice(), 0.15);
				cart.add(cartItem);
			}else if(productList.get(choice).getSalesTax() == "Taxable" && productList.get(choice).getProductType() != "imported") {
				cartItem = addToCart(productList.get(choice).getProductName(), productList.get(choice).getProductType(), productList.get(choice).getPrice(), 0.10);
				cart.add(cartItem);				
			}else if(productList.get(choice).getSalesTax() != "Taxable" && productList.get(choice).getProductType() == "imported") {
				cartItem = addToCart(productList.get(choice).getProductName(), productList.get(choice).getProductType(), productList.get(choice).getPrice(), 0.05);
				cart.add(cartItem);				
			}else {
				salesTax = 0;
				productList.get(choice).setPrice(productList.get(choice).getPrice() + salesTax);
				finalPrice = Double.valueOf(df.format(productList.get(choice).getPrice() + salesTax));
				cartItem = new Cart(productList.get(choice).getProductName(), productList.get(choice).getProductType(), finalPrice, salesTax);
				cart.add(cartItem);
			}
		}
		
		return cart;
	}
	
	//Computing the total price of items in cart and the sum of sales taxes
	public double checkout(ArrayList<Cart> cart) {
		double totalSalesTax = 0;
		double totalBillAmount = 0;
		
		for(Cart ctr:cart) {
			if(ctr.productType == "imported") {
			System.out.println("1 "+ctr.productType+" "+ctr.productName+": "+ctr.price);
			}
			else {
				System.out.println("1 "+ctr.productName+": "+ctr.price);
			}

			totalSalesTax += ctr.salesTax;
			totalBillAmount += ctr.price; 
		}
		String totalBillAmtStr = String.format("%.2f",Double.valueOf(df.format(totalBillAmount)));
		String totalSalesTaxStr = String.format("%.2f",Math.ceil(totalSalesTax*20)/20);
		
		totalBillAmount = Double.valueOf(String.format("%.2f",Double.valueOf(df.format(totalBillAmount))));
		totalSalesTax = Double.valueOf(String.format("%.2f",Math.ceil(totalSalesTax*20)/20));
		df.setRoundingMode(RoundingMode.UP);
		System.out.println("Sales Taxes:" + totalSalesTaxStr + "\nTotal Bill:" + totalBillAmtStr);
		System.out.println("=================");
		return totalBillAmount;
		
	}
	
	
}
