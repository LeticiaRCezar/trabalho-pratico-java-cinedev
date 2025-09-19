import java.util.Scanner;

public class CancelamentoIngresso {
    
    private MapaAssentos mapa;
    private Scanner scanner;
    
    public CancelamentoIngresso (MapaAssentos mapa, Scanner scanner) {
        this.mapa = mapa;
        this.scanner = scanner;   
    }
    
    public void cancelar() {
        System.out.println("Fileira (1-10): ");
        int f = scanner.nextInt() - 1;
        System.out.println("Assento (1-20): ");
        int a = scanner.nextInt() - 1;
        
        if (mapa.liberar(f, a)) {
            System.out.println("Compra Cancelada!");
        } else {
            System.out.println("Esse assento está livre!");
        }
    }
}