package EstacionamientoSynchronized;

public class Estacionamiento {
 private int maxMotos;
 private int maxAutos;
 private Integer cantMotos= new Integer(0);
 private Integer cantAutos= new Integer(0);

public Estacionamiento(int m, int a){
	maxMotos=m;
	maxAutos=a;

}

public void ingresarAuto(String n){
	synchronized(cantAutos){
		if (cantAutos < maxAutos){
			cantAutos++;
			System.out.println("Ingreso un auto por "+n+", ahora hay "+cantAutos+" autos");
		}  else {
            System.out.println("El auto no pudo ingresar, estacionamiento lleno");
        }
    }
	}

public void salirAuto(String n)throws InterruptedException{
	synchronized(cantAutos){
		if (cantAutos > 0){
			cantAutos--;
			System.out.println("Salio un auto por " +n +", ahora hay "+cantAutos+" autos");
			Thread.sleep(1000);
		}  else {
            System.out.println("Estacionamiento de Autos vacio");
        }
    }
	}

public void ingresarMoto(String n){
	synchronized(cantMotos){
		if (cantMotos < maxMotos){
			cantMotos++;
			System.out.println("Ingreso una moto por "+n+", ahora hay "+cantMotos+" motos");
		}  else {
            System.out.println("La moto no pudo ingresar, estacionamiento lleno");
        }
    }
	}

public void salirMoto(String n)throws InterruptedException{
	synchronized(cantMotos){
		if (cantMotos > 0){
			cantMotos--;
			System.out.println("Salio una moto por "+n+", ahora hay "+cantMotos+" motos");
			Thread.sleep(1000);
		}  else {
            System.out.println("Estacionamiento de Motos vacio");
        }
    }
	}
}

