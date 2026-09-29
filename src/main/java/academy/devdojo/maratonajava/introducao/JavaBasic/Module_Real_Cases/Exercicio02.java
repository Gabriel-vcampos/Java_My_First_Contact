package academy.devdojo.maratonajava.introducao.JavaBasic.Module_Real_Cases;

public class Exercicio02 {
    public static void main(String[] args){
        String[] alunos = {"Ana", "Bruno" , "Carla" , "Diego" , "Elena" , "Felipe" , "Gabi" , "Heitor"};
        double[] nota_1 = {7.5 , 5.0 , 9.0 , 3.0 , 6.0 , 8.0 , 4.0 , 10.0};
        double[] nota_2 = {8.0 , 4.5 , 9.5 , 2.5 , 7.0 , 7.5 , 5.0 , 9.0};
        double[] nota_3 = {6.5 , 6.0 , 10.0 , 4.0 , 6.5 , 9.0 , 3.5 , 8.5};
        double soma_notas = 0;
        double media_alunos = 0;
        int contador_aprovados = 0;
        int contador_recuperacao = 0;
        int contador_reprovados = 0;
        int posicao_maior_media = 0;
        int posicao_menor_media = 0;
        double menor_media = (nota_1[0] + nota_2[0] + nota_3[0])/3;
        double maior_media = (nota_1[0] + nota_2[0] + nota_3[0])/3;
        double soma_notas_geral = 0;
        double media_geral_turma = 0;

        System.out.println("----------------------------------");
        System.out.println("         Sistema de Notas         ");
        System.out.println("----------------------------------");

        for(int i = 0 ; i < alunos.length ; i++){
            soma_notas = nota_1[i] + nota_2[i] + nota_3[i];
            media_alunos = soma_notas / 3;
            soma_notas_geral += soma_notas;
            media_geral_turma = soma_notas_geral / (alunos.length * 3);

            if(media_alunos > maior_media){
                maior_media = media_alunos;
                posicao_maior_media = i;
            }

            if(media_alunos < menor_media){
                menor_media = media_alunos;
                posicao_menor_media = i;
            }



            System.out.println("Aluno: " + alunos[i] + "\n" + "Média do aluno :" + media_alunos);
            if(media_alunos >= 7){
                System.out.println("O Aluno foi Aprovado! Média maior que 7!");
                System.out.println("Parabéns!!");
                System.out.println("---------------------------------- \n");
                contador_aprovados++;
            } else if( media_alunos < 7 && media_alunos >= 5){
                System.out.println("O Aluno está de recuperação!\n");
                System.out.println("A prova da recuperação ocorrerá dia 04/12!!");
                System.out.println("---------------------------------- \n");
                contador_recuperacao++;
            } else{
                System.out.println("O Aluno está reprovado!");
                System.out.println("---------------------------------- \n");
                contador_reprovados++;
            }
        }
        System.out.println("         Status Alunos         \n");
        System.out.println("---------------------------------- \n");
        System.out.println("Aprovados: " + contador_aprovados);
        System.out.println("Reprovados: " + contador_reprovados);
        System.out.println("Recuperação: " + contador_recuperacao +"\n");
        System.out.println("Aluno com maior média da Turma: " + alunos[posicao_maior_media]);
        System.out.println("Aluno com menor média da Turma: " + alunos[posicao_menor_media] + "\n");
        System.out.println("Média Geral da Turma: " + media_geral_turma);


    }
}
