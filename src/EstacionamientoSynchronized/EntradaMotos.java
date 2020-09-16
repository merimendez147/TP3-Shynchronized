package EstacionamientoSynchronized;

public class EntradaMotos extends EntradaSalida{
		
		public EntradaMotos(Estacionamiento e, String n){
			super (e,n);
		}
		public void run(){
			for(int c=0; c<10;c++)
				this.estacionamiento.ingresarMoto(this.nombre);
			}
	}
