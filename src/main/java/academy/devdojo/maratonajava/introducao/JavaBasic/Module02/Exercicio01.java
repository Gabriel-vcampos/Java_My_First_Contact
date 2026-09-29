package academy.devdojo.maratonajava.introducao.JavaBasic.Module02;

public class Exercicio01 {
    public static void main (String[]Args){
        int numero = -8;
        if(numero == 0){
                System.out.println("Zero!");
        } else if(numero % 2 == 1 || numero % 2 == -1) {
            if(numero > 0){
                System.out.println("Positivo e Impar!");
            } else {
                System.out.println("Negativo e Impar!");
            }
        } else {
            if(numero > 0){
                System.out.println("Positivo e Par!");
            } else{
                System.out.println("Negativo e Par!");
            }
        }
    }
}
