package academy.devdojo.maratonajava.introducao.JavaBasic.Module03;

public class Exercicio04 {
    public static void main(String[] args){
        int[] valores = {1,2,3,4,5,6};
        int[] valoresInvertidos = new int[6];
        int contador = 0;

        for(int i : valores){
            System.out.println(i);
        }
        System.out.println("\n");

        for(int i = 0; i < valoresInvertidos.length; i++){
            contador++;
            valoresInvertidos[i] = valores[valores.length - contador];
            System.out.println(valoresInvertidos[i]);
        }
    }
}
