package ATVDS01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos produtos você deseja cadastrar?");
        int qnt = leitor.nextInt();
        Produto[] listaProdutos = new Produto[qnt];
        int posicao = 0;
        int opcao = 0;

        do{
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Criar um produto");
            System.out.println("2 - Alterar os dados de um produto");
            System.out.println("3 - Excluir um produto");
            System.out.println("4 - Listar todos os produtos");
            System.out.println("5 - Sair");
            opcao = leitor.nextInt();
            leitor.nextLine();

        
            switch (opcao) {
                case 1:{
                    System.out.println("Digite o nome do produto: ");
                    String nome = leitor.nextLine();
                    System.out.println("Digite o preço do produto: ");
                    float preco = leitor.nextFloat();
                    System.out.println("Digite o código do produto: ");
                    int cod = leitor.nextInt();
                    leitor.nextLine();
                    System.out.println("Digite a quantidade desse produto no estoque: ");
                    int estoque = leitor.nextInt();
                    leitor.nextLine();
                    System.out.println("Digite a data de validade desse produto: ");
                    String validade = leitor.nextLine();

                    Produto produto = new Produto(nome, preco, cod, estoque, validade);
                    listaProdutos[posicao] = produto;

                    if (posicao < qnt) {
                        posicao++;
                    }

                    System.out.println("Você registrou o produto de número "+posicao);

                }
                break;

                case 2:{
                    System.out.println("Atualmente temos "+posicao+" produtos, digite o número do produto que você deseja alterar: ");
                    int pos = leitor.nextInt() - 1;
                    leitor.nextLine();

                    System.out.println("Digite o nome do produto: ");
                    String nome = leitor.nextLine();
                    System.out.println("Digite o preço do produto: ");
                    float preco = leitor.nextFloat();
                    System.out.println("Digite o código do produto: ");
                    int cod = leitor.nextInt();
                    leitor.nextLine();
                    System.out.println("Digite a quantidade desse produto no estoque: ");
                    int estoque = leitor.nextInt();
                    leitor.nextLine();
                    System.out.println("Digite a data de validade desse produto: ");
                    String validade = leitor.nextLine();

                    listaProdutos[pos] = new Produto(nome, preco, cod, estoque, validade);
                }
                break;

                case 3:{
                    System.out.println("Atualmente temos "+posicao+" produtos, digite o número do produto que você deseja excluir: ");
                    int pos = leitor.nextInt();
                    leitor.nextLine();

                    if(listaProdutos[pos] != null){
                        listaProdutos[pos] = null;
                    }
                }
                break;

                case 4:{
                    for(int pos = 0; pos <= qnt; pos++){
                        System.out.println(listaProdutos[pos].todosDados());
                    }
                }
                break;

                default:
                    System.out.println("Opção Invalida");
                break;
            }
        }while(opcao != 5);

        System.out.println("Você saiu do programa");

    }
}