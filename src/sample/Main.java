package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/
    }


    public static void main(String[] args) {

        //Cr�er une fen�tre
        JFrame fenetre = new JFrame();
        //Cr�er une ComboBox pour Action et Indice
        JComboBox comboBoxCACSBF = new JComboBox();
        //Cr�er un Label pour le ComboBox
        JLabel label = new JLabel("Indices : ");

        //JButton bouton

        JPanel container = new JPanel();

        fenetre.setVisible(true);

        // D�finit le titre de la fen�tre
        fenetre.setTitle("Projet Finance");

        // D�finit taille de la fen�tre
        fenetre.setSize(500,500);

        //Nous demandons maintenant � notre objet de se positionner au centre
        fenetre.setLocationRelativeTo(null);

        //Termine le processus lorsqu'on clique sur la croix rouge
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        container.setLayout(new BorderLayout());
        comboBoxCACSBF.setPreferredSize(new Dimension(100, 20));

        JPanel top = new JPanel();
        top.add(label);
        top.add(comboBoxCACSBF);
        container.add(top, BorderLayout.NORTH);
        fenetre.setContentPane(container);
        fenetre.setVisible(true);

        //Taille de la ComboBox
        comboBoxCACSBF.setPreferredSize(new Dimension(110, 20));

        //Ajouter �l�ments dans la liste
        comboBoxCACSBF.addItem("Choisir l'indice");
        comboBoxCACSBF.addItem("CAC 40");
        comboBoxCACSBF.addItem("SBF 120");
        //Couleur de la ComboBox
        comboBoxCACSBF.setBackground(Color.white);
    }
}
