package Opgave;

import java.lang.management.BufferPoolMXBean;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

Cypher cy = new Cypher();

        System.out.println(Character.getNumericValue('a'));
        System.out.println(Character.getNumericValue('z'));

        System.out.println(cy.cypher("abe",3));
        System.out.println(cy.cypher("xyz",1));
        System.out.println(cy.cypher("{",1));
        System.out.println(Character.getNumericValue('{'));

    }
}
