public class Telefone {
    private String ddd;
    private String numero;

    // construtor de Telefone
    public Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }
    
    // métodos específicos
    @Override
    public String toString() {
    	return "Telefone: (" + this.ddd + ") " + this.numero;
    }

    // getters e setters de Telefone
    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
