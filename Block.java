//Developer Aman Nirala

import java.util.Arrays;
public class Block {
	
	
	private String [] data;
	//Stores the Data of the Block
	private int blockHash;
	//Stores the hash of the block
	private int previousHash;
    //Stores the hash of the previous block
	
	
	public Block(int previousHash, String [] data) {
		this.previousHash=previousHash;
		this.data=data;
		Object[] elements = {Arrays.hashCode(data),previousHash};
		this.blockHash=Arrays.hashCode(elements);
	}
	
	public int getBlockHash()
	{
		return blockHash;
	}
	//returns the Hash of the current block
	
	public int getPreviousHash()
	{
		return previousHash;
	}
	//returns hash of the previous block
	
	public String[] getData()
	{
		return data;
	}
    //returns data of the block
}
