package domain.tariff;

public class Corp extends Tariff {

    private boolean conferenceCall;

    public Corp(String name, int coast, boolean conferenceCall) {
        super(name, coast);
        this.conferenceCall = conferenceCall;
    }

    public boolean isConferenceCall() {
        return conferenceCall;
    }

    public void setConferenceCall(boolean conferenceCall) {
        this.conferenceCall = conferenceCall;
    }

    @Override
    public String toString() {
        return "Corp tariff: " + getName() +
                ", Coast in month" + getCoast() +
                ", conferenceCall = " + isConferenceCall();
    }
}

