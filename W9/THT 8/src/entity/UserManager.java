package entity;
import java.util.ArrayList;
import java.util.List;
import entity.UserManager;

public class UserManager {
    private List<User> users = new ArrayList<>();
    private static class User {
        String username;
        String password;

        User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
    public boolean register(String username, String password) {
        for (User u : users) {
            if (u.username.equals(username)) {
                System.out.println("Username sudah ada");
                return false;
            }
        }
        users.add(new User(username, password));
        System.out.println("Registrasi berhasil");
        return true;
    }
    public boolean login(String username, String password) {
        for (User u : users) {
            if (u.username.equals(username) && u.password.equals(password)) {
                System.out.println("Login berhasil");
                return true;
            }
        }
        System.out.println("Username atau password salah");
        return false;
    }
}