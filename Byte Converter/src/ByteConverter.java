/**
 * This program converts a specified number of bytes into a more readable format
 * 
 * Last Modified: October 4, 2016
 * @author: Thomas "RadiantBytes" Lynaugh
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class ByteConverter {

	public static void main(String[] args) {
		//Declares variables
		String byteConversion = " ";
		double equivalentBytes = 0.0;
		
		//Declares new decimal format and scanner
		DecimalFormat df1 = new DecimalFormat("#0.00");
		Scanner scan = new Scanner(System.in);
		
		//Print prompt for number of bytes
		System.out.print("Enter number of bytes: ");
		long numberBytes = scan.nextLong();
		
		//Decipher correct byte conversion
		if ((numberBytes >= 1) && (numberBytes < 1024)) {
			byteConversion = " b";
			equivalentBytes = numberBytes;
		}
		else
		if ((numberBytes >= 1024) && (numberBytes < 1048576)) {
			byteConversion = " Kb";
			equivalentBytes = (numberBytes / 1024.0);
		}
		else
		if ((numberBytes >= 1048576) && (numberBytes < Math.pow(2,  30)))  {
			byteConversion = " Mb";
			equivalentBytes = (numberBytes / (Math.pow(1024.0, 2.0)));
		}
		else
		if (numberBytes >= Math.pow(2, 30)) {
			byteConversion = " Gb";
			equivalentBytes = (numberBytes / (Math.pow(1024.0, 3.0)));		
		}
		else
		if (numberBytes >= Math.pow(2, 40)) {
			byteConversion = " Tb";
			equivalentBytes = (numberBytes / (Math.pow(1024.0, 4.0)));
	}		
		//Print byte conversion
		System.out.print("## " + numberBytes + " Bytes is " + df1.format(equivalentBytes) + byteConversion);
							
	}
}
