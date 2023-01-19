import java.util.*;
public class PlayScrabble {

	public boolean OkToJoin = true;
	public PlayScrabble(Object obj) {
		
	}
	
	public boolean JoinGame (Object obj1, Object obj2) {
		// needs to be the same type of class //
		if (!obj1.getClass().getSuperclass().equals(obj2.getClass().getSuperclass())) {
			return false;
		}
		// cant be another instance of this class //
		if ((obj1 instanceof PlayScrabble)) {
			return false;
		}
		return true;
	}
	
}
