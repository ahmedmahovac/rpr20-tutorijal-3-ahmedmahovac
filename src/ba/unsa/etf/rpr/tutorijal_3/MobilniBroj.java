package ba.unsa.etf.rpr.tutorijal_3;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj implements Comparable<TelefonskiBroj>{
    private final String mobilnaMreza;
    private final String broj;

    MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = "0" + mobilnaMreza;
        this.broj = broj;
    }

    public String ispisi() {
        return mobilnaMreza + "/" + broj;      //toString enuma se automatski poziva ovdje
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobilniBroj that = (MobilniBroj) o;
        return Objects.equals(mobilnaMreza, that.mobilnaMreza) &&
                Objects.equals(broj, that.broj);
    }

    @Override
    public int compareTo(TelefonskiBroj t) {
       return ispisi().compareTo(t.ispisi());
    }

    public String getBroj() {
        return broj;
    }



    @Override
    public int hashCode() {
        return Objects.hash(mobilnaMreza, broj);
    }

}
