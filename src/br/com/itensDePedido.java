package br.com;

public class itensDePedido {
   
	private int quantidade;
	private Produto produto;
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public boolean incrementaQtde() {
		
		System.out.println("insira a quantidade que deseja desse produto" +getQuantidade());
				
		return false;
		
	}
	
	public boolean decrementaQtde() {
		
		System.out.println("Qual produto você deseja decrementar?" +getQuantidade());
		
		return false;
		
	}
	
	
}
