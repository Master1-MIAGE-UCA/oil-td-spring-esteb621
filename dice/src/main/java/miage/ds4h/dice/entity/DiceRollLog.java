package miage.ds4h.dice.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class DiceRollLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int diceCount;

    @ElementCollection
    @CollectionTable(name = "dice_roll_results", joinColumns = @JoinColumn(name = "dice_roll_log_id"))
    @Column(name = "result")
    private List<Integer> results;

    private LocalDateTime timestamp;

    public DiceRollLog() {}
    public DiceRollLog(int diceCount, List<Integer> results, LocalDateTime timestamp) {
        this.diceCount = diceCount;
        this.results = results;
        this.timestamp = timestamp;
    }



}