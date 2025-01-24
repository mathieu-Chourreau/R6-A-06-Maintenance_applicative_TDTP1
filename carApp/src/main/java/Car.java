public class Car {
    public static final int maxSpeed = 120;
    private String model;
    private String color;
    private int speed;

    /**
     * Class voiture
     * @param model
     * @param color
     */

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void accelerer() {
        if (speed + 10 <= maxSpeed) {
            speed += 10;
            // afficher détails
            System.out.println("Modèle : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + speed);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void ralentir() {
        if (speed - 10 >= 0) {
            speed -= 10;
            // afficher détails
            System.out.println("Modèle : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + speed);
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

