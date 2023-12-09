public class create {
    static class node{
        node children[] = new node[26];
        boolean eow = false;
        int freq;

        node(){
            for(int i = 0 ; i<26;i++){
                children[i] = null;
            }
            freq=1;
        }
    }

    public static node root = new node();


    public static void insert(String word){
        node curr = root;
        for(int level = 0;level<word.length();level++){
            int idx = word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new node();
            }
            else{
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }
    // search
    // public static boolean search(String key){
    //     node curr = root;
    //     for(int level = 0;level<key.length();level++){
    //         int idx = key.charAt(level)-'a';
    //         if(curr.children[idx]==null){
    //             return false;
    //         }
    //         curr = curr.children[idx];
    //     }

    //     return curr.eow = true;
    // }
    
    public static void prefix(node r , String ans){
        if(r==null){
            return;
        }
        if(r.freq ==1){
            System.out.println(ans);
            return;
        }

        for(int i = 0 ;i<r.children.length;i++){
            if(r.children!=null){
                prefix(r.children[i], ans+(char)(i+'a'));
            }
        }
    }

    public static void main(String[] args) {
        String words[] = {"zebra","dog","duck","dove"};
        for(int i = 0;i<words.length;i++){
            insert(words[i]);
        }

        root.freq=-1;
        prefix(root, "");

       
    }
}
