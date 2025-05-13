package com.younuschains;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;

public class App {

    public static ArrayList<Block> blockChain = new ArrayList<Block>();
    public static void main(String[] args){
        blockChain.add(new Block("The First Block!", "0")); 
        blockChain.add(new Block("This is the Second Block", blockChain.get(blockChain.size()-1).getHash()));
        blockChain.add(new Block("This is the third Block", blockChain.get(blockChain.size()-1).getHash()));
        
        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockChain);
        System.out.println(blockchainJson);
    }    
}
