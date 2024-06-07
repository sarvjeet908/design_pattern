package singleton_dp;

public class Client {
    public static void main(String[] args) {
        Databaseconnections db1=Databaseconnections.getInstance();
        System.out.println(db1.url);
        System.out.println(db1.username);
        System.out.println(db1.password);

        /*
        Databaseconnections db2=new Databaseconnections();  error explains that
        constructor is private and we cannot access it from other class.
         */

    }
}
