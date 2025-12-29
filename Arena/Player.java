public class Player {

    private Character character;   // COMPOSITION
    private Position position;
    private Direction direction;

    public Player(Character character, Position startPos) {
        this.character = character;
        this.position = startPos;
        this.direction = Direction.RIGHT;
    }

    // Position in the Arena
    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    // Retrieve information about Character
    public Character getCharacter() {
        return character;
    }
}
