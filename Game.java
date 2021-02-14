import java.util.Random;

class Game {
    private int rows;
    private int columns;
    private int ships;
    private char[][] board;
    private Random generate;

    public Game(int rows, int columns, int ships) {
        this.rows = rows;
        this.columns = columns;
        this.ships = ships;
        this.board = new char[rows][columns];
        this.generate = new Random();
    }

    public int getShips() {
        return ships;
    }

    public String createFinalBoard() {

        int shuffleHorizontalVertical = generate.nextInt(2);

        if (shuffleHorizontalVertical == 0) {
            horizontalShuffle();
            return positionShip();
        } else {
            verticalShuffle();
            return positionShip();

        }
    }

    public void horizontalShuffle() {
        int rowShuffler = generate.nextInt(rows);
        int columnShuffler = generate.nextInt((columns / 2) + 1);

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                if (i == rowShuffler && columnShuffler <= j && j <= (ships + columnShuffler - 1)) {
                    board[i][j] = 'x';
                } else {
                    board[i][j] = '_';
                }
            }
        }
    }

    public void verticalShuffle() {

        int columnShuffler = generate.nextInt((rows / 2) + 1);
        int rowShuffler = generate.nextInt(columns);
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {

                if (j == rowShuffler && columnShuffler <= i && i <= (ships + columnShuffler - 1)) {
                    board[i][j] = 'x';
                } else {
                    board[i][j] = '_';
                }
            }
        }
    }

    public String positionShip() {
        String game = "";

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                game += board[i][j] + "      ";
            }
            game += "\n";
        }
        return game;
    }

}