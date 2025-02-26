package OopsConcepts.Encapsulation.InnerClasses.StaticNestedClass.ConfigurationEx;

public class Config {
    static class DbConfig {
        static String url;
        static String username;
        static String password;
        public static void setConfig(String url, String username, String password) {
            DbConfig.url = url;
            DbConfig.username = username;
            DbConfig.password = password;
        }
        public static String getConnectionString() {
            return "URl: " + url + ", Username: " + username + ", Password: " + password;
        }
    }
}
