package co.edu.uco.publiuco.data.dao.relational.postgresql;

import java.sql.Connection;
import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.data.dao.ComentarioRevisorDAO;
import co.edu.uco.publiuco.entities.ComentarioRevisorEntity;

public final class ComentarioRevisorPostgreSqlDAO implements ComentarioRevisorDAO{

    public ComentarioRevisorPostgreSqlDAO(final Connection connection) {
		
	}
    
	@Override
	public void create(ComentarioRevisorEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ComentarioRevisorEntity> read(ComentarioRevisorEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(ComentarioRevisorEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UUID entity) {
		// TODO Auto-generated method stub
		
	}

}