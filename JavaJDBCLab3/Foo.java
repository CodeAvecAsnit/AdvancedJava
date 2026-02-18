package JavaJDBCLab3;

import java.util.concurrent.Semaphore;

public class Foo {

    private Semaphore first;
    private Semaphore second;
    private Semaphore thrid;


    public Foo() {
        this.first= new Semaphore(1);
        this.second = new Semaphore(0);
        this.thrid = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        first.acquire();

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        second.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        second.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        thrid.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        thrid.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        first.release();
    }
}