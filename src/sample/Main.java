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

        //Créer une fenêtre
        JFrame fenetre = new JFrame();
        //Créer une ComboBox pour Action et Indice
        JComboBox comboBoxCACSBF = new JComboBox();
        //Créer un Label pour le ComboBox
        JLabel label = new JLabel("Indices : ");

        //JButton bouton

        JPanel container = new JPanel();

        fenetre.setVisible(true);

        // Définit le titre de la fenêtre
        fenetre.setTitle("Projet Finance");

        // Définit taille de la fenêtre
        fenetre.setSize(500,500);

        //Nous demandons maintenant à notre objet de se positionner au centre
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

        //Ajouter éléments dans la liste
        comboBoxCACSBF.addItem("Choisir l'indice");
        comboBoxCACSBF.addItem("CAC 40");
        comboBoxCACSBF.addItem("SBF 120");
        //Couleur de la ComboBox
        comboBoxCACSBF.setBackground(Color.white);
    }
}
