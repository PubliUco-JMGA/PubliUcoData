package co.edu.uco.publiuco.data.dao.relational.postgresql;

import java.sql.Connection;
import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.data.dao.PersonaDAO;
import co.edu.uco.publiuco.entities.PersonaEntity;

public final class PersonaPostgreSqlDAO implements PersonaDAO {

	public PersonaPostgreSqlDAO(final Connection connection) {
		
	}
	
	@Override
	public void create(PersonaEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PersonaEntity> read(PersonaEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(PersonaEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UUID entity) {
		// TODO Auto-generated method stub
		
	}
	
}