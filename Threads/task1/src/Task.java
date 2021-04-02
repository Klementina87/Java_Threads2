public class Task {
  public static void main(String[] args){
      Car c1 = new Car("Kona",250);
      Car c2 = new Car("Ioniq",220);

      Runnable racer1 = new Racer(c1);
           /* TODO
Create a racer with c1 */
      Racer racer2 = new Racer(c2); /* TODO
Create a Racer with c2*/
      /* TODO:
Create two threads using "new Thread" and pass  one Runnable 
to each thread.  It is your job to figure out which are the Runnables.*/


  new Thread( racer1).start();
  new Thread(racer2).start();

  }
}