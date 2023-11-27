package Menu;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
	
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("# ## ### #### #########   Bem vinde ao menu de compras hockeyBR!   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para selecionar os sticks-- ");
		System.out.println("\n--Digite 2 para proteções-- ");
		System.out.println("\n--Digite 3 para vestuário-- ");
		System.out.println("\n--Digite 4 para sair-- ");
		op = leia.nextInt();

		switch (op) {
        case 1:
        	
            System.out.println("Você escolheu a opção 1 (sticks).");
            break;
        case 2:
            
            System.out.println("Você escolheu a opção 2 (proteções).");
            break;
        case 3:
            
            System.out.println("Você escolheu a opção 3 (vestuário).");
            break;
        case 4:
            System.out.println("Programa encerrado. Obrigado por usar o menu de compras hockeyBR!");
            break;
        default:
            System.out.println("Comando inválido. Por favor, escolha uma opção válida.");
    }
		
		
		
		}
		
		
	}


