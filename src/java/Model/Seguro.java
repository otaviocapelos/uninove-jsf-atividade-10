package Model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;

@ManagedBean
public class Seguro {

    private String nome;
    private int ano;
    private double valor;
    private String regiao = "ZO";
    private List<Taxa> taxas;

    public Seguro() {
        taxas = new ArrayList<>();
    }
    
    /**
     * @return the nome_veiculo
     */
    public String getNome_veiculo() {
        return nome;
    }

    public void setNome_veiculo(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the regiao
     */
    public String getRegiao() {
        return regiao;
    }

    /**
     * @param regiao the regiao to set
     */
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    /**
     * @return the taxas
     */
    public List<Taxa> getTaxas() {
        return taxas;
    }

    /**
     * @param taxas the taxas to set
     */
    public void setTaxas(List<Taxa> taxas) {
        this.taxas = taxas;
    }
}
