package game;

import java.util.ArrayList;

public class Board {

    private boolean[][] board;

    public Board(int size) {
        board = new boolean[size][size];
    }

    public int getLiveNeighbors(int row, int col) {
        int neighbors = 0;
        if (row != 0 && col != 0 && board[row - 1][col - 1]) {
           neighbors++;
        }
        if (row != 0 && board[row - 1][col]) {
            neighbors++;
        }
        if (row != 0 && col != board.length-1 && board[row - 1][col + 1]) {
            neighbors++;
        }
        if (col != board.length-1 && board[row][col + 1]) {
            neighbors++;
        }
        if (row != board.length-1 && col != board.length-1 && board[row + 1][col + 1]) {
            neighbors++;
        }
        if (row != board.length-1 && board[row + 1][col]) {
            neighbors++;
        }
        if (row != board.length-1 && col != 0 && board[row + 1][col - 1]) {
            neighbors++;
        }
        if (col != 0 && board[row][col - 1]) {
            neighbors++;
        }
        return neighbors;
    }

    public void nextState() {
        ArrayList<int[]> changeList = new ArrayList<>();
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                int neighbors = getLiveNeighbors(r, c);
                //System.out.println(r + " " + c + ":" + neighbors);

                if (board[r][c] && (neighbors < 2 || neighbors > 3)) {
                    changeList.add(new int[] {r, c});
                }
                if (!board[r][c] && neighbors == 3) {
                    changeList.add(new int[] {r, c});
                }
            }
        }

        for (int[] cellRC : changeList) {
            board[cellRC[0]][cellRC[1]] = !board[cellRC[0]][cellRC[1]];
            //System.out.println(Arrays.toString(cellRC));
        }
    }

    public void setValue(int row, int col, boolean value) {
        board[row][col] = value;
    }

    public boolean getValue(int row, int col) {
        return board[row][col];
    }

    public int getSize() {
        return board.length;
    }

    public void reset() {
        board = new boolean[board.length][board.length];
    }
}