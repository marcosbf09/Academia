/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDs;


import academia.Fornecedor;
import java.util.Scanner;
import javax.persistence.EntityManager;
import modelo.persistencia.PersistenciaPU;

/**
 *
 * @author Marcos
 */

public class CrudFornecedor {

    public CrudFornecedor() {
    }
    
        public void CadastrarFornecedor(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int x = 1, op, rg, cpf, telefone, salario, senha ;
            String razao, endereco, datanasc, funcao, dataad, datadem, login;
            int cnpj;
            

            while(x==1){
                Fornecedor a = new Fornecedor();


                System.out.println("CNPJ: ");
                cnpj = entrada.nextInt();
                a.setCnpj(cnpj);

                entrada.nextLine();
                System.out.println("Razao Social: ");
                razao = entrada.nextLine();
                a.setRazaoSocial(razao);
                
                entrada.nextLine();
                System.out.println("Endereco: ");
                endereco = entrada.nextLine();
                a.setEndereco(endereco);
                
                System.out.println("Telefone: ");
                telefone = entrada.nextInt();
                a.setTelefone(telefone);
                

                em.getTransaction().begin();
                
                em.persist(a);
                
                em.getTransaction().commit();


                System.out.println("\nDeseja continuar cadastrando Fornecedores? 1-Sim, 2-Nao");
                op = entrada.nextInt();

                if(op==1){
                    entrada.nextLine(); 
                }
                if(op==2){
                       x = 0;
                }

            }
        } catch (Exception e) {

        }
        
            
    }
        
    public void ExcluirFornecedor(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int cnpj;

                System.out.println("Digite o cnpj do fornecedor: ");
                cnpj = entrada.nextInt();
                
                em.getTransaction().begin();
                
                em.remove(cnpj);

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
        public void consultarFornecedor(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int cnpj;

                System.out.println("Digite o cnpj: ");
                cnpj = entrada.nextInt();
                
                em.getTransaction().begin();
                
                Fornecedor b = em.find(Fornecedor.class, cnpj);
                System.out.println("\nRazão Social: "+b.getRazaoSocial());
                System.out.println("CNPJ: "+b.getCnpj());
                System.out.println("Enderçeço: "+b.getEndereco());
                System.out.println("Telefone: "+b.getTelefone());
               

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
    
    
    
    public void atualizarFornecedor(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int x, telefone;
            String nome, endereco;
            int cnpj;

                System.out.println("Digite o cnpj: ");
                cnpj = entrada.nextInt();

                em.getTransaction().begin();
                
                Fornecedor a = em.find(Fornecedor.class, cnpj);
                entrada.nextLine();
                
                System.out.println("Deseja atualizar Razão Social? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    entrada.nextLine();
                    System.out.println("Razão Social: ");
                    nome = entrada.nextLine();
                    a.setRazaoSocial(nome);
                }

                System.out.println("Deseja atualizar Telefone? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    System.out.println("Telefone: ");
                    telefone = entrada.nextInt();
                    a.setTelefone(telefone);
                }

                System.out.println("Deseja atualizar Endereço? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    entrada.nextLine();
                    System.out.println("Endereço: ");
                    endereco = entrada.nextLine();
                    a.setEndereco(endereco);
                }

 

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
}
