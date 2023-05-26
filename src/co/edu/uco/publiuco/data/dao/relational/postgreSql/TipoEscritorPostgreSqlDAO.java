package co.edu.uco.publiuco.data.dao.relational.postgresql;

import java.sql.Connection;
import java.util.List;

import co.edu.uco.publiuco.data.dao.TipoEscritorDAO;
import co.edu.uco.publiuco.entities.TipoEscritorEntity;

public final class TipoEscritorPostgreSqlDAO implements TipoEscritorDAO {

	public TipoEscritorPostgreSqlDAO(final Connection connection) {
		
	}

	@Override
	public List<TipoEscritorEntity> read(TipoEscritorEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}


}