public class App {
    public static void main(String[] args){
        Block block1 = new Block("The first block", "0");
        System.out.println("Block 1 hash: " + block1.getHash());

        Block block2 = new Block("The second block", block1.getHash());
        System.out.println("Block 2 hash: " + block2.getHash());

        Block block3 = new Block("The third block", block2.getHash());
        System.out.println("Block 3 hash: " + block3.getHash());
    }    
}
