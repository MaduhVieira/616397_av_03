import java.util.Scanner;
public class av_03 {

    public static void main(String[] args) {
		String nome;
		int idade, index, op;
		float altura;

        Scanner console = new Scanner(System.in);

		Agenda agenda = new Agenda();

        do{
			System.out.println("1 - Armazena Pessoa na Agenda");
			System.out.println("2 - Remover Pessoa na Agenda");
			System.out.println("3 - Busca Pessoa na Agenda");
			System.out.println("4 - Imprime Agenda");
			System.out.println("5 - Imprime Pessoa");
			
			System.out.println("0 - Fechar Agenda");
			
			System.out.println("\nDigite a opcao: ");
			op = console.nextInt();
			console.nextLine();

			switch(op) 
			{
				case 1: System.out.println("Digite o nome da pessoa: ");
						nome = console.nextLine();
						System.out.println("Digite a idade da pessoa: ");
						idade = console.nextInt();
						System.out.println("Digite a altura da pessoa: ");
						altura = console.nextFloat();

						agenda.armazenaPessoa(nome, idade, altura);
						break;

				case 2: System.out.println("Digite o nome que deseja remover: ");
						nome = console.nextLine();
						agenda.removePessoa(nome);
						break;

				case 3: System.out.println("Digite o nome que deseja procurar: ");
						nome = console.nextLine();
						agenda.imprimePessoa(agenda.buscaPessoa(nome));
						break;

				case 4: agenda.imprimeAgenda();
						break;

				case 5: System.out.println("Digite a posição da pessoa: ");
						index = console.nextInt();
						agenda.imprimePessoa(index);
				
			}			
	    }while (op != 0);

		console.close();
    }
}