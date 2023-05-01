import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    public static void fenetre() {
        GUI fenetre = new GUI();
//        JTextArea zoneTexte = new JTextArea("RATIO FLORIAN");


//        JTextField zoneDeText = new JTextField("Texte mec");

        JButton bouton1 = new JButton("Afficher");
        JButton bouton2 = new JButton("Ajouter");
        JButton bouton3 = new JButton("Retirer");
        JButton bouton4 = new JButton("Rechercher");

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(bouton1);
        panel.add(bouton2);
        panel.add(bouton3);
        panel.add(bouton4);

        fenetre.add(panel);

        fenetre.setTitle("Boufon");
        fenetre.setVisible(true);

    }

    public GUI() {
        super("Fenetre");
        setSize(400,300);
    }

}
