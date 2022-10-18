public class Board {
    public static final int COLUMS = 7;
    public static final int ROW = 6;

    private Token[][] board;

    public Board() {
        this.board = new Token[ROW][COLUMS];
        initializeBoard();
    }

    public void initializeBoard(){
        for(int i = 0; i < ROW; i++){
            for(int j = 0; j < COLUMS; j++){
                this.board[i][j] = Token.NULL;
            }
        }
    }

    public void printBoard(){
        for(int i = 0; i < ROW; i++){
            for(int j = 0; j < COLUMS; j++){
                Console.getInstance().write("|" + this.board[i][j] + "|");
            }
            Console.getInstance().writeln();
        }
    }

    
}



/*para saber si es conecta 4 son dos for que me comprueba 4 direcciones y sus contrarios
 * 
 * como?? ni idea pero a ver que sale jsjsjs
 * 
 * comprueba numero de fichas puestas
 */