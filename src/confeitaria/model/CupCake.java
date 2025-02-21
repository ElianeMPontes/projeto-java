package confeitaria.model;

public class CupCake extends Produto {

	private String decoracao;

	public CupCake(int numero, int tipo, String sabor, String tamanho, float preco, String decoracao) {
		super(numero, tipo, sabor, tamanho, preco);
		this.decoracao = decoracao;
	}

	public String getDecoracao() {
		return decoracao;
	}

	public void setDecoracao(String decoracao) {
		this.decoracao = decoracao;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("A decoração é: " + this.decoracao);
	}
    
	
}
