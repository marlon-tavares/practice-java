package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {
    private String nome;    // modificador: private, somente produto alteram
    private String marca;   // modificador: publico. qualquer classe alteram
    protected double valor;  // modificador: protected, filhos da classe produto alteran
    private Tamanho tamanho;
    private List<Itensinclusos> Itensinclusos;

// Definindo um construtor para produto;
    public Produto(String marcaInicial, Tamanho tamanhoInicial){
        // Serve para definir comandos que serão iniciados durante a instanciação
        this.marca = marcaInicial;
        this.tamanho = tamanhoInicial;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor (double novoValor) {
        if (novoValor > 0)
        {
            this.valor = novoValor;
        }
        else
        {
            throw new IllegalArgumentException("Valores devem ser maiores que 0");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca (String novaMarca){
        this.marca = novaMarca;
    }

    public Tamanho getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Tamanho novoTamanho) {
        this.tamanho = novoTamanho;
    }

    public List<br.com.lojinha.pojo.Itensinclusos> getItensinclusos() {
        return this.Itensinclusos;
    }

    public void setItensinclusos(List<br.com.lojinha.pojo.Itensinclusos> novoItensinclusos) {
        this.Itensinclusos = novoItensinclusos;
    }
}
