package lang.string.test;

public class TestString9
{
    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] parts = email.split("@");
        String idpart = parts[0];
        String domainPart = parts[1];

        System.out.println("ID: " + idpart);
        System.out.println("Domain: " + domainPart);
    }
}
