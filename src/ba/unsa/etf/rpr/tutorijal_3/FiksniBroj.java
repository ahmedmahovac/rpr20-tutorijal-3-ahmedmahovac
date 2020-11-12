package ba.unsa.etf.rpr.tutorijal_3;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj{
    private Grad grad;
    private String broj;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FiksniBroj that = (FiksniBroj) o;
        return grad == that.grad &&
                Objects.equals(broj, that.broj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grad, broj);
    }

    FiksniBroj(Grad grad, String broj) {
  this.grad = grad;
  this.broj = broj;
    }
    public String ispisi() {
   return grad.toString() + "/" + broj; // toString enuma se ovdje automatski poziva
    }
}
