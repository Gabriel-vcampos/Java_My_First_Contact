package academy.devdojo.maratonajava.introducao.JavaBasic.Module03;

public class Exercicio03 {
    public static void main(String[] Args){
        int[] valores = {15, 3, 42, 7, 88, 21, 9, 56};
        int maior_numero = valores[0];
        int menor_numero = valores[0];
        int posicao_maior_numero = 0;
        int posicao_menor_numero = 0;

        for(int i = 0; i < valores.length; i++){
            if(valores[i] > maior_numero){
                maior_numero = valores[i];
                posicao_maior_numero = i;
            }
            if(valores[i] < menor_numero){
                menor_numero = valores[i];
                posicao_menor_numero = i;
            }
            System.out.println("Posição "+ i + "\n Número: " + valores[i] + "\n");
        }
        System.out.println("O maior número dessa lista foi o: " + maior_numero + " e está na posição:" + posicao_maior_numero);
        System.out.println("O menor número dessa lista foi o: " + menor_numero + " e está na posição:" + posicao_menor_numero);
    }
}
