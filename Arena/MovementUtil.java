public class MovementUtil {

    public static Position getNextPosition(Position current, Direction dir) {

        int x = current.x;
        int y = current.y;

        switch (dir) {
            case UP:    y--; break;
            case DOWN:  y++; break;
            case LEFT:  x--; break;
            case RIGHT: x++; break;
        }

        return new Position(x, y);
    }
}
