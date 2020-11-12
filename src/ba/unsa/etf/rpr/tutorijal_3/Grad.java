package ba.unsa.etf.rpr.tutorijal_3;

public enum Grad {
    SARAJEVO ("830"),
    TUZLA("835"),
    ZENICA("832"),
    BRCKO("849"),
    BIHAC("837"),
    ORASJE("831"),
    GORAZDE("838"),
    LIVNO("834"),
    SIROKI-BRIJEG("839"),
        TRAVNIK("830"),
            MOSTAR("836");

    private final String grad;

    private Grad(String opis) {this.grad = opis;};

    @Override
    public String toString() {return grad;};

}
