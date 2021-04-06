package app;

import domain.service.DataBaseService;
import domain.tariff.Corp;
import domain.tariff.Private;
import domain.tariff.Tariff;
import domain.user.Admin;
import domain.user.Entity;
import domain.user.PrivatePerson;
import domain.user.User;

import java.util.LinkedList;

public class App {

    public static void main(String[] args) {

        DataBaseService.Deserialize();

        Admin admin = new Admin("SuperAdmin");

        LinkedList<Tariff> tariffList = new LinkedList();
        Tariff optimal = new Corp("Optimal", 123, true);
        tariffList.add(optimal);
        Tariff call = new Corp("Call", 234, true);
        tariffList.add(call);
        Tariff standard = new Private("Standard", 21, 0);
        tariffList.add(standard);
        Tariff smart = new Private("Smart", 55, 500);
        tariffList.add(smart);


        LinkedList<User> userlist = new LinkedList<>();
        User user1 = new Entity("Nike", 502648971, optimal);
        userlist.add(user1);
        User user2 = new Entity("Mike", 502648976, call);
        userlist.add(user2);
        User user3 = new PrivatePerson("Nike", standard);
        userlist.add(user3);
        User user4 = new PrivatePerson("Mike", smart);
        userlist.add(user4);


        for (User users : userlist
        ) {
            System.out.println(users);
        }

        DataBaseService.Serialize(userlist);

        admin.block(user1);
        admin.unblock(user1);

        DataBaseService.DbSorting(tariffList);

        int userCount = DataBaseService.CountUser(userlist);
        System.out.println("User count = " + userCount);

        DataBaseService.FindTariff(tariffList, 55);
        DataBaseService.DbFilterName(tariffList, "Standard");

    }
}
