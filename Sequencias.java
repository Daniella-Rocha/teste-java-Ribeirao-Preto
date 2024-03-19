package testeEstagioRibPreto;

import java.util.ArrayList;

public class Sequencias {
    public static void main(String[] args){

        int[] listaUm = {1, 3, 5, 7};
        int[] novalistaUm = new int[listaUm.length + 1];

        int[] listaDois = { 2, 4, 8, 16, 32, 64};
        int[] novalistaDois = new int[listaDois.length + 1];

        int[] listaTres = {0, 1, 4, 9, 16, 25, 36};
        int[] novalistaTres = new int[listaTres.length + 1];

        int[] listaQuatro = {4, 16, 36, 64};
        int[] novalistaQuatro = new int[listaQuatro.length + 1];

        int[] listaCinco = {1, 1, 2, 3, 5, 8};
        int[] novalistaCinco = new int[listaCinco.length + 1];

        int[] listaSeis = {2, 10, 12, 16, 17, 18, 19};
        int[] novalistaSeis= new int[listaSeis.length + 1];

        for(int i = 0; i < listaUm.length; i++){
            int ultimo = listaUm.length - 1;
            novalistaUm[i] = listaUm[i];
            if(i == ultimo){
                novalistaUm[i + 1] = listaUm[ultimo] + 2;
            }
        }

        for(int idx1 = 0; idx1 < novalistaUm.length; idx1++){
            System.out.println(novalistaUm[idx1]);
        }
        System.out.println("-------------------------------");

        for(int j = 0; j < listaDois.length; j++){
            int ultimoDois = listaDois.length - 1;
            novalistaDois[j] = listaDois[j];
            if(j == ultimoDois){
                novalistaDois[j + 1] = listaDois[ultimoDois] * 2;
            }
        }

        for(int idx2 = 0; idx2 < novalistaDois.length; idx2++){
            System.out.println(novalistaDois[idx2]);
        }

        System.out.println("-------------------------------");

        int valQuad = 0;
        for(int k = 0; k < listaTres.length; k++){
            int ultimoTres = listaTres.length - 1;
            novalistaTres[k] = listaTres[k];
            if(k == ultimoTres){
                valQuad = (k + 1) * (k + 1);
                novalistaTres[k + 1] = valQuad;
            }
        }


        for(int idx3 = 0; idx3 < novalistaTres.length; idx3++){
            System.out.println(novalistaTres[idx3]);
        }

        System.out.println("-------------------------------");

        int ultimoQuatro = listaQuatro.length - 1;
        double doubleUltimo = (double) listaQuatro[ultimoQuatro];
        double raizUltimoQuatro = Math.sqrt(doubleUltimo);
        int intUltimo = (int) raizUltimoQuatro + 2;
        for(int l = 0; l < listaQuatro.length; l++){
            novalistaQuatro[l] = listaQuatro[l];
            if(l == ultimoQuatro){
                novalistaQuatro[l + 1] = intUltimo * intUltimo;
            }
        }

        for(int idx4 = 0; idx4 < novalistaQuatro.length; idx4++){
            System.out.println(novalistaQuatro[idx4]);

        }
        System.out.println("-------------------------------");

        for(int m = 0; m < listaCinco.length; m++){
            int ultimoCinco = listaCinco.length - 1;
            novalistaCinco[m] = listaCinco[m];
            if(m == ultimoCinco){
                novalistaCinco[m + 1] = listaCinco[ultimoCinco - 1] + listaCinco[ultimoCinco];
            }
        }

        for(int idx5 = 1; idx5 < novalistaCinco.length; idx5++){
            System.out.println(novalistaCinco[idx5]);
        }

    }
}

