/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author Karoline Neves Bernardo - 11311868
 */
public class Conta {
   String numero;
    double saldo;
    
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public String getNumero(){
        return this.numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public void debitar(double valor){
        this.saldo = this.saldo - valor;
    }
    
    public void creditar(double valor){
        this.saldo = this.saldo + valor;
    }
    
    public Conta(){
        numero = "7777";
        saldo = 1000000;
    }
    
    public Conta(String numeros, double saldos){
        saldo = saldos;
        numero = numeros;           
    }

    @Override
	public String toString() {
		return "Numero Saldo";
	}
}
