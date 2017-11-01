package hDTVBrandDisplayBySizePKG;

public class HDTV {                           // defined and declared a class

private int size;                               // declared private variable size of int type
private String brandName;                   // declared private variable size of int type

public HDTV(int size, String brandName) {        // using a parametrized constructor
	this.size = size;                            // assigning local variable value to global variable
	this.brandName = brandName;                   // assigning local variable value to global variable
}

public int getSize() {                    // defined getter method
	return size;                          // returning size
}

public void setSize(int size) {              // defined setter method
	this.size = size;                           // assigning local variable value to global variable
}

public String getBrandName() {                   // defined getter method
	return brandName;                          // returning brandName
}

public void setbrandName(String brandName) {            // defined setter method
	this.brandName = brandName;                       // assigning local variable value to global variable
}
}
