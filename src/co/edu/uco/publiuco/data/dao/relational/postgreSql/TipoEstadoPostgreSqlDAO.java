package co.edu.uco.publiuco.data.dao.relational.postgreSql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoDataException;
import co.edu.uco.publiuco.data.dao.TipoEstadoDAO;
import co.edu.uco.publiuco.data.dao.factory.relational.SqlDAO;
import co.edu.uco.publiuco.entities.TipoEstadoEntity;
import co.edu.uco.publiuco.utils.Messages;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

public class TipoEstadoPostgreSqlDAO extends SqlDAO<TipoEstadoEntity> implements TipoEstadoDAO{
	
	public TipoEstadoPostgreSqlDAO(final Connection connection) {
		super(connection);
	}
	


	@Override
	public List<TipoEstadoEntity> read(TipoEstadoEntity entity) {
		var sqlStatement = new StringBuilder();
		var parameters = new ArrayList<>();
		
		sqlStatement.append(prepareSelect());
		sqlStatement.append(prepareFrom());
		sqlStatement.append(prepareWhere(entity, parameters));
		sqlStatement.append(prepareOrderBy());
		
		try (var preparedstatement = getConnection().prepareStatement(sqlStatement.toString())){
			
			
		} catch (SQLException exception) {
			var userMessage = Messages.TipoEstadoSql.USER_MESSAGE_CREATE;
			var technicalMessage = Messages.TipoEstadoSql.TECHNICAL_MESSAGE_CREATE;
			throw PubliucoDataException.create(technicalMessage, userMessage, exception);
			
		}catch (Exception exception) {
			var userMessage = Messages.TipoEstadoSql.USER_MESSAGE_CREATE;
			var technicalMessage = Messages.TipoEstadoSql.TECHNICAL_MESSAGE_CREATE_JAVA_EXCEPTION;
			throw PubliucoDataException.create(technicalMessage, userMessage, exception);
		}
		
		return null;
	}
	

	@Override
	protected final String prepareSelect() {
		return "SELECT identificador, nombre, descripcion";
	}

	@Override
	protected final String prepareFrom() {
		return "FROM \"TipoEstado\"";
	}

	@Override
	protected final String prepareWhere(final TipoEstadoEntity entity, List<Object> parameters) {
		final var where = new StringBuilder("");
		parameters = UtilObject.getDefault(parameters, new ArrayList<>()); //por referencia
		var setWhere = true;
		
		if (!UtilObject.isNull(entity)){
			
			if (!UtilUUID.isDefault(entity.getIdentificador())) {
				parameters.add(entity.getIdentificador());
				where.append("WHERE identificador = ? ");
				setWhere = false;
			}
			UtilText.getUtilText();
			if (!UtilText.isEmpty(entity.getNombre())) {
				parameters.add(entity.getNombre());
				where.append(setWhere ? "WHERE " : "AND ").append("nombre = ? ");
				setWhere = false;
			}
			UtilText.getUtilText();
			if (!UtilText.isEmpty(entity.getDescripcion())) {
				parameters.add(entity.getDescripcion());
				where.append(setWhere ? "WHERE " : "AND ").append("descripcion = ? ");
				setWhere = false;
			}
		}
		
		return where.toString();
	}



	@Override
	protected String prepareOrderBy() {
		return "ORDER BY nombre ASC";
	}



	@Override
	protected void setParameters(PreparedStatement preparedStatement, List<Object> parameters) {
		// TODO Auto-generated method stub
		
	}



	@Override
	protected List<TipoEstadoEntity> executeQuery(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		return null;
	}
}
	