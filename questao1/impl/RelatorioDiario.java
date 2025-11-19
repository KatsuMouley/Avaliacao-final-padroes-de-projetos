package impl;
import interfaces.Relatorio;

public class RelatorioDiario implements Relatorio {
    @Override
    public void gerarCabecalho() { System.out.println("\nDATA: Hoje [Diário]\n"); }
    @Override
    public void gerarCorpo() { System.out.println("Conteúdo: Rotina operacional...\n"); }
    @Override
    public void exportar() { System.out.println("Exportando PDF simples.\n"); }
}