package co.edu.uco.publiuco.data.dao.relational.postgreSql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.exception.PubliucoDataException;
import co.edu.uco.publiuco.data.dao.EstadoDAO;
import co.edu.uco.publiuco.data.dao.factory.relational.SqlDAO;
import co.edu.uco.publiuco.entities.EstadoEntity;
import co.edu.uco.publiuco.utils.UtilSql;

public final class EstadoPostgreSqlDAO extends SqlDAO implements EstadoDAO{
	
	public EstadoPostgreSqlDAO(final Connection connection) {
		super(connection);
	}

	@Override
	public final List<EstadoEntity> read(final EstadoEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String prepareSelect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String prepareFrom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String prepareWhere(Object entity, List paramethers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String prepareOrderBy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setParameters(PreparedStatement preparedStatement, List parameters) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected List executeQuery(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		return null;
	}


}
