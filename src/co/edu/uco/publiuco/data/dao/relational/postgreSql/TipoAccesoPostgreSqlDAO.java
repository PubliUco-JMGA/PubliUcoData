package co.edu.uco.publiuco.data.dao.relational.postgreSql;

import java.sql.Connection;
import java.util.List;

import co.edu.uco.publiuco.data.dao.TipoAccesoDAO;
import co.edu.uco.publiuco.entities.TipoAccesoEntity;

public final class TipoAccesoPostgreSqlDAO implements  TipoAccesoDAO {

	public TipoAccesoPostgreSqlDAO(final Connection connection) {
		
	}

	@Override
	public List<TipoAccesoEntity> read(TipoAccesoEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	
}