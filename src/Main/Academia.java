/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import CRUDs.CrudAdministrador;
import CRUDs.CrudAluno;
import CRUDs.CrudEquipamento;
import CRUDs.CrudFornecedor;
import CRUDs.CrudProduto;
import CRUDs.CrudProfessor;
import CRUDs.CrudSecretaria;
import academia.Pessoa;
import java.util.Scanner;




/**
 *
 * @author Marcos
 */


public class Academia {

    /**
     * @param args the command line arguments
     * 
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
       
         /* Foram desenvolvidas a ligação do código com o banco de dados (persistência de dados) 
            através do framework JPA, ou seja, a criação de uma classe modelo persistencia,
            a configuração do persistence xml e a distribuição dos dados de forma coerente
            com o codigo no banco de dados.
         */
           
        
        
        Scanner entrada = new Scanner(System.in);
        CrudProduto crudproduto = new CrudProduto();
        CrudAluno crudaluno = new CrudAluno();
        CrudProfessor crudprofessor = new CrudProfessor();
        CrudAdministrador crudadm = new CrudAdministrador();
        CrudSecretaria crudsecretaria = new CrudSecretaria();
        CrudEquipamento crudeq = new CrudEquipamento();
        CrudFornecedor crudfornecedor = new CrudFornecedor();
        int op, p, q=0, s;

        
        while(q==0){
            
            System.out.println("\n\t\t::::: ERENCIAMENTO DE DADOS DA ACADEMIA  :::::\n");

            System.out.println(":: O que deseja acessar?");
            System.out.println(":: 1. Gerenciamento de Pessoas");
            System.out.println(":: 2. Gerenciamento de Produtos");
            System.out.println(":: 3. Gerenciamento de Equipamentos");
            System.out.println(":: 4. Gerenciamento de Fornecedores");
            System.out.println(":: 5. Sair");
            System.out.println(":: Digite o numero da sua escolha: ");

            op = entrada.nextInt();

            switch(op){
                case 1:
                    System.out.println("\n:: Escolha o tipo de Pessoa: ");
                    System.out.println(":: 1. Alunos");
                    System.out.println(":: 2. Professores");
                    System.out.println(":: 3. Secretarias");
                    System.out.println(":: 4. Administradores");
                    System.out.println(":: Digite sua escolha: ");
                    p = entrada.nextInt();
                    switch(p){
                        case 1:
                            System.out.println("\n:: O que deseja fazer? ");
                            System.out.println(":: 1. Cadastrar");
                            System.out.println(":: 2. Alterar");
                            System.out.println(":: 3. Consultar");
                            System.out.println(":: 4. Excluir");
                            System.out.println(":: 5. Digite sua escolha: ");
                            s = entrada.nextInt();
                            switch(s){
                                case 1: crudaluno.CadastrarAluno();
                                        break;
                                case 2: crudaluno.atualizarAluno();
                                        break;
                                case 3: crudaluno.consultarAluno();
                                        break;
                                case 4: crudaluno.excluirAluno();
                                        break;
                            }
                            break;
                        case 2:
                            System.out.println("\n:: O que deseja fazer? ");
                            System.out.println(":: 1. Cadastrar");
                            System.out.println(":: 2. Alterar");
                            System.out.println(":: 3. Consultar");
                            System.out.println(":: 4. Excluir");
                            System.out.println(":: 5. Digite sua escolha: ");
                            s = entrada.nextInt();
                            switch(s){
                                case 1: crudprofessor.CadastrarProfessor();
                                        break;
                                case 2: crudprofessor.atualizarProf();
                                        break;
                                case 3: crudprofessor.consultarProf();
                                        break;
                                case 4: crudprofessor.ExcluirProfessor();
                                        break;
                            }
                            break;
                        case 3:
                            System.out.println("\n:: O que deseja fazer? ");
                            System.out.println(":: 1. Cadastrar");
                            System.out.println(":: 2. Alterar");
                            System.out.println(":: 3. Consultar");
                            System.out.println(":: 4. Excluir");
                            System.out.println(":: 5. Digite sua escolha: ");
                            s = entrada.nextInt();
                            switch(s){
                                case 1: crudsecretaria.CadastrarSecretaria();
                                        break;
                                case 2: crudsecretaria.atualizarSec();
                                        break;
                                case 3: crudsecretaria.consultarSec();
                                         break;
                                case 4: crudsecretaria.ExcluirSecretaria();
                                        break;
                            }
                            break;
                        case 4:
                            System.out.println("\n:: O que deseja fazer? ");
                            System.out.println(":: 1. Cadastrar");
                            System.out.println(":: 2. Alterar");
                            System.out.println(":: 3. Consultar");
                            System.out.println(":: 4. Excluir");
                            System.out.println(":: 5. Digite sua escolha: ");
                            s = entrada.nextInt();
                            switch(s){
                                case 1: crudadm.CadastrarAdministrador();
                                        break;
                                case 2: crudadm.atualizarAdm();
                                        break;
                                case 3: crudadm.consultarAdm();
                                        break;
                                case 4: crudadm.excluirAdministrador();
                                         break;
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n:: O que deseja fazer? ");
                    System.out.println(":: 1. Cadastrar");
                    System.out.println(":: 2. Alterar");
                    System.out.println(":: 3. Consultar");
                    System.out.println(":: 4. Excluir");
                    System.out.println(":: 5. Digite sua escolha: ");
                    s = entrada.nextInt();
                        switch(s){
                            case 1: crudproduto.cadastrarProduto();
                                break;
                            case 2:crudproduto.atualizarProd();
                                break;
                            case 3: crudproduto.consultarProd();
                                break;
                            case 4: crudproduto.excluirProduto();
                                break;
                            }
                         break;
                case 3:
                    System.out.println("\n:: O que deseja fazer? ");
                    System.out.println(":: 1. Cadastrar");
                    System.out.println(":: 2. Alterar");
                    System.out.println(":: 3. Consultar");
                    System.out.println(":: 4. Excluir");
                    System.out.println(":: 5. Digite sua escolha: ");
                    s = entrada.nextInt();
                        switch(s){
                            case 1: crudeq.CadastrarEquipamento();
                                    break;
                            case 2:crudeq.atualizarEq();
                                    break;
                            case 3: crudeq.consultarEq();
                                    break;
                            case 4: crudeq.excluirEquipamento();
                                    break;
                            }
                    break;    
                case 4:
                    System.out.println("\n:: O que deseja fazer? ");
                    System.out.println(":: 1. Cadastrar");
                    System.out.println(":: 2. Alterar");
                    System.out.println(":: 3. Consultar");
                    System.out.println(":: 4. Excluir");
                    System.out.println(":: 5. Digite sua escolha: ");
                    s = entrada.nextInt();
                        switch(s){
                            case 1: crudfornecedor.CadastrarFornecedor();
                                    break;
                            case 2: crudfornecedor.atualizarFornecedor();
                                     break;
                            case 3: crudfornecedor.consultarFornecedor();
                                     break;
                            case 4: crudfornecedor.ExcluirFornecedor();
                                    break;
                            }
                    break; 
                case 5:
                    q = 1;
                    break;
            }
        }
        
        
        
        
        
        
        
        
       
    }

}
