package domain.tariff;

import java.util.Objects;

public abstract class Tariff {

    private int coast;
    private int tariffId;

    public Tariff(int coast, int tariffId) {
        this.coast = coast;
        this.tariffId = tariffId;
    }


    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    public int getTariffId() {
        return tariffId;
    }

    public void setTariffId(int tariffId) {
        this.tariffId = tariffId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tariff tariff = (Tariff) o;
        return coast == tariff.coast && tariffId == tariff.tariffId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coast, tariffId);
    }

    @Override
    public String toString() {
        return "Tariff{" +
                ", coast=" + coast +
                ", tariffId=" + tariffId +
                '}';
    }
}
