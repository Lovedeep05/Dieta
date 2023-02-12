import java.util.Vector;

public class Pasto {
    Vector<Piatto> P = new Vector<>();

    public Pasto(Vector<Piatto> p) {
        P = p;
    }

    public Pasto() {}

    public Vector<Piatto> getP() {
        return P;
    }

    public void setP(Vector<Piatto> p) {
        P = p;
    }

    public Boolean verificaDoppi(){
        int an=0,pr=0,se=0,co=0,fr=0,de=0;
        for(int i=0;i<this.getP().size();i++){
            if(this.getP().elementAt(i).getT()==Tipo.ANTIPASTO){
                an++;
            }
            if(this.getP().elementAt(i).getT()==Tipo.PRIMO){
                pr++;
            }
            if(this.getP().elementAt(i).getT()==Tipo.SECONDO){
                se++;
            }
            if(this.getP().elementAt(i).getT()==Tipo.CONTORNO){
                co++;
            }
            if(this.getP().elementAt(i).getT()==Tipo.FRUTTA){
                fr++;
                System.out.println(fr);
            }
            if(this.getP().elementAt(i).getT()==Tipo.DESSERT){
                de++;
            }
        }
        if(an>1) return true;
        if(pr>1) return true;
        if(se>1) return true;
        if(co>1) return true;
        if(fr>1) return true;
        if(de>1) return true;
        return false;
    }
    public void aggiungi(Piatto p){
        P.add(p);
    }

    public InfoNutriz getInfo(){
        float c=0,g=0,p=0;
        for(int i=0;i<P.size();i++){
            c+=P.elementAt(i).getI().getC();
            g+=P.elementAt(i).getI().getG();
            p+=P.elementAt(i).getI().getP();
        }
        return new InfoNutriz(c,g,p);
    }

    public Boolean equilibrato(){
        boolean frutta=false,contorno=false,primoOsecondo=false;
        for(int i=0;i<P.size();i++){
            if(P.elementAt(i).getT()==Tipo.FRUTTA){
                frutta=true;
            }
            if(P.elementAt(i).getT()==Tipo.CONTORNO){
                contorno=true;
            }
            if(P.elementAt(i).getT()==Tipo.SECONDO||P.elementAt(i).getT()==Tipo.PRIMO){
                primoOsecondo=true;
            }
        }
        return frutta&&contorno&&primoOsecondo;
    }

    public String stampa(){
        String txt="";
        for(int i=0;i<P.size();i++){
            txt+=P.elementAt(i).toString()+"\n";
        }
        return txt;
    }
}
