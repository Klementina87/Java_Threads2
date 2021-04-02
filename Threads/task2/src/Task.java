import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task {
    static ExecutorService service;
    /* TODO
Declare a static ExecutorService named service */
    public static void main(String[] args){
        Car c1 = new Car("Kona",250);
        Car c2 = new Car("Ioniq",220);

        Runnable racer1 = new Racer(c1); /* TODO
Create a Runnable with c1*/
        Runnable racer2 = new Racer(c2); /* TODO
Create a Runnable with c2*/;

        initExecutorService();

        service.submit(racer1);
        service.submit(racer2);
        service.shutdown();

        /* TODO
Submit both runnables to the ExecutorService and then request the ExecutorService to shutdown */
  }

  public static void initExecutorService() {
        service = Executors.newFixedThreadPool(3);
  }
  /* TODO
Implement the initExecutorService method. This has to initialize service to a new FixedThreadPool with a minimum of 3 threads */
}