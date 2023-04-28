package co.edu.uco.publiuco.data.dao.factory;

import co.edu.uco.publiuco.data.dao.EstadoDAO;
import co.edu.uco.publiuco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.factory.relational.postgreSqlServer.PostgreSQLDAOFactory;
import co.edu.uco.publiuco.data.dao.factory.relational.postgreSqlServer.SqlServerDAOFactory;

public abstract class DAOFactory {

    public static DAOFactory getFactory(final Factory factory) {

        DAOFactory daoFactory;
        switch (factory) {
            case SQLSERVER: {
                daoFactory = new SqlServerDAOFactory();
                break;
            }
            case POSTGRESQL: {
                daoFactory = new PostgreSQLDAOFactory();
                break;
            }
            default:{
                throw new IllegalStateException("Not implemented yet");
            }
        }
        return daoFactory;
    }
    protected abstract void abrirConexion();
    public abstract void cerrarConexion();
    public abstract void iniciarTransaccion();
    public abstract void confirmarTransaccion();
    public abstract void cancelarTransaccion();
    public abstract EstadoDAO getEstadoDAO();
    public abstract TipoRelacionInstitucionDAO getTipoRelacionInstitucionDAO();
}
