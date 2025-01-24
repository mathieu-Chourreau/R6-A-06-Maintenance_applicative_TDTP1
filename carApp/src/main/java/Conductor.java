public class Conductor {


    public static final int AGEFORADULT = 18;
    private String name;
    private int age;

    /**
     * Class conductor.
     * @param name - conductor name
     * @param years - Conductor years
     */

    public Conductor(final String name, final int years) {
        this.name = name;
        this.age = years;
    }

    public boolean isAdult() {
        return age >= AGEFORADULT;
    }

    public void startCar(final Car car) {
        if (isAdult()) {
            System.out.println(name + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void stopCar(final Car car) {
        System.out.println(name + " arrête la voiture.");
    }

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
