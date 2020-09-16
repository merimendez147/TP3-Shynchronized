package Punto4;

public class Auto extends Vehiculo {

	public Auto(String p, String mod, String m, int kmpServ, double c, Surtidor s){
		super(p, mod, m, kmpServ,c,s);
	}
	private boolean avanzar(){
		return combustible>10;
	}
	public void run(){
		while(true){
		while (avanzar()){
			combustible= combustible -0.19;
			kmFaltantesParaElService ++;
			System.out.println(marca +" "+modelo+" avanzando");
		}
		System.out.println(marca +" "+modelo+" llego a la reserva se recomienda no avanzar");
		this.surtidor.cargar();
	}
}}
