/**
 * Project: Basketball League
 * By Nicolas Gabriel
 * 1. Register Teams
 * 2. Register Players of own teams
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LeagueManager manage = new LeagueManager(); // Instance of the class "LeagueManager"
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1) Cadastrar Time");
            System.out.println("2) Cadastrar Jogador em Time");
            System.out.println("3) Listar Times e Jogadores");
            System.out.println("4) Sair");
            System.out.print("Escolha uma opção: ");

            int op = sc.nextInt();
            sc.nextLine(); // consome o enter

            switch (op) {
                case 1:
                    System.out.print("Nome do time: ");
                    String tName = sc.nextLine();
                    manage.registerTeam(tName);
                    System.out.println("Time cadastrado!");
                    break;
                case 2:
                    System.out.print("Time do jogador: ");
                    String team = sc.nextLine();
                    System.out.print("Nome do jogador: ");
                    String pName = sc.nextLine();
                    System.out.print("Sobrenome do jogador: ");
                    String pLastname = sc.nextLine();
                    System.out.print("Número do jogador: ");
                    int number = sc.nextInt();
                    sc.nextLine();
                    boolean ok = manage.registerPlayer(team, pName, pLastname, number);
                    System.out.println(ok ? "Jogador cadastrado!" : "Time não encontrado.");
                    break;
                case 3:
                    manage.listAll();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}