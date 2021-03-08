package org.zzpj.app;

import org.zzpj.lib.Person;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class App {

    public static void main( String[] args ) {
        Person person = new Person("Artur");
        person.setName(getNameProperty());
        person.sayHello();
    }

    public static String getNameProperty() {
        Properties properties = new Properties();
        try (InputStream inputStream = App.class.getClassLoader().getResourceAsStream("config.properties")) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty("clientName");
    }
}
