/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDs;

import academia.Aluno;
import java.util.Scanner;
import javax.persistence.EntityManager;
import modelo.persistencia.PersistenciaPU;

/**
 *
 * @author Marcos
 */

public class CrudAluno {

    
    public CrudAluno() {
    }
    
    public void CadastrarAluno(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int x = 1, op, rg, cpf, telefone, mensalidade;
            String nome, endereco, datanasc, datamatr, datacancel;
            int id;
            

            while(x==1){
                Aluno a = new Aluno();
                
                
                System.out.println("Nome: ");
                nome = entrada.nextLine();
                a.setNome(nome);

                System.out.println("ID: ");
                id = entrada.nextInt();
                a.setIdPessoa(id);

                System.out.println("RG: ");
                rg = entrada.nextInt();
                a.setRg(rg);

                System.out.println("CPF: ");
                cpf = entrada.nextInt();
                a.setCpf(cpf);
                
                System.out.println("Telefone: ");
                telefone = entrada.nextInt();
                a.setTelefone(telefone);
                
                entrada.nextLine();
                System.out.println("Endereco: ");
                endereco = entrada.nextLine();
                a.setEndereco(endereco);
                
                entrada.nextLine();
                System.out.println("Data de Nascimento: ");
                datanasc = entrada.nextLine();
                a.setDataNasc(datanasc);
                
                System.out.println("Mensalidade: ");
                mensalidade = entrada.nextInt();
                a.setMensalidadeRef(mensalidade);
                
                entrada.nextLine();
                System.out.println("Data da Matricula: ");
                datamatr = entrada.nextLine();
                a.setDataMatricula(datamatr);
                
                entrada.nextLine();
                System.out.println("Data do Cancelamento da Matricula (se houver): ");
                datacancel = entrada.nextLine();
                a.setDataCancelMatr(datacancel);
                
                
                
                em.getTransaction().begin();
                
                em.persist(a);
                
                em.getTransaction().commit();


                System.out.println("\nDeseja continuar cadastrando alunos? 1-Sim, 2-Nao");
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
    
    public void excluirAluno(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int cpf;

                em.getTransaction().begin();
                
                System.out.println("Digite o cpf do aluno: ");
                cpf = entrada.nextInt();
                
                Aluno b = em.find(Aluno.class, cpf);
                cpf = b.getCpf();
                
                em.remove(cpf);

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
    public void consultarAluno(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int cpf;

                System.out.println("Digite o cpf do aluno: ");
                cpf = entrada.nextInt();
                
                em.getTransaction().begin();
                
                Aluno b = em.find(Aluno.class, cpf);
                System.out.println("\nNome: "+b.getNome());
                System.out.println("ID: "+b.getIdPessoa());
                System.out.println("CPF: "+b.getCpf());
                System.out.println("RG: "+b.getRg());
                System.out.println("Endereço: "+b.getEndereco());
                System.out.println("Telefone: "+b.getTelefone());
                System.out.println("Data de Nascimento: "+b.getDataNasc());
                System.out.println("Data de Matricula: "+b.getDataMatricula());
                System.out.println("Data de Cancelamento de Matricula: "+b.getDataCancelMatr());
                System.out.println("Mensalidade: "+b.getMensalidadeRef());

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
    
    
    
    public void atualizarAluno(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int x, rg, cpf, telefone, mensalidade;
            String nome, endereco, datanasc, datamatr, datacancel;
            int id;

                System.out.println("Digite o cpf do aluno: ");
                cpf = entrada.nextInt();

                em.getTransaction().begin();
                
                Aluno a = em.find(Aluno.class, cpf);
                entrada.nextLine();
                
                System.out.println("Deseja atualizar nome? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    entrada.nextLine();
                    System.out.println("Nome: ");
                    nome = entrada.nextLine();
                    a.setNome(nome);
                }
  
                System.out.println("Deseja atualizar ID? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    System.out.println("ID: ");
                    id = entrada.nextInt();
                    a.setIdPessoa(id);
                }
                
                
                System.out.println("Deseja atualizar RG? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    System.out.println("RG: ");
                    rg = entrada.nextInt();
                    a.setRg(rg);
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
                    System.out.println("Endereco: ");
                    endereco = entrada.nextLine();
                    a.setEndereco(endereco);
                }
                
                System.out.println("Deseja atualizar Data de Nascimento? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    entrada.nextLine();
                    System.out.println("Data de Nascimento: ");
                    datanasc = entrada.nextLine();
                    a.setDataNasc(datanasc);
                }
                
                System.out.println("Deseja atualizar Mensalidade? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    System.out.println("Mensalidade: ");
                    mensalidade = entrada.nextInt();
                    a.setMensalidadeRef(mensalidade);
                }
                
                System.out.println("Deseja atualizar Data de Matricula? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    entrada.nextLine();
                    System.out.println("Data da Matricula: ");
                    datamatr = entrada.nextLine();
                    a.setDataMatricula(datamatr);
                }
                
                System.out.println("Deseja atualizar Data de Cancelamento de Matricula? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    entrada.nextLine();
                    System.out.println("Data do Cancelamento da Matricula (se houver): ");
                    datacancel = entrada.nextLine();
                    a.setDataCancelMatr(datacancel);
                }

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
}
