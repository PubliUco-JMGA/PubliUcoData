package co.edu.uco.publiuco.data.dao.relational.postgreSql;

import java.sql.Connection;
import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.data.dao.EstadoDAO;
import co.edu.uco.publiuco.entities.EstadoEntity;

public final class EstadoPostgreSqlDAO implements EstadoDAO{
	
	public EstadoPostgreSqlDAO(final Connection connection) {
		
	}

	@Override
	public final List<EstadoEntity> read(final EstadoEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}


}
