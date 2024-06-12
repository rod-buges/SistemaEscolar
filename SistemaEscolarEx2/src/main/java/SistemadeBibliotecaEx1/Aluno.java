package SistemadeBibliotecaEx1;

public class Aluno {
    protected String nomeAluno;
    public int idadeAluno;
    public int matriculaAluno;
    private Turma turma;

    Aluno(String nome, int idade, int matricula, Turma turma) {
        this.nomeAluno = nome;
        this.idadeAluno = idade;
        this.matriculaAluno = matricula;
        this.turma = turma;
    }

    public String getNome() {
        return nomeAluno;
    }

    public void setNome(String nome) {
        this.nomeAluno = nome;
    }

    public int getIdade() {
        return idadeAluno;
    }

    public void setIdade(int idade) {
        this.idadeAluno = idade;
    }

    public int getMatricula() {
        return matriculaAluno;
    }

    public void setMatricula(int matricula) {
        this.matriculaAluno = matricula;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getCodigo() {
        return turma.getCodigo();
    }

    public void setCodigo(String codigo) {
        this.turma.setCodigo(codigo);
    }

    @Override
    public String toString() {
        return "Aluno:" +
                " Nome:" + nomeAluno + '\'' +
                ", Idade=" + idadeAluno +
                ", Matricula=" + matriculaAluno +
                ", Turma: " + turma;
    }
}
