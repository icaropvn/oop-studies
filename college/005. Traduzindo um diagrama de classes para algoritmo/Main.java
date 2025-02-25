import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(null);

        Pessoa icaro = new Pessoa(1, "Ícaro Costa Pavan", LocalDate.of(2005, 2, 14), null, null);
        Pessoa jeferson = new Pessoa(2, "Jeferson Tomaz Querino", LocalDate.of(1998, 6, 21), null, null);
        Pessoa maia = new Pessoa(3, "Maia", LocalDate.of(2009, 3, 6), null, null);
        
        agenda.addPessoa(icaro);
        agenda.addPessoa(jeferson);
        agenda.addPessoa(maia);
        
        Endereco endereco1 = new Endereco("Rua Mário Cunha Júnior", "14177167", "Sertãozinho", "São Paulo", "Brasil");
        Endereco endereco2 = new Endereco("Rua Salamandra Carlos", "15179188", "Ribeirão Preto", "São Paulo", "Brasil");
        
        icaro.addEndereco(endereco1);
        jeferson.addEndereco(endereco2);
        maia.addEndereco(endereco1);
        
        Telefone telefone1 = new Telefone("16", "992029408");
        Telefone telefone2 = new Telefone("16", "993456277");
        
        icaro.addTelefone(telefone1);
        jeferson.addTelefone(telefone2);
        
        System.out.println("Pessoas adicionadas na agenda:");
        
        for(Pessoa pessoa : agenda.getPessoas()) {
        	System.out.println(pessoa);
        	for(Endereco endereco : pessoa.getEnderecos())
        		System.out.println(endereco);
        	for(Telefone telefone : pessoa.getTelefones())
        		System.out.println(telefone);
        	System.out.print("\n");
        }
    }
}