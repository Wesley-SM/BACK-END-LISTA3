public class Empregado {
    private String nome;
    private String sobrenome;
    private Double salarioMensal;


    public Empregado(String nome, String sobrenome, Double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;

        this.salarioMensal = (salarioMensal < 0.0) ? 0.0 : salarioMensal;
    }


    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getSobrenome() { return sobrenome; }
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }

    public Double getSalarioMensal() { return salarioMensal; }
    public void setSalarioMensal(Double salarioMensal) {
        this.salarioMensal = (salarioMensal < 0.0) ? 0.0 : salarioMensal;
    }


    public Double getSalarioAnual() {
        return salarioMensal * 13;
    }
}
