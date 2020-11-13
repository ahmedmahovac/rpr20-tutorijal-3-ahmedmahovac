package ba.unsa.etf.rpr.tutorijal_3;

import java.util.Objects;

public class MedunarodniBroj extends TelefonskiBroj implements Comparable<TelefonskiBroj>{
    private String medunarodniBroj;
    private FiksniBroj.Grad grad;

    public MedunarodniBroj(String medunarodniBroj, FiksniBroj.Grad grad) {
        this.medunarodniBroj = medunarodniBroj;
        this.grad = grad;
    }

    public String ispisi() {
        return grad.toString() + "/" + medunarodniBroj;
    }

    @Override
    public FiksniBroj.Grad getGrad() {
        return grad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedunarodniBroj that = (MedunarodniBroj) o;
        return Objects.equals(medunarodniBroj, that.medunarodniBroj) &&
                grad == that.grad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(medunarodniBroj, grad);
    }
}
