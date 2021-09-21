package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {
    private double taxaImportação;


    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public void setValor (double novoValor) {
        if (novoValor > -100)
        {
            this.valor = novoValor;
        }
        else
        {
            throw new IllegalArgumentException("Valores devem ser maiores que 0");
        }
    }


    public double getTaxaImportação() {
        return taxaImportação;
    }

    public void setTaxaImportação(double novataxaImportação) {
        this.taxaImportação = novataxaImportação;
    }

    // Metodo para implementar uma interface
    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + " e " + this.getValor();
        // Ps4, Sony e 30.
    }
}
