package co.edu.uco.publiuco.data.dao.factory.relational.postgreSqlServer;

import co.edu.uco.publiuco.data.dao.EstadoDAO;
import co.edu.uco.publiuco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;

public final class SqlServerDAOFactory extends DAOFactory {
    @Override
    protected void abrirConexion() {

    }

    @Override
    public void cerrarConexion() {

    }

    @Override
    public void iniciarTransaccion() {

    }

    @Override
    public void confirmarTransaccion() {

    }

    @Override
    public void cancelarTransaccion() {

    }

    @Override
    public EstadoDAO getEstadoDAO() {
        return null;
    }

    @Override
    public TipoRelacionInstitucionDAO getTipoRelacionInstitucionDAO() {
        return null;
    }
}
