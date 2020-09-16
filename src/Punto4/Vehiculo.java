package Punto4;

public abstract class Vehiculo implements Runnable{
	String patente;
	String modelo;
	String marca;

	
	public Vehiculo (String p, String mod, String m){
		patente=p;
		modelo=mod;
		marca=m;
	}

}
