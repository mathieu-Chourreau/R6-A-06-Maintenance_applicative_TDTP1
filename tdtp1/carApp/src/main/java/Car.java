public class Car {

    /**
     * @param MAXSPEED - The maximum speed the car can reach.
     */
    public static final int MAXSPEED = 120;

    /**
     * @param STEEPSPEED - The speed reduction when the car slows down.
     */
    public static final int STEEPSPEED = 10;

    /**
     * @param warningMessageMaxSpeed - Warning message for maximum speed.
     */

    public static final String WARNINGMESSAGEMAXSPEED = "Maximum speed has been reached.";

    /**
     * @param warningMessageCarAlreadyStop - Warning message.
     */
    public static final String WARNINGMESSAGECARALREADYSTOP = "The car has already stopped.";

    /**
     * @param model - The model of the car.
     */
    private final String model;

    /**
     * @param color - The color of the car.
     */
    private final String color;

    /**
     * @param speed - The current speed of the car.
     */
    private int speed;


    /**
     * Class voiture.
     * @param model - Car model
     * @param color - Car color
     */

    public Car(final String model, final String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void accelerate() {
        if (speed + STEEPSPEED <= MAXSPEED) {
            speed += STEEPSPEED;
            // afficher détails
            System.out.println("Modèle : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + speed);
        } else {
            System.out.println(WARNINGMESSAGEMAXSPEED);
        }
    }

    public void slowDown() {
        if (speed - STEEPSPEED >= 0) {
            speed -= STEEPSPEED;
            // afficher détails
            System.out.println("Modèle : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + speed);
        } else {
            System.out.println(WARNINGMESSAGECARALREADYSTOP);
        }
    }
}

