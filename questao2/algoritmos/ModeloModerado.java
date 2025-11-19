package algoritmos;
import interfaces.CalculoRiscoStrategy;

public class ModeloModerado implements CalculoRiscoStrategy {
    @Override
    public String calcularPerfil(double patrimonio) {
        return "\nMODERADO: Recomenda-se 60% Renda Fixa / 40% Fundos Imobiliários.\n";
    }
}
