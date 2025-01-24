public class Application {

    /**
     * Programme principal.
     * @param args
     */

    public static void main(final String[] args) {
        Car myCar = new Car("Sedan", "Bleu");
        Conducteur mySelf = new Conducteur("John", 20);

        mySelf.demarrerVoiture(myCar);
        myCar.accelerer();
        mySelf.changerVitesse(myCar, 80);
        myCar.ralentir();
        mySelf.changerVitesse(myCar, 30);
        mySelf.arreterVoiture(myCar);
        System.out.println("Fini");
    }
}
