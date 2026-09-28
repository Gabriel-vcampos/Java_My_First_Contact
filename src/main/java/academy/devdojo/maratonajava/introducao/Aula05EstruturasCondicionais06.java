package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main (String[] args){
        int dia = 7;
        String resultado = "";
        if(dia > 1 && dia < 7){
            resultado = "Dia útil";
        } else {
            resultado = "Dia não útil";
        }
        switch(dia){
            case 1:
                System.out.println("Domingo! Portanto isso é um " + resultado);
                break;
            case 2:
                System.out.println("Segunda! Portanto isso é um " + resultado);
                break;
            case 3:
                System.out.println("Terça! Portanto isso é um " + resultado);
                break;
            case 4:
                System.out.println("Quarta! Portanto isso é um " + resultado);
                break;
            case 5:
                System.out.println("Quinta! Portanto isso é um " + resultado);
                break;
            case 6:
                System.out.println("Sexta! Portanto isso é um " + resultado);
                break;
            case 7:
                System.out.println("Sábado! Portanto isso é um " + resultado);
                break;
                default:
                System.out.println("Valor inválido!");
                break;
        }

    }
}
