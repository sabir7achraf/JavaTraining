package ma.ecole.blockchain;

import java.util.Arrays;
import java.util.Scanner;

public class blockchain {
    public block head;

    public block chain(block b){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter transactions for the block (comma-separated): ");
        String input = sc.nextLine();
        String[] GlobalTransaction = input.split(",");
        b.setTransaction(GlobalTransaction);

        if(head==null){
            head=b;
            b.Hash = Arrays.hashCode(b.getTransaction());
            return head;
        }

        block i = head;
        while (i.Next != null){
            i = i.Next;
        }
        i.Next = b;
        b.PreviousHash = i.getHash();
        b.Hash = Arrays.hashCode(b.getTransaction());
        return head;
    }

    public void displayTransactions(){
        block current = head;
        while (current != null){
            System.out.println("Block Hash: " + current.getHash());
            System.out.println("Previous Hash: " + current.getPreviousHash());
            System.out.println("Transactions: " + Arrays.toString(current.getTransaction()));
            System.out.println("---------------------------");
            current = current.Next;
        }
    }

    public static void main(String[] args) {
        blockchain firstBlockchain = new blockchain();
        block b1 = new block();
        block b2 = new block();
        block b3 = new block();
        block b4 = new block();
        block b5 = new block();

        firstBlockchain.chain(b1);
        firstBlockchain.chain(b2);
        firstBlockchain.chain(b3);
        firstBlockchain.chain(b4);
        firstBlockchain.chain(b5);

        firstBlockchain.displayTransactions();
    }
}

class block {
    public String[] transaction;
    public int PreviousHash = 0;
    public int Hash;
    public block Next;

    public void setTransaction(String[] transaction) {
        this.transaction = transaction;
    }

    public String[] getTransaction(){
        return transaction;
    }

    public int getPreviousHash(){
        return this.PreviousHash;
    }

    public int getHash(){
        return this.Hash;
    }
}
