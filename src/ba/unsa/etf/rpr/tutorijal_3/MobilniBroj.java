package ba.unsa.etf.rpr.tutorijal_3;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj{
    private String mobilnaMreza;
    private String broj;
    MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
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
    public int hashCode() {
        return Objects.hash(mobilnaMreza, broj);
    }
}
