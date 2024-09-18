package lmsGeneric.service.impl;

import lmsGeneric.dao.GenericDao;
import lmsGeneric.dao.impl.AnimalDaoImpl;
import lmsGeneric.dao.impl.PersonDaoImpl;
import lmsGeneric.db.Database;
import lmsGeneric.model.Animal;
import lmsGeneric.model.Person;
import lmsGeneric.service.GenericService;

import java.util.List;

public class PersonServiceImpl implements GenericService <Person> {
 private final GenericDao genericDao = new PersonDaoImpl();
    @Override
    public String add(Person person) {
        return genericDao.add(person);
    }

    @Override
    public Person getById(Long id) {
        return (Person) genericDao.getById(id);
    }

    @Override
    public List<Person> getAll() {
        return genericDao.getAll();
    }

    @Override
    public List<Person> sortByName() {
        return genericDao.sortByName();
    }

    @Override
    public List<Animal> filterByGender(int gender) {
        return genericDao.filterByGender(gender);
    }




    @Override
    public List<Person> clear() {
        return genericDao.clear();
    }
}

