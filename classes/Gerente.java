package classes;
public class Gerente extends Funcionario {

    public Gerente(String nome, int salario, String departamento, String cpf, String dataNasc) {
        super(nome, salario, departamento, cpf, dataNasc);
    }

    public void realizarReuniao(String data, String horario) {
        System.out.println("Reunião de "+ nome +" marcada para o dia " + data + ", às " + horario + ".");
    }

    @Override
    public void mostrarDados() {
        System.out.println("Nome do Gerente: " + nome);
        System.out.println("Salário do Gerente: " + salario);
        System.out.println("Departamento do Gerente: " + departamento);
        System.out.println("CPF do Gerente: " + cpf);
        System.out.println("Data de Nascimento do Gerente: " + dataNasc);
    }
}
