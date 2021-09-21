package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Itensinclusos;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;
import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {

// Testando a classe Produto
        Produto meuProduto = new Produto ("Sony", Tamanho.MEDIO);
        System.out.println(meuProduto.getMarca());
        meuProduto.setNome("Play station 4");
        meuProduto.setValor(30);

// Lista de uma Classe de itens adicionais ao produto
        List<Itensinclusos> Itensinclusos = new ArrayList<>();

        br.com.lojinha.pojo.Itensinclusos primeiroItensinclusos = new Itensinclusos();
        primeiroItensinclusos.setNome("Controle");
        primeiroItensinclusos.setQuantidade(2);
        Itensinclusos.add(primeiroItensinclusos);

        br.com.lojinha.pojo.Itensinclusos segundoItensinclusos = new Itensinclusos();
        segundoItensinclusos.setNome("Jogo");
        segundoItensinclusos.setQuantidade(3);
        Itensinclusos.add(segundoItensinclusos);

        br.com.lojinha.pojo.Itensinclusos terceiroItensinclusos = new Itensinclusos();
        terceiroItensinclusos.setNome("Cabo de Energia");
        terceiroItensinclusos.setQuantidade(2);
        Itensinclusos.add(terceiroItensinclusos);


        meuProduto.setItensinclusos(Itensinclusos);

       System.out.println(meuProduto.getNome());
       System.out.println(meuProduto.getValor());
       System.out.println(meuProduto.getMarca());
       System.out.println(meuProduto.getTamanho());

       System.out.println("Começando a apresentar os itens adcionais:");

// Aplicação de laço de repetição para imprmir os itens 0, 1 e 2.
       for (Itensinclusos itemAtual : meuProduto.getItensinclusos()){
           System.out.println(itemAtual.getNome());
           System.out.println(itemAtual.getQuantidade());
       }
        System.out.println("Acabaram se os itens.");

// Produto Nacional
        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Brastemp", Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.56565);

        System.out.println(meuProdutoNacional.getImpostoNacional());
        System.out.println(meuProdutoNacional.getMarca());
        System.out.println(meuProdutoNacional.getTamanho());

// Produto Internacional
        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Iphone", Tamanho.PEQUENO);
        meuProdutoInternacional.setTaxaImportação(1.237);
        meuProdutoInternacional.setValor(-99.99); // Testando o polimorfismo da classe Produto para o setValor

        System.out.println(meuProdutoInternacional.getTaxaImportação());
        System.out.println(meuProdutoInternacional.getMarca());
        System.out.println(meuProdutoInternacional.getTamanho());
        System.out.println(meuProdutoInternacional.getValor());
    }
}
