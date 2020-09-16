package Punto2;

public class Main {
	public static void main(String [] args){
		Vida unaVida= new Vida();
		Orco orco = new Orco("Orco", unaVida);
		Curandero curandero = new Curandero("Curandero", unaVida);
		Thread h1= new Thread(orco);
		Thread h2= new Thread(curandero);
		h1.start();
		h2.start();
	}
}
