package academy.devdojo.maratonajava.introducao.JavaBasic.Module02;

public class Exercicio03 {
    public static void main(String[]Args){
        int opcao = 99;
        float numero1 = 10F;
        float numero2 = 3F;

        switch(opcao){
            case 0:
                System.out.println("Saindo. . .");
                break;
            case 1:
                System.out.println("Opção escolhida: SOMA!");
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Opção escolhida: SUBTRAÇÃO!");
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Opção escolhida: MULTIPLICAÇÃO!");
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case 4:
                System.out.println("Opção escolhida: DIVISÃO!");
                System.out.println("Resultado: " + (numero1 / numero2));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
