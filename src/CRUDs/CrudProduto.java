/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDs;

import academia.Aluno;
import academia.Produto;
import java.util.Scanner;
import javax.persistence.EntityManager;
import modelo.persistencia.PersistenciaPU;

/**
 *
 * @author Marcos
 */

public class CrudProduto {
    

    public CrudProduto() {
    }
    
    
    public void cadastrarProduto(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int x = 1, estoque, op;
            String nome;
            int id;
            double valor;

            while(x==1){
                Produto a = new Produto();

                
                System.out.println("Nome: ");
                nome = entrada.nextLine();
                a.setNomeProduto(nome);


                System.out.println("ID: ");
                id = entrada.nextInt();
                a.setIdProduto(id);

                System.out.println("Valor de venda: ");
                valor = entrada.nextDouble();
                a.setValorVenda(valor);

                System.out.println("Quantidade em estoque: ");
                estoque = entrada.nextInt();
                a.setEstoque(estoque);
                
                em.getTransaction().begin();
                
                em.persist(a);
                
                em.getTransaction().commit();


                System.out.println("\nDeseja continuar cadastrando produtos? 1-Sim, 2-Nao");
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
    
    public void excluirProduto(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int id;

                System.out.println("Digite o ID do produto: ");
                id = entrada.nextInt();
                
                em.getTransaction().begin();
                
                em.remove(id);

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
    public void consultarProd(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int id;

                System.out.println("Digite o ID do produto: ");
                id = entrada.nextInt();
                
                em.getTransaction().begin();
                
                Produto b = em.find(Produto.class, id);
                System.out.println("\nNome: "+b.getNomeProduto());
                System.out.println("ID: "+b.getIdProduto());
                System.out.println("Quantidade em Estoque: "+b.getEstoque());
                System.out.println("Valor de Venda: "+b.getValorVenda());
               

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
    
    
    
    public void atualizarProd(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int x, estoque;
            String nome;
            double valor;
            int id;

                System.out.println("Digite o ID do produto: ");
                id = entrada.nextInt();

                em.getTransaction().begin();
                
                Produto a = em.find(Produto.class, id);
                entrada.nextLine();
                
                System.out.println("Deseja atualizar nome? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    entrada.nextLine();
                    System.out.println("Nome: ");
                    nome = entrada.nextLine();
                    a.setNomeProduto(nome);
                }

                System.out.println("Deseja atualizar Estoque? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    System.out.println("Quantidade em estoque: ");
                    estoque = entrada.nextInt();
                    a.setEstoque(estoque);
                }

                System.out.println("Deseja atualizar Valor de venda? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    System.out.println("Telefone: ");
                    valor = entrada.nextDouble();
                    a.setValorVenda(valor);
                }

 

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
}
