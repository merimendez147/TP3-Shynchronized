package Punto4;

public class Main {

	public static void main(String [] args){
		Surtidor s=new Surtidor();
		Auto auto = new Auto("AA-543", "Mustang", "Ford", 1230, 50.0, s);
		Thread h1= new Thread(auto);
		h1.start();
	}
}
