package AimsProject;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered ;
	
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
            if (qtyOrdered == itemsOrdered.length) {
                System.out.println("The cart is almost full.");
            }
        } else {
            System.out.println("The cart is full. Cannot add more discs.");
        }
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed.");
                return;
            }
        }
        System.out.println("The disc was not found in the cart.");
    }
    // Overloading method addDigitalVideoDisc
//    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
//    	for(int i = 0; i < dvdList.length; i++) {
//    		this.addDigitalVideoDisc(dvdList[i]);
//    	}
//    }
    // Can't overload the method 
    public void addDigitalVideoDisc(DigitalVideoDisc...dvdList ) {
    	for(int i = 0; i < dvdList.length; i++) {
    		this.addDigitalVideoDisc(dvdList[i]);
    	}
    }
    // Overloading addDigitalVideoDisc
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    	this.addDigitalVideoDisc(dvd1);
    	this.addDigitalVideoDisc(dvd2);
    }
    
    public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    
    public void displayCartItems() {
    	for (int i = 1; i <= qtyOrdered; i++) {
    		String format = Integer.toString(itemsOrdered[i-1].getId()) + "        " + itemsOrdered[i-1].getTitle();System.out.print(format);
    		for(int j = 0; j < 35-format.length(); j++) {
    			System.out.print(" ");
    		}
    		System.out.printf("%.2f\n", itemsOrdered[i-1].getCost());
    	}
    	System.out.printf("         Total Cost:               %.2f\n", this.totalCost());
    }
}
	

