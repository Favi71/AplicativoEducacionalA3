package view;

import java.util.Scanner;
import model.OpcoesMenu;

public class MenuCursos {
	
	Scanner leia = new Scanner(System.in);
	OpcoesMenu chamado = new OpcoesMenu();
	
	public void iteracaoCursos() { 
		
		boolean sair = false;
		do {
		
		System.out.print("\n1 - Cadastrar curso.\n2 - Atualizar curso.\n3 - Listar cursos.\n4 - Remover curso.\n5 - Voltar a tela inicial");
		System.out.println();
		int opcao = leia.nextInt();
		switch(opcao) {
			case 1 : 
				chamado.CadastrarCurso();
				break;
			case 2 :
				chamado.EditarCurso();
				break;
			case 3 :
				chamado.ListarCursos();
				break;
			case 4 :
				chamado.DeletarCurso();
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