package domain.user;

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
