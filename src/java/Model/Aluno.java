package Model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;

@ManagedBean
public class Aluno {
    private String nome;
    private String disciplina;
    private String status;
    private List<String> listaDisciplinas;
    private List<String> listaStatus;
    private List<String> linguagensDisponiveis;
    private List<String> linguagensSelecionadas;
    private int contador;
    
    public Aluno() {
        listaDisciplinas = new ArrayList<>();
        listaDisciplinas.add("Frameworks Web");
        listaDisciplinas.add("Frameworks Mobile");
        
        listaStatus = new ArrayList<>();
        listaStatus.add("Aprovado");
        listaStatus.add("Reprovado");
        
        linguagensDisponiveis = new ArrayList<>();
        linguagensDisponiveis.add("Java");
        linguagensDisponiveis.add("C#");
        linguagensDisponiveis.add("JavaScript");
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the disciplina
     */
    public String getDisciplina() {
        return disciplina;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the listaDisciplinas
     */
    public List<String> getListaDisciplinas() {
        return listaDisciplinas;
    }

    /**
     * @param listaDisciplinas the listaDisciplinas to set
     */
    public void setListaDisciplinas(List<String> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }

    /**
     * @return the listaStatus
     */
    public List<String> getListaStatus() {
        return listaStatus;
    }

    /**
     * @param listaStatus the listaStatus to set
     */
    public void setListaStatus(List<String> listaStatus) {
        this.listaStatus = listaStatus;
    }

    /**
     * @return the linguagensDisponiveis
     */
    public List<String> getLinguagensDisponiveis() {
        return linguagensDisponiveis;
    }

    /**
     * @param linguagensDisponiveis the linguagensDisponiveis to set
     */
    public void setLinguagensDisponiveis(List<String> linguagensDisponiveis) {
        this.linguagensDisponiveis = linguagensDisponiveis;
    }

    /**
     * @return the linguagensSelecionadas
     */
    public List<String> getLinguagensSelecionadas() {
        return linguagensSelecionadas;
    }

    /**
     * @param linguagensSelecionadas the linguagensSelecionadas to set
     */
    public void setLinguagensSelecionadas(List<String> linguagensSelecionadas) {
        this.linguagensSelecionadas = linguagensSelecionadas;
    }

    /**
     * @return the contador
     */
    public int getContador() {
        return ++contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public String decisao() {
        if(linguagensSelecionadas.size() > 0) return "resultado1";
        else return "resultado2";
    }
}
