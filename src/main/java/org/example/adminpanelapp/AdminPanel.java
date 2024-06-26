package org.example.adminpanelapp;

public class AdminPanel {
    public AdminPanel(String username) throws InappropriateUsernameException,UnauthorizedAccessException  {

        if (!isValidUsername(username)) {
            throw new InappropriateUsernameException("Kullanıcı adı karakter hatası.");
        }
        System.out.println("Doğru yapıda kullanıcı adı girilmiştir.");
        if (!hasValidAccess(username)) {
            throw new UnauthorizedAccessException("Yetkisiz erişim hatası.");
        }
        System.out.println("Panele erişim sağlandı.");

    }

    private boolean isValidUsername(String username) {
        return username.matches("[a-zA-Z]+");
    }

    private boolean hasValidAccess(String username) {
        return username.equals("Hazal") || username.equals("Ali") || username.equals("Ceren") || username.equals("Mert");
    }
}