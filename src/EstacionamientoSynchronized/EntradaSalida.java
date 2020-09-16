package EstacionamientoSynchronized;

public abstract class EntradaSalida implements Runnable{
	Estacionamiento estacionamiento;
	String nombre;
	
	public EntradaSalida(Estacionamiento e, String n){
		estacionamiento=e;
		nombre=n;
	}

}

