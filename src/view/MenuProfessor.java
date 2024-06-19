package view;
import java.util.Scanner;
import model.OpcoesMenu;

public class MenuProfessor {

	Scanner leia = new Scanner(System.in);
	OpcoesMenu chamado = new OpcoesMenu();
	
	public void iteracaoProf() {
		
		boolean sair = false;
		do {
		
		System.out.print("\n1. Cadastrar professor.\n2. Atualizar professor.\n3. Listar professores.\n4. Remover professor\n5. Voltar a tela inicial");
		System.out.println();
		int opcao = leia.nextInt();
		switch(opcao) {
			case 1 : 
				chamado.CadastrarProfessor();
				break;
			case 2 :
				chamado.EditarProfessor();
				break;
			case 3 :
				chamado.ListarProfessor();
				break;
			case 4 :
				chamado.DeletarProfessor();
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