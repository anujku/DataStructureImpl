package com.anuj.dsimpl.algorithm;

public class BFSApp {

  public static void main(String[] args) {
    Graph graph = new Graph(20);
    graph.addVertex('A'); // 0 (start for bfs)
    graph.addVertex('B'); // 1
    graph.addVertex('C'); // 2
    graph.addVertex('D'); // 3
    graph.addVertex('E'); // 4

    graph.addEdge(0, 1); // AB
    graph.addEdge(1, 2); // BC
    graph.addEdge(0, 3); // AD
    graph.addEdge(3, 4); // DE

    System.out.print("Visits: ");
    graph.bfs(); // breadth-first com.anuj.dsimpl.search
  }
}

// FIFO
class Queue {
  int size;
  int[] qArray;
  int front;
  int rear;

  public Queue(int size) {
    this.size = size;
    this.qArray = new int[size];
    this.front = 0;
    this.rear = -1;
  }

  public void insert(int num) {
    if (rear == size - 1)
      rear = -1;
    qArray[++rear] = num;
  }

  public int remove() {
    int temp = qArray[front++];
    if (front == size)
      return 0;
    return temp;
  }

  public boolean isEmpty() {
    return (rear + 1 == front || (front + size - 1 == rear));
  }
}

class Vertex {
  char label;
  boolean visited;

  public Vertex(char ch) {
    label = ch;
    visited = false;
  }
}

class Graph {
  int MAX_VERTICES;
  Vertex[] vertexList;
  int adjMatrix[][]; // adjacency matrix
  int currVerts; // current number of vertices
  Queue queue;

  public Graph(int max_vert) {
    MAX_VERTICES = max_vert;
    vertexList = new Vertex[max_vert];
    adjMatrix = new int[max_vert][max_vert];

    for (int i = 0; i < max_vert; i++) {
      for (int j = 0; j < max_vert; j++) {
        adjMatrix[i][j] = 0;
      }
    }
    queue = new Queue(max_vert);
  }

  public void addVertex(char ch) {
    vertexList[currVerts++] = new Vertex(ch);
  }

  public void addEdge(int start, int end) {
    adjMatrix[start][end] = 1;
    adjMatrix[end][start] = 1;
  }

  public void displayVertex(int v) {
    System.out.print(vertexList[v].label);
  }

  public void bfs() {
    vertexList[0].visited = true; // begin at vertex 0 and mark it visited
    displayVertex(0); // display it
    queue.insert(0); // insert at tail
    int v2;

    while (!queue.isEmpty()) { // until queue empty
      int v1 = queue.remove(); // remove vertex at head
      while ((v2 = getAdjUnvisitedVertex(v1)) != -1) {
        vertexList[v2].visited = true; // get one and mark it
        displayVertex(v2); // display it
        queue.insert(v2); // insert it
      }
    }

    // queue is empty, so we're done
    for (int i = 0; i < currVerts; i++)
      vertexList[i].visited = false;
  }

  public int getAdjUnvisitedVertex(int v) {
    for (int j = 0; j < currVerts; j++)
      if (adjMatrix[v][j] == 1 && vertexList[j].visited == false)
        return j;
    return -1;
  }
}
