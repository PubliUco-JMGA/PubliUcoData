package co.edu.uco.publiuco.data.dao.relational.postgreSql;

import java.sql.Connection;
import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.data.dao.PaisDAO;
import co.edu.uco.publiuco.entities.PaisEntity;

public final class PaisPostgreSqlDAO implements PaisDAO  {
	
	public PaisPostgreSqlDAO(final Connection connection) {
		
	}

	@Override
	public List<PaisEntity> read(PaisEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}