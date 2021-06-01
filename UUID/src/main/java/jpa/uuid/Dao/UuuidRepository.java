package jpa.uuid.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jpa.uuid.model.Person;

@Repository
public interface UuuidRepository extends CrudRepository<Person, Integer> {

	
	

}
