import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Puxando os objetos das classes
        MapaAssentos mapa = new MapaAssentos(10, 20);
        CompraIngresso compra = new CompraIngresso(mapa, scanner);
        CancelamentoIngresso cancelamento= new CancelamentoIngresso(mapa, scanner);
        RelatorioOcupacao ocupacao = new RelatorioOcupacao(mapa);
        
    // Exibindo o menu principal
    System.out.println("------------");
    System.out.println("MENU CINEDEV");
    System.out.println("------------");
    
    System.out.println();
    
    int opcao;
    
    do {   
    // Mostrando as opções disponíveis
    System.out.println("1. Exibir mapa de Assentos");
    System.out.println("2. Comprar Ingresso");
    System.out.println("3. Cancelar Compra de Ingresso");
    System.out.println("4. Exibir Relatório de Ocupação");
    System.out.println("5. Sair");
    System.out.print("Escolha uma opção: ");
    opcao = scanner.nextInt();
    
    System.out.println();
    
    // Opções escolhida
    switch(opcao) {
        case 1: mapa.exibirMapa();
        break;
        
        case 2: compra.comprar();
        break;        
        
        case 3: cancelamento.cancelar();
        break;
        
        case 4: ocupacao.exibir();
        break;

        case 5: System.out.println("Saindo...");
        break;
        
        default: System.out.print("Opção inválida");
        break;
    }        
    
    System.out.println();
    
    } while (opcao != 5); 
                
    scanner.close();
        
      }    
    }