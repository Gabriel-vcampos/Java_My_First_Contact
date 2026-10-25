package Modules.JavaBasic.Module_Real_Cases;

public class Exercicio03 {
    public static void main(String[] args){
        int[] tempo_cliente = {5 , 3 , 8 ,2 , 10 , 4 , 6 , 1 , 7 , 9};
        int tempo_total = 0;
        double tempo_medio = 0;
        int maior_tempo = tempo_cliente[0];
        int posicao_maior_tempo = 0;
        int menor_tempo = tempo_cliente[0];
        int posicao_menor_tempo = 0;


        System.out.println("------------------------------------------");
        System.out.println("         Sistema de Fila do Banco         ");
        System.out.println("------------------------------------------");

        for(int i = 0 ; i < tempo_cliente.length ; i++){
            tempo_total += tempo_cliente[i];

            if(tempo_cliente[i] > maior_tempo){
                maior_tempo = tempo_cliente[i];
                posicao_maior_tempo = i;
            }

            if(tempo_cliente[i] < menor_tempo){
                menor_tempo = tempo_cliente[i];
                posicao_menor_tempo = i;
            }

            System.out.println("Cliente " + (i+1) + " atendido em " + tempo_cliente[i] + "min. \n" + "Tempo acumulado: " + tempo_total + "min.");
            System.out.println("------------------------------------------");
        }
        tempo_medio = (double) tempo_total / tempo_cliente.length;
        System.out.println("Todos os clientes foram atendidos em um tempo de: " + tempo_total + "min");
        System.out.println("Tempo médio de atendimento dessa sessão: " + tempo_medio + " \n");
        System.out.println("Cliente com maior tempo de fila:"+ tempo_cliente[posicao_maior_tempo] + " Posição do cliente na fila:" + posicao_maior_tempo);
        System.out.println("Cliente com menor tempo de fila:"+ tempo_cliente[posicao_menor_tempo] + " Posição do cliente na fila:" + posicao_menor_tempo);

    }
}
