package domain.user;

import domain.service.Blocking;

public class Admin implements Blocking {

    @Override
    public void block(User user) {
        System.out.println("User "+ user.getName() + " blocked by administrator!");

    }

    @Override
    public void unblock(User user) {
        System.out.println("User "+ user.getName() + " Unblocked");
    }
}
