import entities.Aluno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Aluno alunos = new Aluno();
        List<Aluno> aluno = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Digite a quantidade de alunos na lista: ");

            int qtidadeAlunos = sc.nextInt();

            for (int i = 0; i < qtidadeAlunos; i++) {
                System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
                String name = sc.next();
                /*System.out.print("O aluno estava presente? ");
                String presenca = sc.next()*/
                ;
                alunos = new Aluno(name);
                aluno.add(alunos);
            }

            System.out.print("Quantidade de datas: ");
            int datas = sc.nextInt();
            for (int j = 0; j < datas; j++) {
                System.out.println();
                System.out.print("Digite a data (dd/MM/yyyy) ");
                Date day = sdf.parse(sc.next());

                System.out.println("----------------------------");
                System.out.println("Data: " + sdf.format(day));
                for (Aluno turma : aluno) {
                    System.out.print(turma);
                    if (alunos.getRandomBoolean() == true) {
                        System.out.println("   Chamada: PRESENTE.");
                    } else {
                        System.out.println("   Chamada: AUSENTE.");
                    }
                }
            }
        }
        catch(InputMismatchException e){
            System.out.println("Ops! Digite novamente um número.");
        }




    }

}
