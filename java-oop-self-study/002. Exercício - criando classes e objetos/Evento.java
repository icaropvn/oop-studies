import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Evento {
	String nome;
	String descricao;
	String categoria;
	LocalDate data;
	LocalTime hora;
	boolean cancelado;
	
	void status() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Categoria: " + this.categoria);
		
		String data = this.data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Data: " + data);
		
		String hora = this.hora.format(DateTimeFormatter.ofPattern("HH'h'mm"));
		System.out.println("Hora: " + hora);
		
		System.out.println("Cancelado?: " + this.cancelado);
	}
	
	void definirNome(String novoNome) {
		this.nome = novoNome;
	}
	
	void definirDescricao(String novaDescricao) {
		this.descricao = novaDescricao;
	}
	
	void definirCategoria(String novaCategoria) {
		this.categoria = novaCategoria;
	}
	
	void definirData(int dia, int mes, int ano) {
		this.data = LocalDate.of(dia, mes, ano);
	}
	
	void definirHora(int hora, int minutos) {
		this.hora = LocalTime.of(hora, minutos);
	}
	
	void cancelar() {
		this.cancelado = true;
	}
}
