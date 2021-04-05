package domain.user;

import domain.tariff.TariffCorpEnum;
import domain.tariff.TariffPrivateEnum;

import java.io.Serializable;

public class PrivatePerson extends User implements Serializable {

    public PrivatePerson(String name, TariffPrivateEnum tariff) {
        super.setName(name);
        this.setTariff(tariff);
    }

    public TariffPrivateEnum getTariff() {
        return tariff;
    }

    public void setTariff(TariffPrivateEnum tariff) {
        this.tariff = tariff;
    }

    private TariffPrivateEnum tariff;


    @Override
    public String toString() {
        return "PrivatePerson: " + getName() +
                ", tariff = " + tariff
                ;
    }
}
