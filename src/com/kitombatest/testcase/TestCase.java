package com.kitombatest.testcase;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test; 
import com.kitombatest.salestax.*;

public class TestCase {
		@Test  
		/*First set of inputs 
		 * 1 book at 12.49
		 * 1 music CD at 14.99
		 * 1 chocolate bar at 0.85
		*/
	    public void testInput1(){
			System.out.println("***Printing the output for first input set***");
			ArrayList<Integer> choices = new ArrayList<>();
			
			choices.add(1); 
			choices.add(2);
			choices.add(3);
			CartManipulations cm = new CartManipulations();
			ArrayList<Cart> cart = cm.getCart(choices);
			
			Double totalPrice  = cm.checkout(cart);  
	        assertEquals(29.83,totalPrice,0.0);  
	        
	    } 
		
		@Test 
		/*Second set of inputs 
		 * 1 imported box of chocolates at 10.00
		 * 1 imported bottle of perfume at 47.50
		*/
	    public void testInput2(){  
			System.out.println("***Printing the output for second input set***");
			ArrayList<Integer> choices = new ArrayList<>();
			
			choices.add(4); 
			choices.add(6);
			CartManipulations cm = new CartManipulations();
			ArrayList<Cart> cart = cm.getCart(choices);
			
			Double totalPrice  = cm.checkout(cart);  
	        assertEquals(65.15,totalPrice,0.0);  
	        
	    } 
		
		@Test  
		/*Second set of inputs 
		 * 1 imported bottle of perfume at 27.99
		 * 1 bottle of perfume at 18.99
		 * 1 packet of headache pills at 9.75
		 * 1 box of imported chocolates at 11.25
		*/
	    public void testInput3(){  
			System.out.println("***Printing the output for third input set***");
			ArrayList<Integer> choices = new ArrayList<>();
			
			choices.add(7); 
			choices.add(8);
			choices.add(9);
			choices.add(5);
			CartManipulations cm = new CartManipulations();
			ArrayList<Cart> cart = cm.getCart(choices);
			
			Double totalPrice  = cm.checkout(cart);  
	        assertEquals(74.68,totalPrice,0.0);  
	        
	    } 
		
}
