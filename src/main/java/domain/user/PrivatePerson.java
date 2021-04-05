package domain.user;

import java.io.Serializable;

public class PrivatePerson extends User implements Serializable {

    public PrivatePerson(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return "PrivatePerson: " + getName() ;
    }
}
