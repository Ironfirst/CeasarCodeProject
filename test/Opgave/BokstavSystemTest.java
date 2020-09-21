package Opgave;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class CypherTest {

    Cypher cypher = new Cypher();

    @Test
    public void cypherTest(){

        String firstTest ="alice";
        String secondTest="abe";

        //forventer første test med alice input giver output bmmjf
        assertEquals("bmmjf", cypher.cypher(firstTest,1));
        //forventer anden test med abe input giver output deh
        assertEquals("deh",cypher.cypher(secondTest,3));

    }

}