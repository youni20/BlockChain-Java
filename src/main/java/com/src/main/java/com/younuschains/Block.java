package com.src.main.java.com.younuschains;
import java.util.Date;

public class Block{
    private String hash;
    private String previousHash;
    private String data;
    private long timeStamp;
    private int nonce;

    public Block(String data, String previousHash){
        this.previousHash = previousHash;
        this.data = data;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash(){
        String calculatedHash = DigitalFingerprint.applySha256(
            previousHash + 
            Long.toString(timeStamp) + 
            Integer.toString(nonce) + 
            data
        );
        return calculatedHash;
    }


    public void mineBlock(int difficulty){
        String target = new String(new char[difficulty]).replace("\0", "0");
        while(!hash.substring(0, difficulty).equals(target)){
            nonce ++;
            hash = calculateHash();
        }
        System.out.println("Block mined!! : " + hash);
    }


    // Getters.
    public String getHash(){
        return this.hash;
    }

    public String getPrevHash(){
        return this.previousHash;
    }

    public String getData(){
        return this.data;
    }

    public long getTimeStamp(){
        return this.timeStamp;
    }

    // Setters.
    public void setHash(String hash){
        this.hash = hash;
    } 

    public void setPrevHash(String previousHash){
        this.previousHash = previousHash;
    } 

    public void setData(String data){
        this.data = data;
    } 

    public void setTimeStamp(long timeStamp){
        this.timeStamp = timeStamp;
    }

}