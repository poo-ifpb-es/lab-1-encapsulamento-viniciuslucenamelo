// Definindo a classe Estudante
public class Estudante {
    private String nome;
    private int matricula;

    // Construtor da classe Estudante
    public Estudante(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Get para obter nome
    public String getNome() {
        return nome;
    }

    // Set para definir nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Get Matricula
    public int getMatricula() {
        return matricula;
    }

    // Set Matricula
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
