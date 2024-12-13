package miage.ds4h.dice.controller;


import miage.ds4h.dice.service.DiceRollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DiceRollController {
    private final DiceRollService diceRollService;

    @Autowired
    public DiceRollController(DiceRollService diceRollService) {
        this.diceRollService = diceRollService;
    }


    @GetMapping("/rollDice")
    public int rollSingleDice() {
        return diceRollService.rollDices(1).get(0);
    }

    // Endpoint pour lancer X dés
    @GetMapping("/rollDices/{count}")
    public List<Integer> rollDices(@PathVariable int count) {
        return diceRollService.rollDices(count);
    }

}
