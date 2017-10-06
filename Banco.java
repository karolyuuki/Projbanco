package Banco;
/**
 *
 * @author Karoline Neves Bernardo - 11311868
 */

import java.util.ArrayList;
import java.util.HashMap;


public class Banco {
    private HashMap<Conta, Cliente> cadastro;
    
    public Banco(){
        cadastro = new HashMap<>();
    }
    
    public void inserir(Conta c, Cliente c1){
        cadastro.put(c, c1);
    }
    
    public Conta buscaConta(String numero){
        for (Conta c : cadastro.keySet()) {
            if(c.getNumero().equals(numero))
                return c;
        }
        return null;
    }
    
    public Cliente buscaCliente(String cpf){
        for(Cliente c: cadastro.values()){
            if(c.getCpf().equals(cpf))
                return c;
        }
        return null;
    }
    
    public ArrayList<Conta> buscaContasdeUmCliente(String cpf){
        ArrayList<Conta> cnt = new ArrayList<>();
        for(HashMap.Entry<Conta, Cliente> cc: cadastro.entrySet()){
            Conta c = cc.getKey();
            Cliente c1 = cc.getValue();
            if(c1.getCpf().equals(cpf))
                cnt.add(c);
        }
        return cnt;
    }
}
