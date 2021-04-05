package domain.user;

public interface Blocking {

    void block(User user);
    void unblock(User user);

}
