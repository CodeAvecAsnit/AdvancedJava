package JavaBasicsLab1.Question7;

public class Child extends Parent{
    public final int num = 67;
    private int childData;

    public Child(int var,int childData) {
        super(var);
        this.childData=childData;
        System.out.println("Child constructor called");
    }

    public void displayNums(){
        System.out.println(num);
        System.out.println(super.num);
    }
}
