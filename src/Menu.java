import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    System.out.println("MENU CINEDEV");
    System.out.println("------------");
    
    int opcao;
    
    do {    
    System.out.println("1. Exibir mapa de Assentos");
    System.out.println("2. Comprar Ingresso");
    System.out.println("3. Cancelar Compra de Ingresso");
    System.out.println("4. Exibir Relatório de Ocupação");
    System.out.println("5. Sair");
    System.out.println("Escolha uma opção: ");
    opcao = scanner.nextInt();
    
    switch(opcao) {
        case 1: System.out.println("Exibição dos assentos: ");
        break;
        
        case 2: System.out.println("Realizar compra do ingresso: ");
        break;
        
        case 3: System.out.println("Cancelamento de compra: ");
        break;
        
        case 4: System.out.println("Assentos ocupados: ");
        break;
        
        case 5: System.out.println("Saindo...");
        break;
        
        default: System.out.print("Opção inválida");
        break;
    }        
            
    } while (opcao != 5); 
                
    scanner.close();
        
      }    
    }    