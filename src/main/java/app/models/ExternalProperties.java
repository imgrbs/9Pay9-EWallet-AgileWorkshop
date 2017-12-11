package app.models;

public class ExternalProperties {
    private static String URL;
    private static String USER;
    private static String PASSWORD;

    public ExternalProperties() {
    }

    public ExternalProperties(String url, String user, String password) {
        ExternalProperties.URL = url;
        ExternalProperties.USER = user;
        ExternalProperties.PASSWORD = password;
    }

    public static void setURL(String URL) {
        ExternalProperties.URL = URL;
    }

    public static void setUSER(String USER) {
        ExternalProperties.USER = USER;
    }

    public static void setPASSWORD(String PASSWORD) {
        ExternalProperties.PASSWORD = PASSWORD;
    }

    public static String getURL() {
        return URL;
    }

    public static String getUSER() {
        return USER;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }
}
