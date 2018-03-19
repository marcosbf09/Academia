/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDs;

import academia.Equipamento;
import academia.Fornecedor;
import academia.Produto;
import java.util.Scanner;
import javax.persistence.EntityManager;
import modelo.persistencia.PersistenciaPU;

/**
 *
 * @author Marcos
 */

public class CrudEquipamento {

    public CrudEquipamento() {
    }
    
    public void CadastrarEquipamento(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int x = 1, op, codigo, tipo;
            String estado, descricao;
            int cnpj;
            

            while(x==1){
                Equipamento a = new Equipamento();


                System.out.println("Codigo: ");
                codigo = entrada.nextInt();
                a.setCodigo(codigo);

                entrada.nextLine();
                System.out.println("Descricao: ");
                descricao = entrada.nextLine();
                a.setDescricao(descricao);
                
                
                System.out.println("Tipo do Equipamento: ");
                tipo = entrada.nextInt();
                a.setTipoEquipamento(tipo);
                
                entrada.nextLine();
                System.out.println("Estado do Equipamento: ");
                estado = entrada.nextLine();
                a.setEstado(estado);
                

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
    
    public void excluirEquipamento(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int codigo;

                System.out.println("Digite o codigo do equipamento: ");
                codigo = entrada.nextInt();
                
                em.getTransaction().begin();
                
                em.remove(codigo);

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
    public void consultarEq(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int cod;

                System.out.println("Digite o codigo do equipamento: ");
                cod = entrada.nextInt();
                
                em.getTransaction().begin();
                
                Equipamento b = em.find(Equipamento.class, cod);
                System.out.println("\nDescrição: "+b.getDescricao());
                System.out.println("Codigo: "+b.getCodigo());
                System.out.println("Estado: "+b.getEstado());
                System.out.println("Tipo de Equipamento: "+b.getTipoEquipamento());
               

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
    
    
    
    public void atualizarEq(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int x, estoque;
            String nome, estado;
            double valor;
            int id;

                System.out.println("Digite o codigo do equipamento: ");
                id = entrada.nextInt();

                em.getTransaction().begin();
                
                Equipamento a = em.find(Equipamento.class, id);
                entrada.nextLine();
                
                System.out.println("Deseja atualizar descricao? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    entrada.nextLine();
                    System.out.println("Descricao: ");
                    nome = entrada.nextLine();
                    a.setDescricao(nome);
                }

                System.out.println("Deseja atualizar Tipo do Equipamento? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    System.out.println("Tipo: ");
                    estoque = entrada.nextInt();
                    a.setTipoEquipamento(estoque);
                }

                System.out.println("Deseja atualizar Estado? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    entrada.nextLine();
                    System.out.println("Estado: ");
                    estado = entrada.nextLine();
                    a.setEstado(estado);
                }

 

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
}
