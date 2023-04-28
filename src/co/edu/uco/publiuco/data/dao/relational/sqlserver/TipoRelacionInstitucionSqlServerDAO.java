package co.edu.uco.publiuco.data.dao.relational.sqlserver;

import co.edu.uco.publiuco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.entities.TipoRelacionInstitucionEntity;

import java.sql.Connection;
import java.util.List;

public final class TipoRelacionInstitucionSqlServerDAO implements TipoRelacionInstitucionDAO {

    public TipoRelacionInstitucionSqlServerDAO(Connection connection){

    }
    @Override
    public final void create(final TipoRelacionInstitucionEntity entity) {

    }

    @Override
    public final List<TipoRelacionInstitucionEntity> read(final TipoRelacionInstitucionEntity entity) {
        return null;
    }

    @Override
    public final void update(final TipoRelacionInstitucionEntity entity) {

    }

    @Override
    public final void delete(final TipoRelacionInstitucionEntity entity) {

    }
}
