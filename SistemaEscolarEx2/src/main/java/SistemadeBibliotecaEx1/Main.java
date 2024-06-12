package SistemadeBibliotecaEx1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<Aluno>();
        List<Turma> turmas = new ArrayList<Turma>();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do{
            System.out.println("Escolha se deseja adicionar os alunos as turmas ou listar todos os alunos existentes.");
            System.out.println("Digite 1 para adicionar os alunos as turmas, 2 para listar os alunos ou 0 para sair.");

            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
                sc.nextLine(); // consome a linha extra
            } else {
                System.out.println("Por favor, insira um número inteiro.");
                sc.next(); // descarta a entrada inválida
                continue;
            }

            if(opcao == 1){
                for(int i = 0; i < 5; i++){
                    System.out.println("Digite o nome do aluno "+(i+1)+": ");
                    String nomeAluno = sc.nextLine();
                    System.out.println("Digite a idade do aluno "+(i+1)+": ");
                    int idadeAluno = sc.nextInt();
                    System.out.println("Digite a matrícula do aluno "+(i+1)+": ");
                    int matriculaAluno = sc.nextInt();
                    sc.nextLine(); // consome a linha extra
                    System.out.println("Digite a turma (Turma A ou Turma B)  "+(i+1)+": ");
                    String nomeTurma = sc.nextLine();
                    System.out.println("Caso Turma A digite 1A ou Caso Turma B digite 1B "+(i+1)+": ");
                    String codigoTurma = sc.nextLine();
                    Turma turma = new Turma(nomeTurma, codigoTurma);
                    Aluno aluno = new Aluno(nomeAluno, idadeAluno, matriculaAluno, turma);
                    alunos.add(aluno);
                    turmas.add(turma);
                }
            } else if (opcao == 2) {
                listarAlunos(alunos);
            } else if (opcao != 0) {
                System.out.println("Opção inválida");
            }

        } while (opcao !=0);
        sc.close();
    }

    private static void listarAlunos(List<Aluno> alunos) {
        if (alunos.isEmpty()){
            System.out.println("Não há alunos cadastrados");
        }else{
            for (Aluno aluno : alunos){
                System.out.println(aluno + ", Turma: " + aluno.getTurma().getNome() + ", Código da Turma: " + aluno.getTurma().getCodigo());
            }
        }
    }
}
