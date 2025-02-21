package confeitaria.model;

public abstract class Produto {

	private int numero;
	private int tipo;
	private String sabor;
	private String tamanho;
	private float preco;

	public Produto(int numero, int tipo, String sabor, String tamanho, float preco) {
		this.numero = numero;
		this.tipo = tipo;
		this.sabor = sabor;
		this.tamanho = tamanho;
		this.preco = preco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {

		case 1:
			tipo = "Bolo";
			break;
		case 2:
			tipo = "CupCake";
			break;
		}

		System.out.println("\n\n*********************************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("*********************************************************************");
		System.out.println("Numero do Produto: " + this.numero);
		System.out.println("Tipo do Produto: " + tipo);
		System.out.println("Sabor: " + this.sabor);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Preço: " + this.preco);

	}

}