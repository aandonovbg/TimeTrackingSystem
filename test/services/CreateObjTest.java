package services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateObjTest {

    @Test
    void adminObjCreated() {
        String accountName = "accountName";
        String password = "password";
        assertEquals(1,CreateObj.adminObj(accountName,password,"AccountsList.txt"));
    }

    @Test
    void adminObjNotCreated() {
        String accountName = "accountName";
        String password = "password";
        assertThrows(RuntimeException.class,()->CreateObj.adminObj(accountName,password,"//"));
    }

    @Test
    void employeeObjCreated() {
        String accountName = "accountName";
        String password = "password";
        String name = "Anton";
        assertEquals(1,CreateObj.employeeObj(accountName,password,name,"AccountsList.txt"));
    }
    @Test
    void employeeObjNotCreated() {
        String accountName = "accountName";
        String password = "password";
        String name = "Anton";
        assertThrows(RuntimeException.class,()->CreateObj.employeeObj(accountName,password,name,"//"));
    }

    @Test
    void clientObjectCreated() {
        String clientName = "clientName";
        String projectName = "test project";
        String date = "31.12.2022";
        assertEquals(1,CreateObj.clientObj(clientName,projectName,date, "ClientsListTest.txt"));
    }
    @Test
    void clientObjNotCreated() {
        String clientName = "clientName";
        String projectName = "test project";
        String date = "31.12.2022";
        assertThrows(RuntimeException.class,()->CreateObj.clientObj(clientName,projectName,date,"//"));
    }
}