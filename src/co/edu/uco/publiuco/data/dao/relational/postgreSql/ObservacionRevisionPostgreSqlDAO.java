package co.edu.uco.publiuco.data.dao.relational.postgreSql;

import java.sql.Connection;
import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.data.dao.ObservacionRevisionDAO;
import co.edu.uco.publiuco.entities.ObservacionRevisionEntity;

public final class ObservacionRevisionPostgreSqlDAO implements ObservacionRevisionDAO {

	public ObservacionRevisionPostgreSqlDAO(final Connection connection) {
		
	}
	
	@Override
	public void create(ObservacionRevisionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ObservacionRevisionEntity> read(ObservacionRevisionEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(ObservacionRevisionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UUID entity) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}