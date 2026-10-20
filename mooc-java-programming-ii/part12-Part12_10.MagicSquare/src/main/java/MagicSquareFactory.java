public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);

        int row = 0;
        int col = size / 2;
        int currentNumber = 1;

        square.placeValue(col, row, currentNumber);

        while (currentNumber < size * size) {
            int nextRow = row - 1;
            int nextCol = col + 1;

            if (nextRow < 0) {
                nextRow = size - 1;
            }

            if (nextCol >= size) {
                nextCol = 0;
            }

            if (square.readValue(nextCol, nextRow) != 0) {
                row = row + 1;
            } else {
                row = nextRow;
                col = nextCol;
            }

            currentNumber++;
            square.placeValue(col, row, currentNumber);
        }

        return square;
    }
}