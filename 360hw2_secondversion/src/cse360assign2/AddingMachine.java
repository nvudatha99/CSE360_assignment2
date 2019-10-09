package cse360assign2;

/**
 * 
 * @author Nikhil Vudatha

 * Date: 10/9/2019
 * CSE360 M 70641
 * Description: This program performs and displays the operations it does on integers with a main to run the methods with test numbers.
 *
 */
import java.util.*;


public class AddingMachine {

	/**
	 *  a private total variable to keep track of total computed.
	 */
	private int total = 0;
	private String str = "0";
	
	
	public AddingMachine(){
		
		total = 0;

	}

	

	/**
	 * this int function returns the amount saved in total after operations are computed
	 * @return total
	 */
	public int getTotal () {
		
		return total;
		
	}
	/**
	 * takes in an integer value and performs addition
	 * @param value
	 */
	public void add (int value) {
		
		total += value;
		str += "+" + value;
	}
	/**
	 * takes in an integer value and performs subtraction
	 * @param value
	 */
	public void subtract (int value) {
		
		total -=  value;
		str += "-" + value;
	}
	/**
	 * this method displays the operations that have been computed in a string format
	 * @return string
	 */
	public String toString () {
		
		return str;
		
	}
	/**
	 * this method clears the sequence of operations stored in the toString and sets total to 0
	 */
	public void clear() {
		
		total = 0;
		
		
	}
	
	 public static void main(String[] args) {
		 
		 
		 AddingMachine one = new AddingMachine();
		 
		 one.add(5);
		 one.add(10);
		 one.subtract(7);
		 one.subtract(4);
		 one.subtract(10);
		 one.add(4);
		 
		 System.out.println(one.toString() + " = " + one.getTotal());
		 
	 }
}
