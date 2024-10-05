import java.util.List;
import java.util.ArrayList;

class Ensalamento {
    public void executar() {
        Aluno[] alunos = {
                new Aluno("Alfredo", "TI"),
                new Aluno("Amélia", "TI"),
                new Aluno("Ana", "ADM"),
                new Aluno("Bruno", "TI"),
                new Aluno("Bentinho", "ADM"),
                new Aluno("Capitú", "TI"),
                new Aluno("Debra", "TI"),
                new Aluno("Ian", "ADM"),
                new Aluno("Iracema", "TI"),
                new Aluno("Joelmir", "ADM"),
                new Aluno("Julieta", "TI"),
                new Aluno("Luana", "ADM"),
                new Aluno("Luciana", "TI"),
                new Aluno("Majô", "ADM"),
                new Aluno("Maria", "ADM"),
                new Aluno("Norberto", "TI"),
                new Aluno("Paulo", "ADM"),
                new Aluno("Romeu", "ADM"),
                new Aluno("Wendel", "TI"),
                new Aluno("Zoey", "TI")
        };

        Professor[] professores = {
                new Professor("Mia", "POO"),
                new Professor("Saulo", "Estrutura de Dados"),
                new Professor("Paula", "BI")
        };

        Disciplina[] disciplinas = {
                new Disciplina("POO", "TI"),
                new Disciplina("Estrutura de Dados", "TI"),
                new Disciplina("BI", "ADM")
        };

        List<Turma> turmas = new ArrayList<>();

        // Turma de POO
        Turma turmaPOO = new Turma(professores[0], disciplinas[0]);
        for (Aluno aluno : alunos) {
            if (aluno.getCurso().equals("TI")) {
                turmaPOO.adicionarAluno(aluno);
            }
        }
        turmas.add(turmaPOO);

        // Turma de Estrutura de Dados
        Turma turmaED = new Turma(professores[1], disciplinas[1]);
        for (Aluno aluno : alunos) {
            if (aluno.getCurso().equals("TI")) {
                turmaED.adicionarAluno(aluno);
            }
        }
        turmas.add(turmaED);

        // Turma de BI
        Turma turmaBI = new Turma(professores[2], disciplinas[2]);
        for (Aluno aluno : alunos) {
            if (aluno.getCurso().equals("ADM")) {
                turmaBI.adicionarAluno(aluno);
            }
        }
        turmas.add(turmaBI);

        for (Turma turma : turmas) {
            turma.mostrarTurma();
        }
    }
}
