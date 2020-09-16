package Punto2;

public class Vida {
private int vida;
	Vida (){
		vida=10;
	}
	
	public synchronized void darVida(){
		if (vida <3){
		vida= vida +3;
		System.out.println("se da mas vida, vida restante:  "+vida);}
	}
	
	public synchronized void quitarVida(){
		if (vida >=3){
		vida = vida - 3;
		System.out.println("se quita vida, vida restante: "+vida);}

	}
	
	public synchronized void guardarVida(){
	
}
}
