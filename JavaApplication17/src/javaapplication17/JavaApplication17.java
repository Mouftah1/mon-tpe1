/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author Mouftah Abdelaziz
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
double[] teuros, tfrancs;
int nombre,i;
Scanner clavier= new Scanner(System.in);
System.out.println("Nombre de notes a saisir?");

nombre = clavier.nextInt();
teuros = new double[nombre];
tfrancs = new double[nombre];
for (i=0; i<nombre; i++){
System.out.println("Entrez une valeur en euros ");
teuros[i] = clavier.nextInt();
}

for (i=0; i<nombre; i++){
tfrancs[i] = teuros[i] *655;
} 
System.out.println("Valeur numero " + i + " : " + teuros[i]);

System.out.println(" euros (" + tfrancs[i] + " francs)");
}
}
    }
    
}
