package lmsGeneric.service;

import lmsGeneric.model.Animal;

import java.util.List;

public interface GenericService<T> {
    String add(T t);

    T getById(Long id);

    List<T> getAll();

    List<T> sortByName();

    //1 ди басканда female, 2 ни басканда male кылып фильтрлесин
    List<Animal> filterByGender(int gender);

    List<T> clear();
}
