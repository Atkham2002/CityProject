package Data.all.city.repository;

import Data.all.city.entity.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<Home,Integer> {

}
