package Classes;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DB {

    //Tạo kết nối giữa dự án và Mysql Database
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "java_library_system"; // Thêm tên database
    private static Integer portnumber = 3306;
    private static String password = ""; // Thêm mật khẩu nếu có

    public static Connection getConnection() {
        Connection connection = null;
        
        MysqlDataSource datasource =new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        datasource.setPassword(password);   
        
        try {
           
            
            
            connection = datasource.getConnection();
          
        } catch (SQLException ex) {

            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }
}
