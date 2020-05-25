package myproject.repositories;

import myproject.entity.OrderStage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface StageRepo extends JpaRepository<OrderStage, Long> {
}
