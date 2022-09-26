package vnw.estruturadedados.listaligada;

public class Nota {

    private final double nota1;
    private final double nota2;
    private final double nota3;
    private final double nota4;
    private String resultado;
    private double media;

    public Nota(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;

        calculaMedia(nota1, nota2, nota3, nota4);
    }

    private void calculaMedia(double nota1, double nota2, double nota3, double nota4) {
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7.5) {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";

        }
    }

    public String getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        return "\n Notas:" +
                "  N1 = " + nota1 +
                " | N2 = " + nota2 +
                " | N3 = " + nota3 +
                " | N4 = " + nota4 +
                "\n" +
                " Resultado = " + resultado +
                "\n" +
                " Média = " + media +
                "\n";

    }
}
