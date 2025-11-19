package context;
import interfaces.CalculoRiscoStrategy;

public class AnalisadorInvestimento {
    
    // A referência para a interface, não para a classe concreta
    private CalculoRiscoStrategy estrategia;

    // Injeção de dependência via construtor ou Setter
    public void setEstrategia(CalculoRiscoStrategy novaEstrategia) {
        this.estrategia = novaEstrategia;
    }

    public void executarAnalise(double patrimonio) {
        if (estrategia == null) {
            System.out.println("\nErro: Nenhuma estratégia definida.\n");
            return;
        }
        // Delegação: O Analisador não calcula, ele manda a estratégia calcular
        String resultado = estrategia.calcularPerfil(patrimonio);
        System.out.println(resultado);
    }
}