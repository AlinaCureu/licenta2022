package com.jonyapps.a2022proiect;

import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


    public class SQL {

        private static String ip = "192.168.1.3";
        private static String port = "1433";
        private static String Classes = "net.sourceforge.jtds.jdbc.Driver";
        private static String database = "test";
        private static String username = "sa";
        private static String password = "denisa";
        private static String url = "jdbc:jtds:sqlserver://"+ip+":"+port+"/"+database;

        private Connection connection = null;

        public Connection getConnection() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            Class.forName(Classes).newInstance();
            connection= DriverManager.getConnection(url,username,password);

            return connection;
        }

    }

