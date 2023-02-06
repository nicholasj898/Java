

public class Control {
	 
    public static void main(String[] args) {
           // TODO Auto-generated method stub
           
           boolean inStack = false;
           Stack<Integer> aS = new ArrayStack<>();
           Queue<Integer> aQ = new ArrayQueue<>();

           aS.push(1);
           aS.push(2);
           aS.push(3);
           
           while(!aS.isEmpty()) {
                  if (aS.top() == 4) inStack=true;
               //System.out.println(aS.top());
               aQ.enqueue( aS.pop());

                  /* if (aQ.equals(obj)) */
           }  
           
           //System.out.println(aS);
           //System.out.println(aQ);
           
           while(!aQ.isEmpty()) {
                  aS.push(aQ.dequeue());
           }
           
           //System.out.println(inStack);
           //System.out.println(aS);
           //System.out.println(aQ);
           
    }
    
}
