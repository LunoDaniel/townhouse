package br.com.groupsoftware.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.groupsoftware.domain.Unit;

@Repository
public interface UnitRepository extends CrudRepository<Unit, Long> {

}
