package algoritmos;
import interfaces.CalculoRiscoStrategy;

public class ModeloConservador implements CalculoRiscoStrategy {
    @Override
    public String calcularPerfil(double patrimonio) {
        return "\nCONSERVADOR: Recomenda-se 90% em Renda Fixa. Risco calculado sobre " + patrimonio + ": Baixo.\n";
    }
}
