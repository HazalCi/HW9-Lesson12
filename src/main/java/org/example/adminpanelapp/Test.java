package org.example.adminpanelapp;

public class Test {
    public static void main(String[] args) {
        String username ="Ahmet";

        try {
            AdminPanel user = new AdminPanel(username);
        } catch (InappropriateUsernameException e) {
            System.err.println("Hata durumu: " + e.getMessage());
        } catch (UnauthorizedAccessException e) {
            System.err.println("Hata Durumu: " + e.getMessage());
        }
    }
}