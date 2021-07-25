import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class BoardAnimator implements Runnable {

    private Board board;
    private Rectangle[][] cells;
    private boolean stopped = true;

    public static final int length = 10;

    public BoardAnimator(Board board, Pane pane) {
        this.board = board;
        cells = new Rectangle[board.getSize()][board.getSize()];

        int x = 0, y = 0;
        for (int r = 0; r < board.getSize(); r++) {
            for (int c = 0; c < board.getSize(); c++) {
                Rectangle cell = new Rectangle(x + (c*length), y, length, length);
                cell.setFill(Color.BLACK);
                //cell.setStroke(Color.GRAY); ///////
                cells[r][c] = cell;

                int cellRow = r, cellCol = c;
                cell.setOnMouseClicked(e -> {
                    //System.out.println(cell.getY()/length + " " + cell.getX()/length); //another way
                    System.out.println(cellCol + " " + cellRow);

                    if (cell.getFill() == Color.BLACK) {cell.setFill(Color.WHITE);}
                    else {cell.setFill(Color.BLACK);}
                    board.setValue(cellRow, cellCol, !board.getValue(cellRow, cellCol));
                });
                pane.getChildren().add(cell);
            }
            y += length;
        }
    }

    public void nextStage() {
        board.nextState();
        for (int r = 0; r < board.getSize(); r++) {
            for (int c = 0; c < board.getSize(); c++) {
                if (board.getValue(r, c)) {
                    cells[r][c].setFill(Color.WHITE);
                } else {
                    cells[r][c].setFill(Color.BLACK);
                }
            }
        }
    }

    public void loadPreset(ArrayList<int[]> preset) throws IndexOutOfBoundsException {
        for (int[] cell : preset) {
            cells[cell[0]][cell[1]].setFill(Color.WHITE);
            board.setValue(cell[0], cell[1], true);
        }
    }

    @Override public void run() {
        while (!stopped) {
            nextStage();
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {ex.printStackTrace();}
        }
    }

    public void setStopped(boolean stopped) {
        this.stopped = stopped;
    }

    public void reset() {
        board.reset();
        for (int r = 0; r < board.getSize(); r++) {
            for (int c = 0; c < board.getSize(); c++) {
               cells[r][c].setFill(Color.BLACK);
            }
        }
    }
}