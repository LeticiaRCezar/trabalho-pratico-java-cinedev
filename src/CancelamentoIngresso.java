import java.util.Scanner;

public class CancelamentoIngresso {
    
    // Atributos da classe para cancelamento de ingresso
    private MapaAssentos mapa;
    private Scanner scanner;
    
    // Recebe mapa de assentos e o scanner para leitura
    public CancelamentoIngresso (MapaAssentos mapa, Scanner scanner) {
        this.mapa = mapa;
        this.scanner = scanner;   
    }
    
    // Processo para confirmar o cancelamento da compra do ingresso
    public void cancelar() {
        
        System.out.println();
        System.out.println("------------------------");
        System.out.println("CANCELAMENTO DE INGRESSO");
        System.out.println("------------------------");
        
        System.out.print("Fileira (1-10): ");
        int f = scanner.nextInt() - 1;
        System.out.print("Assento (1-20): ");
        int a = scanner.nextInt() - 1;
        
        System.out.println();
        
        if (f < 0 || f >= mapa.Fileiras() || a < 0 || a >= mapa.Assentos()) {
            System.out.println("Erro! Fileira ou assento inválido!");
        } else if (mapa.liberar(f, a)) {
            System.out.println("Compra Cancelada!");
        } else {
            System.out.println("Esse assento está livre!");
        }
        
        System.out.println();
    }
}