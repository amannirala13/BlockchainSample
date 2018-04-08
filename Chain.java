import java.util.ArrayList;
import java.util.Scanner;
public class Chain {
                   private       int commandInt=1;
                   private       int prevHash;
                   private       Block Block$[] = new Block[99999];
                   private       int blockNumber=1;
	ArrayList<Block> blockChain = new ArrayList<>();
	public void main(String[] args) {
	    
	       Scanner sc = new Scanner(System.in);
		//Created GenesisBLock
		String[] genesisBlockData = {"Block Chain", " Developer: Aman Nirala", "Company: AmanSoft Developers","Version: 1.2"};
		Block$[0] = new Block(0,genesisBlockData);
	
		  while(commandInt !=0)
		  {
		    String command;
		    command = sc.nextLine();
		    if(command.equalsIgnoreCase("block -c"))
		    {
		        prevHash = Block$[(blockNumber-1)].getBlockHash();
		        int size;
		        System.out.println("::::::Enter the data array Size");
		        size =sc.nextInt();
		        String data [] = new String [size];
		        for(int i=0;i<size;i++)
		        { 
		           System.out.println("::::::Enter the data entity");
		           data[i]=sc.next();
		           System.out.println("::::::Data accepted>>>> "+data[i]);
		        }
		        Block$[blockNumber]=createBlock(data, prevHash);
		        blockNumber++;
		        System.out.println("\n------------------Block created------------------\n");
		      }
		      else if(command.equalsIgnoreCase("block -p"))
		      {
		          for(int j = 0; j<blockNumber;j++)
		              printData(j);

		      }
		      else if(command.equalsIgnoreCase("block -e"))
		         commandInt=0;
		      else if(command.equalsIgnoreCase("exit"))
		          System.exit(0);
		      }
		   
		  }
		
	
	private Block createBlock(String [] data,int prevHash)
	{
	    Block$[blockNumber]=new Block(prevHash,data);
           return Block$[blockNumber];
  }
   private void printData(int indexNumber)
  {
    System.out.println("***********************BLOCK "+indexNumber+"*****************************************");
    System.out.println("::::::Data: "+ Block$[indexNumber].getData()+"\n::::::Block Hash: "+ Block$[indexNumber].getBlockHash()+"\n::::::Previous Hash: "+ Block$[indexNumber].getPreviousHash());;
  }
}