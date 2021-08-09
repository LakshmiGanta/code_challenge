package task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinPrice {
	public static void main(String[] args) {
		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(191, "Xyz Travels", 1700.22, 2.3f));
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		
		double cost = 0;
		
		List<Bus>  XyzTravelBuses= new ArrayList<>();
//		for (Bus bus : busList) {
//			if(bus.getProviderName()=="Xyz Travels") {
//				XyzTravelBuses.add(bus);
//			}
//		}
//		for(Bus bus: XyzTravelBuses) {
//			System.out.println(bus);
//		}
		busList.stream()
				.filter(e -> e.getProviderName().equals("Xyz Travels"))	
				.collect(Collectors.toList())
				.forEach(System.out::println);
		
		Bus bus1 = busList.stream()
				.filter(e -> e.getProviderName().equals("Xyz Travels"))					
				.min(Comparator.comparingDouble(Bus::getCost)).get();
		
		System.out.println("min is "+bus1.getCost());
		System.out.println("rating is "+ bus1.getRating());
	
			
	}

}
