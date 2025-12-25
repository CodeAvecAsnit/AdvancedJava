package JavaBasicsLab1.Question13;

public class Table extends Thread{
    synchronized void printTable(int num,Sum sum){
        for(int i = 1 ; i <= 10 ; ++i){
            int mul = num*i;
            System.out.println(num +" * "+i +" = "+mul);
            sum.add(mul);
        }
    }

    void printTableBlock(int n,Sum sum){
        synchronized (this){
            for(int i = 1 ; i < 10 ; ++i){
                System.out.println(n+" * "+i +" = "+n*i);
                sum.add(n*i);
                try{Thread.sleep(100);} catch (Exception e) {};
                }
            }
        }

    public static void main(String[] args) throws InterruptedException {
        Table t = new Table();
        Sum sum = new Sum();
        Thread t1 = new ThreadUne(t, 6, sum);
        Thread t2 = new ThreadUne(t, 9, sum);
        Thread t3 = new ThreadUne(t, 2, sum);

        t1.start();
        t2.start();
        t3.start();


        t1.join();
        t2.join();
        t3.join();
        sum.print();
    }
}
class ThreadUne extends Thread{
    Table t;
    int number;
    Sum sum;

    public ThreadUne(Table t,int n,Sum sum){
        this.t=t;
        this.number=n;
        this.sum=sum;
    }

    public void run(){
        t.printTable(number,sum);
        t.printTableBlock(number+5,sum);
    }
}

class Sum{
    private int x;

    Sum(){
        this.x=0;
    }

    public void add(int num){
        x+=num;
    }

    public void print(){
        System.out.println(x);
    }
}
