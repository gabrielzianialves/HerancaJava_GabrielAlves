import java.util.ArrayList;
import java.util.Scanner;
import classes.Desenvolvedor;
import classes.Estagiario;
import classes.Funcionario;
import classes.Gerente;

public class Menu { 
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;

        ArrayList<Gerente> listaGerentes = new ArrayList<>();
        ArrayList<Desenvolvedor> listaDevs = new ArrayList<>();
        ArrayList<Estagiario> listaEstagiarios = new ArrayList<>();

        
        do {
            System.out.println("Bem vindo ao sistema de gerenciamento de empresas!");
            System.out.println("  1 - Cadastrar um novo funcionário \n  2 - Exibição de dados de funcionários existentes \n  3 - Sair");
            System.out.print("Digite uma opção: ");
            op = scanner.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Você selecionou: Cadastrar um novo funcionário.");
                    System.out.print("Escolha o tipo de funcionário (0 para Gerente, 1 para Desenvolvedor e 2 para Estagiário) que deseja cadastrar: ");
                    int tipoFuncionario = scanner.nextInt();
                    
                    switch (tipoFuncionario) {
                        case 0:
                            System.out.print("Digite o nome do Gerente: ");
                            String nome = scanner.next();
                            
                            System.out.print("Digite o salário do Gerente: ");
                            int salario = scanner.nextInt();
                            
                            System.out.print("Digite o departamento do Gerente: ");
                            String departamento = scanner.next();

                            System.out.print("Digite o cpf do Gerente: ");
                            String cpf = scanner.next();

                            System.out.print("Digite a data de nascimento do Gerente: ");
                            String dataNasc = scanner.next();

                            Gerente gerente1 = new Gerente(nome, salario, departamento, cpf, dataNasc);
                            listaGerentes.add(gerente1);
                            
                            System.out.println("Gerente cadastrado com sucesso.");
                            System.out.println("--------------------------------------------");
                        break;

                        case 1:
                            System.out.print("Digite o nome do Desenvolvedor: ");
                            nome = scanner.next();
                            
                            System.out.print("Digite o salário do Desenvolvedor: ");
                            salario = scanner.nextInt();
                            
                            System.out.print("Digite o departamento do Desenvolvedor: ");
                            departamento = scanner.next();

                            System.out.print("Digite o cpf do Desenvolvedor: ");
                            cpf = scanner.next();

                            System.out.print("Digite a data de nascimento do Desenvolvedor: ");
                            dataNasc = scanner.next();

                            Desenvolvedor dev1 = new Desenvolvedor(nome, salario, departamento, cpf, dataNasc);
                            listaDevs.add(dev1);
                            
                            System.out.println("Desenvolvedor cadastrado com sucesso.");
                            System.out.println("--------------------------------------------");
                        break;

                        case 2:
                            System.out.print("Digite o nome do Estagiário: ");
                            nome = scanner.next();
                            
                            System.out.print("Digite o salário do Estagiário: ");
                            salario = scanner.nextInt();
                            
                            System.out.print("Digite o departamento do Estagiário: ");
                            departamento = scanner.next();

                            System.out.print("Digite o cpf do Estagiário: ");
                            cpf = scanner.next();

                            System.out.print("Digite a data de nascimento do Estagiário: ");
                            dataNasc = scanner.next();

                            Estagiario estagiario1 = new Estagiario(nome, salario, departamento, cpf, dataNasc);
                            listaEstagiarios.add(estagiario1);
                            
                            System.out.println("Estagiário cadastrado com sucesso.");
                            System.out.println("--------------------------------------------");
                        break;
                    
                        default:
                            System.out.println("Opção Inválida.");
                        break;
                    }
                    
                break;
                case 2:
                    
                    System.out.println("Você selecionou: Exibição de dados de funcionários existentes.");
                    System.out.print("Selecione o tipo de funcionário que deseja visualizar (0 para Gerente, 1 para Desenvolvedor e 2 para Estagiário): ");
                    int tipoFuncionarioVisualizacao = scanner.nextInt();
                    
                    switch (tipoFuncionarioVisualizacao) {
                        case 0:
                            if (listaGerentes.isEmpty()) {
                                System.out.println("Nenhum Gerente está cadastrado.");
                            } else {
                                System.out.println("--------------------------------------------");
                                System.out.println("Lista de Gerentes:");
                                for (Gerente gerente : listaGerentes) {
                                    gerente.mostrarDados();
                                }
                                System.out.println("--------------------------------------------");
                            }
                        break;

                        case 1:
                            if (listaDevs.isEmpty()) {
                                System.out.println("Nenhum Desenvolvedor está cadastrado.");
                            } else {
                                System.out.println("--------------------------------------------");
                                System.out.println("Lista de Desenvolvedores:");
                                for (Desenvolvedor desenvolvedor : listaDevs) {
                                    desenvolvedor.mostrarDados();
                                }
                                System.out.println("--------------------------------------------");
                            }
                        break;

                        case 2:
                            if (listaEstagiarios.isEmpty()) {
                                System.out.println("Nenhum Estagiário está cadastrado.");
                            } else {
                                System.out.println("--------------------------------------------");
                                System.out.println("Lista de Estagiários:");
                                for (Estagiario estagiario : listaEstagiarios) {
                                    estagiario.mostrarDados();
                                }
                                System.out.println("--------------------------------------------");
                            }
                        break;
                    
                        default:
                            System.out.println("Opção Inválida.");
                        break;
                    }
                    
                break;
                case 3:
                    System.out.println("Você selecionou: Sair.");
                    System.out.println("Programa encerrado.");
                break;
                default:
                    System.out.println("Opção Inválida.");
                    System.out.println("--------------------------------------------");
                break;
            }

        } while (op != 3);

        scanner.close();
    }
}