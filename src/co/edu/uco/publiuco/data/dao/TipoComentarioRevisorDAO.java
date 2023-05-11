package co.edu.uco.publiuco.data.dao;

import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.entities.TipoComentarioRevisorEntity;

public interface TipoComentarioRevisorDAO {


	List<TipoComentarioRevisorEntity> read(TipoComentarioRevisorEntity entity);


}