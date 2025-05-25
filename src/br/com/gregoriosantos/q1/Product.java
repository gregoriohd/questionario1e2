package br.com.gregoriosantos.q1;

import java.util.Objects;

public class Product {

	private String name;
	private String barCode;
	private double preco;
	
	public Product(String name, String barCode, double preco) {
		this.name = name;
		this.barCode = barCode;
		this.preco = preco;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(barCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(barCode, other.barCode);
	}
	
	

}
