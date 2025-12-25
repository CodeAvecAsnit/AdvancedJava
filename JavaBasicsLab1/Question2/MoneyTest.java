package JavaBasicsLab1.Question2;

/**
 * @author : Asnit Bakhati
 * Question number 2
 */
public class MoneyTest {
    public static void main(String[] args) {
        Money money = new Money();
        money.setMoney(13,50);
        money.displayMoney();
        money.addMoney(12,50);
        money.displayMoney();
    }
}
