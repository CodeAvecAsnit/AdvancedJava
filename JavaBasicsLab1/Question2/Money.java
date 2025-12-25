package JavaBasicsLab1.Question2;

/**
 * @author : Asnit Bakhati
 * Question number 2
 */
public class Money {
    int rupee;
    int paisa;

    public void setMoney(int rupee, int paisa){
        this.rupee=rupee;
        this.paisa=paisa;
    }

    public void displayMoney(){
        System.out.printf("Amount available : %d.%d", rupee, paisa);
        System.out.println();
    }

    public void addMoney(int addRupee,int addPaisa){
        System.out.printf("Added Amount : %d.%d",addRupee,addPaisa);
        System.out.println();
        rupee+=addRupee;
        paisa+=addPaisa;
        if(paisa>=100){
            paisa%=100;
            rupee++;
        }
    }
}
