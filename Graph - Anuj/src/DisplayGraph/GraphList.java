package DisplayGraph;
import java.util.ArrayList;

public class GraphList {
    public static void main(String[] args) {
        // create graph
        int V = 5;
        ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(V);

        for(int i = 0; i < V; i++){
            am.add(new ArrayList<Integer>());
        }

        // add edges
        addEgdes(am,0,1);
        addEgdes(am,0,2);
        addEgdes(am,0,3);
        addEgdes(am,1,2);

        printGraph(am);

    }
    static void addEgdes(ArrayList<ArrayList<Integer>> am, int s, int d){
        am.get(s).add(d);
        am.get(d).add(s);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> am){
        for(int i = 0; i < am.size(); i++){
            System.out.print("\nVertex " + i + " :");
            for(int j = 0; j < am.get(i).size(); j++){
                System.out.print(" -> " + am.get(i).get(j));
            }
            System.out.println();
        }
    }

}
