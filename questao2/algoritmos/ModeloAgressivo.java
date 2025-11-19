package algoritmos;
import interfaces.CalculoRiscoStrategy;

public class ModeloAgressivo implements CalculoRiscoStrategy {
    @Override
    public String calcularPerfil(double patrimonio) {
        return "\nAGRESSIVO: Foco em Ações e Cripto. Atenção à volatilidade alta.\n";
    }
}