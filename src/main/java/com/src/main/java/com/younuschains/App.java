package com.src.main.java.com.younuschains;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;

public class App {

    public static ArrayList<Block> blockChain = new ArrayList<Block>();
    public static int difficulty = 5;

    public static void main(String[] args){
        blockChain.add(new Block("The First Block!", "0")); 
        System.out.println("Trying to mine block...");
        blockChain.get(0).mineBlock(difficulty);

        blockChain.add(new Block("This is the Second Block", blockChain.get(blockChain.size()-1).getHash()));
        System.out.println("Trying to mine block...");
        blockChain.get(1).mineBlock(difficulty);

        blockChain.add(new Block("This is the third Block", blockChain.get(blockChain.size()-1).getHash()));
        System.out.println("Trying to mine block...");
        blockChain.get(2).mineBlock(difficulty);
        
        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockChain);
        System.out.println("\nThe BlockChain:");
        System.out.println(blockchainJson);
    }    

    public static Boolean isChainValid(){
        Block currentBlock;
        Block previousBlock;
        String hashTarget = new String(new char[difficulty]).replace('\0', '0');

        // Loop through the chain to check hashes.
        for (int i = 1; i < blockChain.size(); i++){
            currentBlock = blockChain.get(i);
            previousBlock = blockChain.get(i-1);

            // Now compare the registered hash with the final hash
            if(!currentBlock.getHash().equals(currentBlock.calculateHash())){
                System.out.println("Current Hash is not equal!");
                return false;
            }
            // compare previous hash and registered previous hash.
            if(!previousBlock.getHash().equals(currentBlock.getPrevHash())){
                System.out.println("Previous Hash not Equal");
                return false;
            }

            //To check if the hash is solved.
            if(!currentBlock.getHash().substring(0, difficulty).equals(hashTarget)) {
                System.out.println("This block hasn't been mined");
                return false;
            }
        }
        return true;
    }
}
