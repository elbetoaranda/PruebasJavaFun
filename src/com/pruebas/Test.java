package com.pruebas;
import java.math.BigDecimal;
import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        System.out.println("Escriba un division formato dividendo+divisor");
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();

        if(!entrada.contains("+")){
            System.out.println("No se encuentra operador +");
            return;
        }

        String[] operadores = entrada.split("\\+");

        if(operadores.length<2){
            System.out.println("Faltan operadores dividendo o divisor");
            return;
        }

        BigDecimal resultado = BigDecimal.ZERO;
        try {
            BigDecimal dividendo = new BigDecimal(operadores[0]);
            BigDecimal divisor = new BigDecimal(operadores[1]);

            resultado = dividendo.divide(divisor);

        } catch (NumberFormatException numberFormatException){
            System.out.println("Error en operadores dividendo o divisor");
            System.out.println(numberFormatException.getMessage());
        } catch (Exception e){
            System.out.println("Error en operadores dividendo o divisor");
            System.out.println(e.getMessage());
        }


        System.out.println(resultado);
    }
}
