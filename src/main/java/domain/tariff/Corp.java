package domain.tariff;

public class Corp extends Tariff {

    private boolean conferenceCall;
    private TariffCorpEnum name;

    public Corp (TariffCorpEnum name, int coast, int tariffId, boolean conferenceCall) {
        super(coast, tariffId);
        this.conferenceCall = conferenceCall;
    }
}
