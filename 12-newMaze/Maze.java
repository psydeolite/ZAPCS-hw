import java.io.*;
import java.util.*;
public class Maze
{

    private myQueue<Node> q = new myQueue<Node>();

	
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
    public Maze()
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
	q.enQueue(start);
	while (!q.empty() && !solved) {
	    System.out.println(this);
	    delay(30);
	    Node current=q.deQueue();
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
		q.enQueue(new Node(cx+1,cy,cc,current));
		board[cx+1][cy]=cc;
	    } else if (board[cx+1][cy]==exit) {
		solved=true;
		printSolution(new Node(cx+1,cy,exit,current));
		System.exit(0);
	    }
	    if (inBounds(cx-1,cy) && board[cx-1][cy]==path) {
		q.enQueue(new Node(cx-1,cy,cc,current));
		board[cx-1][cy]=cc;
	    } else if (board[cx-1][cy]==exit) {
		solved=true;
		printSolution(new Node(cx-1,cy,exit,current));
		System.exit(0);
	    }
	    if (inBounds(cx,cy+1) && board[cx][cy+1]==path) {
		q.enQueue(new Node(cx,cy+1,cc,current));
		board[cx][cy+1]=cc;
	    } else if (board[cx][cy+1]==exit) {
		solved=true;
		printSolution(new Node(cx,cy+1,exit,current));
		System.exit(0);
	    }
	    if (inBounds(cx,cy-1) && board[cx][cy-1]==path) {
		q.enQueue(new Node(cx,cy+1,cc,current));
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









	/*System.out.println("entered solve function");
	Node nod=new Node(x,y);
	q.enQueue(nod);
	char c='A';
	while (!q.empty()) {
	    //System.out.println("entered !q.empty() loop");
	    System.out.println(this);
	    delay(20);
	    Node current=q.deQueue();
	    char pc = current.getChar();
	    int cx=current.getx();
	    int cy=current.gety();
	    char c='A';
	    if (c<'Z') c=(char)(c+1); else c='A';
	    
	    if (pc==exit) {
		//System.out.println("entered if c==exit");
		for (Node n=current.getPrev();n!=null;n=n.getPrev()) {
		    board[n.getx()][n.gety()]=solution;
		    System.out.println(this);
		    delay(20);
		}
		//System.out.println("SOLVED");
		System.out.println(this);
		System.exit(0);
	    } 
	    
	    board[cx][cy]=visited;
	    if (inBounds(cx,cy+1) && board[cx][cy+1]!=visited && board[cx][cy+1]!=wall) {
		System.out.println("option1");
		board[cx][cy+1]=c;
		q.enQueue(new Node(cx,cy+1,c,current));
	    }
	    if (inBounds(cx,cy-1) && board[cx][cy-1]!=visited && board[cx][cy-1]!=wall) {
		System.out.println("option2");
		board[cx][cy-1]=c;
		q.enQueue(new Node(cx,cy-1,c,current));
	    }
	    if (inBounds(cx+1,cy) && board[cx+1][cy]!=visited && board[cx+1][cy]!=wall) {
		System.out.println("option3");
		board[cx+1][cy]=c;
		q.enQueue(new Node(cx+1,cy,c,current));
	     }
	     if (inBounds(cx-1,cy) && board[cx-1][cy]!=visited && board[cx-1][cy]!=wall) {
		 System.out.println("option4");
		 board[cx-1][cy]=c;
		 q.enQueue(new Node(cx-1,cy,c,current));
		 
	    }	
	}
	System.out.println("q is empty");
    }
    /*
      solved - instance variable to indicate we're done
    
    public void solve(int x, int y){
	if (board[x][y]==wall ||
	    board[x][y]==me ||
	    board[x][y]==visited ||
	    solved){
	    return;
	}
	if (board[x][y]==exit){
	    System.out.println(this);
	    solved = true;
	}
	delay(100);
	System.out.println(this);
	board[x][y]=me;
	solve(x+1,y);
	solve(x-1,y);
	solve(x,y+1);
	solve(x,y-1);
	if (!solved){
	    board[x][y]=visited;
	}
    }
    */
    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	m.solve(1,1);
	//System.out.println(m);
    }
}
