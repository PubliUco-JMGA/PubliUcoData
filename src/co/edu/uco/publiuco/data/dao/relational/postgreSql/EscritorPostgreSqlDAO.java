package co.edu.uco.publiuco.data.dao.relational.postgresql;

import java.sql.Connection;
import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.data.dao.EscritorDAO;
import co.edu.uco.publiuco.entities.EscritorEntity;

public final class EscritorPostgreSqlDAO implements EscritorDAO{

	public EscritorPostgreSqlDAO(final Connection connection) {
		
	}

	@Override
	public void create(EscritorEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EscritorEntity> read(EscritorEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(EscritorEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UUID entity) {
		// TODO Auto-generated method stub
		
	}

}