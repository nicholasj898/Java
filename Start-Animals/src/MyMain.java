
public class MyMain
{
	public static void main( String[] args )
	{
		Salamander bob = new Salamander();
		Gecko larry = new Gecko();
		Cat linda = new Cat();
		Rabbit pete = new Rabbit();
//		Pigeon clara = new Pigeon();
//		Dove alice = new Dove();

		bob.Breathe();
		bob.Move();
		if( bob.CanEat("fire") )
			System.out.println( "Bob likes fire.\n" );
		else
			System.out.println( "Bob doesn't like fire.\n" );
		System.out.println( "Bob is a " + bob.GetName() + "\n" );
		PlayScrabble game = new PlayScrabble(linda);
		// boolean ind = game.JoinGame(pete, linda);
		System.out.println(game.OkToJoin);
		// boolean ind = game.JoineGame(pete, linda);
		PlayScrabble game2 = new PlayScrabble(linda);
		// boolean ind = game.JoinGame (pete, linda);
		System.out.println(game.OkToJoin);
	}
}
