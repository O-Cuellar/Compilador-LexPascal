import Mecanismo.Executor;

public class App {
    public static void main(String[] args) throws Exception {
        
        Executor exec = new Executor();
        //motor.CarregarArquivo();
        exec.CarregarArquivo();
        exec.ProcessarBufferPrimario();
        exec.ImprimirBufferPrimario();
        exec.ProcessarBufferSecundario();
        exec.ImprimirBufferSecundario();
        exec.AnalisarMontandoTabelaSimbolos();
        exec.ImprimirTabelaSimbolosPrograma();        
    }
}
