package miage.ds4h.dice.repository;

import miage.ds4h.dice.entity.DiceRollLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DiceRollLogRepository extends JpaRepository<DiceRollLog, Long> {
}
