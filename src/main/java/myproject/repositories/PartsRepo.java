package myproject.repositories;

import myproject.entity.Parts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartsRepo extends JpaRepository<Parts, Long> {
}
