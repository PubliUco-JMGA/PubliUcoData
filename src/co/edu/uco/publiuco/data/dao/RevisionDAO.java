package co.edu.uco.publiuco.data.dao;

import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.entities.RevisionEntity;

public interface RevisionDAO {
	
	void create(RevisionEntity entity);

	List<RevisionEntity> read(RevisionEntity entity);

	void update(RevisionEntity entity);

	void delete(UUID entity);

}