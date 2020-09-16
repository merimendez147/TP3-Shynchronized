package EstacionamientoSynchronized;

public class SalidaAutos implements Runnable{
	Estacionamiento estacionamiento;
	String nombre;
	
	public SalidaAutos(Estacionamiento e, String n){
		estacionamiento=e;
		nombre=n;
	}
	public void run(){
		for(int c=0; c<10;c++)
			try {
				estacionamiento.salirAuto(nombre);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
