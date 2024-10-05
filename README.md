# ProjetoA1 _POO

### Este projeto mostra um sistema para gerenciar a alocação de alunos em turmas de uma instituição de ensino, o sistema é estruturado em várias classes que representam os principais elementos do cenário educacional: Aluno, Professor, Disciplina, Turma e Ensalamento.

# Como funciona ?

### Primerio temos as Classes listadas no projeto que serão : Aluno, Professor, Disciplina, Curso, Turma e Ensalamento :

<img src="https://github.com/user-attachments/assets/f81437be-f321-439a-abe7-e7ebd086ea37" width="550"/>
<img src="https://github.com/user-attachments/assets/ccdc5039-af18-4a87-ac1f-d89d84721a60" width="550"/>
<img src="https://github.com/user-attachments/assets/86224ac6-fa58-4c2c-b9d1-c7af74921e05" width="550"/>
<img src="https://github.com/user-attachments/assets/eb78461a-644f-4881-8743-938a979b7dd7" width="700"/>
<img src="https://github.com/user-attachments/assets/95741bc4-bc80-4e0d-a9e5-a0faaf9ed648" width="700"/>
<img src="https://github.com/user-attachments/assets/6c3509d3-33dc-47bb-b21c-21cf4472e0bc" width="700"/>
<img src="https://github.com/user-attachments/assets/a739dd46-3f49-4c91-a6ce-2c26d1bd1a8f" width="550"/>

### Segundo temos a Classe main (Cuja serve apenas para acionar a execução do ensalamento) :

<img src="https://github.com/user-attachments/assets/3fa4a29f-0310-4897-9174-b29d8800c60f" width="550"/>

### Terceiro temos a Classe Pessoa (Herança) :

<img src="https://github.com/user-attachments/assets/4a9bdc21-4f50-406e-ac8f-37c1597abe7a" width="550"/>

# O que cada classe faz :
## Classe Pessoa :

### Essa classe é usada como um ponto de partida para definir atributos comuns que serão herdados por Aluno e Professor.
## Classe Aluno :

### Ela estende a classe Pessoa para incluir a especificidade do curso em que o aluno está matriculado.
## Classe Professor :

### Esta classe estende Pessoa para associar uma disciplina ao professor, de forma que possa ser facilmente vinculada às turmas.
## Classe Curso :

### Esta classe agrupa as disciplinas para facilitar a organização do que cada curso oferece.

## Classe Disciplina :
### Ela é usada para associar as disciplinas aos cursos e possibilitar a alocação nas turmas.

## Classe Turma :
### Esta classe faz a junção de todos os elementos, associando professores, disciplinas e alunos em uma estrutura organizada.

## Classe Ensalamento :
### A classe Ensalamento coordena a criação e alocação de turmas, centralizando a lógica do sistema.
