import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MenuFrame extends JFrame {

    static JCheckBox antipasto1;
    static JCheckBox antipasto2;
    static JCheckBox antipasto3;

    static JCheckBox primo1;
    static JCheckBox primo2;
    static JCheckBox primo3;

    static JCheckBox secondo1;
    static JCheckBox secondo2;
    static JCheckBox secondo3;
    static JCheckBox secondo4;

    static JCheckBox contorno1;
    static JCheckBox contorno2;
    static JCheckBox contorno3;
    static JCheckBox contorno4;


    static JCheckBox frutta1;
    static JCheckBox frutta2;
    static JCheckBox frutta3;

    static JCheckBox dessert1;
    static JCheckBox dessert2;
    static JCheckBox dessert3;

    static JLabel ordineEffettuato;
    static JButton ordina;



    public MenuFrame() throws IOException {
        this.setTitle("MENU");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1300,750);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        //ImageIcon backgroundWood = new ImageIcon("wood.jpeg");
        JPanel menu = new JPanel();
        menu.setBounds(0,0,1000,720);
        menu.setLayout(null);
        JLabel titolo = new JLabel("Menu");
        titolo.setBounds(450,20,170,40);
        titolo.setFont(new Font("cmmi10",Font.BOLD,35));
        menu.setBackground(new Color(254, 213, 111));

        JPanel listaPasti = new JPanel();
        listaPasti.setLayout(new GridLayout(3,2,10,10));
        listaPasti.setBounds(20,70,960,570);

        final int PANEL_DIMENSION = 200;
        
        /**antipasti**/
        JPanel antipasti = new JPanel();
        antipasti.setPreferredSize(new Dimension(PANEL_DIMENSION,PANEL_DIMENSION));
        JLabel antipastiT = new JLabel("Antipasti");
        antipastiT.setFont(new Font("cmmi10",Font.BOLD,15));
        antipastiT.setHorizontalAlignment(JLabel.CENTER);
        antipasti.setBackground(new Color(253, 208, 59));

        antipasto1 = new JCheckBox("Tagliere di Affettati misti");
        antipasto2 = new JCheckBox("Tagliere di Formaggi");
        antipasto3 = new JCheckBox("Crostini");
        
        antipasto1.setIcon(new ImageIcon("CheckDefault.png"));
        antipasto1.setSelectedIcon(new ImageIcon("CheckSelected1.png"));
        antipasto2.setIcon(new ImageIcon("CheckDefault.png"));
        antipasto2.setSelectedIcon(new ImageIcon("CheckSelected1.png"));
        antipasto3.setIcon(new ImageIcon("CheckDefault.png"));
        antipasto3.setSelectedIcon(new ImageIcon("CheckSelected1.png"));

        antipasto1.setHorizontalAlignment(JCheckBox.CENTER);
        antipasto2.setHorizontalAlignment(JCheckBox.CENTER);
        antipasto3.setHorizontalAlignment(JCheckBox.CENTER);
        antipasto1.setOpaque(false);
        antipasto2.setOpaque(false);
        antipasto3.setOpaque(false);
        antipasto1.setFocusable(false);
        antipasto2.setFocusable(false);
        antipasto3.setFocusable(false);
        antipasto1.setFont(new Font("Verdana",Font.BOLD,10));
        antipasto2.setFont(new Font("Verdana",Font.BOLD,10));
        antipasto3.setFont(new Font("Verdana",Font.BOLD,10));


        antipasti.setLayout(new GridLayout(4,1));
        antipasti.add(antipastiT);
        antipasti.add(antipasto1);
        antipasti.add(antipasto2);
        antipasti.add(antipasto3);


        /**primi**/
        JPanel primi = new JPanel();
        primi.setPreferredSize(new Dimension(PANEL_DIMENSION,PANEL_DIMENSION));
        JLabel primiT = new JLabel("Primi");
        primiT.setFont(new Font("cmmi10",Font.BOLD,15));
        primiT.setHorizontalAlignment(JLabel.CENTER);
        primi.setBackground(new Color(253, 208, 59));
        primi.add(primiT);


        primo1 = new JCheckBox("Tagliatelle al Ragù");
        primo2 = new JCheckBox("Strozzapreti Stridoli e Pinoli");
        primo3 = new JCheckBox("Lasagnetta Gorgonzola e Funghi");

        primo1.setIcon(new ImageIcon("CheckDefault.png"));
        primo1.setSelectedIcon(new ImageIcon("CheckSelected1.png"));
        primo2.setIcon(new ImageIcon("CheckDefault.png"));
        primo2.setSelectedIcon(new ImageIcon("CheckSelected1.png"));
        primo3.setIcon(new ImageIcon("CheckDefault.png"));
        primo3.setSelectedIcon(new ImageIcon("CheckSelected1.png"));
        
        primo1.setHorizontalAlignment(JCheckBox.CENTER);
        primo2.setHorizontalAlignment(JCheckBox.CENTER);
        primo3.setHorizontalAlignment(JCheckBox.CENTER);
        primo1.setOpaque(false);
        primo2.setOpaque(false);
        primo3.setOpaque(false);
        primo1.setFocusable(false);
        primo2.setFocusable(false);
        primo3.setFocusable(false);
        primo1.setFont(new Font("Verdana",Font.BOLD,10));
        primo2.setFont(new Font("Verdana",Font.BOLD,10));
        primo3.setFont(new Font("Verdana",Font.BOLD,10));


        primi.setLayout(new GridLayout(4,1));
        primi.add(primiT);
        primi.add(primo1);
        primi.add(primo2);
        primi.add(primo3);



        /**secondi**/
        JPanel secondi = new JPanel();
        secondi.setPreferredSize(new Dimension(PANEL_DIMENSION,PANEL_DIMENSION));
        JLabel secondiT = new JLabel("Secondi");
        secondiT.setFont(new Font("cmmi10",Font.BOLD,15));
        secondiT.setHorizontalAlignment(JLabel.CENTER);
        secondi.setBackground(new Color(253, 208, 59));
        secondi.add(secondiT);

        secondo1 = new JCheckBox("Coniglio in Porchetta");
        secondo2 = new JCheckBox("Tagliata alla griglia al Sale Dolce di Cervia / Rucola e Grana");
        secondo3 = new JCheckBox("Grigliata mista di carne");
        secondo4 = new JCheckBox("Castrato alla griglia");

        secondo1.setIcon(new ImageIcon("CheckDefault.png"));
        secondo1.setSelectedIcon(new ImageIcon("CheckSelected1.png"));
        secondo2.setIcon(new ImageIcon("CheckDefault.png"));
        secondo2.setSelectedIcon(new ImageIcon("CheckSelected1.png"));
        secondo3.setIcon(new ImageIcon("CheckDefault.png"));
        secondo3.setSelectedIcon(new ImageIcon("CheckSelected1.png"));
        secondo4.setIcon(new ImageIcon("CheckDefault.png"));
        secondo4.setSelectedIcon(new ImageIcon("CheckSelected1.png"));
        
        secondo1.setHorizontalAlignment(JCheckBox.CENTER);
        secondo2.setHorizontalAlignment(JCheckBox.CENTER);
        secondo3.setHorizontalAlignment(JCheckBox.CENTER);
        secondo4.setHorizontalAlignment(JCheckBox.CENTER);
        secondo1.setOpaque(false);
        secondo2.setOpaque(false);
        secondo3.setOpaque(false);
        secondo4.setOpaque(false);
        secondo1.setFocusable(false);
        secondo2.setFocusable(false);
        secondo3.setFocusable(false);
        secondo4.setFocusable(false);
        secondo1.setFont(new Font("Verdana",Font.BOLD,10));
        secondo2.setFont(new Font("Verdana",Font.BOLD,10));
        secondo3.setFont(new Font("Verdana",Font.BOLD,10));
        secondo4.setFont(new Font("Verdana",Font.BOLD,10));


        secondi.setLayout(new GridLayout(5,1));
        secondi.add(secondiT);
        secondi.add(secondo1);
        secondi.add(secondo2);
        secondi.add(secondo3);
        secondi.add(secondo4);



        /**contorni**/
        JPanel contorni = new JPanel();
        primi.setPreferredSize(new Dimension(PANEL_DIMENSION,PANEL_DIMENSION));
        JLabel contorniT = new JLabel("Contorni");
        contorniT.setFont(new Font("cmmi10",Font.BOLD,15));
        contorniT.setHorizontalAlignment(JLabel.CENTER);
        contorni.setBackground(new Color(253, 208, 59));
        contorni.add(contorniT);

        contorno1 = new JCheckBox("Verdure Grigliate");
        contorno2 = new JCheckBox("Erbette di campo");
        contorno3 = new JCheckBox("Patate Fritte o al forno");
        contorno4 = new JCheckBox("Insalata Mista");

        contorno1.setIcon(new ImageIcon("CheckDefault.png"));
        contorno1.setSelectedIcon(new ImageIcon("CheckSelected1.png"));
        contorno2.setIcon(new ImageIcon("CheckDefault.png"));
        contorno2.setSelectedIcon(new ImageIcon("CheckSelected1.png"));
        contorno3.setIcon(new ImageIcon("CheckDefault.png"));
        contorno3.setSelectedIcon(new ImageIcon("CheckSelected1.png"));
        contorno4.setIcon(new ImageIcon("CheckDefault.png"));
        contorno4.setSelectedIcon(new ImageIcon("CheckSelected1.png"));

        contorno1.setHorizontalAlignment(JCheckBox.CENTER);
        contorno2.setHorizontalAlignment(JCheckBox.CENTER);
        contorno3.setHorizontalAlignment(JCheckBox.CENTER);
        contorno4.setHorizontalAlignment(JCheckBox.CENTER);
        contorno1.setOpaque(false);
        contorno2.setOpaque(false);
        contorno3.setOpaque(false);
        contorno4.setOpaque(false);
        contorno1.setFocusable(false);
        contorno2.setFocusable(false);
        contorno3.setFocusable(false);
        contorno4.setFocusable(false);
        contorno1.setFont(new Font("Verdana",Font.BOLD,10));
        contorno2.setFont(new Font("Verdana",Font.BOLD,10));
        contorno3.setFont(new Font("Verdana",Font.BOLD,10));
        contorno4.setFont(new Font("Verdana",Font.BOLD,10));


        contorni.setLayout(new GridLayout(5,1));
        contorni.add(contorniT);
        contorni.add(contorno1);
        contorni.add(contorno2);
        contorni.add(contorno3);
        contorni.add(contorno4);


        /**frutta**/
        JPanel frutta = new JPanel();
        primi.setPreferredSize(new Dimension(PANEL_DIMENSION,PANEL_DIMENSION));
        JLabel fruttaT = new JLabel("Frutta");
        fruttaT.setFont(new Font("cmmi10",Font.BOLD,15));
        fruttaT.setHorizontalAlignment(JLabel.CENTER);
        frutta.setBackground(new Color(253, 208, 59));
        frutta.add(fruttaT);

        frutta1 = new JCheckBox("Ananas");
        frutta2 = new JCheckBox("Macedonia");
        frutta3 = new JCheckBox("Frutta di Stagione");

        frutta1.setIcon(new ImageIcon("CheckDefault.png"));
        frutta1.setSelectedIcon(new ImageIcon("CheckSelected1.png"));
        frutta2.setIcon(new ImageIcon("CheckDefault.png"));
        frutta2.setSelectedIcon(new ImageIcon("CheckSelected1.png"));
        frutta3.setIcon(new ImageIcon("CheckDefault.png"));
        frutta3.setSelectedIcon(new ImageIcon("CheckSelected1.png"));
        
        frutta1.setHorizontalAlignment(JCheckBox.CENTER);
        frutta2.setHorizontalAlignment(JCheckBox.CENTER);
        frutta3.setHorizontalAlignment(JCheckBox.CENTER);
        frutta1.setOpaque(false);
        frutta2.setOpaque(false);
        frutta3.setOpaque(false);
        frutta1.setFocusable(false);
        frutta2.setFocusable(false);
        frutta3.setFocusable(false);
        frutta1.setFont(new Font("Verdana",Font.BOLD,10));
        frutta2.setFont(new Font("Verdana",Font.BOLD,10));
        frutta3.setFont(new Font("Verdana",Font.BOLD,10));


        frutta.setLayout(new GridLayout(4,1));
        frutta.add(fruttaT);
        frutta.add(frutta1);
        frutta.add(frutta2);
        frutta.add(frutta3);

        /**dessert**/
        JPanel dessert = new JPanel();
        JLabel dessertT = new JLabel("Dessert");
        dessertT.setFont(new Font("cmmi10",Font.BOLD,15));
        dessertT.setHorizontalAlignment(JLabel.CENTER);
        dessert.setBackground(new Color(253, 208, 59));
        dessert.add(dessertT);

        dessert1 = new JCheckBox("Marcarpone");
        dessert2 = new JCheckBox("Tiramisù");
        dessert3 = new JCheckBox("Tortino di cioccolato al cuore caldo");

        dessert1.setIcon(new ImageIcon("CheckDefault.png"));
        dessert1.setSelectedIcon(new ImageIcon("CheckSelected1.png"));
        dessert2.setIcon(new ImageIcon("CheckDefault.png"));
        dessert2.setSelectedIcon(new ImageIcon("CheckSelected1.png"));
        dessert3.setIcon(new ImageIcon("CheckDefault.png"));
        dessert3.setSelectedIcon(new ImageIcon("CheckSelected1.png"));
        
        dessert1.setHorizontalAlignment(JCheckBox.CENTER);
        dessert2.setHorizontalAlignment(JCheckBox.CENTER);
        dessert3.setHorizontalAlignment(JCheckBox.CENTER);
        dessert1.setOpaque(false);
        dessert2.setOpaque(false);
        dessert3.setOpaque(false);
        dessert1.setFocusable(false);
        dessert2.setFocusable(false);
        dessert3.setFocusable(false);
        dessert1.setFont(new Font("Verdana",Font.BOLD,10));
        dessert2.setFont(new Font("Verdana",Font.BOLD,10));
        dessert3.setFont(new Font("Verdana",Font.BOLD,10));


        dessert.setLayout(new GridLayout(4,1));
        dessert.add(dessertT);
        dessert.add(dessert1);
        dessert.add(dessert2);
        dessert.add(dessert3);

        /**ordina**/
        ordina = new JButton("ORDINA");
        ordina.setBounds(450,650,100,50);
        ordina.setFocusable(false);
        ordina.setFont(new Font("Verdana",Font.BOLD,10));
        ordina.setBackground(new Color(253, 208, 59));

        ordineEffettuato = new JLabel();
        ordineEffettuato.setFont(new Font("Verdana",Font.BOLD,10));
        ordineEffettuato.setBounds(555,650,150,50);




        ordina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writePasto();
            }
        });

        listaPasti.setBackground(new Color(0, 0, 0, 0));
        listaPasti.add(antipasti);
        listaPasti.add(contorni);
        listaPasti.add(primi);
        listaPasti.add(frutta);
        listaPasti.add(secondi);
        listaPasti.add(dessert);

        menu.add(titolo);
        menu.add(listaPasti);
        menu.add(ordina);
        menu.add(ordineEffettuato);

        this.add(menu);
    }

    public static void writePasto() {
        String ordine="";
        String piattoSingolo="";
        try{
            if(antipasto1.isSelected()){
                ordine+=antipasto1.getText().replace(" ","_")+".antipasto:10.4<10.2>63.3\n";
                antipasto1.setSelected(false);
            }
            if(antipasto2.isSelected()){
                ordine+=antipasto2.getText().replace(" ","_")+".antipasto:176<23>12.5\n";
                antipasto2.setSelected(false);
            }
            if(antipasto3.isSelected()){
                ordine+=antipasto3.getText().replace(" ","_")+".antipasto:14.4<14.4>14\n";
                antipasto3.setSelected(false);
            }

            if(primo1.isSelected()){
                ordine+=primo1.getText().replace(" ","_")+".primo:123.5<12>15\n";
                primo1.setSelected(false);
            }
            if(primo2.isSelected()){
                ordine+=primo2.getText().replace(" ","_")+".primo:12.4<85.3>14.9\n";
                primo2.setSelected(false);
            }
            if(primo3.isSelected()){
                ordine+=primo3.getText().replace(" ","_")+".primo:17.7<114.4>5.5\n";
                primo3.setSelected(false);
            }

            if(secondo1.isSelected()){
                ordine+=secondo1.getText().replace(" ","_")+".secondo:76.6<19.4>62.3\n";
                secondo1.setSelected(false);
            }
            if(secondo2.isSelected()){
                ordine+=secondo2.getText().replace(" ","_")+".secondo:15.8<5.3>42.6\n";
                secondo2.setSelected(false);
            }
            if(secondo3.isSelected()){
                ordine+=secondo3.getText().replace(" ","_")+".secondo:145.44<14.3>15.99\n";
                secondo3.setSelected(false);
            }
            if(secondo4.isSelected()){
                ordine+=secondo4.getText().replace(" ","_")+".secondo:1.4<11.4>1.5\n";
                secondo4.setSelected(false);
            }

            if(contorno1.isSelected()){
                ordine+=contorno1.getText().replace(" ","_")+".contorno:5.4<12.0>6.2\n";
                contorno1.setSelected(false);
            }
            if(contorno2.isSelected()){
                ordine+=contorno2.getText().replace(" ","_")+".contorno:17.5<4.5>1.2\n";
                contorno2.setSelected(false);
            }
            if(contorno3.isSelected()){
                ordine+=contorno3.getText().replace(" ","_")+".contorno:12.3<1.4>1.5\n";
                contorno3.setSelected(false);
            }
            if(contorno4.isSelected()){
                ordine+=contorno4.getText().replace(" ","_")+".contorno:12.3<114>3.5\n";
                contorno4.setSelected(false);
            }

            if(frutta1.isSelected()){
                ordine+=frutta1.getText().replace(" ","_")+".frutta:15.2<15.4>6.2\n";
                frutta1.setSelected(false);
            }
            if(frutta2.isSelected()){
                ordine+=frutta2.getText().replace(" ","_")+".frutta:15.4<8.5>1.42\n";
                frutta2.setSelected(false);
            }
            if(frutta3.isSelected()){
                ordine+=frutta3.getText().replace(" ","_")+".frutta:187<14.4>9.5\n";
                frutta3.setSelected(false);
            }

            if(dessert1.isSelected()){
                ordine+=dessert1.getText().replace(" ","_")+".dessert:123<9.99>10.2\n";
                dessert1.setSelected(false);
            }
            if(dessert2.isSelected()){
                ordine+=dessert2.getText().replace(" ","_")+".dessert:13.2<7.5>13.4\n";
                dessert2.setSelected(false);
            }
            if(dessert3.isSelected()){
                ordine+=dessert3.getText().replace(" ","_")+".dessert:14<1.14>1.75\n";
                dessert3.setSelected(false);
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"));
            writer.write(ordine);
            writer.close();
            if(ordine.isEmpty()){
                ordineEffettuato.setText("ORDINE VUOTO!");
            }else{
                ordineEffettuato.setText("ORDINE EFFETTUATO!");
                ordina.setEnabled(false);
            }
            Main.createPasto();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}
