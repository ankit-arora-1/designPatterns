package singleton.multithreadedeager;

public class DBConnection {
    private static DBConnection dbConnection = new DBConnection();

    // Attr goes here

    private DBConnection() { }

    // Safe for multi threaded env
    public static DBConnection createInstance() {
        return dbConnection;
    }

}
