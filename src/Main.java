import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;

public class Main {

    static Pasto P = new Pasto();
    public static void createPasto() throws IOException {
        String nome,tipoT,cT,gT,pT;
        Tipo tipo=Tipo.ANTIPASTO;
        InfoNutriz infoN;
        BufferedReader reader = new BufferedReader(new FileReader("log.txt"));
        String line;
        while((line = reader.readLine()) != null) {
            nome=line.substring(0,line.indexOf("."));
            System.out.println(nome);
            tipoT=line.substring(line.indexOf(".")+1,line.indexOf(":"));
            System.out.println(tipoT);
            switch (tipoT){
                case "antipasto":
                    tipo= Tipo.ANTIPASTO;
                    break;
                case "primo":
                    tipo= Tipo.PRIMO;
                    break;
                case "secondo":
                    tipo= Tipo.SECONDO;
                    break;
                case "contorno":
                    tipo= Tipo.CONTORNO;
                    break;
                case "frutta":
                    tipo= Tipo.FRUTTA;
                    break;
                case "dessert":
                    tipo= Tipo.DESSERT;
                    break;
            }
            cT=line.substring(line.indexOf(":")+1,line.indexOf("<"));
            gT=line.substring(line.indexOf("<")+1,line.indexOf(">"));
            pT=line.substring(line.indexOf(">")+1);
            System.out.println(cT+" "+gT+" "+pT+"\n");
            Piatto piatto = new Piatto(nome,tipo,new InfoNutriz(Float.parseFloat(cT),Float.parseFloat(gT),Float.parseFloat(pT)));
            P.aggiungi(piatto);
        }
        reader.close();
        P.stampa();
    }
    //creare un menu a tendina e far scegliere
    public static void main(String[] args) throws IOException {
        MenuFrame mainFrame = new MenuFrame();
        JPanel functionality = new JPanel();
        functionality.setBounds(1000,0,300,720);
        functionality.setBackground(new Color(166, 169, 200));
        functionality.setLayout(null);

        JLabel titolo = new JLabel("Funzioni");
        titolo.setBounds(75,20,170,40);
        titolo.setFont(new Font("cmmi10",Font.BOLD,35));

        JButton infoNutr = new JButton("INFORMAZIONI NUTRIZIONALI");
        infoNutr.setBounds(25,70,250,50);
        infoNutr.setFont(new Font("Verdana",Font.BOLD,10));
        infoNutr.setBackground(new Color(121, 110, 168));

        JLabel infoNutrL = new JLabel();
        infoNutrL.setBounds(75,130,200,20);
        infoNutrL.setFont(new Font("Verdana",Font.BOLD,10));

        JButton stampa = new JButton("STAMPA");
        stampa.setBounds(25,160,250,50);
        stampa.setFont(new Font("Verdana",Font.BOLD,10));
        stampa.setBackground(new Color(121, 110, 168));

        JTextArea stampaT = new JTextArea();
        stampaT.setBounds(0,0,250,1000);
        stampaT.setBackground(new Color(211, 217, 233));
        stampaT.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(stampaT);
        scrollPane.setBounds(25,220,250,200);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        JButton equilibrato = new JButton("EQUILIBRATO");
        equilibrato.setBounds(25,450,250,50);
        equilibrato.setFont(new Font("Verdana",Font.BOLD,10));
        equilibrato.setBackground(new Color(121, 110, 168));

        JLabel equlibratoT = new JLabel();
        equlibratoT.setBounds(130,520,250,20);
        equlibratoT.setFont(new Font("Verdana",Font.BOLD,10));

        JButton aggiungi = new JButton("AGGIUNGI");
        aggiungi.setBounds(25,550,250,50);
        aggiungi.setFont(new Font("Verdana",Font.BOLD,10));
        aggiungi.setBackground(new Color(121, 110, 168));

        JLabel aggiungiT = new JLabel();
        aggiungiT.setBounds(130,620,250,20);
        aggiungiT.setFont(new Font("Verdana",Font.BOLD,10));


        functionality.add(titolo);
        functionality.add(infoNutr);
        functionality.add(infoNutrL);
        functionality.add(stampa);
        functionality.add(scrollPane);
        functionality.add(equilibrato);
        functionality.add(equlibratoT);
        functionality.add(aggiungi);
        functionality.add(aggiungiT);

        equilibrato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                equlibratoT.setText(P.equilibrato().toString().toUpperCase());
            }
        });

        stampa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stampaT.setText(P.stampa());
            }
        });

        infoNutr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(P.getInfo().toString());
                infoNutrL.setText(P.getInfo().toString());
            }
        });

        aggiungi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuFrame.writePasto();
                aggiungiT.setText(P.verificaDoppi().toString().toUpperCase());
            }
        });

        mainFrame.add(functionality);
        mainFrame.setVisible(true);
    }
}
