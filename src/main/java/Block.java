import Utils.StringUtil;

import java.util.Date;

public class Block {

    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
        System.out.println("## New Block Added(" + hash + ") : " + data);
    }

    public String calculateHash() {
        return StringUtil.applySha256(
                previousHash +
                        timeStamp +
                        data
        );
    }


}
