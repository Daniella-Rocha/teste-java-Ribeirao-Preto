package testeEstagioRibPreto;

import java.util.ArrayList;
import java.util.Scanner;

public class InverteString {
    public static void main(String[] args){



        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");

        char[] textoLista = scan.nextLine().toCharArray();

        int tamanho = textoLista.length;

        ArrayList<Character> textoInvertido = new ArrayList<Character>();

        StringBuilder builder = new StringBuilder();

        for(int i = tamanho; i > 0; i--){
            builder.append(textoLista[i - 1]);
        }
        String texto = builder.toString();
        System.out.println(texto);
    }
}
