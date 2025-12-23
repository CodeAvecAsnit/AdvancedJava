package lab1.Question7;

public class GrandChild extends Child{

    private final int num = 69;

    public GrandChild(int var,int childData){
        super(var, childData);
        System.out.println("GrandChild constructor called");
    }

    public void displayNums(){
        System.out.println("GrandChild class number : "+num);
        System.out.println("Child class number : "+super.num);
    }
    public static void main(String[] args) {
        GrandChild gc2 = new GrandChild(6,7);
        gc2.displayNums();
    }
}
