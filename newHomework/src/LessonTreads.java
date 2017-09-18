import java.io.IOException;

public class LessonTreads extends Thread{


    public void run() {
        Thread thread1 = new Thread();
        ConsoleReader consoleReader = new ConsoleReader();
        Thread thread = new Thread();

        try {
            System.out.println("Hi, " + consoleReader.reads());
            if (thread.isAlive()) {
                thread.join();
            }

        } catch (IOException e) {
            System.out.println("Damns");
        } catch (InterruptedException e) {
            System.out.println("Damns2");
        }

    }

}