package application;

import db.DB;

import java.sql.Connection;

public class Main {
    static void main(String[] args) {
        Connection conn = DB.getConnection();

        if (conn != null){
            System.out.println("Conexao Estabelecida");
        }
        else {
            System.out.println("Conexao Nao estabelecida");
        }

    }

}
