/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apph2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author wanzambi
 */
public class InsertTabela {

    public static void main(String[] args) {
        try {
            //Class.forName("org.h2.Driver");
            Connection cn = DriverManager.getConnection("jdbc:h2:" + "./db/my", "admin", "");
//           
            Statement stmt = cn.createStatement();
            String sql = "insert into REGISTRATION(nome, endereco, idade) values ('Je', 'Huila', '10')";
            int i = stmt.executeUpdate(sql);
            System.out.println(i + "Tabela Inserida");
        } catch (Exception e) {
            System.out.println("Falha de conexao" + e.getMessage());
        }
    }
}
