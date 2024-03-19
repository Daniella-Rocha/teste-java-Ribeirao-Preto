package testeEstagioRibPreto;

public class Soma {

    public static void main(String[] args){
        int k = 0;
        int soma = 0;
        int indice = 13;

        while(k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.println(soma);
    }
}
