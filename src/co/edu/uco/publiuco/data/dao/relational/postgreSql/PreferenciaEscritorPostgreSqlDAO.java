package co.edu.uco.publiuco.data.dao.relational.postgresql;

import java.sql.Connection;
import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.data.dao.PreferenciaEscritorDAO;
import co.edu.uco.publiuco.entities.PreferenciaEscritorEntity;

public final class PreferenciaEscritorPostgreSqlDAO implements PreferenciaEscritorDAO {

	public PreferenciaEscritorPostgreSqlDAO(final Connection connection) {
		
	}
	
	@Override
	public void create(PreferenciaEscritorEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PreferenciaEscritorEntity> read(PreferenciaEscritorEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(PreferenciaEscritorEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UUID entity) {
		// TODO Auto-generated method stub
		
	}

}