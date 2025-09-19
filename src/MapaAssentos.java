public class MapaAssentos {
    private String[][] sala;
    
    // Criando o mapa de assentos com o número de fileiras e assentos
    public MapaAssentos(int fileiras, int assentos) {
        sala = new String[fileiras][assentos];
        inicializar();     
    }
    
    // Inicializar para mostras os assentos como livres
    private void inicializar() {
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                sala[i][j] = "L";
            }
        }
    }
    
    // Exibindo o mapa da sala com fileiras e assentos
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
    
    // Ocupa um assento se ele estiver livre
    public boolean ocupar(int fileira, int assento) {
        if (sala[fileira][assento].equals("L")) {
            sala[fileira][assento] = "X";
            return true;
        }
        return false;
    }
    
    // Libera um assento se ele estiver ocupado
    public boolean liberar(int fileira, int assento) {
        if (sala[fileira][assento].equals("X")) {
            sala[fileira][assento] = "L";
            return true;
        }
        return false;
    }
    
    // Mostra o total de assentos da sala 
    public int totalAssentos() {
        return sala.length * sala[0].length;
    }
    
    // Mostra o número de assentos ocupados na sala
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