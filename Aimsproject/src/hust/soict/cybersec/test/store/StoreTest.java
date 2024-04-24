package hust.soict.cybersec.test.store;

import hust.soict.cybersec.aims.disc.DigitalVideoDisc;
import hust.soict.cybersec.aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 85, 19.95f);
		store.addDVD(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		store.addDVD(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		store.addDVD(dvd3);
		
		
		System.out.println(store.getDVDAtIndex(0).toString());
		System.out.println(store.getDVDAtIndex(1).toString());
		System.out.println(store.getDVDAtIndex(2).toString());
		
		store.removeDVD(dvd2);
		
		System.out.println(store.getDVDAtIndex(0).toString());
		System.out.println(store.getDVDAtIndex(1).toString());
	}
}
