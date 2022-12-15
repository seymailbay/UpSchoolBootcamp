package Collections.Odev2;

public class AdresveTel {
    private String adres;
    private String telefon;

    public AdresveTel(String adres, String telefon) {
        this.adres = adres;
        this.telefon = telefon;
    }
    public AdresveTel(String adres) {
        this.adres = adres;
    }


    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' ;
    }
}
