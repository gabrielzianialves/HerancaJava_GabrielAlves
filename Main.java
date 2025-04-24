import java.util.Date;
import classes.Desenvolvedor;
import classes.Estagiario;
import classes.Funcionario;
import classes.Gerente;
import classes.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("1223", "20 de novembro");
        Funcionario funcionario = new Funcionario("Mariana", 3380, "RH", "45678", "11 de junho");
        Gerente gerente = new Gerente("Leonardo", 4440, "Financeiro", "23583", "8 de maio");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Gabriel", 16000, "TI", "47284", "27 de junho");
        Estagiario estagiario = new Estagiario("Rafael", 8000, "Marketing", "284638", "30 de dezembro");
        
        

        Date dataHoraAtual = new Date();
        funcionario.baterPonto(dataHoraAtual);
        System.out.println("------------------------");
        gerente.baterPonto(dataHoraAtual);
        System.out.println("------------------------");
        desenvolvedor.baterPonto(dataHoraAtual);
        System.out.println("------------------------");
        estagiario.baterPonto(dataHoraAtual);
        System.out.println(" ");

        gerente.realizarReuniao("25 de abril", "19:00");
        System.out.println("------------------------");
        desenvolvedor.programar();
        System.out.println("------------------------");
        estagiario.fazerTarefa();


    }
}
