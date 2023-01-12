package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un chiffre entre 1 et 7");
        int indexJour = scanner.nextInt();
        while(indexJour < 1 || indexJour > 7) {
            System.out.println("Veuillez entrer un chiffre entre 1 et 7");
            indexJour = scanner.nextInt();
        }

        if( indexJour > 3) {
            if( indexJour > 5) {
                if(indexJour == 6) {
                    System.out.println("Samedi");
                } else {
                    System.out.println("dimanche");
                }
            } else if (indexJour == 5) {
                System.out.println("Vendredi");
            } else {
                System.out.println("Jeudi");
            }
        } else {
            if( indexJour > 2) {
                System.out.println("Mercredi");
            } else if( indexJour < 2) {
                System.out.println("Lundi");
            } else {
                System.out.println("Mardi");
            }
        }

    }
}
