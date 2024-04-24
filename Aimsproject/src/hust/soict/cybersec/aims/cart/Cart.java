package hust.soict.cybersec.aims.cart;

import hust.soict.cybersec.aims.disc.DigitalVideoDisc;

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
    
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList ) {
    	for(int i = 0; i < dvdList.length; i++) {
    		this.addDigitalVideoDisc(dvdList[i]);
    	}
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    	this.addDigitalVideoDisc(dvd1);
    	this.addDigitalVideoDisc(dvd2);
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
    
    public float getTotalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    
    public String toString() {
    	String ans = "Orderd Items: \n";
    	for(int i=0;i<qtyOrdered;i++) {
    		ans += (Integer.toString(i + 1) + ".DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + 
    				" - " + itemsOrdered[i].getDirector() + " - " + Integer.toString(itemsOrdered[i].getLength()) + ": " +
    				Float.toString(itemsOrdered[i].getCost()) + " $\n"
    				);
    	}
    	ans += ("Total cost: " + Float.toString(this.getTotalCost()));
    	return ans;
    }
}
	
