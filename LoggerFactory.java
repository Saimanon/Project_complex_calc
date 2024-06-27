public class LoggerFactory {
    public static Logger getLogger(String type, String filePath) {
        if (type.equalsIgnoreCase("console")) {
            return new ConsoleLogger();
        } else if (type.equalsIgnoreCase("file")) {
            return new FileLogger(filePath);
        }
        throw new IllegalArgumentException("Unknown logger type: " + type);
    }
}
