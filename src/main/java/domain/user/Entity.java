package domain.user;

import domain.tariff.Tariff;

public class Entity extends User {

    private int VatID;
    private Tariff tariff;

    public Entity(String name, int VatID, Tariff tariff) {
        super.setName(name);
        this.tariff = tariff;
        this.VatID = VatID;
    }

    public int getVatID() {
        return VatID;
    }

    public void setVatID(int vatID) {
        VatID = vatID;
    }

    @Override
    public String toString() {
        return "Entity: " + getName() + " with " +
                "VatID = " + getVatID() + ", Tariff - " + tariff.getName();
    }
}
