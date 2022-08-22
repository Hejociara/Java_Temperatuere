/**
 * @author: Hejociara
 * 21/08/22
 * @since: 1.0
 *
 */

public class Temperature {
            public static void main (String[]args){
            //(°F -32) x 5/9(9.0) = °C /armazenar tudo em constantes
            // 2 constantes e o resultado da expressão
            final double ajuste = 32; // x = ajuste (°F -32)
            final double fator = 5.0 / 9.0; //fator

            double fahrenheit = 86;
            double celsius = (fahrenheit - ajuste) * fator;
            System.out.println("Temperature = " + celsius + "°C");

            fahrenheit = 0;
            celsius = (fahrenheit - ajuste) * fator;
            System.out.println("Temperature = " + celsius + "°C");

        }
    }