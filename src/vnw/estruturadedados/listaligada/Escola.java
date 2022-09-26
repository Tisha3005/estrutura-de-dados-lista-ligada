package vnw.estruturadedados.listaligada;

public class Escola {

    private Aluno primeiroAluno;

    public Escola(Aluno primeiro) {
        this.primeiroAluno = primeiro;
    }

    public Aluno getPrimeiroAluno() {
        return primeiroAluno;
    }

    public void setPrimeiroAluno(Aluno primeiroAluno) {
        this.primeiroAluno = primeiroAluno;
    }
}