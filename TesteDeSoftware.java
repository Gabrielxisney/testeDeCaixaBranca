package testedesoftware;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class TesteDeSoftware {

    public class User {
        public Connection conectarBD(){
            Connection conn = null;    //1                                                           
            try{                       //2                                                               
            Class.forName("com.mysql.Driver.Manager").newInstance();                        
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);    
        }catch (Exception e){}        //3
            return conn; }
    public String nome = "";
public boolean result = false;
public boolean verificarUsuario (String login, String senha){
String sql = "";
Connection conn = conectarBD();    //4

sql += "select nome from usuarios";
sql += "where login =" + "'" + login + "'";
sql += " and senha = " + "'" + senha + "';";
 try{                            //5
    Statement st = conn.createStatement ();
    ResultSet rs = st.executeQuery(sql);
    if (rs.next()){            //6
        result = true;
        nome = rs.getString ("nome");}
}catch (Exception e) {}        //7
return result;                 //8
    }

}
    }
    
    
