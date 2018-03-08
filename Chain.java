import java.util.ArrayList;
public class Chain {

	ArrayList<Block> blockChain = new ArrayList<>();
	public static void main(String[] args) {
		
		//Created GenesisBLock
		String[] genesisBlockData = {"Sender: Aman", "Receiver: David", "Amount: 1000"};
		Block genesisBlock = new Block(0,genesisBlockData);
		System.out.println("Block Hash of Genesis Block: "+ genesisBlock.getBlockHash());
		
		//Created Block2
	   String[] block2Data = {"Sender: David", "Receiver: Amam","Amount: 500"};
	   Block block2 = new Block(genesisBlock.getBlockHash(),block2Data);
	   System.out.println("Block Hash of Block2: "+ block2.getBlockHash() );
	   
	   System.out.println("---------------Genesis Block and Block 2 Full Data-----------------");
	   System.out.println("\n ****Genesis Block****");
	   System.out.println("Data: "+ genesisBlock.getData()+"\n Block Hash: "+ genesisBlock.getBlockHash()+"\n Previous Hash: "+ genesisBlock.getPreviousHash());;
	   System.out.println("\n ****Block2****");
	   System.out.println("Data: "+ block2.getData()+"\n Block Hash: "+ block2.getBlockHash()+"\n Previous Hash: "+ block2.getPreviousHash());;

	}

}
