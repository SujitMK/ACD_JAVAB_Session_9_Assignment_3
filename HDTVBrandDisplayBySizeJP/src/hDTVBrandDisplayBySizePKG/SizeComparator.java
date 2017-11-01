package hDTVBrandDisplayBySizePKG;               // package declared

import java.util.Collections;      // Importing Collections
import java.util.Comparator;       // Importing Comparator

public class SizeComparator  implements Comparator<HDTV> {                   // defined and declared a class

	public int compare(HDTV tv1, HDTV tv2) {                   // overriden compare method
		int tv1Size = tv1.getSize();                           // assigning size to  variable
		int tv2Size = tv2.getSize();                            // assigning size to  variable
 
		if (tv1Size > tv2Size) {                                // comparing size using if condition
			return 1;                                           // sorting 
		} else if (tv1Size < tv2Size) {
			return -1;                                            // sorting 
		} else {
			return 0;
		}
	}
}