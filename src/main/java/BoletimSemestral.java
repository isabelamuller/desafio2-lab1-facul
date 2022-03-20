public class BoletimSemestral {
    // criaçao dos atributos da classe BoletimSemestral
    private String nomeAluno;
    private double notaProva;
    private double notaTrabalho;
    private int numeroFaltas;

    //criaçao do construtor
    public BoletimSemestral(String nomeAluno, double notaProva, double notaTrabalho, int numeroFaltas) {
        this.nomeAluno = nomeAluno;
        this.notaProva = notaProva;
        this.notaTrabalho = notaTrabalho;
        this.numeroFaltas = numeroFaltas;
    }

    // getters
    public String getNomeAluno() {
        return nomeAluno;
    }

    public double getNotaProva() {
        return notaProva;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public int getNumeroFaltas() {
        return numeroFaltas;
    }

    // método para verificar aprovaçao
    public boolean verificarAprovacao() { // verifica, inicialmente de acordo com as faltas, se o aluno reprovou
        if (numeroFaltas > 5) { // se as faltas forem maior que 5 (75% de 16 aulas por semestre)
            return false; // retorna false, ou seja, reprovado
        } else { // caso o número de faltas for menor que 5
            return (notaProva + notaTrabalho) >= 7; // retorna o calculo da nota final, que caso maior ou igual a 7, está aprovado (true)
        }
    }
}


