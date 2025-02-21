package confeitaria;
import java.io.IOException;
import java.util.Scanner;
import confeitaria.model.Bolo;
import confeitaria.model.CupCake;
import confeitaria.model.Produto;

import controller.ConfeitariaController;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao, tipo, numero;
		String sabor, tamanho, cobertura, decoracao, produto;
		float preco;

		ConfeitariaController produtos = new ConfeitariaController();

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
				System.out.println(Cores.TEXT_CYAN + "Adicionar Produtos\n");

				do {
					System.out.print("Digite o Tipo do Produto (1-Bolo ou 2-CupCake): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);
				leia.skip("\\R?");

				System.out.print("Digite o Sabor : ");
				sabor = leia.nextLine();

				System.out.print("Digite o Tamanho: ");
				tamanho = leia.nextLine();

				System.out.print("Digite o Valor: R$ ");
				preco = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.print("Digite a Cobertura: ");
					leia.skip("\\R?");
					cobertura = leia.nextLine();
					produtos.cadastrar(new Bolo(produtos.gerarNumero(), tipo, sabor, tamanho, preco, cobertura));
				}
				case 2 -> {
					System.out.print("Digite a decoração desejada: ");
					leia.skip("\\R?");
					decoracao = leia.nextLine();
					produtos.cadastrar(new CupCake(produtos.gerarNumero(), tipo, sabor, tamanho, preco, decoracao));
				}
				}

				keyPress();
				break;

			case 2:
				System.out.println(Cores.TEXT_CYAN + "Listar todos os Produtos\n\n");

				produtos.listarTodas();

				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_CYAN + "Buscar Produto por Numero\n\n");
				System.out.println("Digite o número do produto: ");
				numero = leia.nextInt();
				produtos.procurarPorNumero(numero);

				keyPress();
				break;

			case 4:
				System.out.println(Cores.TEXT_CYAN + "Atualizar Dados do Produto \n\n");

				System.out.print("Digite o número do produto: ");
				numero = leia.nextInt();

				var buscaProduto = produtos.buscarNaCollection(numero);

				if (buscaProduto != null) {
					System.out.print("Digite o tipo: ");
					leia.skip("\\R?");
					tipo = leia.nextInt();
					
					System.out.print("Digite o sabor: ");
					leia.skip("\\R?");
					sabor = leia.nextLine();
					
					System.out.print("Digite o tamanho: ");
					leia.skip("\\R?");
					tamanho = leia.nextLine();
					
					System.out.print("Digite o valor (R$) : ");
					leia.skip("\\R?");
					preco = leia.nextFloat();

					tipo = buscaProduto.getTipo();

					switch (tipo) {
					case 1 -> {
						System.out.print("Digite a Cobertura: ");
						leia.skip("\\R?");
						cobertura = leia.nextLine();
						produtos.atualizar(new Bolo(numero, tipo, sabor, tamanho, preco, cobertura));
					}
					case 2 -> {
						System.out.print("Digite a decoração desejada: ");
						leia.skip("\\R?");
						decoracao = leia.nextLine();
						produtos.atualizar(new CupCake(numero, tipo, sabor, tamanho, preco, decoracao));
					}

					default -> {
						System.out.println("Tipo de produto inválido!");
					}
					}

				} else
					System.out.println("\nProduto não encontrado!");

				keyPress();
				break;

			case 5:
				System.out.println(Cores.TEXT_CYAN + "Deletar Produto \n\n");
				System.out.println("Digite o número do produto: ");
				numero = leia.nextInt();

				produtos.deletar(numero);

				keyPress();
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

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}
