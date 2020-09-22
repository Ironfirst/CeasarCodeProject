package Opgave;

import java.lang.management.BufferPoolMXBean;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

Cypher cy = new Cypher();

BokstavSystem bk = new BokstavSystem();
bk.listen.put('a',1);


        System.out.println(cy.cypher("abe",-3));
        System.out.println(cy.cypher("xyz",1));



    }
}
