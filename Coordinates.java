public class Coordinates {
    //tiene x e y y ademas el usuario lo mete aqui cuando se lo pedimos por pantalla, ademas calcula la fila dependiendo del estado
    // del tablero

    //get coordinate
    //calculateRow
    //getROw
    //getCOLUM

    private int colum;

    public Coordinates(){
        this.colum = obtainCoordinate();
    }

    private int obtainCoordinate(){
        return Console.getInstance().readInt(null);
    }

    public int calculateRow(int colum, Board board){
        return 0;
    }//calcula
}
