public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        LoggerFactory level = new LoggerFactory();
        Logger mensagem = level.onConsole();
        mensagem.log(Level.DEBUG, "Debug message.");
        mensagem.log(Level.WARNING, "Warning message.");
        mensagem.log(Level.ERROR, "Error message.");
        Logger cor = level.onFile();
        cor.log(Level.DEBUG, "Debug message.");
        cor.log(Level.WARNING, "Warning message.");
        cor.log(Level.ERROR, "Error message.");
    }
}