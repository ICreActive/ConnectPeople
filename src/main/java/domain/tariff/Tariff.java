package domain.tariff;

public abstract class Tariff {

    private String name;
    private int coast;

    public Tariff(String name, int coast) {
        this.name = name;
        this.coast = coast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    @Override
    public String toString() {
        return "Tariff: " +
                "name='" + getName() + '\'' +
                ", coast=" + getCoast();
    }
}
