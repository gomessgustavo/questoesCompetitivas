package uri;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class uri2557 {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        String soma;
        int calc=0, i=0;
        ArrayList<Integer> calcFinal = new ArrayList<>();
        String[] vetAux;
        while(tc.hasNext()) { //looping infinito semelhante ao for(;;)
            soma = tc.next();
            vetAux = soma.split("[+=]");
            if (vetAux[0].equalsIgnoreCase("R")) {
                calc = Integer.parseInt(vetAux[2]) - Integer.parseInt(vetAux[1]);
                calcFinal.add(calc);
            }
            if (vetAux[1].equalsIgnoreCase("L")) {
                calc = Integer.parseInt(vetAux[2]) - Integer.parseInt(vetAux[0]);
                calcFinal.add(calc);
            }
            if (vetAux[2].equalsIgnoreCase("J")) {
                calc = Integer.parseInt(vetAux[0]) + Integer.parseInt(vetAux[1]);
                calcFinal.add(calc);
            }
            System.out.println(calcFinal.get(i));
            i++;
            calc=0;
        }
    }
}


