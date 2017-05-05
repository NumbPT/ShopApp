package service;

import java.util.ArrayList;

import model.Produto;

public class SProdutos {
	
	ArrayList<Produto> arProdutos;

	public SProdutos() {
		arProdutos = new ArrayList<>();
	}

	public ArrayList<Produto> getArProdutos() {
		return arProdutos;
	}

	public void setArProdutos(ArrayList<Produto> arProdutos) {
		this.arProdutos = arProdutos;
	}
	
	public void addProduto(String nome, int qtd, double preco) {
		Produto p = new Produto(nome,qtd,preco);
		
		this.arProdutos.add(p);
	}
	

}
