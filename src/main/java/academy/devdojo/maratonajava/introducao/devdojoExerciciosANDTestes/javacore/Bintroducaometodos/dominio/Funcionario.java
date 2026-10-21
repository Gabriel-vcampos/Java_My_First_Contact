package academy.devdojo.maratonajava.introducao.devdojoExerciciosANDTestes.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void getNome(String nome){
        this.nome = nome;
    }

    public void getIdade(int idade){
        this.idade = idade;
    }

    public void getSalario(double[] salario){
        this.salario = salario;
    }

    public double calcularMedia(){
        double somaSalario = 0;
        for(int i = 0; i< salario.length;i++){
        somaSalario += this.salario[i];
        }
        double mediaSalario = somaSalario/this.salario.length;
        return mediaSalario;
    }

    public void imprimir(){
        System.out.println("------------------------------");
        System.out.println("Funcionario: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for(int i = 0; i< this.salario.length; i++){
            System.out.println("Salários: " + this.salario[i]);
        }
        System.out.println("Média dos salários: " + calcularMedia());
    }
}


