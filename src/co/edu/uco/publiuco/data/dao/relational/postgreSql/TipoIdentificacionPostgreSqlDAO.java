
package co.edu.uco.publiuco.data.dao.relational.postgresql;

import java.sql.Connection;
import java.util.List;

import co.edu.uco.publiuco.data.dao.TipoIdentificacionDAO;
import co.edu.uco.publiuco.entities.TipoIdentificacionEntity;

public final class TipoIdentificacionPostgreSqlDAO implements TipoIdentificacionDAO {
	
	public TipoIdentificacionPostgreSqlDAO(final Connection connection) {
		
	}

	@Override
	public List<TipoIdentificacionEntity> read(TipoIdentificacionEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}