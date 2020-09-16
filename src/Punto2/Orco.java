package Punto2;

public class Orco extends Personaje implements Runnable{
	
	public Orco(String p, Vida v){
		super(p, v);
	}
	
	public void run(){
		while (true){
		unaVida.quitarVida();}
	}

}
