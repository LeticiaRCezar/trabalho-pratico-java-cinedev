public class MapaAssentos {
    private String[][] sala;
    
    public MapaAssentos(int fileiras, int assentos) {
        sala = new String[fileiras][assentos];
        inicializar();     
    }
    
    private void inicializar() {
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                sala[i][j] = "L";
            }
        }
    }
    
    public void exibirMapa() {
        System.out.println("Mapa da Sala: ");
        for (int i = 0; i < sala.length; i++) {
            System.out.printf("Fileira %2d: ", (i + 1));
            for (int j = 0; j < sala[i].length; j++) {
                System.out.print("[" + sala[i][j] + "]");
            }
            System.out.println();
        }
    }
    
    public boolean ocupar(int fileira, int assento) {
        if (sala[fileira][assento].equals("L")) {
            sala[fileira][assento] = "X";
            return true;
        }
        return false;
    }
    
    public boolean liberar(int fileira, int assento) {
        if (sala[fileira][assento].equals("X")) {
            sala[fileira][assento] = "L";
            return true;
        }
        return false;
    }
    
    public int totalAssentos() {
        return sala.length * sala[0].length;
    }
    
    public int ocupados() {
        int soma = 0;
        for (String[] linha : sala) {
            for (String assento : linha) {
                if (assento.equals("X")) {
                    soma++;
                }
            }
        }
        return soma;
    }
}