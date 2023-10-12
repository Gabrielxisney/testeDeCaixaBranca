package testedesoftware;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class TesteDeSoftware {

    /**
     *  Esta classe representa um usuario
     */
    public class User {
        /**
         * Metodo para iniciar conexao com banco de dados
         * @return 
         */
        public Connection conectarBD(){
            /**
             * Variavel para checar conexao com banco de dados
             */
            Connection conn = null;
                /* Tenta iniciar a conexao com banco */
             try{
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
            // Captura qualquer excecao, mas nao e feito nada no codigo
            }catch (Exception e){}
            //Retorna o resultado da conexo
                return conn; }
        /**
         * Variavel para armazenar o nome de usuario
         */
    public String nome = "";
        /**
         * Variavel para informar se existe um usuario com as credencias informadas ou nao
         */
public boolean result = false;
        /**
         * Metodo para verificar credencias informadas com as do banco de dados
         * @param login
         * @param senha
         * @return 
         */
public boolean verificarUsuario (String login, String senha){
        /**
         * Variavel para armazenar a query SQL que sera feita no BD
         */
String sql = "";

        // chama o metodo conectarBD(), que tentara iniciar a conexao com banco de dados
Connection conn = conectarBD();
        /* As 3 linhas a seguir concatenam a query SQL e sera consultado o nome do usuario que tenham o login e senha informados no sistema*/
sql += "select nome from usuarios";
sql += "where login =" + "'" + login + "'";
sql += " and senha = " + "'" + senha + "';";

       /* As linhas abaixo tentam executar a query no banco */
try{
        //Cria uma instancia de Statement para executar a query utilizando a conexao ``conn´´
    Statement st = conn.createStatement ();
        // Executa a query no banco e armazena o resultado da query
    ResultSet rs = st.executeQuery(sql);
        /* Verifica se existe algum resultado no ``ResultSet´´*/
    if (rs.next()){
        /**
         * Caso seja encontrado ira definir a variavel result como verdadeira
         */
        result = true;
        /**
         * Armazena o valor da variavel ``nome´´ com o valor recebido pela variavel ``rs´´ depois da query SQL no banco
         */
        nome = rs.getString ("nome");}
        //Captura qualquer excecao, porem nada e retornado
}catch (Exception e) {}
        //Caso as credencias fornecidas nao tenham sido encontradas ira retornar o valor ``false´´ na variavel ``result´´
return result;
    }

}
    }
    
    
