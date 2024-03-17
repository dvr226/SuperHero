package Claseviernes;

public class SuperHero extends Persona{
	String heroName;
	String[] poderes;
	String franquicia;
	
	public SuperHero(String name, int edad, String heroName, String[]poderes, String franquicia) {
		super(name, edad, franquicia);
		this.heroName = heroName;
		this.poderes = poderes;
		this.franquicia = franquicia;
		// TODO Auto-generated constructor stub
	}
}
