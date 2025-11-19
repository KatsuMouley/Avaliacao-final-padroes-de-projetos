
import factory.NovoRelatorioFactory;
import factory.RelatorioDiarioFactory;
import factory.RelatorioEmergencialFactory;
import factory.RelatorioFactory;
import factory.RelatorioSemanalFactory;
import interfaces.Relatorio;

public class MainLogistica {
    public static void main(String[] args) {
        // O cliente escolhe a FÁBRICA, não o produto direto.
        // Se precisarmos mudar a lógica de criação do Diário, mudamos só na Factory.
        
        RelatorioFactory fabrica = new RelatorioDiarioFactory();
        Relatorio relatorio = fabrica.criarRelatorio();
        relatorio.gerarCabecalho();
        relatorio.gerarCorpo();
        relatorio.exportar();
        
        System.out.println("\n--- Mudando contexto ---\n");
        
        fabrica = new RelatorioEmergencialFactory();
        relatorio = fabrica.criarRelatorio();
        relatorio.gerarCorpo();
        relatorio.exportar();

    
        System.out.println("\n--- Mudando contexto ---\n");

        
        fabrica = new RelatorioSemanalFactory();
        relatorio = fabrica.criarRelatorio();
        relatorio.gerarCabecalho();
        relatorio.gerarCorpo();
        relatorio.exportar();  
        
        System.out.println("\n--- Mudando contexto ---\n");
    
        fabrica = new NovoRelatorioFactory();
        relatorio = fabrica.criarRelatorio();
        relatorio.gerarCabecalho();
        relatorio.gerarCorpo();
        relatorio.exportar();
    }
}