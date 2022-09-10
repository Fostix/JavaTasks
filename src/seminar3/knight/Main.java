package seminar3.knight;

public class Main {

    public  static byte goX = 0;
    public  static byte goY = 0;
    public static byte mrHorse = 0;
    public static byte count = 0;
    static void horse(int[][] board, int axisX, int axisY, int fit, int ii) {
        int boardLength = board.length;
        System.out.println("----------------------------");
        printBoard(board);
        if(fit != boardLength * boardLength) {
            board[axisX][axisY] = fit;
            int[][] movers = {{1, 2, 2, 1, -1, -2, -2, -1},
                    {2, 1, -1, -2, -2, -1, 1, 2}};
            // System.out.println(movers[0][0]);
            for (int i = 0; i < movers[0].length; i++) {
                int moveX = movers[0][i] + axisX;
                int moveY = movers[1][i] + axisY;
                if ((moveX >= 0 && moveX < boardLength) && (moveY >= 0 && moveY < boardLength) && (board[moveX][moveY] == 0)) {
                    horse(board, moveX, moveY, fit + 1, i);
                }
                else if((moveX >= 0 && moveX < boardLength) && (moveY >= 0 && moveY < boardLength) && (i == movers[0].length - 1)) {
                    returnFit(board, axisX, axisY, fit, moveX, moveY, i);
                    //horse(board, moveX, moveY, fit, i);

                    //horse(board, axisX, axisY, fit - 1);

                }
            }
        }
        else if (fit == 25) {
            return;
        }
    }

    static void returnFit(int[][] board, int axisX, int axisY, int fit, int moveX, int moveY, int i) {
//        if(i == 7) {
//            board[moveX][moveY] = 0;
//            board[axisX][axisY] = 0;
//            horse(board, axisX, axisY, fit - 1, i);
//
//        }
        if (i < 7) {
            board[moveX][moveY] = 0;
            for (int j = 0; j < board.length; j++) {
                for (int k = 0; k < board.length; k++) {
                    if(board[j][k] == fit) {
                        board[j][k] = 0;
                    }

                }
            }
//            horse(board, moveX, moveY, fit - 1, i - 1);
            }
    }

    static void printBoard(int[][] board) {
        for (int[] item: board) {
            for (int f : item) {
                System.out.print(f + "   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = new int[5][5];

        //System.out.println(board[0].length);


        horse(board, 2, 2, 1, 0);


        System.out.println("-------------------------------");
        printBoard(board);





    }

}


//* Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке была строго один раз.
//        Пример для доски 5х5 решение может выглядеть так.
//
//        25, 14, 3,  8,  19,
//        4,  9,  18, 13, 2,
//        15, 24, 1,  20, 7,
//        10, 5,  22, 17, 12,
//        23, 16, 11, 6,  21

