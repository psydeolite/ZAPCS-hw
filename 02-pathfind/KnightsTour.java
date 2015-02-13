import java.util.*;
import java.io.*;

public class KnightsTour {
    private int[][] board;
    private int maxX;
    private int maxY;
   
    public KnightsTour() {
	maxX=5;
	maxY=5;
	board=new int[5][5];
	for (int y=0;y<maxY;y++) {
	    for (int x=0;x<maxX;x++) {
		board[x][y]=00;
	    }
	}
    }

    public String toString() {
	String s="";
	for (int y=0;y<maxY;y++) {
	    for (int x=0;x<maxX;x++) {
		s+=board[x][y];
	    }
	    s+="\n";
	}
	return s;
    }

    private void joust(int x, int y) {}

    public static void main(String[] args) {
	KnightsTour kt=new KnightsTour();
	System.out.println(kt.toString());
    }
}
