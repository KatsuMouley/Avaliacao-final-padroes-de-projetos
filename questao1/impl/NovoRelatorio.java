package impl;
import interfaces.Relatorio;

public class NovoRelatorio implements Relatorio {
    @Override
    public void gerarCabecalho() { System.out.println("\nNovo Relatorio\n"); }
    @Override
    public void gerarCorpo() { System.out.println("Conteúdo: Diferente\n"); }
    @Override
    public void exportar() { System.out.println("Exportando em um meio diferente\n"); }
}