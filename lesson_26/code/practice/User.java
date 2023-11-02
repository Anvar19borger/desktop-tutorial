package practice;

import java.util.Objects;

/*
1) @ exists and only one (done)//@ tolka odna
2) dot after @ (done) ->doljana bit . posle @
3) after last dot minimum 2 symbols (done) ->posle poslednei tochki doljno bit minemum 2 simvola
4) alphabetic, digits, _ , - , . , @ -> rasrescheni  bukvi alfovita,cifri  i neekotirie cimvoli
 */
public class User {
    // polja klassa
    private String email;
    private String password;

    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println(email + "isn't valid.");

        }
    }

    private boolean validateEmail(String email) {
        int indexAt = email.indexOf('@');// ischem indeex @
        if (indexAt <= 0 || indexAt != email.lastIndexOf('@')) {// proveerjaem nalichie naschei sobaki i chto ona odna
            return false;// tokda mi vosvraschjaem false
        }
        if (email.indexOf('.', indexAt) == -1) {// eto ne naschlas tochka, nachinaja s posicii @
            return false;
        }
        if (email.indexOf('.') >= email.length() - 2) {//boliee odnogo sinvola posle tochki
            return false;
        }
        for (int i = 0; i < email.length(); i++) {// proverka na dopustimie sinmvoli
            char c = email.charAt(i);
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')
                    || c == '_' || c == '-' || c == '.' || c == '@')) {
                return false;
            }

        }
        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (validatePassword(password)) {
            this.password = password;
        } else {
            System.out.println("Password not valid");
        }
    }

    /*
    1) min 8 symbols
    2) min one symbol of uppercase
    3) min one symbol of lowercase
    4) min one digit
    5) min one special symbol (!%@*&)
     */
    private boolean validatePassword(String password) {
        //TODO
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        User user = (User) object;

        return email.equals(user.email);
    }

    public User(String password) {
        this.password = password;
    }

    public boolean validatePassword() {
        boolean[] validationResults = new boolean[password.length()];

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            // An example of checking the presence of a digit:
            validationResults[i] = Character.isDigit(c);
        }

        boolean isValid = true;
        for (boolean result : validationResults) {
            if (!result) {
                isValid = false;
                break;
            }
        }

        return isValid;
    }
}



