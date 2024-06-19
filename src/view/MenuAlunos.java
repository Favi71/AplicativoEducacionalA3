package view;
import java.util.Scanner;
import model.OpcoesMenu;

public class MenuAlunos {
	
	Scanner leia = new Scanner(System.in);
	OpcoesMenu chamado = new OpcoesMenu();
	
	public void iteracaoAluno() { 
		
		boolean sair = false;
		do {
		
		System.out.print("\n1 - Cadastrar aluno.\n2 - Atualizar aluno.\n3 - Listar alunos.\n4 - Remover aluno\n5 - Voltar a tela inicial");
		System.out.println();
		int opcao = leia.nextInt();
		switch(opcao) {
			case 1 : 
				chamado.CadastrarAluno();
				break;
			case 2 :
				chamado.EditarAluno();
				break;
			case 3 :
				chamado.ListarAlunos();
				break;
			case 4 :
				chamado.DeletarAluno();
				break;
			case 5 :
				sair = true;
				System.out.println("Voltando...");
				break;
			default :
				System.out.println("Opção inválida. ");
		}
		} while	(sair != true);
	}
}

