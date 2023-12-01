public class create {
    static class node{
        node children[] = new node[26];
        boolean eow = false;

        node(){
            for(int i = 0 ; i<26;i++){
                children[i] = null;
            }
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
            curr = curr.children[idx];
        }

        curr.eow = true;
    }
    

    public static void main(String[] args) {
        String words[] = {"the","a","there","three"};
        for(int i = 0;i<words.length;i++){
            insert(words[i]);
        }
    }
}
