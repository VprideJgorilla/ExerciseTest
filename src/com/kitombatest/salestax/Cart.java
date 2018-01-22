package com.kitombatest.salestax;

public class Cart {
		String productName;
		String productType;
		double price;
		double salesTax;
		
		Cart(){
			
		}
		
		public Cart(String productName, String productType, double price, double salesTax){
			this.productName = productName;
			this.productType = productType;
			this.price = price;
			this.salesTax = salesTax;
		}
}
