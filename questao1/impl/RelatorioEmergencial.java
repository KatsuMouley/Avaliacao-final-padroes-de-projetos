package impl;
import interfaces.Relatorio;

public class RelatorioEmergencial implements Relatorio {
    @Override
    public void gerarCabecalho() { System.out.println("\nURGENTE: Imediato [Emergencial]\n"); }
    @Override
    public void gerarCorpo() { System.out.println("Conteúdo: Crise e Bloqueios...\n"); }
    @Override
    public void exportar() { System.out.println("Enviando E-mail para Diretoria.\n"); }
}