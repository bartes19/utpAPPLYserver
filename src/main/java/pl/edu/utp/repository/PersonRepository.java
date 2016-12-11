package pl.edu.utp.repository;

import org.springframework.data.repository.Repository;
import pl.edu.utp.model.Person;

import java.util.List;

/**
 * Created by szydzik on 07.12.2016.
 */
public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findAll();
    Person findByName(String name);

}
