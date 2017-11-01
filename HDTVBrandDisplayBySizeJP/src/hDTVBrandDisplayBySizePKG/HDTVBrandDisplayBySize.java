package hDTVBrandDisplayBySizePKG;    // package declared

import java.util.ArrayList;        // Importing ArrayList
import java.util.Collections;      // Importing Collections
import java.util.Comparator;       // Importing Comparator

// This program creates objects of HDTV with size and brandname, then add the objects into ArrayList and sort the data using compare method and prints them

public class HDTVBrandDisplayBySize {                // declared and defined a class

	public static void main(String[] args) {               // main method
		
		HDTV tv1 = new HDTV(70, "Sony");               // created an object with size and brand
		HDTV tv2 = new HDTV(60, "Videocon");                  // created an object with size and brand
		HDTV tv3 = new HDTV(50, "LG");             // created an object with size and brand
 
		ArrayList<HDTV> al = new ArrayList<HDTV>();                // created an array list object with HDTV generic
		al.add(tv1);                                     // adding HDTV object to array list
		al.add(tv2);                                     // adding HDTV object to array list
		al.add(tv3);                                     // adding HDTV object to array list
 
		System.out.println("HDTV Size and Brand Name Before Sorting :  ");       // printing info
		System.out.println();         // printing blank line
		
		for (HDTV a : al) {                                       // using for each loop
			System.out.println("Size : "+a.getSize()+"    Brand Name : "+a.getBrandName());                    // printing brandname
		}
		
		Collections.sort(al, new SizeComparator());          // sorting array list using sizeComparator class
		
		System.out.println();         // printing blank line
		System.out.println("HDTV Size and Brand Name After Sorting :  ");       // printing info
		System.out.println();         // printing blank line
		
		for (HDTV a : al) {                                       // using for each loop
			System.out.println("Size : "+a.getSize()+"    Brand Name : "+a.getBrandName());                    // printing brandname
		}
	}

}
