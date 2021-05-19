package bookExmple;

public class DrowingBoardDemo {
    public static void main(String[] args) {
        DrawingBoard drowingBoard = new DrawingBoard();
        Circle cricle = new Circle();
        Square square = new Square();
        drowingBoard.draw(cricle);
        drowingBoard.draw(square);
    }
}
