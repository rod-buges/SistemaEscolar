package SistemadeBibliotecaEx1;

public class Turma {
    private String nomeTurma;
    private String codigo;

    public Turma(String nomeTurma, String codigoTurma) {
        this.nomeTurma = nomeTurma;
        this.codigo = codigoTurma;
    }

    public String getNome() {
        return nomeTurma;
    }

    public void setNome(String nome) {
        this.nomeTurma = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
