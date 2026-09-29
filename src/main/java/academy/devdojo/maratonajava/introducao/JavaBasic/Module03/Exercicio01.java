package academy.devdojo.maratonajava.introducao.JavaBasic.Module03;

public class Exercicio01 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        /*for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }*/

        for(int i : numeros){
            System.out.println(i);
        }
    }
}
