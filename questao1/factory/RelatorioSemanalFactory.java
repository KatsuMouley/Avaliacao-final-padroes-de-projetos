package factory;

import impl.RelatorioSemanal;
import interfaces.Relatorio;

// Fábrica Concreta 2
public class RelatorioSemanalFactory implements RelatorioFactory {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioSemanal();
    }
}