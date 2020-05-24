package myproject.repositories;

import myproject.entity.OrderStage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface StageRepo extends JpaRepository<OrderStage, Long> {
    @Query("SELECT s from OrderStage s where s.id= ?1")
    Optional<OrderStage> findById(long id);
}
