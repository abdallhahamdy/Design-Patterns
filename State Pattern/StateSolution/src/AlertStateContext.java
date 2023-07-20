public class AlertStateContext {
    private MobileAlertState currentState;

    public AlertStateContext() {
        this.currentState = new Vibration();    // default state
    }

    public void setCurrentState(MobileAlertState state) {
        this.currentState = state;
    }

    public void alert(){
        currentState.alert();
    }
}


