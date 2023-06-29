package tienda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {

    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;

    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";

    protected void conectarBase() throws ClassNotFoundException, SQLException {

        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }

    
    protected void desconectarBase() throws Exception{
    
        try {
            if (resultado != null) { 
                resultado.close(); /*-- Esto sirve para cerrar la base de datos*/
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception e){
        throw e;
        }  
    }
    
    protected void insertarModificarEliminar(String sql) throws Exception{ /*Aca recibo la consulta a modificar, eliminar o hacer updatre*/
        try {
   conectarBase();
   sentencia = conexion.createStatement(); /*Aca le digo que se prepare la variable*/
   sentencia.executeUpdate(sql);  /*Aca le digo que ejecute la query*/
        } catch (SQLException | ClassNotFoundException ex) {
           /* conexion.rollback(); esto sirve en caso de que salga un error para que no se ejecute, se hace un rollback 
            sobre la consulta. Se va para atras. 
            
            SET autocommit=1;
            COMMIT;
            */
            throw ex;
        } finally {
        desconectarBase();
        }
    }
    
    protected void consultarBase(String sql) throws Exception{
    
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
}
