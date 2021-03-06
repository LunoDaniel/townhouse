package br.com.groupsoftware.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.groupsoftware.domain.TownHouse;

@Repository
public interface TownHouseRepository extends CrudRepository<TownHouse, Long> {

}
