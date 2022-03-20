public class Main {
    public static void main(String[] args) {
        // criação do boletim semestral do aluno aprovado
        BoletimSemestral boletim1 = new BoletimSemestral("Karol Conka", 7, 3, 4);
        // exibição do boletim do aluno aprovado
        System.out.println("--------------------");
        System.out.println("BOLETIM DO ALUNO 1:");
        System.out.println();
        System.out.println("Nome: " + boletim1.getNomeAluno()); // pega o nome do aluno
        String resultado1 = boletim1.verificarAprovacao() ? "Sim" : "Não"; // operador ternário, se for true, retorna "sim", caso false retorna "não"
        System.out.println("Nota da prova (peso 7.0): " + boletim1.getNotaProva()); // retorna a nota da prova valendo 7
        System.out.println("Nota do trabalho (peso 3.0): " + boletim1.getNotaTrabalho()); // retorna a nota do trabalho valendo 3
        System.out.println("Nota final (prova + trabalho): " + (boletim1.getNotaTrabalho() + boletim1.getNotaProva())); // retorna a nota final, somando a prova com o trabalho
        System.out.println("Número de faltas (máximo 5 faltas por semestre): " + boletim1.getNumeroFaltas()); // retorna o número de faltas
        System.out.println("O aluno está aprovado? " + resultado1); // retorna caso o aluno foi ou não aprovado
        System.out.println("--------------------");

        // criação do boletim semestral do aluno reprovado por faltas
        BoletimSemestral boletim2 = new BoletimSemestral("Juliette", 5, 3, 7);
        // exibição do boletim do aluno reprovado por faltas
        System.out.println("BOLETIM DO ALUNO 2:");
        System.out.println();
        System.out.println("Nome: " + boletim2.getNomeAluno());
        String resultado2 = boletim2.verificarAprovacao() ? "Sim" : "Não";
        System.out.println("Nota da prova (peso 7.0): " + boletim2.getNotaProva());
        System.out.println("Nota do trabalho (peso 3.0): " + boletim2.getNotaTrabalho());
        System.out.println("Nota final (prova + trabalho): " + (boletim2.getNotaTrabalho() + boletim2.getNotaProva()));
        System.out.println("Número de faltas (máximo 5 faltas por semestre): " + boletim2.getNumeroFaltas());
        System.out.println("O aluno está aprovado? " + resultado2);
        System.out.println("--------------------");

        // criação do boletim semestral do aluno reprovado por nota
        BoletimSemestral boletim3 = new BoletimSemestral("Lucas Penteado", 3, 2, 0);
        // exibição do boletim do aluno reprovado por nota
        System.out.println("BOLETIM DO ALUNO 3:");
        System.out.println();
        System.out.println("Nome: " + boletim3.getNomeAluno());
        String resultado3 = boletim3.verificarAprovacao() ? "Sim" : "Não";
        System.out.println("Nota da prova (peso 7.0): " + boletim3.getNotaProva());
        System.out.println("Nota do trabalho (peso 3.0): " + boletim3.getNotaTrabalho());
        System.out.println("Nota final (prova + trabalho): " + (boletim3.getNotaTrabalho() + boletim3.getNotaProva()));
        System.out.println("Número de faltas (máximo 5 faltas por semestre): " + boletim3.getNumeroFaltas());
        System.out.println("O aluno está aprovado? " + resultado3);
        System.out.println("--------------------");
    }
}
