package domain.user;

import java.io.Serializable;

public abstract class User implements Serializable {

    private String name;


    protected User() {

    }
    protected User(String name) {
        this.name = name;
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
                '}';
    }
}
