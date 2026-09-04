package application;

import db.DB;

import java.sql.Connection;

public class Main {
    static void main(String[] args) {
        Connection conn = DB.getConnection();
        conn = DB.closeConnection();

    }

}
