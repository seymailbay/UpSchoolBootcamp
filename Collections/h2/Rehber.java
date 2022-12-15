package Collections.Odev2;

import java.util.*;

public class Rehber {

    public static void main(String[] args) {
        HashMap<Kisiler,ArrayList<AdresveTel>> rehber = new HashMap<>();
        Kisiler kisi1=new Kisiler("Baris","Orhan");
        Kisiler kisi2=new Kisiler("Ceyda","Yilmaz");
        Kisiler kisi3=new Kisiler("Arif","Orhan");
        Kisiler kisi4=new Kisiler("Melisa","İlbay");

        AdresveTel kisi1AdresTel1= new AdresveTel("İzmir","5073821920");
        AdresveTel kisi1AdresTel2= new AdresveTel("İstanbul");
        ArrayList<AdresveTel> kisi1adresveTel= new ArrayList<>();
        kisi1adresveTel.add(kisi1AdresTel1);
        kisi1adresveTel.add(kisi1AdresTel2);

        AdresveTel kisi2AdresTel1= new AdresveTel("İstanbul","5022023020");
        AdresveTel kisi2AdresTel2= new AdresveTel("Mardin","5082930390");
        ArrayList<AdresveTel> kisi2adresveTel= new ArrayList<>();
        kisi2adresveTel.add(kisi2AdresTel1);
        kisi2adresveTel.add(kisi2AdresTel2);

        AdresveTel kisi3AdresTel1= new AdresveTel("İzmir","5032930934");
        ArrayList<AdresveTel> kisi3adresveTel= new ArrayList<>();
        kisi3adresveTel.add(kisi3AdresTel1);

        AdresveTel kisi4AdresTel1= new AdresveTel("Ankara","5230438986");
        ArrayList<AdresveTel> kisi4adresveTel= new ArrayList<>();
        kisi4adresveTel.add(kisi4AdresTel1);

        rehber.put(kisi1,kisi1adresveTel);
        rehber.put(kisi2,kisi2adresveTel);
        rehber.put(kisi3,kisi3adresveTel);
        rehber.put(kisi4,kisi4adresveTel);


        System.out.println("Siralamadan önce...");
        for (HashMap.Entry<Kisiler, ArrayList<AdresveTel>> entry : rehber.entrySet()) {
            System.out.println(entry.getKey() + ", Adres ve Telefon : " + entry.getValue());
        }



        List<Kisiler> sortedKeys = new ArrayList<Kisiler>(rehber.keySet());

        System.out.println();
        System.out.println("Sadece isim siralaması: ");
        Collections.sort(sortedKeys,new İsimComparator());
        System.out.println(sortedKeys);
        System.out.println();

        System.out.println("Siralamadan sonra...");
        TreeMap<Kisiler, ArrayList<AdresveTel>> sorted = new TreeMap<>(rehber);

        for (Map.Entry<Kisiler, ArrayList<AdresveTel>> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + ", Adres ve Telefon : " + entry.getValue());
        }

        KisiBulmaServisi f=new KisiBulmaServisi();
        f.Search("İzmir",sorted);

    }
}
