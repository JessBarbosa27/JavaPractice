import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc://postgresql://localhost:5432/JavaPracticeDB";
        String user = "postgres";
        String password = "12345";
        try {
            Connection connection = DriverManager.getConnection(url,
                    user, password);
        } catch (Exception e) {
            throw new RuntimeException("DB Connection failed, Find more at : " + e.getLocalizedMessage());
        }
    }
}