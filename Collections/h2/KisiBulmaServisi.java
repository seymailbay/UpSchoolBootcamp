package Collections.Odev2;

import java.util.*;

public class KisiBulmaServisi extends Rehber {
    public void Search(String adresTel,TreeMap sorted){
        Set entries  = sorted.entrySet();
        Iterator it = entries.iterator();
        ArrayList<String> list = new ArrayList<>();

        while (it.hasNext()){
            Object o= it.next();
            String s= o.toString();
            list.add(s);
        }

        System.out.println();
        System.out.println("Bilgilerinin içerisinde "+ adresTel+" olanlar...");
        for (String j:list
             ) {
            if(j.contains(adresTel)){
                System.out.println(j);
            }
        }
    }
}
