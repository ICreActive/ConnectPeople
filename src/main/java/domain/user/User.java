package domain.user;


import domain.tariff.Tariff;

import java.io.Serializable;

public abstract class User implements Serializable {

    private String name;
    private Tariff tariff;

    protected User() {

    }

    protected User(String name) {
        this.name = name;
    }

    protected User(String name, Tariff tariff) {
        this.name = name;
        this.tariff = tariff;
    }


    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", tariff= " + getTariff() +
                '}';
    }
}
