
package Banco;
import java.util.ArrayList;
/**
 *
 * @author Karol
 */
public class TestaBanco {
    public static void main (String[] args) {
        
        //Instancia as contas
        Conta ct1 = new Conta("10", 3);
        Conta ct2 = new Conta("20", 200);
        Conta ct3 = new Conta("30", 5300);
        Conta ct4 = new Conta("40", 50);
        Conta ct5 = new Conta("320", 425);
        
        //Instancia os clientes
        Cliente c1 = new Cliente("Avelan", "222.333.555-49");
        Cliente c2 = new Cliente("Marion", "111.111.111-22");
        Cliente c3 = new Cliente("Nim", "059.927.509-77");
        
        //Instancia o banco
        Banco b = new Banco();
        
        //Insere as contas no banco
        b.inserir(ct1, c1);
        b.inserir(ct3, c1);
        b.inserir(ct2, c2);
        b.inserir(ct4, c3);
        b.inserir(ct5, c3);

        // Testes
        Conta busca = b.buscaConta("40");
        Cliente busca_cliente = b.buscaCliente("059.927.509-77");
        ArrayList<Conta> busca_contas = b.buscaContasdeUmCliente("222.333.555-49");
        System.out.println(busca.toString());
        System.out.println(busca_cliente.toString());
        
        for(Conta c: busca_contas){
            System.out.println(c.toString());
        }
    }
}
