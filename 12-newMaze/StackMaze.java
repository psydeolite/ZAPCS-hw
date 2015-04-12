import java.util.*;
import java.io.*;
public class StackMaze {
    private myStack<Node> s=new myStack<Node>();
    private char[][] board;
    private int maxX;
    private int maxY;
    private char path='#';
    private char wall=' ';
    private char me='z';
    private char exit='$';
    private char visited = '.';
    private char solution= '@';
    private boolean solved = false;
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
    public StackMaze()
    {
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
	try {
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext())
		{
		    String line = sc.nextLine();
		    for (int i=0;i<maxX;i++)
			{
			    board[i][j] = line.charAt(i);
			}
		    j++;
		}
	}
	catch (Exception e)
	    {
	    }
    }
    public String toString()
    {
	String s = "[2J\n";
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	return s;
    }

    public boolean inBounds(int x,int y) {
	return x<maxX && x>=0 && y<maxY && y>=0;
    }

    public void solve(int x, int y){
	Node start=new Node(x,y);
	s.push(start);
	while (!s.empty() && !solved) {
	    System.out.println(this);
	    delay(30);
	    Node current=s.pop();
	    int cx=current.getx();
	    int cy=current.gety();
	    char cc=current.getChar();
	    if (cc<'Z') cc=(char)(cc+1); else cc='A';
	    
	    if (board[cx][cy]==exit) {
		printSolution(current);
		System.out.println("solved");
		solved=true;
		System.exit(0);
	    }
	    
	    
	    board[cx][cy]=visited;
	    if (inBounds(cx+1,cy) && board[cx+1][cy]==path) {
		s.push(new Node(cx+1,cy,cc,current));
		board[cx+1][cy]=cc;
	    } else if (board[cx+1][cy]==exit) {
		solved=true;
		printSolution(new Node(cx+1,cy,exit,current));
		System.exit(0);
	    }
	    if (inBounds(cx-1,cy) && board[cx-1][cy]==path) {
		s.push(new Node(cx-1,cy,cc,current));
		board[cx-1][cy]=cc;
	    } else if (board[cx-1][cy]==exit) {
		solved=true;
		printSolution(new Node(cx-1,cy,exit,current));
		System.exit(0);
	    }
	    if (inBounds(cx,cy+1) && board[cx][cy+1]==path) {
		s.push(new Node(cx,cy+1,cc,current));
		board[cx][cy+1]=cc;
	    } else if (board[cx][cy+1]==exit) {
		solved=true;
		printSolution(new Node(cx,cy+1,exit,current));
		System.exit(0);
	    }
	    if (inBounds(cx,cy-1) && board[cx][cy-1]==path) {
		s.push(new Node(cx,cy+1,cc,current));
		board[cx][cy+1]=cc;
	    } else if (board[cx][cy-1]==exit) {
		solved=true;
		printSolution(new Node(cx,cy-1,exit,current));
		System.exit(0);
	    }
	}
    }
     public void printSolution(Node end) {
	for (Node n=end.getPrev();n!=null;n=n.getPrev()) {
	    board[n.getx()][n.gety()]=solution;
	    System.out.println(this);
	    delay(30);
	}
    }
    public static void main(String[] args){
	  Maze m = new Maze();
	System.out.println(m);
	m.solve(1,1);
	//System.out.println(m);
      }

}
