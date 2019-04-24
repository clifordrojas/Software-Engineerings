package com.hfad.inventoryappfinalproject;

public class DatabaseOptions {

    public static final String DB_NAME = "local.db";
    public static final int DB_VERSION = 9;

    public static final String EMPLOYEES_TABLE = "employees";

    public static final String ID = "id";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";

    public static final String CREATE_EMPLOYEES_TABLE_ =
            "CREATE TABLE  " + EMPLOYEES_TABLE + "(" +
                    ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    USERNAME + " TEXT NOT NULL," +
                    PASSWORD + " TEXT NOT NULL);";


//    public static final String DB_NAME_CUSTOMERS = "customers.db";
//    public static final int DB_VERSION_CUSTOMERS = 1;

    public static final String CUSTOMERS_TABLE = "customers";

    public static final String CUSTOMER_ID = "id";
    public static final String CUSTOMER_NAME = "name";
    public static final String CUSTOMER_PHONE = "phonenum";
    public static final String CUSTOMER_ZIP = "zipcode";
    public static final String CUSTOMER_EMAIL = "email";

    public static final String CREATE_CUSTOMER_TABLE_ =
            "CREATE TABLE  " + CUSTOMERS_TABLE + "(" +
                    CUSTOMER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    CUSTOMER_NAME + " TEXT NOT NULL," +
                    CUSTOMER_PHONE + " INT NOT NULL, " +
                    CUSTOMER_ZIP + " INT NOT NULL," +
                    CUSTOMER_EMAIL + " TEXT NOT NULL);";

    public static final String PARTS_TABLE = "parts";
    public static final String PART_NUMBER = "parts_number";
    public static final String PART_NAME = "parts_name";
    public static final String PART_QOH = "parts_quantity";


    public static final String CREATE_PARTS_TABLE_ =
            "CREATE TABLE  " + PARTS_TABLE + "(" +
                    PART_NUMBER + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    PART_NAME + " TEXT NOT NULL," +
                    PART_QOH + " INT NOT NULL);"
            ;
}
