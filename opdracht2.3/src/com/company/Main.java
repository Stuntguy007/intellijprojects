package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String totaal;
        double start;
        double rente;
        double antwoord1;
        double antwoord2;

        totaal = JOptionPane.showInputDialog(null, "Vul het startbedrag in:");
        totaal = JOptionPane.showInputDialog(null, "Vul het rentepercentage in:");
        start = Double.parseDouble(totaal);
        rente = Double.parseDouble(totaal);

        antwoord1 = rente / 10;
        antwoord2 = antwoord1 * start;


        JOptionPane.showMessageDialog(null, antwoord2);
    }
}
