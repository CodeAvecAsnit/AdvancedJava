package JavaBasicsLab1.Question10;
import JavaBasicsLab1.Question2.Money;


/**
 * @author : Asnit Bakhati
 */
public class Import {
    private final Money money;
    public Import(){
        this.money = new Money();
    }

    void setMoney(int rupee,int paisa){
        money.setMoney(rupee,paisa);
        money.displayMoney();
    }

    public static void main(String[] args) {
        Import importer = new Import();
        importer.setMoney(23,78);
    }
}
