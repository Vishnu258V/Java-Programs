package Abstraction_Interface;

import java.io.*;

abstract class computer {
	String Colour;

	// Constructor
	public computer(String PcColour) {
		this.Colour = PcColour;
		// System.out.println("--------------------\n--------------------");
	}

	abstract String lenovoData();

	abstract String dellData();
}

class lenovo extends computer {
	String PcName;
	int size;
	int PcPrice;

	lenovo(String Colour, int size, String PcName, int PcPrice) {
		super(Colour);
		this.Colour = Colour;
		this.size = size;
		this.PcPrice = PcPrice;
	}

	@Override
	public String toString() {

		return "The name of the computer " + PcName + "the colour of the computer " + Colour
				+ " having the price around" + PcPrice + " with the " + size + " inches diplay ";
	}

	@Override
	String dellData() {
		
		return null;
	}
}

public class Abstract_2 {
	public static void main(String[] args) {

		lenovo l1 = new lenovo("Black", 14, "Lenovo", 75000);
	
	}

}
