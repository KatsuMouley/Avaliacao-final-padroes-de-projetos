package factory;
import impl.RelatorioEmergencial;
import interfaces.Relatorio;
// Fábrica Concreta 2
public class RelatorioEmergencialFactory implements RelatorioFactory {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioEmergencial();
    }
}