
import domain.service.DataBaseService;
import domain.tariff.*;
import domain.user.*;

import java.util.LinkedList;



public class MainPage {

    public static void main(String[] args) {

        DataBaseService.Deserialize();

        Admin admin = new Admin();

        LinkedList <User> userlist = new LinkedList<>();
        User user = new Entity("Nike", 502648971, TariffCorpEnum.OPTIMAL);
        userlist.add(user);
        User user1 = new Entity("Mike", 502648976, TariffCorpEnum.EXTRA);
        userlist.add(user1);
        User user2 = new Entity("Nike", 502648972, TariffCorpEnum.EXTRA);
        userlist.add(user2);
        User user3 = new Entity("Mike", 502648978, TariffCorpEnum.STANDARD);
        userlist.add(user3);

        User user4 = new PrivatePerson("Nike", TariffPrivateEnum.UNLIM);
        userlist.add(user4);

        for (User users :userlist
             ) {
            System.out.println(users);
        }

        DataBaseService.Serialize(userlist);

        admin.block(user1);
        admin.unblock(user1);

        LinkedList <Tariff> tariffList = new LinkedList();

        Tariff tariff = new Corp(TariffCorpEnum.OPTIMAL, 123, 1555, true);
        tariffList.add(tariff);
        Tariff tariff1 = new Corp(TariffCorpEnum.EXTRA, 234, 1555, true);
        tariffList.add(tariff1);
        Tariff tariff2 = new Private(TariffPrivateEnum.UNLIM, 21, 1555, 500);
        tariffList.add(tariff2);
        Tariff tariff3 = new Corp(TariffCorpEnum.OPTIMAL, 55, 1555, true);
        tariffList.add(tariff3);

        DataBaseService.DbSorting(tariffList);
        DataBaseService.DbFilterName(tariffList, TariffCorpEnum.OPTIMAL);

        int userCount = DataBaseService.CountUser(userlist);
        System.out.println("User count = " + userCount);

    }
}
