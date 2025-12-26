package JavaBasicsLab1.Question8;


/**
 * @author : Asnit Bakhati
 */
public class Car extends Vehicle implements Electric{

    public void setCarName(String name){this.vehicleModel=name;}
    @Override
    public void drive() {
        System.out.println(this.vehicleModel+" is being driven which is a car");
    }

    @Override
    public void charge() {
        System.out.println(this.vehicleModel+" is Charging");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setCarName("Tesla");
        car.charge();
        car.drive();
    }
}
