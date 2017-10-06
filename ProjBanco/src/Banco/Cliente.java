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
public class Cliente {
    String cpf;
    String nome;
    
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    
    public Cliente(){
        nome = "Nome e sobrenome";
        cpf = "123.456.789-90";
    }
    
    public Cliente(String nomes, String cpfs){
        nome = nomes;
        cpf = cpfs;           
    }
    
	@Override
	public String toString(){
		return "Nome:" + nome + "\n" + "Cpf:" + cpf;
        }
    
}
