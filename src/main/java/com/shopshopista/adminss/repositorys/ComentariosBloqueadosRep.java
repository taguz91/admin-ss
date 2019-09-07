
package com.shopshopista.adminss.repositorys;

import com.shopshopista.adminss.models.Admins.ComentariosBloqueados;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentariosBloqueadosRep extends JpaRepository<ComentariosBloqueados, Long>  {
    
    @Query(value = "SELECT c FROM comentarios_bloqueados c WHERE c.id_comentario_bloqueado = :idComeBloqueado")
    ComentariosBloqueados buscarPorIdComeBloqueados(@Param("idComeBloqueado") Long idComeBloqueado);
    
    @Query(value = "UPDATE comentarios_bloqueados c SET c.cobl_activo = false WHERE c.id_comentario_bloqueado = :idComeBloqueado")
    void eliminarByIdComeBloqueado(@Param("idComeBloqueado") Long idComeBloqueado);
    
}
