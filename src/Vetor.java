import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno){
        // recebe um aluno
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    public Aluno pega(int posicao){
        // recebe um aluno
        return null;
    }

    public void remove(int posicao){
        // remove pela posição
    }

    public boolean contem(Aluno aluno){
        // descobre se o aluno está ou não na lista
        for (int i = 0; i < totalDeAlunos; i++) {
            if (aluno.equals(alunos[i])){
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        // devolve a quantidade de alunos
        return totalDeAlunos;
    }

    @Override
    public String toString() {
        // facilitará na impressão
        return Arrays.toString(alunos);
    }
}
