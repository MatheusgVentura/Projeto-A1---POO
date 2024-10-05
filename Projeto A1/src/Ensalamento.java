import java.util.List;
import java.util.ArrayList;

class Ensalamento {
    public void executar() {
        // Criação dos cursos
        Curso cursoTI = new Curso("TI");
        Curso cursoADM = new Curso("ADM");

        // Criação das disciplinas
        Disciplina disciplinaPOO = new Disciplina("POO", cursoTI);
        Disciplina disciplinaED = new Disciplina("Estrutura de Dados", cursoTI);
        Disciplina disciplinaBI = new Disciplina("BI", cursoADM);

        // Adicionando disciplinas aos cursos
        cursoTI.adicionarDisciplina(disciplinaPOO);
        cursoTI.adicionarDisciplina(disciplinaED);
        cursoADM.adicionarDisciplina(disciplinaBI);

        // Dados fixos
        Aluno[] alunos = {
                new Aluno("Alfredo", cursoTI),
                new Aluno("Amélia", cursoTI),
                new Aluno("Ana", cursoADM),
                new Aluno("Bruno", cursoTI),
                new Aluno("Bentinho", cursoADM),
                new Aluno("Capitú", cursoTI),
                new Aluno("Debra", cursoTI),
                new Aluno("Ian", cursoADM),
                new Aluno("Iracema", cursoTI),
                new Aluno("Joelmir", cursoADM),
                new Aluno("Julieta", cursoTI),
                new Aluno("Luana", cursoADM),
                new Aluno("Luciana", cursoTI),
                new Aluno("Majô", cursoADM),
                new Aluno("Maria", cursoADM),
                new Aluno("Norberto", cursoTI),
                new Aluno("Paulo", cursoADM),
                new Aluno("Romeu", cursoADM),
                new Aluno("Wendel", cursoTI),
                new Aluno("Zoey", cursoTI)
        };

        Professor[] professores = {
                new Professor("Mia", "POO"),
                new Professor("Saulo", "Estrutura de Dados"),
                new Professor("Paula", "BI")
        };

        // Alocação de alunos nas turmas
        List<Turma> turmas = new ArrayList<>();

        // Turma de POO
        Turma turmaPOO = new Turma(professores[0], disciplinaPOO);
        for (Aluno aluno : alunos) {
            if (aluno.getCurso() == cursoTI) {
                turmaPOO.adicionarAluno(aluno);
            }
        }
        turmas.add(turmaPOO);

        // Turma de Estrutura de Dados
        Turma turmaED = new Turma(professores[1], disciplinaED);
        for (Aluno aluno : alunos) {
            if (aluno.getCurso() == cursoTI) {
                turmaED.adicionarAluno(aluno);
            }
        }
        turmas.add(turmaED);

        // Turma de BI
        Turma turmaBI = new Turma(professores[2], disciplinaBI);
        for (Aluno aluno : alunos) {
            if (aluno.getCurso() == cursoADM) {
                turmaBI.adicionarAluno(aluno);
            }
        }
        turmas.add(turmaBI);

        // Exibição das turmas
        for (Turma turma : turmas) {
            turma.mostrarTurma();
        }
    }
}
