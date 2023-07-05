package singleton.singlethreaded;

public class DBConnection {
    private static DBConnection dbConnection;

    // Attr goes here

    private DBConnection() { }

    public static DBConnection createInstance() {
        if(dbConnection == null) {
            dbConnection = new DBConnection();
        }

        return dbConnection;
    }

}
