package ba.unsa.etf.rpr.tutorijal_3;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

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
        return null;
    }

  public  Set<String> izGrada(Grad g) {
   TreeSet<String> sortiranaImena = new TreeSet<>();
   for(String br : brojevi.keySet()) if(g.getGrad().equals(br.substring(0,3)))  sortiranaImena.add(brojevi.get(br));
    return sortiranaImena;
    }

}
