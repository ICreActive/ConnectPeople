package domain.service;

import domain.tariff.Tariff;
import domain.tariff.TariffCorpEnum;
import domain.user.User;
import java.util.Comparator;
import java.util.LinkedList;



public class DataBaseService extends Exception{

    private final String FILE = "_____";


    public static void DbSorting(LinkedList<Tariff> list) {
        list.sort(Comparator.comparing(Tariff::getCoast));
    }

    public static void DbFilterName(LinkedList<Tariff> list, TariffCorpEnum name) {
    }

    public static int CountUser (LinkedList <User> list) {
        int count = 0;
        for (User user: list
             ) { count++;

        }
        return count;
    }

    public static void FindTariff (LinkedList<Tariff> list, TariffCorpEnum name, int coast) {
    }

    public static void Serialize (LinkedList list){
        System.out.println("Save successfully");
    }

    public static Object Deserialize () {
        return new LinkedList();
    }



}



