package classes;
import java.util.Date;

public class Funcionario extends Pessoa {
    String nome;
    int salario;
    String departamento;

    public Funcionario(String nome, int salario, String departamento, String cpf, String dataNasc) {
        super(cpf, dataNasc);
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void mostrarDados() {
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário do funcionário: " + salario);
        System.out.println("Departamento do funcionário: " + departamento);
        System.out.println("CPF do funcionário: " + cpf);
        System.out.println("Data de Nascimento do funcionário: " + dataNasc);
    }

    public void baterPonto(Date dataHoraAtual) {
        System.out.println("Ponto eletrônico registrado.\nData e horário: " + dataHoraAtual);
    }
}
