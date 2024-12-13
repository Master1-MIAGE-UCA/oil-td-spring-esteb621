package miage.ds4h.dice.controller;

import miage.ds4h.dice.entity.DiceRollLog;
import miage.ds4h.dice.repository.DiceRollLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DiceLogController {

    private final DiceRollLogRepository diceRollLogRepository;

    @Autowired
    public DiceLogController(DiceRollLogRepository diceRollLogRepository) {
        this.diceRollLogRepository = diceRollLogRepository;
    }

    @GetMapping("/diceLogs")
    public List<DiceRollLog> getAllDiceLogs() {
        return diceRollLogRepository.findAll();
    }
}