package ba.unsa.etf.rpr.tutorijal_3;

import java.util.Objects;

public class MedunarodniBroj extends TelefonskiBroj implements Comparable<TelefonskiBroj>{
    private final String medunarodniBroj;
    private final String broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.medunarodniBroj = drzava;
        this.broj= broj;
    }

    public String ispisi() {
        return medunarodniBroj + "/" + broj;
    }


    @Override
    public String toString() {
        return ispisi();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedunarodniBroj that = (MedunarodniBroj) o;
        return Objects.equals(medunarodniBroj, that.medunarodniBroj) &&
                Objects.equals(broj, that.broj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medunarodniBroj, broj);
    }

    @Override
    public int compareTo(TelefonskiBroj o) {
      return ispisi().compareTo(o.ispisi());
    }
}
