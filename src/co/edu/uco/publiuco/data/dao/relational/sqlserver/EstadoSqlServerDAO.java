package co.edu.uco.publiuco.data.dao.relational.sqlserver;

import co.edu.uco.publiuco.data.dao.EstadoDAO;
import co.edu.uco.publiuco.entities.EstadoEntity;

import java.sql.Connection;
import java.util.List;

public final class EstadoSqlServerDAO implements EstadoDAO {

    public EstadoSqlServerDAO(final Connection connection) {

    }
    @Override
    public void create(final EstadoEntity entity) {

    }

    @Override
    public final List<EstadoEntity> read(final EstadoEntity entity) {
        return null;
    }

    @Override
    public final void update(final EstadoEntity entity) {

    }

    @Override
    public void delete(final EstadoEntity entity) {

    }
}
