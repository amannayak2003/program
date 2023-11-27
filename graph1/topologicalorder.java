import java.util.ArrayList;
import java.util.Stack;

public class topologicalorder {
    static class edge{
        int src ;
        int dest;
      
        public edge(int s ,int d ){
            this.src = s;
            this.dest = d;
            
        }
}

public static void creategraph(ArrayList<edge> graph[]){
    for(int i = 0 ; i<graph.length;i++){
        graph[i] = new ArrayList<>();
    }
    graph[2].add(new edge(2, 3));
    graph[3].add(new edge(3, 1));
    graph[4].add(new edge(4, 1));
    graph[4].add(new edge(4, 0));
    graph[5].add(new edge(5, 0));
    graph[5].add(new edge(5, 2));


}

public static void topsort(ArrayList<edge> graph[]){
    Boolean vis[] = new Boolean[graph.length];
    Stack<Integer> s = new Stack<>();

    for(int i = 0; i<graph.length;i++){
        if(!vis[i]){
           helptopsort(graph,i,s,vis);
        }
    }


    while(!s.isEmpty()){
        System.out.println(s.pop());
    }
}

public static void helptopsort(ArrayList<edge> graph[],int curr,Stack<Integer> stack,Boolean[] vist){
    vist[curr] = true;
    for(int i = 0 ;i<graph[curr].size();i++){
        edge e = graph[curr].get(i);
        if(!vist[e.dest]){
            helptopsort(graph, e.dest, stack, vist);
        }
    }

    stack.push(curr);


}
    public static void main(String[] args) {
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        topsort(graph);



    }
}

