package co.edu.uco.publiuco.data.dao.factory.relational;

import java.sql.Connection;
import java.util.List;

import co.edu.uco.publiuco.crosscutting.exception.PubliucoDataException;
import co.edu.uco.publiuco.utils.UtilSql;

public abstract class SqlDAO<E> {
	private Connection connection;
	protected SqlDAO(final Connection connection) {
		if(!UtilSql.connectionIsOpen(connection)) {
			var userMessage = "Se ha presentado un problema tratando de llevar a cabo la operación deseada, por favor intente de nuevo, y si el problema persiste contacte al administrador de la aplicación";
			var technicalMessage = "No se ha podido crear el SqlDAO, debido a que la conexión no está abierta";
			throw PubliucoDataException.create(technicalMessage,userMessage);
		}
		setConnection(connection);
	}
	
	protected final Connection getConnection() {
		return connection;
	}
	private final void setConnection(final Connection connection) {
		this.connection = connection;
	}
	protected abstract String prepareSelect();
	protected abstract String prepareFrom();
	protected abstract String prepareWhere(E entity,List<Object> paramethers);
	protected abstract String prepareOrderBy();



}
