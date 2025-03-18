public class Main {
	public static void main(String[] args) {
		Visitante visitante = new Visitante("Gabriela", 16, "Feminino");
		Aluno aluno = new Aluno("Renato", 20, "Masculino", 898611, "Administração");
		Bolsista bolsista = new Bolsista("Cástula", 24, "Feminino", 445672, "Enfermagem", 15);
		
		System.out.println(visitante.toString());
		System.out.println();
		System.out.println(aluno.toString());
		System.out.println();
		System.out.println(bolsista.toString());
		System.out.println();
		
		aluno.pagarMensalidade();
		bolsista.pagarMensalidade();
	}
}
