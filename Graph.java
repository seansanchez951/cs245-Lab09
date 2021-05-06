import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {


    private void dfs(int [][] graph,List<List<Integer>> result, List<Integer> path, int v) {
        path.add(v);
        if (v == graph.length -1) {
            result.add(new ArrayList(path));
        } else {
            for (int elem: graph[v]) {
                dfs(graph, result, path, elem);
                path.remove(path.size()-1);
            }
        }
    }

    public List<List<Integer>> allPaths (int [][] graph) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> path = new ArrayList();
        dfs(graph,result,path, 0);
        return result;
    }

    public static void main(String[] args) {

        Graph g1 = new Graph();

        // testing examples from lab handout
        int[][] graph1 = new int[][]{{1, 2}, {3}, {3}, {}};
        System.out.println("Input Explanation: " + Arrays.deepToString(graph1));
        List<List<Integer>> result1 = g1.allPaths(graph1);
        System.out.println("Output Explanation: "+ result1);

        int[][] graph2 = new int[][]{{1}, {}};
        System.out.println("Input Explanation: " + Arrays.deepToString(graph2));
        List<List<Integer>> result2 = g1.allPaths(graph2);
        System.out.println("Output Explanation: "+ result2);

        int[][] graph3 = new int[][]{{4,3,1},{3,2,4},{3},{4},{}};
        System.out.println("Input Explanation: " + Arrays.deepToString(graph3));
        List<List<Integer>> result3 = g1.allPaths(graph3);
        System.out.println("Output Explanation: "+ result3);

    }
}
