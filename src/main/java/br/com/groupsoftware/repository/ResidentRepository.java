package br.com.groupsoftware.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.groupsoftware.domain.Resident;

@Repository
public interface ResidentRepository extends CrudRepository<Resident, Long> {

}
