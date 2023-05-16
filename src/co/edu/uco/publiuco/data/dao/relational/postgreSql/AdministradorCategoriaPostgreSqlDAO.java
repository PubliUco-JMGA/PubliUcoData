package co.edu.uco.publiuco.data.dao.relational.postgreSql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.exception.PubliucoDataException;
import co.edu.uco.publiuco.data.dao.AdministradorCategoriaDAO;
import co.edu.uco.publiuco.data.dao.factory.relational.SqlDAO;
import co.edu.uco.publiuco.entities.AdministradorCategoriaEntity;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

public final class AdministradorCategoriaPostgreSqlDAO extends SqlDAO<AdministradorCategoriaEntity> implements AdministradorCategoriaDAO {

	public AdministradorCategoriaPostgreSqlDAO(final Connection connection) {
		super(connection);
	}	
	
	@Override
	public void create(AdministradorCategoriaEntity entity) {
		var sqlStatement = "INSERT INTO \"AdministradorCategoria\"( identificador, persona, estado) VALUES (?, ?, ?);";

		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getPersona());
			preparedStatement.setObject(3, entity.getEstado());
			
			preparedStatement.executeUpdate();
		}catch(final SQLException exception) {
			var userMessage = "Se ha presentado un problema tratando de registrar la información del Administrador Categoria";
			var technicalMessage = "Se ha presentado un problema dentro del método create dentro de la clase Administrador Categoria, por favor revise la traza completa del error";
			
			throw PubliucoDataException.create(technicalMessage, userMessage, exception);
		}catch(final Exception exception) {
			var userMessage = "Se ha presentado un problema inesperado tratando de registrar la información del administrador Categoria";
			var technicalMessage = "Se ha presentado un problema inesperado dentro del método create dentro de la clase Administrador Categoria, por favor revise la traza completa del error";
		}
	}

	@Override
	public List<AdministradorCategoriaEntity> read(AdministradorCategoriaEntity entity) {
		var sqlStatement = new StringBuilder();
		var parameters = new ArrayList<>();
		
		sqlStatement.append(prepareSelect());
		sqlStatement.append(prepareFrom());
		sqlStatement.append(prepareWhere(entity, parameters));
		sqlStatement.append(prepareOrderBy());
		
		try (var prepareStatement = getConnection().prepareStatement(sqlStatement.toString())){
			
		} catch (SQLException exception) {
			// TODO: handle exception
		}catch(Exception exception) {
			
		}
		
		return null;
	}

	@Override
	public void update(AdministradorCategoriaEntity entity) {
		var sqlStatement = "UPDATE \"AdministradorCategoria\" SET nombre=?, descripcion = ? WHERE identificador = ?;";

		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getPersona());
			preparedStatement.setObject(3, entity.getEstado());
			
			preparedStatement.executeUpdate();
		}catch(final SQLException exception) {
			var userMessage = "Se ha presentado un problema tratando de modificar la información del Administrador Categoria";
			var technicalMessage = "Se ha presentado un problema dentro del método modificar dentro de la clase Administrador Categoria, por favor revise la traza completa del error";
			
			throw PubliucoDataException.create(technicalMessage, userMessage, exception);
		}catch(final Exception exception) {
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información del administrador Categoria";
			var technicalMessage = "Se ha presentado un problema inesperado dentro del método modificar dentro de la clase Administrador Categoria, por favor revise la traza completa del error";
		}
		
	}

	@Override
	public void delete(UUID entity) {
		var sqlStatement = "DELETE FROM \"AdministradorCategoria\" WHERE identificador = ?;";

		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			preparedStatement.setObject(1, entity);
			
			preparedStatement.executeUpdate();
		}catch(final SQLException exception) {
			var userMessage = "Se ha presentado un problema tratando de eliminar la información del Administrador Categoria";
			var technicalMessage = "Se ha presentado un problema dentro del método drop dentro de la clase Administrador Categoria, por favor revise la traza completa del error";
			
			throw PubliucoDataException.create(technicalMessage, userMessage, exception);
		}catch(final Exception exception) {
			var userMessage = "Se ha presentado un problema inesperado tratando de eliminar la información del administrador Categoria";
			var technicalMessage = "Se ha presentado un problema inesperado dentro del método drop dentro de la clase Administrador Categoria, por favor revise la traza completa del error";
		}
		
	}

	@Override
	protected final String prepareSelect() {
		return "SELECT identificador, nombre, descripcion";
	}

	@Override
	protected final String prepareFrom() {
		return "FROM \"AdministradorCategoria\"";
	}

	@Override
	protected final String prepareWhere(final AdministradorCategoriaEntity entity, List<Object> paramethers) {
		final var where = new StringBuilder("");
		var setWhere = true;
		paramethers = UtilObject.getDefault(paramethers, new ArrayList<>());
		
		if(!UtilObject.isNull(entity)) {
			if(!UtilUUID.isDefault(entity.getIdentificador())) {
				paramethers.add(entity.getIdentificador())
				where.append("WHERE identificador=?");
				setWhere = false;
			}
			if(UtilText.isEmpty(entity.getPersona().getPrimerNombre())) {
				paramethers.add(entity.getPersona().getPrimerNombre());
				where.append(setWhere ? "WHERE ": "AND ").append("nombre=?");
				setWhere = false;
			}
			if(UtilText.isEmpty(entity.getPersona().getPrimerNombre())) {
				where.append(setWhere ? "WHERE ": "AND ").append("nombre=?");
				setWhere = false;
			}
		}
		return where.toString();
	}

	@Override
	protected final String prepareOrderBy() {
		// TODO Auto-generated method stub
		return "ORDER BY persona.nombre ASC";
	}
    
}
