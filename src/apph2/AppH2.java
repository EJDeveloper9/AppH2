package apph2;

import java.sql.Connection;
import java.sql.DriverManager;

public class AppH2 {

    public static void main(String[] args) {
        try {
            Class.forName("org.h2.Driver");
            //Connection cn = DriverManager.getConnection("jdbc:h2:./db/myDB:IFEXISTS=TRUE", "admin", "");
            Connection cn = DriverManager.getConnection("jdbc:h2:" + "./db/my", "admin", "");
            System.out.println("Sucesso!");
        } catch (Exception e) {
            System.out.println("Falha de conexao" + e.getMessage());
        }
    }

}
