package factory;

import interfaces.*;
import impl.*;

public class RelatorioDiarioFactory implements RelatorioFactory {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioDiario();
    }
}