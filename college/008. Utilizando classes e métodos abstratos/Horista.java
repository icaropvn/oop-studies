public class Horista extends Funcionario {
    private float horasNormais, horasExtras;

    // construtores
    public Horista(int matricula, String nome, float salario, float horasNormais, float horasExtras) {
        super(matricula, nome, salario);
        this.horasNormais = horasNormais;
        this.horasExtras = horasExtras;
    }

    public Horista() {
        super();
    }

    // métodos específicos
    public float getSalarioFinal() {
        float valorHoraNormal = this.getSalario() / 220;
        float valorHoraExtra = valorHoraNormal * 1.5f;

        return (this.horasNormais * valorHoraNormal + this.horasExtras * valorHoraExtra);
    }

    // getters e setters
    public float getHorasNormais() {
        return this.horasNormais;
    }

    public void setHorasNormais(float horasNormais) {
        this.horasNormais = horasNormais;
    }

    public float getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(float horasExtras) {
        this.horasExtras = horasExtras;
    }
}
