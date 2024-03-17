package Claseviernes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona tony_stark = new Persona(null, 0, null);
		tony_stark.setName("Tony Stark");
		System.out.println(tony_stark.name+":"+tony_stark.edad);
		tony_stark.setEdad(35);
		System.out.println(tony_stark.name+":"+tony_stark.edad);
		
		SuperHero iron_man = new SuperHero(tony_stark.name, tony_stark.edad, null, args, null);
		iron_man.heroName = "Iron Man";
		iron_man = new String[]{"volar","pelear"};
	}
}
