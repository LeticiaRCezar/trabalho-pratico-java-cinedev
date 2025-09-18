import java.util.Scanner;

public class CompraIngresso {
    
    private MapaAssentos mapa;
    private Scanner scanner;
    
    public CompraIngresso (MapaAssentos mapa, Scanner scanner) {
        this.mapa = mapa;
        this.scanner = scanner;   
    }
    
    public void comprar() {
        System.out.println("Fileira (1-10): ");
        int f = scanner.nextInt() - 1;
        System.out.println("Assento (1-20): ");
        int a = scanner.nextInt() - 1;
        
        if (mapa.ocupar(f, a)) {
            System.out.println("Ingresso Comprado!");
        } else {
            System.out.println("Esse assento já está ocupado!");
        }
    }
}
