package EstacionamientoSynchronized;

public class Estacionamiento {
 private int maxMotos;
 private int maxAutos;
 private Object autos = new Object();
 private Object motos = new Object();;
 private int cantMotos= 0;
 private int cantAutos= 0;

public Estacionamiento(int m, int a){
	maxMotos=m;
	maxAutos=a;

}

public void ingresarAuto(String n){
	synchronized(autos){
		if (cantAutos <= maxAutos){
			cantAutos++;
			System.out.println("Ingreso un auto por "+n+" hay "+cantAutos+" autos");
		}  else {
            System.out.println("El auto no pudo ingresar, estacionamiento lleno");
        }
    }
	}

public void salirAuto(String n)throws InterruptedException{
	synchronized(autos){
		if (cantAutos > 0){
			cantAutos--;
			System.out.println("Salio un auto por " +n +" hay "+cantAutos+" autos");
			Thread.sleep(1000);
		}  else {
            System.out.println("Estacionamiento de Autos vacio");
        }
    }
	}

public void ingresarMoto(String n){
	synchronized(motos){
		if (cantMotos <= maxMotos){
			cantMotos++;
			System.out.println("Ingreso una moto por "+n+" hay "+cantMotos+" motos");
		}  else {
            System.out.println("La moto no pudo ingresar, estacionamiento lleno");
        }
    }
	}

public void salirMoto(String n)throws InterruptedException{
	synchronized(motos){
		if (cantMotos > 0){
			cantMotos--;
			System.out.println("Salio una moto por "+n+" hay "+cantMotos+" motos");
			Thread.sleep(1000);
		}  else {
            System.out.println("Estacionamiento de Motos vacio");
        }
    }
	}
}

