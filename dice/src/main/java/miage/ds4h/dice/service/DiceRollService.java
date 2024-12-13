package miage.ds4h.dice.service;

import miage.ds4h.dice.model.Dice;
import miage.ds4h.dice.entity.DiceRollLog;
import miage.ds4h.dice.repository.DiceRollLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class DiceRollService {
    private final DiceRollLogRepository diceRollLogRepository;

    @Autowired
    public DiceRollService(DiceRollLogRepository diceRollLogRepository) {
        this.diceRollLogRepository = diceRollLogRepository;
    }

    public List<Integer> rollDices(int diceCount) {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < diceCount; i++) {
            Dice dice = new Dice(6);
            dice.roll();
            results.add(dice.getValue());
        }
        DiceRollLog diceRollLog = new DiceRollLog(diceCount, results, LocalDateTime.now());
        diceRollLogRepository.save(diceRollLog);
        return results;
    }
}
