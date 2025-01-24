public class Conductor {
    public static final int AGEFORADULT = 18;
    private String name;
    private int age;

    public Conductor(String name, int years) {
        this.name = name;
        this.age = years;
    }

    public boolean estAdulte() {
        return age >= AGEFORADULT;
    }

    public void demarrerVoiture(Car car) {
        if (estAdulte()) {
            System.out.println(name + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void arreterVoiture(Car car) {
        System.out.println(name + " arrête la voiture.");
    }

    public void changerVitesse(Car car, int nouvelleVitesse) {
        System.out.println(name + " change la vitesse de la voiture à " + nouvelleVitesse);
        int vitesseActuelle;
        if (car.getSpeed() >= nouvelleVitesse) {
            while (car.getSpeed() > nouvelleVitesse) {
                car.slowDown();
            }
        } else  {
            while (car.getSpeed() < nouvelleVitesse) {
                car.accelerate();
            }
        }
    }
}
