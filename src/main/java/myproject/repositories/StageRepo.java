package myproject.entity.stage;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StageRepo extends CrudRepository<OrderStage, Long> {
}
