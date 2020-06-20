package Monster;

public class MonsterFactory {

    public Monster createMonster(String monsterType) {
        if ("MINOTAUR".equalsIgnoreCase(monsterType)) {
            return new Minotaur();
        }
        return null;
    }
}
