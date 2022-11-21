package model;

import java.util.Date;

public class Pedido {

	private Integer numero_pedido;
	private double valor_bruto;
	private double desconto;
	private double valor_total;
	
	public Integer getNumero_pedido() {
		return numero_pedido;
	}
	public void setNumero_pedido(Integer numero_pedido) {
		this.numero_pedido = numero_pedido;
	}
	
	public double getValor_bruto() {
		return valor_bruto;
	}
	public void setValor_bruto(double valor_bruto) {
		this.valor_bruto = valor_bruto;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	
	 
	
}
