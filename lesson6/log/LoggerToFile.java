package lesson6.log;
import java.time.LocalDateTime;
import lesson6.model.FileLoggOperable;
import lesson6.model.FileLoggOperationImpl;

public class LoggerToFile implements Loggerable{
    private FileLoggOperable loggOperation;

    public LoggerToFile(String fileNameForLogg) {
        loggOperation = new FileLoggOperationImpl(fileNameForLogg);
    }

    @Override
    public void logg(String text) {
        loggOperation.saveLogg(LocalDateTime.now() + ": " + text);
    }
}
