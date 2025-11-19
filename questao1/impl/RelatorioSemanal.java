package impl;

import interfaces.Relatorio;

public class RelatorioSemanal implements Relatorio {
    @Override
    public void gerarCabecalho() { System.out.println("\nSEMANA: 1º SEMANA do mês (01/01/22-07/01/22)\n"); }
    @Override
    public void gerarCorpo() { System.out.println("Conteúdo: Rotina de averiguação semanal...\n"); }
    @Override
    public void exportar() { System.out.println("Encaminhando anexo  semana1.docx\n"); }
}
