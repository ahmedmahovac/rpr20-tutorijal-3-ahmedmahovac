package ba.unsa.etf.rpr.tutorijal_3;

public enum Grad {
    SARAJEVO ("033"),
    TUZLA("035"),
    ZENICA("032"),
    BRCKO("049"),
    BIHAC("037"),
    ORASJE("031"),
    GORAZDE("038"),
    LIVNO("034"),
    SIROKIBRIJEG("039"),
        TRAVNIK("030"),
            MOSTAR("036");

    private final String grad;

    private Grad(String opis) {this.grad = opis;};

    public String getGrad() {
        return grad;
    }

    @Override
    public String toString() {return grad;};

}
