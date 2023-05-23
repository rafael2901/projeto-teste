package br.com;

public class Produto {

	private Long codigo;
	private String descricao;
	private int quantidade;
	private double valor;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String consultar(int codigo) {

		int codigoCadastrado = 0;
		
		if (codigo == codigoCadastrado) {
			System.out.println("O nome desse produto é: " +getCodigo());
		}
		else {
			System.out.println("Erro! código invalido.");
		}

		return " sla ";
	}

	public Produto(Long codigo, String descricao, int quantidade, double valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valor = valor;

	}

}
