/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Generador_Secuencial_Multiplicativo {
     public static void main(String[] args) {        
        double d =0;
        boolean esEntero=true;
        //validamos si el numero es entero
        int numComprobar=0;
        while(esEntero){
            try {
                numComprobar= Integer.parseInt(JOptionPane.showInputDialog(null, "Igrese d para obtener m =2^d ", "DATO d", JOptionPane.INFORMATION_MESSAGE));
                esEntero = false;
            } catch (NumberFormatException e) {                
  
            }
        }
        d=numComprobar;
        
        //fin de la validacion        
        double m = Math.pow(2, d);
        
        //validacion de que k sea entero
        esEntero=true;
        numComprobar=0;
        while(esEntero){
            try {
                numComprobar= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese k para el calculo de a= 3+8k:", "ingrese k", JOptionPane.INFORMATION_MESSAGE));
                esEntero = false;
            } catch (NumberFormatException e) {                
  
            }
        }
        int k = numComprobar;
        //fin de la validacion
        
        int a = 5+(8*k);
        
        
        double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese x", "DATO X", JOptionPane.INFORMATION_MESSAGE));
        
        boolean comprobarX= true;
        while(comprobarX){
            if(x>0){
                comprobarX=false;
            }else{
                x = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese x", "DATO X", JOptionPane.INFORMATION_MESSAGE));
            }
        }
       
        double r=0;
        System.out.println("i" + "\t" + "x" + "\t" + "r" + "\t" + "(r/m)");
        double verificarPeriodo=x/m;
        int cont=1;
        for (int i = 1; i <= m; i++) {
            
            r = (a * x) % m;
            System.out.println(i + "\t" + x + "\t" + r + "\t" +r+"/"+(m-1));
            x =  r;
            if(verificarPeriodo==r/m){
            System.out.println("CUMPLE "+cont+" PERIODO");
            cont++;
            
            }
            
        }        
        
        
        
        
    }

    //retornamos el ultimo valor primo para el calculo de m
    static double obtenerUltimoPrimoM(double numero) {
        int contador = 2;
        boolean primo = true;

        while ((primo) && (contador != numero)) {
            if (numero % contador == 0) {
                primo = false;
            }
            contador++;
        }

        if (primo) {
            return numero;
        } else {
            return obtenerUltimoPrimoM(numero - 1);
        }

    }

    // retornamos tru si el numero es primo;
    static boolean esPrimo(int numero) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0) {
                primo = false;
            }
            contador++;
        }
        return primo;
    }
}
