package domain.user;

import domain.tariff.Tariff;

import java.io.Serializable;

public class PrivatePerson extends User implements Serializable {

    private Tariff tariff;

    public PrivatePerson(String name, Tariff tariff) {
        super.setName(name);
        this.tariff = tariff;

    }

    @Override
    public String toString() {
        return "PrivatePerson: " + getName() +
                ", tariff - " + tariff.getName()
                ;
    }
}
