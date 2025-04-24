package classes;
public class Estagiario extends Funcionario {

    public Estagiario(String nome, int salario, String departamento, String cpf, String dataNasc) {
        super(nome, salario, departamento, cpf, dataNasc);
    }
    
    public void fazerTarefa() {
        System.out.println("Estagiário " + nome + " fazendo suas tarefas.");
    }

    @Override
    public void mostrarDados() {
        System.out.println("Nome do estagiário: " + nome);
        System.out.println("Salário do estagiário: " + salario);
        System.out.println("Departamento do estagiário: " + departamento);
        System.out.println("CPF do estagiário: " + cpf);
        System.out.println("Data de Nascimento do estagiário: " + dataNasc);
    }
}
