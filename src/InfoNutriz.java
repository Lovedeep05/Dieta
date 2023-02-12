public class InfoNutriz {
    private float c;
    private float g;
    private float p;

    public InfoNutriz(float c, float g, float p) {
        this.c = c;
        this.g = g;
        this.p = p;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getG() {
        return g;
    }

    public void setG(float g) {
        this.g = g;
    }

    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "c=" + c +
                ", g=" + g +
                ", p=" + p;
    }
}
