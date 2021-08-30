package three_DFS_BFS_problem;

public class UndirectedGraph {
    private int count;
    private int [][] vertexMatrix;

    public UndirectedGraph(int count){
        this.count = count;
        vertexMatrix = new int[count][count];
    }

    public void addEdges(int from, int to, int weight){
        vertexMatrix[from][to] = weight;
        vertexMatrix[from][to] = weight;
    }

    public int[][] getMatrix(){
        return vertexMatrix;
    }
}
