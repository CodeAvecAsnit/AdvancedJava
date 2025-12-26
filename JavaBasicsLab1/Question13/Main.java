package JavaBasicsLab1.Question13;


/**
 * @author : Asnit Bakhati
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Teacher teacher = new Teacher();
        SecondTeacher t2 = new SecondTeacher();
        Thread t1 = new Thread(teacher);
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        System.out.println("Before start: " + t1.isAlive());
        t1.start();
        System.out.println("After start: " + t1.isAlive());
        t1.join();
        System.out.println("After completion: " + t1.isAlive());
    }
}
