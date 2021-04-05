package domain.user;

import domain.service.Blocking;
import domain.tariff.TariffCorpEnum;

public class Entity extends User {

    private int VatID;

    public Entity(String name, int VatID, TariffCorpEnum tariff) {
        super.setName(name);
        this.setTariff(tariff);
        this.VatID=VatID;
    }

    public TariffCorpEnum getTariff() {
        return tariff;
    }

    public void setTariff(TariffCorpEnum tariff) {
        this.tariff = tariff;
    }

    private TariffCorpEnum tariff;

    public int getVatID() {
        return VatID;
    }

    public void setVatID(int vatID) {
        VatID = vatID;
    }


    @Override
    public String toString() {
        return "Entity: " + getName() + " with " +
                "VatID = " + getVatID() + ", Tariff = " + getTariff();
    }
}
