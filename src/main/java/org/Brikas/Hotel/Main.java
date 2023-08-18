package org.Brikas.Hotel;


import static org.Brikas.Hotel.HotelDatabase.ConnectAndExecuteMySQL;

public class Main {
    public static void main(String[] args) {
    String databaseName = "jdbchoteldb"; //* If we are using DB
    ConnectAndExecuteMySQL(databaseName); //*
    }




}