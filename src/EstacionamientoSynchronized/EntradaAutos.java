package EstacionamientoSynchronized;

public class EntradaAutos extends EntradaSalida{

	
	public EntradaAutos(Estacionamiento e, String n){
		super(e,n);
	}
	public void run(){
		for(int c=0; c<10;c++)
		this.estacionamiento.ingresarAuto(this.nombre);
	}
}
