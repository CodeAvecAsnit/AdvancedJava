package JavaBasicsLab1.Question9;

public class Main {
    public static void main(String[] args) {
        StaticNested.Node n1 = new StaticNested.Node();
        n1.incrementDisplay();
        n1.incrementDisplay();

        System.out.println();
        NonStaticNested nsTed = new NonStaticNested();
        NonStaticNested.Inner in = nsTed.new Inner();
        in.display();
        in.display();
        in.display();
        in.whatsNew("Question number 9 ");
    }
}
