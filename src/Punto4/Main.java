package Punto4;

public class Main {

	public static void main(String [] args){
		Surtidor s=new Surtidor();
		Auto auto1 = new Auto("AA-543", "Mustang", "Ford", 1230, 50.0, s);
		Auto auto2 = new Auto("AB-890", "C63", "Mercedes-Benz", 1230, 40.0, s);
		Auto auto3 = new Auto("CC-403", "RS3", "Audi", 1230, 60.0, s);
		Auto auto4 = new Auto("CB-143", "I-Pace", "Jaguar", 1200, 55.0, s);
		Auto auto5 = new Auto("AD-000", "Camaro", "Chevrolet", 3430, 65.0, s);
		Thread h1= new Thread(auto1);
		Thread h2= new Thread(auto2);
		Thread h3= new Thread(auto3);
		Thread h4= new Thread(auto4);
		Thread h5= new Thread(auto5);
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
	}
}
