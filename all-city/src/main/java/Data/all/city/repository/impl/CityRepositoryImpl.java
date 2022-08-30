package Data.all.city.repository.impl;

import Data.all.city.entity.City;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CityRepositoryImpl {

    private final EntityManager entityManager;

    public List<City> findAll(){
        Query query = entityManager.createQuery("select cy from City cy join fetch cy.districts");

        return query.getResultList();
    }

}
