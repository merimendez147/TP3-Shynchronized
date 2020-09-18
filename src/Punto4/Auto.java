package Punto4;
/*
 * Facultad de Inform�tica
 * Programaci�n Concurrente - Departamento de Programaci�n - 2020
 * Trabajo pr�ctico N� 3 - Synchronized
 * Ejercicio N� 4 
 * Maria Mendez - Marcos Molina
 */

public class Auto extends Vehiculo {
	int kmFaltantesParaElService;
	private double combustible;
	Surtidor surtidor;
	
	public Auto(String p, String mod, String m, int kmpServ, double c, Surtidor s){
		super(p, mod, m);
		kmFaltantesParaElService=kmpServ;
		combustible=c;
		surtidor=s;	
	}
	
	private boolean avanzar(){
		return combustible>10;
	}
	
	public void run(){
		while(true){
		while (avanzar()){
			combustible= combustible -0.29;
			kmFaltantesParaElService --;
			System.out.println(marca +" "+modelo+" avanzando");
		}
		System.out.println(marca +" "+modelo+" llego a la reserva se recomienda no avanzar");
		combustible=surtidor.cargar();
	}
}}
