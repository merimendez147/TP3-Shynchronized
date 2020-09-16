package Punto2;

public abstract class Personaje implements Runnable  {
	Vida unaVida;
	String personaje;
	
	public Personaje(String p, Vida v){
		unaVida=v;
		personaje=p;
	}

	public Vida getVida(){
		return unaVida;
	}
	
}
