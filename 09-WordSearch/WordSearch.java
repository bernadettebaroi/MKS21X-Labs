import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class WordSearch{
    private char[][]data;
    private int seed;
    private Random randgen;
    private ArrayList<String> wordsAdded;

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
      col--;
      row--;
      for (int i = 0; i < word.length();i++) {
        if (col < data[row].length) {
          if (data[row][col] == '_' || data[row][col] == word.charAt(i)) {
            data[row][col] = word.charAt(i);
            col++;
          }
        }
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
      col--;
      row--;
      for (int i = 0; i < word.length();i++) {
        if (row < data.length && data[row][col] == '_' || data[row][col] == word.charAt(i)) {
          if (data[row][col] == '_' || data[row][col] == word.charAt(i)) {
            data[row][col] = word.charAt(i);
            row++;
          }
        }
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
      col--;
      row--;
      for (int i = 0; i < word.length(); i++) {
        if (row < data.length && col < data[row].length) {
          if (data[row][col] == '_' || data[row][col] == word.charAt(i)) {
            data[row][col] = word.charAt(i);
            row++;
            col++;
          } else {
            break;
          }
        }
      }
      return true;
    }


    public boolean addWord(int row, int col, String word, int rowInc, int colInc){
      if (rowInc == 0) {
        if (colInc == 1) {
          addWordHorizontal(word, row, col);
          } else if( colInc == -1){
            col--;
            row--;
            for (int i = 0; i < word.length(); i++) {
              if (col >= 0 && col <= data[row].length) {
                if (data[row][col] == '_' || data[row][col] == word.charAt(i)) {
                  data[row][col] = word.charAt(i);
                  col --;
                }
              }
            }
          }
      } else if (rowInc == 1) {
        if (colInc == 0) {
          addWordHorizontal(word, row, col);
        } else if( colInc == 1){
          addWordDiagonal(word, row, col);
        } else if (colInc == -1) {
          col--;
          row--;
          for (int i = 0; i < word.length();i++) {
            if (col >= 0 && row < data.length) {
              if (data[row][col] == '_' || data[row][col] == word.charAt(i)) {
                data[row][col] = word.charAt(i);
                row++;
                col--;
              }
            }
          }
        }
      } else if (rowInc == -1 ) {
        if (colInc == 0) {
          col--;
          row--;
          for (int i = 0; i < word.length();i++) {
            if (row >= 0) {
              if (data[row][col] == '_' || data[row][col] == word.charAt(i)) {
                data[row][col] = word.charAt(i);
                row--;
              }
            }
          }
        } else if( colInc == 1){
          col--;
          row--;
          for (int i = 0; i < word.length();i++) {
            if (col < data[row].length && row >= 0) {
              if (data[row][col] == '_' || data[row][col] == word.charAt(i)) {
                data[row][col] = word.charAt(i);
                row--;
                col++;
              }
            }
          }
        } else if (colInc == -1) {
          col--;
          row--;
          for (int i = 0; i < word.length();i++) {
            if (col < data[row].length && row >= 0) {
              if (data[row][col] == '_' || data[row][col] == word.charAt(i)) {
                data[row][col] = word.charAt(i);
                row--;
                col--;
              }
            }
          }
        }
      }
      return true;
    }

    public boolean addAllWord(String filename) {
      return true;
    }


}
