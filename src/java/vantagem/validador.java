/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vantagem;

import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Formação
 */
public class validador {

    public static final boolean validarContribuinte(String contribuinte) throws NumberFormatException {

        boolean valido = false;
        char digito;
        int num;
        int subtotal;
        int total = 0;
        int numDigitos = contribuinte.length();

        
            Integer nifTemp = Integer.parseInt(contribuinte);
       

        for (int i = 0; i < contribuinte.length(); i++) {

            digito = contribuinte.charAt(i);
            num = Character.digit(digito, 10);
            subtotal = num * (numDigitos - i);
            total += subtotal;
        }
        if (total % 11 == 0) {
            valido = true;
        }
        return valido;
    }

    public static void main(String[] args) {

        validador nif = new validador();

        System.out.println(nif.validarContribuinte("dfgdfgdf"));

    }

}
