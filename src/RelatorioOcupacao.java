public class RelatorioOcupacao {
    private MapaAssentos mapa;
    
    public RelatorioOcupacao(MapaAssentos mapa) {
        this.mapa = mapa;
    }
    
    public void exibir() {
        int total = mapa.totalAssentos();
        int ocupados = mapa.ocupados();
        int livres = total - ocupados;
        double porcentagem = (ocupados * 100.0) / total;
        
        System.out.println("RELATÓRIO");
        System.out.println("---------");
        
        System.out.println("Total: " + total);
        System.out.println("Ocupados: " + ocupados);
        System.out.println("Livres: " + livres);
        System.out.printf("Percentual: %.2f%%", porcentagem);
    }
}