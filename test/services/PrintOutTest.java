package services;

import models.Account;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class PrintOutTest {
private static HashMap<String, Account> accountsList = Load.accountsListFromFile();
    @Test
    void showEmployeesListTest() {
        assertDoesNotThrow(()->PrintOut.showEmployeesList(accountsList),"Employee list:");
    }

    @Test
    void showEmployeeClients() {
        String accountName="AANDONOV";
        assertDoesNotThrow(()->PrintOut.showEmployeeClients(accountName),"Clients List:");
    }
}