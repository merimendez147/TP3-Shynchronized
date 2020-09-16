package Punto2;

public class Curandero extends Personaje implements Runnable{
	
	public Curandero(String p, Vida v){
		super(p, v);
	}
	
	public void run(){
		while (true){
		unaVida.darVida();}
	}

}