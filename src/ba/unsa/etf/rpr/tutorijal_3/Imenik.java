package ba.unsa.etf.rpr.tutorijal_3;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {
  private HashMap<TelefonskiBroj, String> brojevi;

    public Imenik() {
       brojevi = new HashMap<>();
    }

    void dodaj(String ime, TelefonskiBroj broj) {
        brojevi.put(broj, ime);

    }

  public String dajBroj(String ime) {
      for(TelefonskiBroj t : brojevi.keySet()) if(brojevi.get(t).equals(ime)) return t.ispisi();
      return null;
  }

    public String dajIme(TelefonskiBroj broj) {
        for(TelefonskiBroj t : brojevi.keySet())  if(t.equals(broj)) return brojevi.get(t);
        return null;
    }



  public  Set<String> izGrada(FiksniBroj.Grad g) {
   TreeSet<String> sortiranaImena = new TreeSet<>();
   for(TelefonskiBroj t : brojevi.keySet()) if(t instanceof FiksniBroj && ((FiksniBroj)t).getGrad().equals(g)) sortiranaImena.add(brojevi.get(t));
    return sortiranaImena;
    }
    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g)
    {
        TreeSet<TelefonskiBroj> imena = new TreeSet<>();
        for(TelefonskiBroj t : brojevi.keySet()) if(t instanceof FiksniBroj && ((FiksniBroj)t).getGrad().equals(g)) imena.add(t);
     return imena;
    }


    public String naSlovo(char c) {
        String result = "";
        int i = 1;
        for(TelefonskiBroj key : brojevi.keySet()) {
            if(brojevi.get(key).charAt(0) == c) result+= i++  + ". " + (brojevi.get(key).toString() + " - " + key + "\n");
        }
        return result;
    }
}














