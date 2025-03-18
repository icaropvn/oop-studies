public class Main {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Celeste", 21, "Feminino");
		Aluno aluno1 = new Aluno("Clara", 17, "Não-binário", 114620, "Veterinária");
		Professor professor1 = new Professor("Milton", 45, "Masculino", "Big Data e Data Science", 9520.00f);
		Funcionario funcionario1 = new Funcionario("Aurora", 25, "Feminino", "Financeiro", false);
		
		System.out.println(pessoa1.toString());
		System.out.println();
		System.out.println(aluno1.toString());
		System.out.println();
		System.out.println(professor1.toString());
		System.out.println();
		System.out.println(funcionario1.toString());
	}
}
