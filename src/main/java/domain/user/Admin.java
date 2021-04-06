package domain.user;

import domain.service.Blocking;

public class Admin extends User implements Blocking {


    public Admin(String name) {
        super(name);
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void block(User user) {
        System.out.println("User " + user.getName() + " blocked by administrator!");
    }

    @Override
    public void unblock(User user) {
        System.out.println("User " + user.getName() + " Unblocked");
    }


}


