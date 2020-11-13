package ba.unsa.etf.rpr.tutorijal_3;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {
  private HashMap<TelefonskiBroj, String> brojevi;


    void dodaj(String ime, TelefonskiBroj broj) {
        brojevi.put(broj, ime);
    }
  public String dajBroj(String ime) {
      for(TelefonskiBroj t : brojevi.keySet()) if(brojevi.get(t).equals(ime)) return t.ispisi();
      return null;
  }

    public String dajIme(TelefonskiBroj broj) {
        for(TelefonskiBroj t : brojevi.keySet())  if(brojevi.get(t).equals(broj)) return brojevi.get(t);
        return null;
    }

  public  Set<String> izGrada(FiksniBroj.Grad g) {
   TreeSet<String> sortiranaImena = new TreeSet<>();
   for(TelefonskiBroj t : brojevi.keySet()) if(t instanceof FiksniBroj) ((FiksniBroj)t).getGrad().equals(g))  sortiranaImena.add(br);
    return sortiranaImena;
    }
    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g)
    {
        TreeSet<TelefonskiBroj> imena = new TreeSet<>();
        for(TelefonskiBroj t : brojevi.keySet())  if(t.getGrad()) imena.add(brojevi.get(br));
     return imena;
    }


    public String naSlovo(char c) {
        String result = "";
        for(String key : brojevi.keySet()) if(brojevi.get(key).charAt(0) == c) result+=(brojevi.get(key) + "-" + key + "\n");
    }
}














