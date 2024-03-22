package views;
import java.util.Scanner;
import model.Aluno;
import model.Curso;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno(); 
		Curso curso = new Curso();
		
		System.out.println("--DADO DO ALUNO--");
		
		System.out.println("> RA:");
		aluno.ra = sc.nextInt();
		sc.nextLine();
		
		System.out.println("> Nome:");
		aluno.nome = sc.nextLine();
		
		System.out.println("> Idade:");
		aluno.idade = sc.nextInt();
		
		System.out.println("> CPF:");
		aluno.cpf = sc.nextInt();
		
		System.out.println("> Sexo:");
		aluno.sexo = sc.nextLine().charAt(0);
		
		
		System.out.println("--DADO DO CURSO--");
		
		System.out.println("> Nome do curso:");
		curso.nome = sc.nextLine();
		
		System.out.println("> Tipo de curso:");
		curso.tipo = sc.nextLine();
		
		System.out.println(">Tipo de curso:");
		curso.tipo = sc.nextLine();
		
		System.out.println("> Valor Total: &");
		curso.valorTotal = sc.nextFloat();
		
		aluno.curso = curso;
		
		//todo: fazer endereco, implementar professor, a disciplina e etc
	}

}
