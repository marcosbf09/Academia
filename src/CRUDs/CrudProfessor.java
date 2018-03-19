/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDs;

import academia.Administrador;
import academia.Aluno;
import academia.Professor;
import java.util.Scanner;
import javax.persistence.EntityManager;
import modelo.persistencia.PersistenciaPU;

/**
 *
 * @author Marcos
 */

public class CrudProfessor {

    public CrudProfessor() {
    }
    
    public void CadastrarProfessor(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int x = 1, op, rg, cpf, telefone, salario, senha ;
            String nome, endereco, datanasc, funcao, dataad, datadem, login;
            int id;
            

            while(x==1){
                Professor a = new Professor();

                
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
                
                System.out.println("Salario: ");
                salario = entrada.nextInt();
                a.setSalarioRef(salario);
                
                entrada.nextLine();
                System.out.println("Funcao: ");
                funcao = entrada.nextLine();
                a.setFuncao(funcao);
                
                entrada.nextLine();
                System.out.println("Data de Admissao: ");
                dataad = entrada.nextLine();
                a.setDataAdmissao(dataad);
                
                entrada.nextLine();
                System.out.println("Data de Demissao (se houver): ");
                datadem = entrada.nextLine();
                a.setDataDemissao(datadem);
                
                entrada.nextLine();
                System.out.println("LOGIN: ");
                login = entrada.nextLine();
                a.setLogin(login);
                
                System.out.println("SENHA: ");
                senha = entrada.nextInt();
                a.setSenha(senha);
                

                
                em.getTransaction().begin();
                
                em.persist(a);
                
                em.getTransaction().commit();


                System.out.println("\nDeseja continuar cadastrando professores? 1-Sim, 2-Nao");
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
    
    public void ExcluirProfessor(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int cpf;

                System.out.println("Digite o cpf do professor: ");
                cpf = entrada.nextInt();
                
                em.getTransaction().begin();
                
                em.remove(cpf);

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
    public void consultarProf(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int cpf;

                System.out.println("Digite o cpf: ");
                cpf = entrada.nextInt();
                
                em.getTransaction().begin();
                
                Professor b = em.find(Professor.class, cpf);
                System.out.println("\nNome: "+b.getNome());
                System.out.println("ID: "+b.getIdPessoa());
                System.out.println("CPF: "+b.getCpf());
                System.out.println("RG: "+b.getRg());
                System.out.println("Endereço: "+b.getEndereco());
                System.out.println("Telefone: "+b.getTelefone());
                System.out.println("Data de Nascimento: "+b.getDataNasc());
                System.out.println("Função: "+b.getFuncao());
                System.out.println("Data de Admissao: "+b.getDataAdmissao());
                System.out.println("Data de Demissão: "+b.getDataDemissao());
                System.out.println("Salario: "+b.getSalarioRef());

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
    
    
    
    public void atualizarProf(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int x, rg, cpf, telefone, salario, senha;
            String nome, endereco, datanasc, funcao, dataad, datadem, login;
            int id;

                System.out.println("Digite o cpf: ");
                cpf = entrada.nextInt();

                em.getTransaction().begin();
                
                Professor a = em.find(Professor.class, cpf);
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
                
                System.out.println("Deseja atualizar Funcao? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    entrada.nextLine();
                    System.out.println("Funcao: ");
                    funcao = entrada.nextLine();
                    a.setFuncao(funcao);
                }
                
                System.out.println("Deseja atualizar Salario? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    System.out.println("Salario: ");
                    salario = entrada.nextInt();
                    a.setSalarioRef(salario);
                }
                
                System.out.println("Deseja atualizar Data de Admissao? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    entrada.nextLine();
                    System.out.println("Data de Admissao: ");
                    dataad = entrada.nextLine();
                    a.setDataAdmissao(dataad);
                }
                
                System.out.println("Deseja atualizar Data de Demissao? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    entrada.nextLine();
                    System.out.println("Data de Demissao: ");
                    datadem = entrada.nextLine();
                    a.setDataDemissao(datadem);
                }
                
                System.out.println("Deseja atualizar Login? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    entrada.nextLine();
                    System.out.println("Login: ");
                    login = entrada.nextLine();
                    a.setDataDemissao(login);
                }

                System.out.println("Deseja atualizar Senha? Digite 1 se sim");
                x = entrada.nextInt();
                if(x==1){
                    System.out.println("Senha: ");
                    senha = entrada.nextInt();
                    a.setSenha(senha);
                }
                

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
}
