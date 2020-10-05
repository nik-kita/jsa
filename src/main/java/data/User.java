package data;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class User {
    private String name;
    private String email;
    private String password;

    public User(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public static User getValidUser() {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/resources/credentials.properties"));
        } catch (IOException e) {
            System.err.println("It looks like you forgot to create 'src/resources/credentials.properties' file");
        }

        return new User(properties.getProperty("username"), properties.getProperty("password"));
    }

}
