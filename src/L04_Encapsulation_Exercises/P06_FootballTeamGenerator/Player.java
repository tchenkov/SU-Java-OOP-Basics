package L04_Encapsulation_Exercises.P06_FootballTeamGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

class Player {
    private static final int STAT_MIN_VALUE = 0;
    private static final int STAT_MAX_VALUE = 100;
    private static final Predicate<Integer> IS_STAT_INVALID = stat -> stat < STAT_MIN_VALUE || STAT_MAX_VALUE < stat;
    
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;
    private List<Integer> stats;
    
    Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
        this.stats = new ArrayList<>(5);
        Collections.addAll(this.stats, this.endurance, this.sprint, this.dribble, this.passing, this.shooting);
    }
    
    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(ErrorMessages.INVALID_NAME);
        }
        this.name = name;
    }
    
    private void setEndurance(int endurance) {
        if (IS_STAT_INVALID.test(endurance)) {
            throw new IllegalArgumentException(ErrorMessages.getInvalidStat("Endurance"));
        }
        this.endurance = endurance;
    }
    
    private void setSprint(int sprint) {
        if (IS_STAT_INVALID.test(sprint)) {
            throw new IllegalArgumentException(ErrorMessages.getInvalidStat("Sprint"));
        }
        this.sprint = sprint;
    }
    
    private void setDribble(int dribble) {
        if (IS_STAT_INVALID.test(dribble)) {
            throw new IllegalArgumentException(ErrorMessages.getInvalidStat("Dribble"));
        }
        this.dribble = dribble;
    }
    
    private void setPassing(int passing) {
        if (IS_STAT_INVALID.test(passing)) {
            throw new IllegalArgumentException(ErrorMessages.getInvalidStat("Passing"));
        }
        this.passing = passing;
    }
    
    private void setShooting(int shooting) {
        if (IS_STAT_INVALID.test(shooting)) {
            throw new IllegalArgumentException(ErrorMessages.getInvalidStat("Shooting"));
        }
        this.shooting = shooting;
    }
    
    String getName() {
        return name;
    }
    
    long getSkill() {
        return Math.round(this.stats.stream().mapToInt(Integer::valueOf).average().getAsDouble());
    }
}
