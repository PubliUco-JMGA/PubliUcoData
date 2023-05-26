package co.edu.uco.publiuco.data.dao.relational.postgresql;

import java.sql.Connection;
import java.util.List;

import co.edu.uco.publiuco.data.dao.TipoRevisionDAO;
import co.edu.uco.publiuco.entities.TipoRevisionEntity;

public final class TipoRevisionPostgreSqlDAO implements TipoRevisionDAO {

	public TipoRevisionPostgreSqlDAO(final Connection connection) {
		
	}

	@Override
	public List<TipoRevisionEntity> read(TipoRevisionEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}


}