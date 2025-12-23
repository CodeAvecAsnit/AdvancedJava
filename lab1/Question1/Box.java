package lab1.Question1;

/**
 * @author : Asnit Bakhati
 * Question number 1
 *
 */
public class Box {
    int height,length,breadth;

    Box(int h,int l,int b){
        this.height = h;
        this.length = l;
        this.breadth=b;
    }

    void printData(){
        System.out.printf("Length : %d, Breadth : %d, Height %d%n",length,breadth,height);
    }
    void printVolume(){
        System.out.println("Volume : "+(height*length*breadth));
    }

    public static void main(String[] args) {
        Box b1 = new Box(10,15,8);
        Box b2 = new Box(12,12,5);
        b1.printData();
        b1.printVolume();

        b2.printData();
        b2.printVolume();
    }

}
