package com.solartech.ex.lambda;


import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.Date;
import javax.swing.*;

/**
 * Lambda
 */
public class ExTimerLambda {

    public static void main(String[] args) {
        String[] arPlanet = {"earth", "jupiter", "Mars", "venus", "saturn"};
        System.out.println(Arrays.toString(arPlanet));
        Arrays.sort(arPlanet);
        System.out.println(Arrays.toString(arPlanet));

        Arrays.sort(arPlanet, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(arPlanet));

        Arrays.sort(arPlanet, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(arPlanet));

        Timer oTimer = new Timer(1000, (ActionEvent event) -> {
            System.out.println("The time is " + new Date());
        } );
        oTimer.start();

        JOptionPane.showMessageDialog(null, "退出");
        return;

    }
}
