package graph;

import java.util.*;


public class traversal {


    static class edge{
        int src ;
        int dest;
        int weight;

        public edge(int s ,int d , int w ){
            this.src = s;
            this.dest = d;
            this.weight=w;
        }
    }

    public static void bfs(ArrayList<edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        boolean vist[] = new boolean[graph.length];
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vist[curr]){
                System.out.print(curr + " ");
                vist[curr] = true;
                for(int j = 0 ;j<graph[curr].size();j++){
                     edge e = graph[curr].get(j);
                     q.add(e.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<edge> graph[],boolean vist[],int curr ){
        System.out.print(curr+" ");
        vist[curr]=true;
        for(int i = 0 ;i<graph[curr].size();i++){
                edge e = graph[curr].get(i);
                if(!vist[e.dest]){
                    dfs(graph, vist, e.dest);
                }
        }
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<edge> graph[] = new ArrayList[7];

        for(int i = 0 ; i<v;i++){
            graph[i] = new ArrayList<>();
        }

        // 0 vertex 
        graph[0].add(new edge(0,1,1));
        graph[0].add(new edge(0,2,1));

        // 1 vertex                
        graph[1].add(new edge(1,0,1));
        graph[1].add(new edge(1,3,1));
        // 2 vertex
        graph[2].add(new edge(2, 0, 3));
        graph[2].add(new edge(2, 4, 3));
        
        // 3 vertex
        graph[3].add(new edge(3, 1, 1));
        graph[3].add(new edge(3, 4, 1));
        graph[3].add(new edge(3, 5, 1));
        // 4 vertex
        graph[4].add(new edge(4, 2, 1));
        graph[4].add(new edge(4, 3, 1));
        graph[4].add(new edge(4, 5, 1));

        // 5 vertex
        graph[5].add(new edge(5, 3, 1));
        graph[5].add(new edge(5, 4, 1));
        graph[5].add(new edge(5, 6, 1));

        // 6 vertex
        graph[6].add(new edge(6, 5, 1));

        

        // bfs(graph);
        dfs(graph, new boolean[v], 0);
    }

}
