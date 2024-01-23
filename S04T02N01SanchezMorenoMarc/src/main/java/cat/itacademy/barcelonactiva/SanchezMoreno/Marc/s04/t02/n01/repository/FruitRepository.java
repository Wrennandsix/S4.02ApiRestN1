package cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s04.t02.n01.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s04.t02.n01.domain.Fruit;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer> {

}