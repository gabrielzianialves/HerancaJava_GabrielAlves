package classes;
public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, int salario, String departamento, String cpf, String dataNasc) {
        super(nome, salario, departamento, cpf, dataNasc);
    }
    
    public void programar() {
        System.out.println("Desenvolvedor " + nome + " programando.");
    }

    @Override
    public void mostrarDados() {
        System.out.println("Nome do desenvolvedor: " + nome);
        System.out.println("Salário do desenvolvedor: " + salario);
        System.out.println("Departamento do desenvolvedor: " + departamento);
        System.out.println("CPF do desenvolvedor: " + cpf);
        System.out.println("Data de Nascimento do desenvolvedor: " + dataNasc);
    }
}
