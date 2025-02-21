package confeitaria.model;

public class Bolo extends Produto {

	private String cobertura;

	public Bolo(int numero, int tipo, String sabor, String tamanho, float preco, String cobertura) {
		super(numero, tipo, sabor, tamanho, preco);
		this.cobertura = cobertura;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("A cobertura é: " + this.cobertura);
	}

}
