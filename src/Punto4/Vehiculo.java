package Punto4;

public abstract class Vehiculo implements Runnable{
	String patente;
	String modelo;
	String marca;
	int kmFaltantesParaElService;
	double combustible;
	Surtidor surtidor;
	
	public Vehiculo (String p, String mod, String m, int kmpServ, double c, Surtidor s){
		patente=p;
		modelo=mod;
		marca=m;
		kmFaltantesParaElService=kmpServ;
		combustible=c;
		surtidor=s;
	}

}
