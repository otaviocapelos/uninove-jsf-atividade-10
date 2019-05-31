package Dao;

import Model.Seguro;
import Model.Taxa;

public class SeguroDAO {

    public String calculaSeguro(Seguro seguro) {
       double valorSeguro = 0;
       if (seguro.getAno() <= 2005) valorSeguro = seguro.getValor() * 0.15;
       else if (seguro.getAno() >= 2006 && seguro.getAno() <= 2013) valorSeguro = seguro.getValor() * 0.10;
       else if (seguro.getAno() >= 2014) valorSeguro = seguro.getValor() * 0.05;
       calculaTaxa(seguro, valorSeguro);
       return "resultado";
    }
    
    public void calculaTaxa(Seguro seguro, double valorSeguro) {
        Taxa taxa = new Taxa();
        taxa.setRegiao(seguro.getRegiao());
        taxa.setValor(valorSeguro);
        seguro.getTaxas().add(taxa);
    }
}
