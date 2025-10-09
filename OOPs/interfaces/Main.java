package OOPs.interfaces;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car();
        // Engine car = new Car();

        // car.a;
        // car.start();
        // car.acc();
        // car.stop();

        // Media carMedia = new Car();
        // carMedia.stop();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();

        NiceCar car2 = new NiceCar(new ElectricEngine());
        car2.start();
        car2.stop();
    }   
}
