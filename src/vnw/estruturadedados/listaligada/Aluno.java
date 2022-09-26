package vnw.estruturadedados.listaligada;

import java.util.UUID;

public class Aluno {

    private final UUID id;
    private final String nome;
    public final Aluno proximoAluno;
    private Nota notas;

    public Aluno(String nome, Nota notas, Aluno proximoAluno) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.proximoAluno = proximoAluno;
        this.notas = notas;
    }

    public Nota getNotas() {
        return notas;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Aluno getProximoAluno() {
        return proximoAluno;
    }

    @Override
    public String toString() {
        return "\n ID: " + id +
                "\n Nome: " + nome + notas;
    }
}