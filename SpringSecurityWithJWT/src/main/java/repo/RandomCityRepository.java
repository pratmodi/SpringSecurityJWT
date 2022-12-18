package repo;

import org.springframework.data.repository.CrudRepository;

import entity.RandomCity;

public interface RandomCityRepository extends CrudRepository<RandomCity, Long> {
}
