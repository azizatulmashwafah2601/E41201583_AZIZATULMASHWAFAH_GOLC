package graph;

public class GraphApp {
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        
        theGraph.addVertex('A'); // 0
        theGraph.addVertex('B'); // 1
        theGraph.addVertex('C'); // 2
        theGraph.addVertex('D'); // 3
        theGraph.addVertex('E'); // 4
        theGraph.addVertex('F'); // 5
        
        theGraph.addEdge(0, 1); // AB
        theGraph.addEdge(1, 2); // BC
        theGraph.addEdge(2, 3); // CD
        theGraph.addEdge(3, 4); // DE
        theGraph.addEdge(4, 5); // EF
        
        Graph isGraph = new Graph();
        
        isGraph.addVertex('A'); // 0
        isGraph.addVertex('B'); // 1
        isGraph.addVertex('C'); // 2
        isGraph.addVertex('D'); // 3
        isGraph.addVertex('E'); // 4
        isGraph.addVertex('F'); // 5
        
        isGraph.addEdge(0, 1); // AB
        isGraph.addEdge(1, 5); // BF
        isGraph.addEdge(5, 2); // FC
        isGraph.addEdge(2, 3); // CD
        isGraph.addEdge(3, 4); // DE
        
        
        theGraph.display();
        theGraph.bfs(); 
        
        isGraph.display();
        isGraph.dfs(); 
    }
}
