package Collections.Odev2;

public class Kisiler implements Comparable<Kisiler> {

    private String isim;
    private String soyisim;

    public Kisiler(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    @Override
    public String toString() {
        return isim+ " "+ soyisim ;
    }

    @Override
    public int compareTo(Kisiler o) {
        return this.isim.compareTo(o.isim);
    }


}
