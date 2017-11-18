package packages.Week1.unionFind;

// O(n^2) for making the union

public class quickFind {

    private int[] id;

    public quickFind(int N){

        id = new int[N];

        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    public boolean connected (int p, int q){

        return id[p] == id[q];

    }

    public void union(int p, int q){

        int pid = id[p];
        int qid = id[q];
        for(int i =0; i<id.length;i++){
            if(id[i]==pid){
                id[i]=qid;
            }
        }

    }

}
