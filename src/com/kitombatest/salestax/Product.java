package com.kitombatest.salestax;

import java.util.ArrayList;

public class Product {
	String productName;
	String productType;
	String salesTax;
	double price;
	int count = 0;
	public static ArrayList<Product> alProducts = new ArrayList<Product>();
	public Product(){
		
	}
	
	Product(String productName, String productType, String salesTax, double price){
		this.productName = productName;
		this.productType = productType;
		this.salesTax = salesTax;
		this.price = price;
		count++;
	}
	//Creating new instances of product class and adding to an ArrayList
	public ArrayList<Product> addToList() {
		Product p1 = new Product("book","","Tax-Exempt", 12.49);
		Product p2 = new Product("music CD","","Taxable", 14.99);
		Product p3 = new Product("chocolate bar","","Tax-Exempt", 0.85);
		Product p4 = new Product("box of chocolates","imported","Tax-Exempt", 10.00);
		Product p5 = new Product("box of chocolates","imported","Tax-Exempt", 11.25);
		Product p6 = new Product("bottle of perfume","imported","Taxable", 47.50);
		Product p7 = new Product("bottle of perfume","imported","Taxable", 27.99);
		Product p8 = new Product("bottle of perfume","","Taxable", 18.99);
		Product p9 = new Product("packet of headache pills","","Tax-Exempt", 9.75);
		
		alProducts.add(p1);
		alProducts.add(p2);
		alProducts.add(p3);
		alProducts.add(p4);
		alProducts.add(p5);
		alProducts.add(p6);
		alProducts.add(p7);
		alProducts.add(p8);
		alProducts.add(p9);
		
		return alProducts;
	}

	public String toString() {
		if(productType== "imported") {
			return productType+" "+productName+": $"+price;
		}

		return productName+": $"+price;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductType() {
		return productType;
	}

	public String getSalesTax() {
		return salesTax;
	}

	public double getPrice() {
		return price;
	}

	public int getCount() {
		return count;
	}

	public static ArrayList<Product> getAlProducts() {
		return alProducts;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
