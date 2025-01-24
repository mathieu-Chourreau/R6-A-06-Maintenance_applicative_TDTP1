public class Application {

    /**
     * Programme principal.
     * @param args
     */

    public static void main(final String[] args) {
        Car myCar = new Car("Sedan", "Bleu");
        Conductor mySelf = new Conductor("John", 20);

        mySelf.demarrerVoiture(myCar);
        myCar.accelerate();
        mySelf.changerVitesse(myCar, 80);
        myCar.slowDown();
        mySelf.changerVitesse(myCar, 30);
        mySelf.arreterVoiture(myCar);
        System.out.println("Fini");
    }
}
