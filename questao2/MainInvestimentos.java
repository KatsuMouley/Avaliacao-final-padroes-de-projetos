
import algoritmos.*;
import context.AnalisadorInvestimento;

public class MainInvestimentos {
    public static void main(String[] args) {
        AnalisadorInvestimento analisador = new AnalisadorInvestimento();
        double patrimonioCliente = 50000.00;

//Permite trocar o algoritmo (a estratégia) em tempo de execução.
        System.out.println("--- Cliente Iniciou o sistema ---");

        // 1. Começa com estratégia Conservadora
        analisador.setEstrategia(new ModeloConservador());
        analisador.executarAnalise(patrimonioCliente);

        System.out.println("--- Cliente mudou o perfil no app ---");

        // 2. Troca "a quente" para Agressivo
        analisador.setEstrategia(new ModeloAgressivo());
        analisador.executarAnalise(patrimonioCliente);

        // 3. Troca para Moderado
        analisador.setEstrategia(new ModeloModerado());
        analisador.executarAnalise(patrimonioCliente);

        
        // 4. Error
        analisador.setEstrategia( null);
        analisador.executarAnalise(patrimonioCliente);
    }
}