import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ConductorTest {

    private Conductor conductor;

    @BeforeEach
    public void setUp() {
        conductor = new Conductor("John", 20);
    }

    @Test
    public void testEstAdulte() {
        assertThat(conductor.estAdulte()).isTrue();
    }

    @Test
    public void testDemarrerVoiture() {
        Car car = new Car("Sedan", "Bleu");
        conductor.demarrerVoiture(car);
        // How to assert that the demarrerVoiture method was called?
    }

    @Test
    public void testArreterVoiture() {
        Car car = new Car("Sedan", "Bleu");
        conductor.arreterVoiture(car);
        // How to assert that the arreterVoiture method was called?
    }

    @Test
    public void testChangerVitesse() {
        Car car = new Car("Sedan", "Bleu");

        conductor.changerVitesse(car, 80);
        assertThat(car.getSpeed()).isEqualTo(80);
    }
}
