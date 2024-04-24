package hust.soict.cybersec.aims.store;

import hust.soict.cybersec.aims.disc.DigitalVideoDisc;
import java.util.ArrayList;

public class Store {
	private ArrayList<DigitalVideoDisc> itemsInStore;
	
	
	public Store() {
		itemsInStore  = new ArrayList<DigitalVideoDisc>();
	}
	public DigitalVideoDisc getDVDAtIndex(int i){
		return itemsInStore.get(i);
	}
	public void addDVD(DigitalVideoDisc dvd) {
		itemsInStore.add(dvd);
	}
	public void removeDVD(DigitalVideoDisc dvd) {
		for(int i=0;i<itemsInStore.size();i++) {
			if (itemsInStore.get(i).isMatch(dvd.getTitle())) {
				itemsInStore.remove(i);
				return;
			}
		}
	}
}
