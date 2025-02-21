public class Endereco {
    private String rua;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;

    // construtor de Endereco
    public Endereco(String rua, String cep, String cidade, String estado, String pais) {
        this.rua = rua;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }
    
    // métodos específicos
    @Override
    public String toString() {
    	return "Rua: " + this.rua + "\nCEP: " + this.cep + "\nCidade: " + this.cidade + "\nEstado: " + this.estado + "\nPaís: " + this.pais;
    }

    // getters e setters de Endereco
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
