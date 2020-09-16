package EstacionamientoSynchronized;

public class Main {
	public static void main(String[] args) {
        Estacionamiento e = new Estacionamiento(10,10);
        EntradaAutos entradaSur = new EntradaAutos(e, "Entrada Sur");
        EntradaAutos entradaNorte = new EntradaAutos(e, "Entrada Norte");
        EntradaMotos entradaMoto = new EntradaMotos(e, "Entrada Moto");
        SalidaAutos salidaAuto = new SalidaAutos(e, "Salida Auto");
        SalidaMotos salidaMoto = new SalidaMotos(e, "Salida Moto");

        Thread ESur = new Thread(entradaSur);
        Thread ENorte = new Thread(entradaNorte);
        Thread EMoto = new Thread(entradaMoto);
        Thread SalidaAuto = new Thread(salidaAuto);
        Thread SalidaMoto = new Thread(salidaMoto);
        
        ESur.start();
        ENorte.start();
        EMoto.start();
        SalidaAuto.start();
        SalidaMoto.start();

    }
}
