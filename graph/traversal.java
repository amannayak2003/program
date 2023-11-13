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

    public static void bfs(ArrayList<edge>[] graph){
        Queue<Integer> q = new LinkedList<>();
        boolean vist[] = new boolean[graph.length]

        q.add(0);
        while(!q.isEmpty()){
            int cur = q.remove();

            if(vist[cur]!=true){
                System.out.print(cur);
                vist[cur] = true;
                for(int i = 0 ; i<graph[cur].size();i++){
                    edge e = graph[cur].get(i);
                    q.add(e.dest);
                }
            }
        }


    }


    public static void dfs(ArrayList<edge>[] graph , boolean vist[], int curr){
        System.out.println(curr);
        vist[curr] = true;

        for(int i = 0 ; i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if(!vist[curr]){
                dfs(graph, vist, e.dest);
            }
        }
    }

}
