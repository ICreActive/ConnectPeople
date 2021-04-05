
import domain.service.DbService;
import domain.user.*;

import java.util.LinkedList;



public class MainPage {

    public static void main(String[] args) {

        DbService.Deserialize();

        Admin admin = new Admin();

        LinkedList <User> userlist = new LinkedList<>();
        User user = new Entity("Nike", 502648971);
        userlist.add(user);
        User user1 = new Entity("Nike", 502648971);
        userlist.add(user1);
        User user2 = new Entity("Nike", 502648971);
        userlist.add(user2);
        User user3 = new Entity("Nike", 502648971);
        userlist.add(user3);

        User user4 = new PrivatePerson("Nike");
        userlist.add(user4);

        for (User users :userlist
             ) {
            System.out.println(users);
        }

        DbService.Serialize(userlist);

        admin.block(user1);
        admin.unblock(user1);

    }
}
