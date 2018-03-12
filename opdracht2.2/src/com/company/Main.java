package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String leeftijd;
        int jaar;
        int maanden;
        double minuten;

        leeftijd = JOptionPane.showInputDialog(null, "Enter number of years.");
        leeftijd = JOptionPane.showInputDialog(null, "Enter number of months.");
        jaar = Integer.parseInt(leeftijd);
        maanden = Integer.parseInt(leeftijd);

        maanden = maanden * 43800;
        jaar = jaar * 525600;
        minuten = maanden + jaar;

        JOptionPane.showMessageDialog(null, minuten + " minuten oud ben jij!.");
    }
}
