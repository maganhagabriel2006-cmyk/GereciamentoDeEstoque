package entities;

public class Estoque {
	
	private String nome;
	private int codigo;
	private double preço;
	
	
	public Estoque(String nome, int codigo, double preço) {
		this.nome = nome;
		this.codigo = codigo;
		this.preço = preço;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public double getPreço() {
		return preço;
	}


	public void setPreço(double preço) {
		this.preço = preço;
	}


	@Override
	public String toString() {
		return "Nome:"+ nome +"," + "Codigo:"+codigo + ","  + String.format("%.3f",+preço);
	}
	
	
	
	
	
	
	
	

}
