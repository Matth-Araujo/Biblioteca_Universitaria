import entities.Aluno;
import entities.Funcionario;
import entities.Professor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int n = 0;

        do {
            System.out.println("----------");
            System.out.println("Biblioteca");
            System.out.println("----------");
            System.out.println("[1] Cadastrar usuario");
            System.out.println("[2] Cadastrar livro");
            System.out.println("[3] Alugar livro");
            System.out.println("[4] Devolver livro");
            System.out.println("[9] sair");
            System.out.print("Escolha uma das Operacoes: ");
            n = scan.nextInt();
            scan.nextLine();

            switch (n){
                case 1:
                    System.out.print("Nome: ");
                    String nome = scan.nextLine();
                    System.out.print("Email: ");
                    String email = scan.nextLine();
                    System.out.print("Sexo: ");
                    String sexo = scan.nextLine();
                    System.out.print("Data de nascimento (dd/MM/yyyy): ");
                    Date nascimento = sdf.parse(scan.next());
                    scan.nextLine();
                    System.out.print("Tipo de Usuario: ");
                    String funcao = scan.nextLine();

                    switch (funcao.toLowerCase()){
                        case "aluno" :
                            System.out.print("Insira seu Curso: ");
                            String curso = scan.nextLine();
                            System.out.print("Insira a sua matricula: ");
                            Double matric = scan.nextDouble();
                            System.out.println("Cadastro concluido! :)");

                            Aluno aluno = new Aluno(nome,nascimento,sexo,email,matric,curso);
                            break;
                        case "professor":
                            System.out.print("Insira o seu centro academico: ");
                            String centro = scan.nextLine();
                            System.out.print("Insira a area de trabalho: ");
                            String especializacao = scan.nextLine();

                            Professor professor = new Professor(nome,nascimento,sexo,email,especializacao,centro);
                            System.out.println("Cadastro concluido! :)");
                            break;
                        case "funcionario":
                            System.out.print("Insira o seu departamento: ");
                            String depart = scan.nextLine();
                            System.out.print("Area de interesse: ");
                            String interesse = scan.nextLine();

                            Funcionario funcionario = new Funcionario(nome,nascimento,sexo,email,depart,interesse);
                            System.out.println("Cadastro concluido! :)");
                            break;
                        default:
                            System.out.println("Tipo de usuario nao existente!!");
                    }




            }

        }while(n!=9);
        scan.close();
    }
}