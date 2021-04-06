package domain.service;

import domain.user.User;

public interface Blocking {

    void block(User user);

    void unblock(User user);

}
