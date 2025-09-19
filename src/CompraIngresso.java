import java.util.Scanner;

public class CompraIngresso {
    
    // Atributos da classe de comprar ingresso
    private MapaAssentos mapa;
    private Scanner scanner;
    
    // Recebe o mapa de assentos e o scanner para leitura de escolha
    public CompraIngresso (MapaAssentos mapa, Scanner scanner) {
        this.mapa = mapa;
        this.scanner = scanner;   
    }
    
    
    // Confirmação da compra de ingresso e aviso para erro de compra
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
