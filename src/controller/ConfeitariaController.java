package controller;
import java.util.ArrayList;
import java.util.Arrays;

import confeitaria.model.Produto;
import repository.ConfeitariaRepository;



public class ConfeitariaController implements ConfeitariaRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	/**
	 * Procurar Produto por Numero
	 */
	@Override
	public void procurarPorNumero(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null)
			produto.visualizar();
		else
			System.out.println("\nO produto: " + numero + " não foi encontrado!");
	}

	/**
	 * Método Listar todos os Produtos
	 */
	@Override
	public void listarTodas() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}

	}

	/**
	 * Método Cadastrar Produtos
	 */
	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto); 
		System.out.println("\nO Produto: " + produto.getNumero() + " foi criado com sucesso!");

	}

	/**
	 * Método Atualizar Produtos
	 */
	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getNumero());

		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO Produto: " + produto.getNumero() + " foi atualizado com sucesso!");
		} else
			System.out.println("\nO Produto: " + produto.getNumero() + " não foi encontrado!");

	}

	/**
	 * Método Deletar Produtos
	 */
	@Override
	public void deletar(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nO Produto numero: " + numero + " foi deletado com sucesso!");
		} else
			System.out.println("\nO produto numero: " + numero + " não foi encontrado!");
	}
	

	public int gerarNumero() {
		return ++ numero;
	}

	public Produto buscarNaCollection(int numero) {
		for (var produto : listaProdutos) {
			if (produto.getNumero() == numero) {
				return produto;
			}
		}
		
		return null;
	}
}
