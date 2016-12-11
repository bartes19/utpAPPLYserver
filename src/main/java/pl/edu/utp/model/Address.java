package pl.edu.utp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by szydzik on 07.12.2016.
 */
@Entity
public class Address implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String street;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Person> persons;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
