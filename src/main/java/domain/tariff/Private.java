package domain.tariff;

public class Private extends Tariff {

    public Private(String name, int coast, int internetMb) {
        super(name, coast);
        InternetMb = internetMb;
    }

    private int InternetMb;

    public int getInternetMb() {
        return InternetMb;
    }

    public void setInternetMb(int internetMb) {
        InternetMb = internetMb;
    }

    @Override
    public String toString() {
        return "Private tariff: " + getName() + ", " +
                " Coast in month " + getCoast() + ", " +
                " Mb for internet = " + getInternetMb();
    }

}

