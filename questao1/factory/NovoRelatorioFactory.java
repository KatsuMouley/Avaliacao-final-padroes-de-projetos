package factory;

import impl.NovoRelatorio;
import interfaces.Relatorio;

// Fábrica Concreta 2
public class NovoRelatorioFactory implements RelatorioFactory {
    @Override
    public Relatorio criarRelatorio() {
        return new NovoRelatorio();
    }
}