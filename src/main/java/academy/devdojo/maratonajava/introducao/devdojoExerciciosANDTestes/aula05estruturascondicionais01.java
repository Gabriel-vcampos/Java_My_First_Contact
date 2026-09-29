package academy.devdojo.maratonajava.introducao.devdojoExerciciosANDTestes;

public class aula05estruturascondicionais01 {
    public static void main (String[] args){
        int idade = 18;
        if(idade < 15){
            System.out.println("Você está cadastrado na categoria infantil");
        } else if (idade >= 15 && idade < 18){
            System.out.println("Você está cadastrado na categoria juvenil");
        } else {
            System.out.println("Você está cadastrado na categoria adulta");
        }
    }
}
