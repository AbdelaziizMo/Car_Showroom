
package car_showroom;
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
*/
public class CarShowroom {
/*
    static String user = "root";
    static String password = "";
    static String url = "jdbc://localhost/login and signup";
    static Connection c;
    
    */
    public static void main(String[] args) /*throws SQLException*/ {
      /*  c = DriverManager.getConnection(url,user,password);
        System.out.println("55");*/
        LoginAndSignup loginframe = new LoginAndSignup();
        loginframe.setVisible(true);
        loginframe.pack();
        loginframe.setLocationRelativeTo(null);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*Toyota.CarUtils.printToyotaInfo();
        Ford.CarUtils.printFordInfo();
        Volkswagen.CarUtils.printVolkswagenInfo();
        Honda.CarUtils.printHondaInfo();
        Nissan.CarUtils.printNissanInfo();
        BMW.CarUtils.printBMWInfo();
        MercedesBenz.CarUtils.printMercedesBenzInfo();
        Audi.CarUtils.printAudiInfo();
        Hyundai.CarUtils.printHyundaiInfo();
        Kia.CarUtils.printKiaInfo();
       Car_Showroom ob = new Car_Showroom();
       ob.getCars();*/
    }

  
}
