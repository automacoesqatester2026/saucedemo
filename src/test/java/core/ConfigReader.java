package core;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private final Properties properties;

    public ConfigReader() {
        properties = new Properties();

        try (FileInputStream arquivo = new FileInputStream("src/test/resources/config/config.properties")) {
            properties.load(arquivo);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao ler o arquivo config.properties", e);
        }
    }

    public String getUrl() {
        return properties.getProperty("url");
    }

    public String getBrowser() {
        return properties.getProperty("browser");
    }

    public String getProperty(String chave) {
        return properties.getProperty(chave);
    }
}
