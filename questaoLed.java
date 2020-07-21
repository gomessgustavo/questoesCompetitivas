package uri;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class questaoLed {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int n, cont = 0;
        n = tc.nextInt();
        for (int i = 0;i < n; i++) {
            Integer num;
            String valor = tc.next();
            String vetAux[] = new String[valor.length()-1];
            vetAux = valor.split("");

            for (int j = 0; j < valor.length(); j++) {
                if (vetAux[j].equals("1")) {
                    cont += 2;
                }
                if (vetAux[j].equals("2") || vetAux[j].equals("3") || vetAux[j].equals("5")) {
                    cont += 5;
                }
                if (vetAux[j].equals("4")) {
                    cont += 4;
                }
                if (vetAux[j].equals("6") || vetAux[j].equals("9") || vetAux[j].equals("0")) {
                    cont += 6;
                }
                if (vetAux[j].equals("7")) {
                    cont += 3;
                }
                if (vetAux[j].equals("8")) {
                    cont += 7;
                }


            }

            System.out.println(cont + " leds");
            cont = 0;
        }
    }
}
