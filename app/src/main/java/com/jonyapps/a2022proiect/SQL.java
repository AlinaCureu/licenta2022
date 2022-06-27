package com.jonyapps.a2022proiect;

import android.os.StrictMode;

import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;


public class SQL {

        private static String port = "1433";
        private static String Classes = "net.sourceforge.jtds.jdbc.Driver";
        private static String database = "test";
        private static String username = "sa";
        private static String password = "denisa";

        private Connection connection = null;

        public Connection getConnection() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException, SocketException {
            String ip="192.168.1.3";
            try{
                Enumeration<NetworkInterface> networkInterfaceEnumeration=NetworkInterface.getNetworkInterfaces();
                while(networkInterfaceEnumeration.hasMoreElements()) {
                    for (InterfaceAddress interfaceAddress : networkInterfaceEnumeration.nextElement().getInterfaceAddresses()) {
                        final InetAddress inetAddress = interfaceAddress.getAddress();
                        if (inetAddress.isSiteLocalAddress() && inetAddress.getHostAddress().startsWith("192.168")) {
                            ip = inetAddress.getHostAddress();
                            System.out.println("Adresa ip=" + ip);
                        }
                    }
                }
                }catch(SocketException e){
                    e.printStackTrace();
                }
            String url = "jdbc:jtds:sqlserver://"+ip+":"+port+"/"+database;
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            Class.forName(Classes).newInstance();
            connection= DriverManager.getConnection(url,username,password);

            return connection;
        }

    }

