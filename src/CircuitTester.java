public class CircuitTester {
    private int FirstSwitchState, SecondSwitchState, LampState;

    public CircuitTester(){
        FirstSwitchState = 0;
        SecondSwitchState = 0;
        LampState = 0;
    }

    public CircuitTester(int firstSwitchState, int secondSwitchState) {
        FirstSwitchState = firstSwitchState;
        SecondSwitchState = secondSwitchState;
    }

    public int getFirstSwitchState() {
        return FirstSwitchState;
    }

    public int getSecondSwitchState() {
        return SecondSwitchState;
    }

    public int getLampState() {
        return LampState;
    }

    public void toggleFirstSwitch(){
        FirstSwitchState = ( FirstSwitchState == 0 ) ? 1 : 0;
        toggleLampSwitch();
    }

    public void toggleSecondSwitch(){
        SecondSwitchState = ( SecondSwitchState == 0 ) ? 1 : 0;
        toggleLampSwitch();
    }

    public void toggleLampSwitch(){
        if( FirstSwitchState == 1 || SecondSwitchState == 1 )
            LampState = ( LampState == 0 ) ? 1 : 0;
    }
}
