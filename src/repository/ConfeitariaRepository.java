package repository;

import confeitaria.model.Produto;

public interface ConfeitariaRepository {

	// CRUD da Conta
		public void procurarPorNumero(int tipo);
		public void listarTodas();
		public void cadastrar(Produto produto);
		public void atualizar(Produto produto);
		public void deletar(int tipo);
		
}
