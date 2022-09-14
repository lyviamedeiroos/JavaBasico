package BasicoJava;

public class MeuArray {
    public static void main(String[] args) {
        String[] alunos = new String[7];

        alunos[0]= "pedro";
        alunos[1] = "alice";
        alunos[2] = "jose";
        alunos[3] = "lucas";
        alunos[4] = "joao";
        alunos[5] = "gabriel";
        alunos[6] = "florentima";

        for (int i = 0; i < alunos.length; i++){
            System.out.println(alunos[i]);
        }
    }
}
