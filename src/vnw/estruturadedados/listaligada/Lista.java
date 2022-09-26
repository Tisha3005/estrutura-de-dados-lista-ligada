package vnw.estruturadedados.listaligada;

import java.util.UUID;

public class Lista {
    public static void main(String[] args) {

        Nota thaisNotas = new Nota(10.0, 10.0, 10.0, 4.0);
        Nota jadsonNotas = new Nota(8.0, 7.0, 7.0, 8.0);
        Nota felipeNotas = new Nota(9.0, 10.0, 10.0, 7.0);
        Nota gilvanNotas = new Nota(10.0, 8.0, 9.0, 6.0);

        Aluno thais = new Aluno("Thaís", thaisNotas, null);
        Aluno jadson = new Aluno("Jadson", jadsonNotas, thais);
        Aluno felipe = new Aluno("Felipe", felipeNotas, jadson);
        Aluno gilvan = new Aluno("Gilvan", gilvanNotas, felipe);

        Escola escola = new Escola(gilvan);

        exiberLista(escola.getPrimeiroAluno());

        System.out.println(exibeAlunosAprovados(escola.getPrimeiroAluno()));

        buscarAluno(UUID.fromString("bcb43b60-fb6f-47c5-b178-0dbe8cbf71ab"), escola.getPrimeiroAluno());
        buscarAluno(thais.getId(), escola.getPrimeiroAluno());
    }

    public static void exiberLista(Aluno primeiroAluno) {
        System.out.println("------ Lista dos Alunos ------");
        Aluno aluno = primeiroAluno;
        while (aluno != null) {
            System.out.println(aluno.toString());
            aluno = aluno.getProximoAluno();
        }
    }

    public static void buscarAluno(UUID uuid, Aluno aluno) {
        System.out.println("------ Retorno da busca de Aluno por ID ------");
        while (aluno != null && !aluno.getId().equals(uuid)) {
            //System.out.println(aluno.getNome() + aluno.getId());
            aluno = aluno.getProximoAluno();
        }
        if (aluno == null) {
            System.out.println("ID nao localizado");
        } else {
            System.out.println(aluno.toString());
        }
    }

    public static String exibeAlunosAprovados(Aluno aluno) {
        String str = "\n------ Alunos Aprovados  ------\n";
        while (aluno != null) {
            if (aluno.getNotas().getResultado().equals("Aprovado")) {
                str += " " + aluno;
            }
            aluno = aluno.getProximoAluno();
        }
        return str + "\n";
    }
}