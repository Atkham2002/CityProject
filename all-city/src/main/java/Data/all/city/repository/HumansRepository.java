package Data.all.city.repository;

import Data.all.city.entity.Humans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumansRepository extends JpaRepository<Humans,Integer> {

}
