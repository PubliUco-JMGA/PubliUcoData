package co.edu.uco.publiuco.data.dao.factory.relational.postgreSqlServer;

import co.edu.uco.publiuco.data.dao.EstadoDAO;
import co.edu.uco.publiuco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.TipoRelacionInstitucionSqlServerDAO;

import java.sql.Connection;

public final class PostgreSQLDAOFactory extends DAOFactory {
    private Connection connection;
    public PostgreSQLDAOFactory(){
        abrirConexion();
    }
    @Override
    protected void abrirConexion() {

    }

    @Override
    public void cerrarConexion() {

    }

    @Override
    public void iniciarTransaccion() {
        // setAutocommit->false)
    }

    @Override
    public void confirmarTransaccion() {
        //commit
    }

    @Override
    public void cancelarTransaccion() {
        //rollback
    }

    @Override
    public EstadoDAO getEstadoDAO() {
        return new EstadoSqlServerDAO(connection);
    }

    @Override
    public TipoRelacionInstitucionDAO getTipoRelacionInstitucionDAO() {
        return new TipoRelacionInstitucionSqlServerDAO(connection);
    }
}
