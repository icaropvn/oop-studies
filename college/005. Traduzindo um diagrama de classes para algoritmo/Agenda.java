import java.util.List;
import java.util.ArrayList;

public class Agenda {
    private List<Pessoa> pessoas;
    
    // construtor de Agenda
    public Agenda(List<Pessoa> pessoas) {
    	this.pessoas = pessoas == null ? new ArrayList<>() : pessoas;
    }
    
    // métodos específicos
    public void addPessoa(Pessoa pessoa) {
    	if(this.pessoas.contains(pessoa)) {
    		System.out.println("A pessoa já foi adicionada à agenda.");
    		return;
    	}
    	
    	this.pessoas.add(pessoa);
    }
    
    public void removePessoa(Pessoa pessoa) {
    	this.pessoas.remove(pessoa);
    }

    // getters e setters de Agenda
    public List<Pessoa> getPessoas() {
    	return this.pessoas;
    }
    
    public void setPessoas(List<Pessoa> pessoas) {
    	this.pessoas = pessoas;
    }
}
