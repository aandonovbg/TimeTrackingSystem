package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProtocolTest {

    @Test
    void getClientName() {
        Protocol protocol = new Protocol(new Client("client name","project name","31.12.2022"),20,"28.12.2022");
        assertEquals("client name", protocol.getClient().getClientName());
    }

    @Test
    void getDeadLine() {
        Protocol protocol = new Protocol(new Client("client name","project name","31.12.2022"),20,"28.12.2022");
        assertEquals("31.12.2022",protocol.getClient().getExpirationDate());
    }

    @Test
    void getMinutes() {
        Protocol protocol = new Protocol(new Client("client name","project name","31.12.2022"),20,"28.12.2022");
        assertEquals(20,protocol.getMinutes());
    }

    @Test
    void setMinutes() {
        Protocol protocol = new Protocol(new Client("client name","project name","31.12.2022"),20,"28.12.2022");
        protocol.setMinutes(1);
        assertEquals(1,protocol.getMinutes());
    }

    @Test
    void getProtocolDate() {
        Protocol protocol = new Protocol(new Client("client name","project name","31.12.2022"),20,"28.12.2022");
        assertEquals("28.12.2022",protocol.getProtocolDate());
    }
}