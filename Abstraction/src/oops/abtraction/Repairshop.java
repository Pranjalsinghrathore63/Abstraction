package oops.abtraction;

public class Repairshop {
	
public static void repairCar(car car) {
	System.out.println("car i repaired");
		
	}

	public static void main(String[] args) {
	
		
		
		WagonR wagonR = new WagonR();
		Audi audi = new Audi();
		
		
		
		
		repairCar(wagonR);
	
		
	}

}
