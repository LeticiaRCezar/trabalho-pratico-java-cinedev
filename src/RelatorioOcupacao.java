public class RelatorioOcupacao {
    
    // Atributos da classe
    private MapaAssentos mapa;
    
    // Recebe o mapa de assentos
    public RelatorioOcupacao(MapaAssentos mapa) {
        this.mapa = mapa;
    }
    
    // Organizando a leitura do código e mostrando o relatório de ocupação 
    public void exibir() {
        int total = mapa.totalAssentos();
        int ocupados = mapa.ocupados();
        int livres = total - ocupados;
        double porcentagem = (ocupados * 100.0) / total;
        
        System.out.println();
        System.out.println("---------------------");
        System.out.println("RELATÓRIO DE OCUPAÇÃO");
        System.out.println("---------------------");
        
        System.out.println("Total      : " + total);
        System.out.println("Ocupados   : " + ocupados);
        System.out.println("Livres     : " + livres);
        System.out.printf("Percentual : %.2f%%", porcentagem);
        
        System.out.println();
    }
}