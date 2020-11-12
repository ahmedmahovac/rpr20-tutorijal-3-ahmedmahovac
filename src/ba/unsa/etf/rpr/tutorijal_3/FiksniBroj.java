package ba.unsa.etf.rpr.tutorijal_3;

public class FiksniBroj extends TelefonskiBroj{
    private Grad grad;
    private String broj;
    FiksniBroj(Grad grad, String broj) {
  this.grad = grad;
  this.broj = broj;
    }
    public String ispisi() {
   return grad.toString() + "/" + broj;
    }
}
