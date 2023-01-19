
public class Animal {
	
	public String AnimalName = "I am an animal";
	
	void Breathe() {
		System.out.println( "I breathe.\n" );
	}

	void Move() { 
		System.out.println( "I fly.\n" );
	}

	boolean CanEat(String tWhat) {
		if( tWhat.equals( "garbage") )
			return true;
		else
			return false;
	}
public String GetName() {
	return AnimalName;
	
}
}
