package lmsGeneric.dao;

import lmsGeneric.model.Animal;

import java.util.List;

public interface GenericDao <T>{
    String add(T t);
    T getById(Long id);
    List<T> getAll();
    List<T> sortByName();
    //1 ди басканда ascending, 2 ни басканда descending кылып сорттосун

    List<T> filterByGender(int t);
    //1 ди басканда female, 2 ни басканда male кылып фильтрлесин
    List<T> clear();


}
