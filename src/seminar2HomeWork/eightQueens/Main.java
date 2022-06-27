package seminar2HomeWork.eightQueens;



public class Main {


    public static int count = 0;
    public static void setQueen(int i, int j, byte[][] board) {
        int length = board.length;
        for (int x = 0; x < length; x++) {
            board[x][j] +=1;
            board[i][x] +=1;
            if (0 <= i + j - x && i + j - x < length) {
                board[i + j - x][x] += 1;
            }
            if (0 <= i - j + x && i - j + x < length) {
                board[i - j + x][x] += 1;
            }
        }
        board[i][j] = -1;
    }

    public static void removeQueen(int i, int j, byte[][] board) {
        int length = board.length;
        for (int x = 0; x < length; x++) {
            board[x][j] -=1;
            board[i][x] -=1;
            if (0 <= i + j - x && i + j - x < length) {
                board[i + j - x][x] -= 1;
            }
            if (0 <= i - j + x && i - j + x < length) {
                board[i - j + x][x] -= 1;
            }
        }
        board[i][j] = 0;
    }

    public static void printPosition(byte[][] board) {
        //String abc = "abcdefgh";
        //ArrayList<String> ans = new ArrayList<>();
        int length = board.length;
        byte[][] boardQueens = new byte[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (board[i][j] == -1) {
                    boardQueens[i][j] = 1;
                }
            }
        }

        System.out.println();

        for (byte[] x: boardQueens) {
            for (byte y: x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }


    public static void solve(int i, byte[][] board) {
        int length = board.length;
        for (int j = 0; j < length; j++) {
            if(board[i][j] == 0) {
                setQueen(i, j, board);
                if (i == length - 1) {
                    count++;
                    printPosition(board);
                } else {
                    solve(i + 1, board);
                }
                removeQueen(i, j, board);
            }
        }
    }


    public static void main(String[] args) {

        byte lengthBoard = 4;

        byte[][] board = new byte[lengthBoard][lengthBoard];

        long seed = System.currentTimeMillis();
        solve(0, board);
        System.out.print("\ncount " + count + "." + "\ntimer ");
        System.out.println(System.currentTimeMillis() - seed + ".");


    }




}

