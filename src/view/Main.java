package view;
import java.util.Arrays;
import java.util.Scanner;

import connection.ConexaoMysql;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString( args ));
		ConexaoMysql conexao = new ConexaoMysql();
        conexao.OpenConnection();
		
		Scanner leia = new Scanner(System.in);
		boolean sair = false;
		MenuAlunos chamadoAlunos = new MenuAlunos();
		MenuProfessor chamadoProf = new MenuProfessor();
		MenuCursos chamadoCursos = new MenuCursos();
		do{
			System.out.println("Qual menu você deseja acessar? ");
			System.out.println("1. Gerenciar Alunos. ");
			System.out.println("2. Gerenciar Professores. ");
			System.out.println("3. Gerenciar Cursos. ");
			System.out.println("4. Sair do Programa. ");
			
			int opcao = leia.nextInt();
			switch(opcao){
				case 1 : chamadoAlunos.iteracaoAluno();
						break;
				case 2 : chamadoProf.iteracaoProf();
						break;
				case 3 : chamadoCursos.iteracaoCursos();
						break;
				case 4 : sair = true;
						System.out.println("Saindo...");
						break;
				default : System.out.println("opcão inválida");
						break;

			}
		}while(!sair);
	}
}

//f:; cd 'f:\Favi\Projeto A3\aplicativoEducacional'; & 'C:\Program Files (x86)\Java\jdk-22.0.1\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '--module-path' 'F:\Favi\Projeto A3\aplicativoEducacional\AplicativoEducacional\bin' '--class-path' 'F:\Favi\Projeto A3\aplicativoEducacional\AplicativoEducacional\mysql-connector-java-8.0.26.jar' '-m' 'AplicativoEducacional/view.Main'