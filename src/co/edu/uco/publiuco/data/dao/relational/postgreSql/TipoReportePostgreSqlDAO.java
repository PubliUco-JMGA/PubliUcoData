package co.edu.uco.publiuco.data.dao.relational.postgresql;

import java.sql.Connection;
import java.util.List;

import co.edu.uco.publiuco.data.dao.TipoReporteDAO;
import co.edu.uco.publiuco.entities.TipoReporteEntity;

public final class TipoReportePostgreSqlDAO implements TipoReporteDAO {

	public TipoReportePostgreSqlDAO(final Connection connection) {
		
	}

	@Override
	public List<TipoReporteEntity> read(TipoReporteEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}


}