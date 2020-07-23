package uri;

import java.util.Scanner;

public class cwiQuestao {
    public static void main(String[]args){
        Scanner tc = new Scanner(System.in);

        String senha = tc.next();
        System.out.println(validaComplexidade(senha));


}
    private static int validaComplexidade(String senha){
        boolean cond1=false, cond2=false, cond3=false;
        if(senha.length()>=8&&senha.length()<=32){
            for(int i=0; i<senha.length(); i++){
                if(Character.isDigit(senha.charAt(i))){
                    cond1 = true;
                }if(Character.isUpperCase(senha.charAt(i))){
                    cond2 = true;
                }if(Character.isLowerCase(senha.charAt(i))){
                    cond3=true;
                }
            }

        }else{
            return 0;
        }
        if(cond1 && cond2 && cond3){
            return 1;
        }else{
            return 0;
        }
    }






}
