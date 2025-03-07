public abstract class Funcionario {
    private int matricula;
    private String nome;
    private float salario;

    // construtores
    public Funcionario(int matricula, String nome, float salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario(){}

    // métodos específicos
    public abstract float getSalarioFinal();

    // getters e setters
    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
