package models;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static models.Client.getChosenClientIndex;
import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void getExpirationDate() {
        Client client = new Client("clientName","test","31.12.2022");
        assertEquals("31.12.2022", client.getExpirationDate());
    }

    @Test
    void addClientToList() {
    }

    @Test
    void getChosenClientIndexReturnChoice() {
        String input = "3";
        int value=Integer.valueOf(input);
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(value-1,getChosenClientIndex());
    }

}