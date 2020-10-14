package com.vlade.ppm.repositories;

import com.vlade.ppm.domain.BackLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BacklogRepository extends CrudRepository<BackLog, Long> {

    BackLog findByProjectIdentifier(String Identifier);
}
