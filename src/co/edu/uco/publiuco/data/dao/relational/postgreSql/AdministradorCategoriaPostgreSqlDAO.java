package co.edu.uco.publiuco.data.dao.relational.postgreSql;

import java.sql.Connection;
import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.data.dao.AdministradorCategoriaDAO;
import co.edu.uco.publiuco.entities.AdministradorCategoriaEntity;

public final class AdministradorCategoriaPostgreSqlDAO implements AdministradorCategoriaDAO {

	public AdministradorCategoriaPostgreSqlDAO(final Connection connection) {
		
	}	
	
	@Override
	public void create(AdministradorCategoriaEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AdministradorCategoriaEntity> read(AdministradorCategoriaEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(AdministradorCategoriaEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UUID entity) {
		// TODO Auto-generated method stub
		
	}
    
}
