package co.edu.uco.publiuco.data.dao.relational.postgresql;

import java.sql.Connection;
import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.data.dao.RevisionDAO;
import co.edu.uco.publiuco.entities.RevisionEntity;

public final class RevisionPosgreSqlDAO implements RevisionDAO {

	public RevisionPosgreSqlDAO(final Connection connection) {
		
	}
	
	@Override
	public void create(RevisionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RevisionEntity> read(RevisionEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(RevisionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UUID entity) {
		// TODO Auto-generated method stub
		
	}

}