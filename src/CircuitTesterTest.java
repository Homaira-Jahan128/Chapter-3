import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class CircuitTesterTest {
    CircuitTester initial;

    @BeforeEach
    void setup(){
        initial = new CircuitTester();
    }

    @Test
    void getSwitch0(){
        assertEquals(0,initial.getLampState());
    }


    @Test
    void getSwitch1(){
        initial.toggleFirstSwitch();
        assertEquals(1,initial.getLampState());
    }

    @Test
    void getSwitch2(){
        initial.toggleSecondSwitch();
        assertEquals(1,initial.getLampState());
    }

    @Test
    void getSwitch3(){
        initial.toggleFirstSwitch();
        initial.toggleSecondSwitch();
        assertEquals(0,initial.getLampState());
    }

    @Test
    void getFirstSwitchState() {
    }

    @Test
    void getSecondSwitchState() {
    }

    @Test
    void getLampState() {
    }

    @Test
    void toggleFirstSwitch() {
    }

    @Test
    void toggleSecondSwitch() {
    }

    @Test
    void toggleLampSwitch() {
    }
}