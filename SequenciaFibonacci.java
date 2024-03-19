package testeEstagioRibPreto;

import java.util.Scanner;

import java.util.ArrayList;

public class SequenciaFibonacci {
    public static void main(String[] args){

        // recebe uma entrada de número
        Scanner scan = new Scanner(System.in);

        //limite da contagem
        int max = 0;

        //variável que vai verificar se o número está na sequência
        Boolean existe = false;

        //inicia a sequência
        ArrayList<Integer> seq = new ArrayList<Integer>();
        seq.add(0);
        seq.add(1);



        boolean inputValido = false;

        while (!inputValido) {
            System.out.println("Digite um número: ");
            String valorEntrada = scan.nextLine();
            if (!valorEntrada.isEmpty()) {
                if(valorEntrada.matches("\\d+")) {
                    max = Integer.parseInt(valorEntrada);
                    inputValido = true;
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scan.next(); // Limpa o buffer do Scanner
                max = Integer.parseInt(valorEntrada);
            }
        }

        // Gera a sequência de Fibonacci até o número informado
        for(int i = 2; seq.get(i - 1) + seq.get(i - 2) <= max; i++){
            int temp = seq.get(i - 2) + seq.get(i - 1);
            seq.add(temp);
        }
        // Imprime a sequência de Fibonacci
        for(int i = 0; i < seq.size(); i++) {
            System.out.println(seq.get(i));
            if(seq.contains(max)) {
                existe = true;
            }
        }
        if(existe){
            System.out.println("O número escolhido pertene à sequência.");
        } else {
            System.out.println("O número escolhido não pertene à sequência.");
        }
    }
}
