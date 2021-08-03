package org.rede_social.knowledgeDomainKD.repository;

import org.rede_social.knowledgeDomainKD.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface TemaRepository extends JpaRepository<Tema, Long>{

}
