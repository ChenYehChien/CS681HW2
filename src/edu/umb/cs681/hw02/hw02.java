package edu.umb.cs681.hw02;

import java.util.ArrayList;
import java.util.Comparator;

public class hw02 {
	private static ArrayList<Car> carList = new ArrayList<Car>();
	
	private static void carsInstantiation() {
		Car A = new Car("Toyota", "RAV4", 300, 2018, 1000L);
		Car B = new Car("Toyota", "RAV4", 400, 2018, 2000L);
		Car C = new Car("Toyota", "RAV4", 500, 2018, 3000L);
		Car D = new Car("Toyota", "RAV4", 200, 2018, 2000L);
		Car E = new Car("Toyota", "RAV4", 100, 2018, 2000L);
		
		A.setDominationCount(0);
		B.setDominationCount(3);
		C.setDominationCount(4);
		D.setDominationCount(1);
		E.setDominationCount(0);
		
		carList.add(A);
		carList.add(B);
		carList.add(C);
		carList.add(D);
		carList.add(E);
	}
	
	public static void main(String[] arg) {
		carsInstantiation();
		// PriceComparator - Ascending Order
		System.out.println("PriceComparator - Ascending Order");
		System.out.println("---------------------------------");
		carList.stream().sorted(Comparator.comparing(Car :: getPrice)).forEach((car) -> System.out.println(car.getPrice()));

		// PriceComparator - Descending Order
		System.out.println("PriceComparator - Descending Order");
		System.out.println("---------------------------------");
		carList.stream().sorted(Comparator.comparing(Car :: getPrice, Comparator.reverseOrder())).forEach((car) -> System.out.println(car.getPrice()));
		
		// YearComparator - Ascending Order
		System.out.println("YearComparator - Ascending Order");
		System.out.println("--------------------------------");
		carList.stream().sorted(Comparator.comparing(Car :: getYear)).forEach((car) -> System.out.println(car.getYear()));
		
		// YearComparator - Descending Order
		System.out.println("YearComparator - Descending Order");
		System.out.println("---------------------------------");
		carList.stream().sorted(Comparator.comparing(Car :: getYear, Comparator.reverseOrder())).forEach((car) -> System.out.println(car.getYear()));
		
		// MileageComparator - Ascending Order
		System.out.println("MileageComparator - Ascending Order");
		System.out.println("-----------------------------------");
		carList.stream().sorted(Comparator.comparing(Car :: getMileage)).forEach((car) -> System.out.println(car.getMileage()));
		
		// MileageComparator - Descending Order
		System.out.println("MileageComparator - Descending Order");
		System.out.println("------------------------------------");
		carList.stream().sorted(Comparator.comparing(Car :: getMileage, Comparator.reverseOrder())).forEach((car) -> System.out.println(car.getMileage()));
		
		// DominationComparator - Ascending Order
		System.out.println("DominationComparator - Ascending Order");
		System.out.println("--------------------------------------");
		carList.stream().sorted(Comparator.comparing(Car :: getDominationCount)).forEach((car) -> System.out.println(car.getDominationCount()));
		
		// DominationComparator - Descending Order
		System.out.println("DominationComparator - Descending Order");
		System.out.println("---------------------------------------");
		carList.stream().sorted(Comparator.comparing(Car :: getDominationCount, Comparator.reverseOrder())).forEach((car) -> System.out.println(car.getDominationCount()));
		
	}
	
	
}