package practice;

public class UserAppl {
    public static void main(String[] args) {
        User user = new User("peter@gmail.com", "1245");// sosdajem polsevatelja
        System.out.println(user);// pechataem

        user.setEmail("peter@gmail.com");
        System.out.println(user);

        System.out.println("----------");
        String password = "1234"; // Replace with your desired password
        User user1 = new User(password);
        user.setPassword("12345");
        System.out.println(user1);

        if (user1.validatePassword()) {
            System.out.println("The password is valid.");
        } else {
            System.out.println("The password is not valid.");
        }
    }
}
