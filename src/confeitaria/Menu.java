package confeitaria;

import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao, tipo;

		while (true) {

			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND
					+ "♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**");
			System.out.println("                                                      ");
			System.out.println("               ♥ ELI ATELIÊ DE DOCES ♥                ");
			System.out.println("                                                      ");
			System.out.println("♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**");
			System.out.println("                                                      ");
			System.out.println("            1 - Adicionar Produtos                    ");
			System.out.println("            2 - Listar todos os Produtos              ");
			System.out.println("            3 - Buscar Produto por Numero             ");
			System.out.println("            4 - Atualizar Dados do Produto            ");
			System.out.println("            5 - Deletar Produto                       ");
			System.out.println("            6 - Sair                                  ");
			System.out.println("                                                      ");
			System.out.println("♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**");
			System.out.println("Entre com a opção desejada:                           ");
			System.out.println("                                                      " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println(Cores.TEXT_CYAN_BOLD
						+ "\n♥ Eli Ateliê de Doces - Tudo feito com Carinho e recheados de Amor ♥\n");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_CYAN + "Adicionar Produtos\n\n");

				do {
					System.out.println("Digite o Tipo do Produto (1-Bolo ou 2-CupCake): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				break;
			case 2:
				System.out.println(Cores.TEXT_CYAN + "Listar todos os Produtos\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_CYAN + "Buscar Produto por Numero\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_CYAN + "Atualizar Dados do Produto \n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_CYAN + "Deletar Produto \n\n");

				break;

			default:
				System.out.println(Cores.TEXT_CYAN + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Eliane Medeiros - elianep@genstudents.org");
		System.out.println("github.com/elianempontes");
		System.out.println("♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**♥**");
	}

}
