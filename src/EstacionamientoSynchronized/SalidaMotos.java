package EstacionamientoSynchronized;

public class SalidaMotos implements Runnable{
	Estacionamiento estacionamiento;
	String nombre;
	
	public SalidaMotos(Estacionamiento e, String n){
		estacionamiento=e;
		nombre=n;
	}
	public void run(){
		for(int c=0; c<10;c++)
			try {
				estacionamiento.salirMoto(nombre);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
}
