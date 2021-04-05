package domain.user;

public class Entity extends User implements Blocking {

    private int VatID;

    public Entity(String name, int VatID) {
        super.setName(name);
        this.VatID=VatID;
    }

    public int getVatID() {
        return VatID;
    }

    public void setVatID(int vatID) {
        VatID = vatID;
    }


    @Override
    public void block(User user) {

    }

    @Override
    public void unblock(User user) {

    }

    @Override
    public String toString() {
        return "Entity: " + getName() + " with " +
                "VatID = " + getVatID();
    }
}
