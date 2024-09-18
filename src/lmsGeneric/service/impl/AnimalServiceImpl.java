package lmsGeneric.service.impl;

import lmsGeneric.dao.GenericDao;
import lmsGeneric.dao.impl.AnimalDaoImpl;
import lmsGeneric.model.Animal;
import lmsGeneric.service.GenericService;

import java.util.List;

public class AnimalServiceImpl implements GenericService <Animal>{
    private final GenericDao<Animal> genericDao = new AnimalDaoImpl();

    @Override
    public String add(Animal t) {
        return genericDao.add(t);
    }

    @Override
    public Animal getById(Long id) {
        return genericDao.getById(id);
    }

    @Override
    public List<Animal> getAll() {
        return genericDao.getAll();
    }

    @Override
    public List<Animal> sortByName() {
        return genericDao.sortByName();
    }



    @Override
    public List<Animal> filterByGender(int gender) {
        return genericDao.filterByGender(gender);
    }


    @Override
    public List<Animal> clear() {
        return genericDao.clear();
    }

}
