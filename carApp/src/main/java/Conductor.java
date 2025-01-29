public class Conductor {

    /**
     * @param AGEDORADULT - The age for an adult
     */
    public static final int AGEFORADULT = 18;

    /**
     * @param name - The name
     */
    private final String name;

    /**
     * @param age - The age
     */
    private final int age;

    /**
     * Class conductor.
     * @param name - conductor name
     * @param years - Conductor years
     */

    public Conductor(final String name, final int years) {
        this.name = name;
        this.age = years;
    }

    /**
     *
     * @return boolean - idAdult
     */

    public boolean isAdult() {
        return age >= AGEFORADULT;
    }

    /**
     *
     * @param car - startCar
     */

    public void startCar(final Car car) {
        if (isAdult()) {
            System.out.println(name + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    /**
     *
     * @param car - stopCar
     */

    public void stopCar(final Car car) {
        System.out.println(name + " arrête la voiture.");
    }


    /**
     *
     * @param car - changeSpeed
     * @param newSpeed -changeSpeed
     */
    public void changeSpeed(final Car car, final int newSpeed) {
        System.out.println(name + " change la vitesse de la voiture à " + newSpeed);
        int currentspeed;
        if (car.getSpeed() >= newSpeed) {
            while (car.getSpeed() > newSpeed) {
                car.slowDown();
            }
        } else  {
            while (car.getSpeed() < newSpeed) {
                car.accelerate();
            }
        }
    }
}
