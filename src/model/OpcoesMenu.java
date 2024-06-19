package model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpcoesMenu {

	//Armazenar Professores, Cursos e Alunos
	List<Aluno> alunos = new ArrayList<>();
	List<Professor> professores = new ArrayList<>();
	List<Curso> cursos = new ArrayList<>();
	
	Scanner leia = new Scanner(System.in);
	
	//Método para cadastrar novos alunos
	public void CadastrarAluno() {
		
		System.out.println();
		System.out.println("Numero de matrícula:");
		int numMatric = leia.nextInt();
		leia.nextLine();
		
		System.out.println("Nome:");
		String nome = leia.nextLine();
		
		System.out.println("Data de nascimento:");
		String datNasc = leia.nextLine();
		
		System.out.println("Endereço:");
		String endereco = leia.nextLine();
		
		System.out.println("Telefone:");
		String telefone = leia.nextLine();
		
		System.out.println("Email:");
		String email = leia.nextLine();
		Aluno novoAluno = new Aluno(numMatric, nome, datNasc, endereco, telefone, email);
		alunos.add(novoAluno);
		
	}
	//Método para editar inrfomações dos alunos
	public void EditarAluno() {
	    Scanner leia = new Scanner(System.in);
	    
	    int i = 1;
	    System.out.println("Escolha o número do aluno que você deseja editar: ");
	    for (Aluno aluno : alunos) {
	        System.out.println(i + ". " + aluno.getNome());
	        i++;
	    }
	    
	    int opcao = leia.nextInt();
	    leia.nextLine(); // Limpar o buffer
	    
	    if (opcao < 1 || opcao > alunos.size()) {
	        System.out.println("Opção inválida.");
	        return;
	    }
	    
	    Aluno alunoSelecionado = alunos.get(opcao - 1);
	    boolean sair = false;
	    do {
	    	
	    	System.out.println("O que você deseja alterar neste aluno?");
		    System.out.println("1. Nome.");
		    System.out.println("2. Data de Nascimento.");
		    System.out.println("3. Endereço.");
		    System.out.println("4. Telefone.");
		    System.out.println("5. Email.");
		    System.out.println("6. Cancelar/Sair.");
		    
	        int alterar = leia.nextInt();
	        leia.nextLine(); // Limpar o buffer
	        
	        switch (alterar) {
	            case 1:
	                System.out.println("Digite o novo nome: ");
	                String novoNome = leia.nextLine();
	                alunoSelecionado.setNome(novoNome);
	                break;
	            case 2:
	                System.out.println("Digite a nova data de nascimento: ");
	                String novaData = leia.nextLine();
	                alunoSelecionado.setDataNasc(novaData);
	                break;
	            case 3:
	                System.out.println("Digite o novo endereço: ");
	                String novoEndereco = leia.nextLine();
	                alunoSelecionado.setEndereco(novoEndereco);
	                break;
	            case 4:
	                System.out.println("Digite o novo telefone: ");
	                String novoTelefone = leia.nextLine();
	                alunoSelecionado.setTelefone(novoTelefone);
	                break;
	            case 5:
	                System.out.println("Digite o novo email: ");
	                String novoEmail = leia.nextLine();
	                alunoSelecionado.setEmail(novoEmail);
	                break;
	            case 6:
	                sair = true;
	                break;
	            default:
	                System.out.println("Opção inválida. Digite novamente.");
	                break;
	        }
	    } while (!sair);
	}
	
	//Método para exibir os alunos cadastrados
	public void ListarAlunos() {
		
		if (alunos.isEmpty()) {
			System.out.println();
			System.out.println("Não há alunos na lista. ");
			return;
		}
		int i = 1;
		for(Aluno aluno : alunos) {
			System.out.println();
			System.out.println(i);
			System.out.println("Númedo de Matrícula: " + aluno.getNumMatricula());
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Data de Nascimento: " + aluno.getDataNasc());
			System.out.println("Endereço: " + aluno.getEndereco());
			System.out.println("Telefone: " + aluno.getTelefone());
			System.out.println("Email: " + aluno.getEmail());
			System.out.println();
			i++;
		}
	}
	
	//Método para deletar alunos
	public void DeletarAluno() {
		
		if (alunos.isEmpty()) {
			System.out.println();
			System.out.println("Não há alunos para serem removidos. ");
			return;
		}
		
		Scanner leia = new Scanner(System.in);
	    
	    int i = 1;
	    System.out.println("Escolha o número do aluno que quer deletar: ");
	    for (Aluno aluno : alunos) {
	        System.out.println(i + ". " + aluno.getNome());
	        i++;
	    }
	    
	    int opcao = leia.nextInt();
	    leia.nextLine(); // Limpar o buffer
	    
	    if (opcao < 1 || opcao > alunos.size()) {
	        System.out.println("Opção inválida.");
	        return;
	    }
	    alunos.remove(opcao - 1);
	    System.out.println("Aluno removido!");
	}
	
	//Método para cadastrar novos professores
		public void CadastrarProfessor() {
			
			System.out.println();
			System.out.println("Código:");
			int codigo = leia.nextInt();
			leia.nextLine();
			
			System.out.println("Nome:");
			String nome = leia.nextLine();
			
			System.out.println("Data de nascimento:");
			String datNasc = leia.nextLine();
			
			System.out.println("Endereço:");
			String endereco = leia.nextLine();
			
			System.out.println("Telefone:");
			String telefone = leia.nextLine();
			
			System.out.println("Email:");
			String email = leia.nextLine();
			Professor novoProfessor = new Professor(codigo, nome, datNasc, endereco, telefone, email);
			professores.add(novoProfessor);
			
		}
		//Método para editar inrfomações dos Professores
		public void EditarProfessor() {
		    Scanner leia = new Scanner(System.in);
		    
		    int i = 1;
		    System.out.println("Escolha o códico do professor que você deseja editar: ");
		    for (Professor professor : professores) {
		        System.out.println(i + ". " + professor.getNome());
		        i++;
		    }
		    
		    int opcao = leia.nextInt();
		    leia.nextLine(); // Limpar o buffer
		    
		    if (opcao < 1 || opcao > professores.size()) {
		        System.out.println("Opção inválida.");
		        return;
		    }
		    
		    Professor professoreSelecionado = professores.get(opcao - 1);
		    boolean sair = false;
		    do {
		    	
		    	System.out.println("O que você deseja alterar neste professor?");
			    System.out.println("1. Nome.");
			    System.out.println("2. Data de Nascimento.");
			    System.out.println("3. Endereço.");
			    System.out.println("4. Telefone.");
			    System.out.println("5. Email.");
			    System.out.println("6. Cancelar/Sair.");
			    
		        int alterar = leia.nextInt();
		        leia.nextLine(); // Limpar o buffer
		        
		        switch (alterar) {
		            case 1:
		                System.out.println("Digite o novo nome: ");
		                String novoNome = leia.nextLine();
		                professoreSelecionado.setNome(novoNome);
		                break;
		            case 2:
		                System.out.println("Digite a nova data de nascimento: ");
		                String novaData = leia.nextLine();
		                professoreSelecionado.setDataNasc(novaData);
		                break;
		            case 3:
		                System.out.println("Digite o novo endereço: ");
		                String novoEndereco = leia.nextLine();
		                professoreSelecionado.setEndereco(novoEndereco);
		                break;
		            case 4:
		                System.out.println("Digite o novo telefone: ");
		                String novoTelefone = leia.nextLine();
		                professoreSelecionado.setTelefone(novoTelefone);
		                break;
		            case 5:
		                System.out.println("Digite o novo email: ");
		                String novoEmail = leia.nextLine();
		                professoreSelecionado.setEmail(novoEmail);
		                break;
		            case 6:
		                sair = true;
		                break;
		            default:
		                System.out.println("Opção inválida. Digite novamente.");
		                break;
		        }
		    } while (!sair);
		}
		
		//Método para exibir os Professores cadastrados
		public void ListarProfessor() {
			
			if (professores.isEmpty()) {
				System.out.println();
				System.out.println("Não há professores na lista. ");
				return;
			}
			int i = 1;
			for(Professor professor : professores) {
				System.out.println();
				System.out.println(i);
				System.out.println("Código: " + professor.getCod());
				System.out.println("Nome: " + professor.getNome());
				System.out.println("Data de Nascimento: " + professor.getDataNasc());
				System.out.println("Endereço: " + professor.getEndereco());
				System.out.println("Telefone: " + professor.getTelefone());
				System.out.println("Email: " + professor.getEmail());
				System.out.println();
				i++;
			}
		}
		
		//Método para deletar Professores
		public void DeletarProfessor() {
			
			if (professores.isEmpty()) {
				System.out.println();
				System.out.println("Não há professores para serem removidos. ");
				return;
			}
			
			Scanner leia = new Scanner(System.in);
		    
		    int i = 1;
		    System.out.println("Escolha o número do professor que quer deletar: ");
		    for (Professor professor : professores) {
		        System.out.println(i + ". " + professor.getNome());
		        i++;
		    }
		    
		    int opcao = leia.nextInt();
		    leia.nextLine(); // Limpar o buffer
		    
		    if (opcao < 1 || opcao > professores.size()) {
		        System.out.println("Opção inválida.");
		        return;
		    }
		    professores.remove(opcao - 1);
		    System.out.println("Professor removido!");
		}
		
		//Método para cadastrar novos cursos
		public void CadastrarCurso() {
			
			System.out.println();
			System.out.println("Código do curso:");
			int codigo = leia.nextInt();
			leia.nextLine();
			
			System.out.println("Nome:");
			String nome = leia.nextLine();
			
			System.out.println("Dados do curso:");
			String dadosCurso = leia.nextLine();
			
			System.out.println("Código do Professor responsável:");
			int codProfRespensavel = leia.nextInt();
			
			Curso novoCurso = new Curso(codigo, nome, dadosCurso, codProfRespensavel);
			cursos.add(novoCurso);
			
		}
		//Método para editar inrfomações dos cursos
		public void EditarCurso() {
		    Scanner leia = new Scanner(System.in);
		    
		    int i = 1;
		    System.out.println("Escolha o número do curso que você deseja editar: ");
		    for (Curso curso : cursos) {
		        System.out.println(i + ". " + curso.getNome());
		        i++;
		    }
		    
		    int opcao = leia.nextInt();
		    leia.nextLine(); // Limpar o buffer
		    
		    if (opcao < 1 || opcao > cursos.size()) {
		        System.out.println("Opção inválida.");
		        return;
		    }
		    
		    Curso cursoSelecionado = cursos.get(opcao - 1);
		    boolean sair = false;
		    do {
		    	
		    	System.out.println("O que você deseja alterar neste curso?");
			    System.out.println("1. Nome.");
			    System.out.println("2. Código.");
			    System.out.println("3. Código do Professor responsável.");
			    System.out.println("4. Dados do curso.");
			    System.out.println("5. Cancelar/Sair.");
			    
		        int alterar = leia.nextInt();
		        leia.nextLine(); // Limpar o buffer
		        
		        switch (alterar) {
		            case 1:
		                System.out.println("Digite o novo nome: ");
		                String novoNome = leia.nextLine();
		                cursoSelecionado.setNome(novoNome);
		                break;
		            case 2:
		                System.out.println("Digite o novo código: ");
		                int novoCod = leia.nextInt();
		                cursoSelecionado.setCod(novoCod);
		                break;
		            case 3:
		                System.out.println("Código de Professor responsável: ");
		                int novoCodProf = leia.nextInt();
		                cursoSelecionado.setCodProfRespensavel(novoCodProf);
		                break;
		            case 4:
		                System.out.println("Digite os novos dados do curso: ");
		                String novosDados = leia.nextLine();
		                cursoSelecionado.setDadosCurso(novosDados);
		                break;
		            case 5:
		                sair = true;
		                break;
		            default:
		                System.out.println("Opção inválida. Digite novamente.");
		                break;
		        }
		    } while (!sair);
		}
		
		//Método para exibir os cursos cadastrados
		public void ListarCursos() {
			
			if (cursos.isEmpty()) {
				System.out.println();
				System.out.println("Não há cursos na lista. ");
				return;
			}
			int i = 1;
			for(Curso curso : cursos) {
				System.out.println();
				System.out.println(i);
				System.out.println("Código do curso: " +curso.getCod());
				System.out.println("Nome: " + curso.getNome());
				System.out.println("Dados do curso: " + curso.getDadosCurso());
				System.out.println("Código de Professor responsável: " + curso.getCodProfRespensavel());
				System.out.println();
				i++;
			}
		}
		
		//Método para deletar curso
		public void DeletarCurso() {
			
			if (cursos.isEmpty()) {
				System.out.println();
				System.out.println("Não há cursos para serem removidos. ");
				return;
			}
			
			Scanner leia = new Scanner(System.in);
		    
		    int i = 1;
		    System.out.println("Escolha o número do curso que deseja deletar: ");
		    for (Curso curso : cursos) {
		        System.out.println(i + ". " + curso.getNome());
		        i++;
		    }
		    
		    int opcao = leia.nextInt();
		    leia.nextLine(); // Limpar o buffer
		    
		    if (opcao < 1 || opcao > cursos.size()) {
		        System.out.println("Opção inválida.");
		        return;
		    }
		    cursos.remove(opcao - 1);
		    System.out.println("Curso removido!");
		}
}
