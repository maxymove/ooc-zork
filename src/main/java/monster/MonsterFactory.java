package monster;

public class MonsterFactory {

    public Monster createMonster(String monsterType) {
        if ("MINOTAUR".equalsIgnoreCase(monsterType)) {
            return new Minotaur();
        } else if ("ORC".equalsIgnoreCase(monsterType)) {
            return new Orc();
        }
        return null;
    }
}
