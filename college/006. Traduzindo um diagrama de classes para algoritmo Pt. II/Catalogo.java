import java.util.List;
import java.util.ArrayList;

public class Catalogo {
	private List<Veiculo> veiculos;
	
	// construtor de Catalogo
	public Catalogo(List<Veiculo> veiculos) {
		this.veiculos = veiculos == null ? new ArrayList<>() : veiculos;
	}
	
	public Catalogo() {
		this.veiculos = new ArrayList<>();
	}
	
	// métodos específicos de Catalogo
	public void addVeiculo(Veiculo veiculo) {
		this.veiculos.add(veiculo);
	}
	
	public void removeVeiculo(Veiculo veiculo) {
		this.veiculos.remove(veiculo);
	}
	
	public void removeVeiculo(int codigo) {
		Veiculo v;
		
		for(int i=0; i<this.veiculos.size(); i++) {
			v = this.veiculos.get(i);
			
			if(v.getCodigo() == codigo)
				this.veiculos.remove(v);
		}
	}
	
	public Veiculo consultar(Veiculo veiculo) {
		for(int i=0; i<this.veiculos.size(); i++) {
			if(this.veiculos.get(i) == veiculo)
				return this.veiculos.get(i);
		}
		
		return null;
	}
	
	public Veiculo consultar(int codigo) {
		for(int i=0; i<this.veiculos.size(); i++) {
			if(this.veiculos.get(i).getCodigo() == codigo)
				return this.veiculos.get(i);
		}
		
		return null;
	}
	
	public void imprimir() {
		for(int i=0; i<this.veiculos.size(); i++) {
			this.veiculos.get(i).imprimir();
		}
	}
	
	// getters e setters de Catalogo
	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	};
}