package OopsConcepts.Encapsulation.InnerClasses.StaticNestedClass.ConfigurationEx;


public class Main {
    public static void main(String[] args) {
        Config.DbConfig.setConfig("jdbc:mysql://localhost:3306/mydb", "admin", "password123");
        System.out.println("Initial Configuration:");
        System.out.println(Config.DbConfig.getConnectionString());

        Config.DbConfig.setConfig("jdbc:postgresql://localhost:4457/mydb", "user", "password456");
        System.out.println("Updated Configuration:");
        System.out.println(Config.DbConfig.getConnectionString());
    }
}
