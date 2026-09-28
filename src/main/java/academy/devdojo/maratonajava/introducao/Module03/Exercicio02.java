package academy.devdojo.maratonajava.introducao.Module03;

public class Exercicio02 {
    public static void main(String[] args){
        double[] notas = {7.5, 8.0, 6.5, 9.0, 5.0, 10.0};
        double soma = 0;
        double media = 0;

        for(double i : notas){
            soma += i;
        }
        media = soma / notas.length;
        System.out.println("A soma das notas é: " + soma);
        System.out.println("A média das notas é: " + media);

    }
}
