package pl.edu.utp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.utp.model.Person;
import javax.annotation.PostConstruct;
import pl.edu.utp.repository.PersonRepository;

/**
 * Created by Bartosz on 2016-12-10.
 */
@Component
public class RunAtStart {

    private final PersonRepository personRepository;

    @Autowired
    public RunAtStart(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostConstruct
    public void runAtStart() {

        Person p1 = new Person();
        p1.setName("Bartosz");
        p1.setSurname("Szydzik LUJ");
        personRepository.save(p1);

        Person per = personRepository.findByName("Bartosz");
        System.out.println("Bartek " + per.getSurname());
    }
}
