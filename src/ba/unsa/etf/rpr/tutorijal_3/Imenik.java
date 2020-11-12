package ba.unsa.etf.rpr.tutorijal_3;

import java.util.HashMap;

public class Imenik {
  private HashMap<String, TelefonskiBroj> brojevi;


  public  String dajBroj(String ime) {
      return brojevi.get(ime).ispisi();
  }

}
