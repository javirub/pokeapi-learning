package com.laberit.sina.bootcamp.extra.gui.view;

import javax.swing.*;

public class MainUI extends JFrame {
    private ImageIcon icon = new ImageIcon("graphics/Pokeball.png");
    public MainUI() {
        this.setTitle("Pokedex pokeapi");
        this.setIconImage(icon.getImage());
        this.setContentPane(MainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


    // Getters and setters
    public JButton getSearchBtn() {
        return searchBtn;
    }

    public JButton getPokedexBtn() {
        return pokedexBtn;
    }

    public JTextField getIdOrNameTextField() {
        return idOrNameTextField;
    }

    // Variables declaration
    private JButton pokedexBtn;
    private JButton searchBtn;
    private JTextField idOrNameTextField;
    private JPanel MainPanel;
}
