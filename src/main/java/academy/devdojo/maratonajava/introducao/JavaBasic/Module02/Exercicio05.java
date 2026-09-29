package academy.devdojo.maratonajava.introducao.JavaBasic.Module02;

public class Exercicio05 {
    public static void main(String[] Args){
        int rodada_um = 2;
        int rodada_dois = 3;
        int rodada_tres = -20;
        int rodada_quatro = 10;
        int rodada_cinco = 5;
        int rodada_seis = 150;
        int rodada_sete = -50;
        int rodada_oito = 300;
        int soma_pontos = 0;
        int rodadas_validas = 0;

        for(int i = 1; i <= 8; i++) {
            switch (i) {
                case 1:
                    if (rodada_um < 0 || rodada_um == 0) {
                        continue;
                    } else {
                        soma_pontos += rodada_um;
                        rodadas_validas++;
                    }
                    break;
                case 2:
                    if (rodada_dois < 0 || rodada_dois == 0) {
                        continue;
                    } else {
                        soma_pontos += rodada_dois;
                        rodadas_validas++;
                    }
                    break;
                case 3:
                    if (rodada_tres < 0 || rodada_tres == 0) {
                        continue;
                    } else {
                        soma_pontos += rodada_tres;
                        rodadas_validas++;
                    }
                    break;
                case 4:
                    if (rodada_quatro < 0 || rodada_quatro == 0) {
                        continue;
                    } else {
                        soma_pontos += rodada_quatro;
                        rodadas_validas++;
                    }
                    break;
                case 5:
                    if (rodada_cinco < 0 || rodada_cinco == 0) {
                        continue;
                    } else {
                        soma_pontos += rodada_cinco;
                        rodadas_validas++;
                    }
                    break;
                case 6:
                    if (rodada_seis < 0 || rodada_seis == 0) {
                        continue;
                    } else {
                        soma_pontos += rodada_seis;
                        rodadas_validas++;
                    }
                    break;
                case 7:
                    if (rodada_sete < 0 || rodada_sete == 0) {
                        continue;
                    } else {
                        soma_pontos += rodada_sete;
                        rodadas_validas++;
                    }
                    break;
                case 8:
                    if (rodada_oito < 0 || rodada_oito == 0) {
                        continue;
                    } else {
                        soma_pontos += rodada_oito;
                        rodadas_validas++;
                    }
                    break;
            }
        }
            double media = (double) soma_pontos / rodadas_validas;
            if(media >= 150){
                System.out.println("Resultado é Excelente!");
            } else if(media < 150 && media >= 100){
                System.out.println("Resultado é Bom!");
            } else if(media < 100 && media >= 50){
                System.out.println("Resultado é Regular!");
            } else {
                System.out.println("Resultado é Ruim!");
        }
        }
    }
