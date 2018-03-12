package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String main;
        double kilometers;
        double miles;

        main = JOptionPane.showInputDialog(null, "Enter number of miles.");
        miles = Double.parseDouble(main);

        kilometers = miles / 0.621;

        JOptionPane.showMessageDialog(null, miles + " miles is " + kilometers + " kilometers.");

    }
}
