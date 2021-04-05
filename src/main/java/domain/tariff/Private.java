package domain.tariff;

public class Private extends Tariff {

    private int internetMb;
    TariffPrivateEnum name;

    public Private (TariffPrivateEnum name, int coast, int tariffId, int internetMb) {
        super(coast, tariffId);
        this.internetMb = internetMb;
        this.name = name;
    }
}
