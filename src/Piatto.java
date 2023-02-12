public class Piatto {
    private String n;
    private Tipo t;
    private InfoNutriz i;

    public Piatto(String n, Tipo t, InfoNutriz i) {
        this.n = n;
        this.t = t;
        this.i = i;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public Tipo getT() {
        return t;
    }

    public void setT(Tipo t) {
        this.t = t;
    }

    public InfoNutriz getI() {
        return i;
    }

    public void setI(InfoNutriz i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return  n +
                "\n "+ t +
                "\n " + i+"\n";
    }
}
