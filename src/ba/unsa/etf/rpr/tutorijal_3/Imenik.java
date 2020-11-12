package ba.unsa.etf.rpr.tutorijal_3;

import java.util.HashMap;
import java.util.Set;

public class Imenik {
  private HashMap<String, TelefonskiBroj> brojevi;


    void dodaj(String ime, TelefonskiBroj broj) {
        brojevi.put(ime, broj);
    }
  public  String dajBroj(String ime) {
      return brojevi.get(ime).ispisi();
  }

    public String dajIme(TelefonskiBroj broj) {
        for(String tmp : brojevi.keySet())  if(brojevi.get(tmp).equals(broj)) return tmp;
    }

  public  Set<String> izGrada(Grad g) {

    }

}
