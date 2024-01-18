package cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s04.t02.n01.modelRepository;

import org.springframework.data.jpa.repository.*;

import cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s04.t02.n01.modelDomain.Fruit;


public interface FruitRepository extends JpaRepository<Fruit, Integer> {

}