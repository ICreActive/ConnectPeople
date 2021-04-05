package domain.tariff;

import domain.user.Blocking;
import domain.user.User;

import java.io.Serializable;

public class Corp extends Tariff implements Blocking {

    private boolean conferenceCall;


    @Override
    public void block(User user) {

    }

    @Override
    public void unblock(User user) {

    }
}
