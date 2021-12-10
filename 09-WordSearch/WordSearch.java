public class WordSearch{
    private char[][]data;

    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols){
      data = new char[rows][cols];
      for (int i = 0; i < data.length; i++) {
        for (int j = 0; j < data[i].length; j++) {
          data[i][j] = '_';
        }
      }
    }

    /**Set all values in the WordSearch to underscores'_'*/
    private void clear(){
      for (int i = 0; i < data.length; i++) {
        for (int j = 0; j < data[i].length; j++) {
          data[i][j] = '_';
        }
      }
    }

    /**Each row is a new line, there is a space between each letter
     *@return a String with each character separated by spaces, and rows
     *separated by newlines.
     */
    public String toString(){
      String ans = "";
      for (int i = 0; i < data.length;i++) {
        for (int j = 0; j < data[i].length;j++) {
          ans += data[i][j];
          ans += " ";
        }
        ans += "\n";
      }
      return ans;
    }


    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     * or there are overlapping letters that do not match, then false is returned
     * and the board is NOT modified.
     */
    public boolean addWordHorizontal(String word,int row, int col){
      int j = 0;
      for (int i = 0; i < word.length(); i++) {
        data[row][j] = word.charAt(i);
        j++;
      }
      return true;
    }


   /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     *and the board is NOT modified.
     */
    public boolean addWordVertical(String word,int row, int col){
      int j = row;
      int i = 0;
      while (i < word.length() && j < data.length) {
        data[j][col] = word.charAt(i);
        i++;
        j++;
      }
      return true;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top left towards the bottom right, it must fit on the board,
     *and must have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned
     *and the board is not modified.
     */
    public boolean addWordDiagonal(String word,int row, int col){
      int a = 0;
      int b = 0;
      for (int i = 0; i < word.length(); i++) {
        data[a][b] = word.charAt(i);
        a++;
        b++;
      }
      return true;
    }

    public boolean addWord(int row, int col, String word, int rowInc, int colInc){
      if (rowInc == 0) {
        if (colInc == 1) {
          addWordVertical(word, row, col);
        } else if( colInc == -1){
          int b = 0;
          while(row >= 0 && b > 0) {
            data[row][col] = word.charAt(b);
            row -= 1;
            b++;
          }
        }

      } else if (rowInc == 1) {
        if (colInc == 0) {
          addWordHorizontal(word, row, col);
        } else if( colInc == 1){
          addWordDiagonal(word, row, col);
        } else if (colInc == -1) {
          int b = 0;
          while(col >= 0 && b > 0) {
            data[row][col] = word.charAt(b);
            col += 1;
            row -= 1;
            b++;
          }
        }
        //

      } else if (rowInc == -1 ) {
        if (colInc == 0) {
          int b = 0;
          while(col >= 0 && b < word.length()) {
            data[row][col] = word.charAt(b);
            col --;
            b++;
          }
        } else if( colInc == 1){
          int b = 0;
          while(col >= 0 && b < word.length()) {
            data[row][col] = word.charAt(b);
            col--;
            row++;
            b++;
          }
        } else if (colInc == -1) {
          addWordHorizontal(word, row, col);
        }
      }
      return true;
    }



}
