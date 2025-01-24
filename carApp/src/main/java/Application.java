public class Application {

    /**
     * Programme principal.
     * @param args
     */

    public static void main(final String[] args) {
        Car myCar = new Car("Sedan", "Bleu");
        Conductor mySelf = new Conductor("John", 20);

        mySelf.startCar(myCar);
        myCar.accelerate();
        mySelf.changeSpeed(myCar, 80);
        myCar.slowDown();
        mySelf.changeSpeed(myCar, 30);
        mySelf.stopCar(myCar);
        System.out.println("Fini");
    }
}
