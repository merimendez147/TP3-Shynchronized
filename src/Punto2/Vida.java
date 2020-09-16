package Punto2;

public class Vida {
private int vida;
	Vida (){
		vida=10;
	}
	
	public synchronized void darVida(){
		if (vida >0){
		vida= vida +3;
		System.out.println("se da mas vida, vida restante:  "+vida);}
	}
	
	public synchronized void quitarVida(int v){
		if (vida >0){
		vida = vida - v;
		System.out.println("se quita vida, vida restante: "+vida);}

	}
	
	public synchronized void guardarVida(){
	
}
}
