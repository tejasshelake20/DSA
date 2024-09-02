package DisplayGraph;
// Implementing a Graph using adjacency matrix
public class GraphAdjMatrix {
    public static void main(String[] args) {
        GraphAdjMatrix g = new GraphAdjMatrix(4);

        System.out.println("Initial graph : ");

        g.addEdges(0,1);
        g.addEdges(0,2);
        g.addEdges(1,2);
        g.addEdges(2,0);
        g.addEdges(2,3);

        System.out.println(g.toString());

        System.out.println("Graph after remove some edges: ");

        g.removeEdges(1,2);
        g.removeEdges(0,1);

        System.out.println(g.toString());

    }

    // declaring boolean adjacency matrix
    private boolean[][] adjMatrix;

    // declaring int number of vertices(nodes)
    private int numVertices;

    // initializing the adjacency matrix --> Graph
    public GraphAdjMatrix(int numVertices){
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    public void addEdges(int i, int j){
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    public void removeEdges(int i, int j){
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();

        for(int i = 0; i < numVertices; i++){
            s.append(i + " : ");

            for(boolean j : adjMatrix[i]){
                s.append((j ? 1 : 0) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
