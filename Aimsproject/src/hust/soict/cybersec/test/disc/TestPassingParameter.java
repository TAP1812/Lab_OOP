package hust.soict.cybersec.test.disc;

import hust.soict.cybersec.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cindrella");
		
		swap(jungleDVD,cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cindrella dvd title: " + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD,cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		
	}
	public static void swap(Object obj1, Object obj2) {
		if (obj1 instanceof DigitalVideoDisc) {
			String temp = ((DigitalVideoDisc) obj1).getTitle();
			((DigitalVideoDisc) obj1).setTitle(((DigitalVideoDisc) obj2).getTitle());
			((DigitalVideoDisc) obj2).setTitle(temp);
		}
		else {
			System.out.println("Error!");
		}
	}
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}
