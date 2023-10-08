import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello welcome to our system !");
        Scanner scanner = new Scanner(System.in);
        Service service = new Service();

        int input = 0;
        String result = "";
        while (input!=3){
            System.out.println("1 ==> Sign Up\n2 ==>Login\n3 ==> Exit ");
            input = scanner.nextInt();
            scanner = new Scanner(System.in);

            if (input==1){
                System.out.println("Enter your name: ");
                String name = scanner.nextLine();

                System.out.println("Enter email address: ");
                String email = scanner.nextLine();

                System.out.println("Enter your username: ");
                String username = scanner.nextLine();

                System.out.println("Create your password: ");
                String password1 = scanner.nextLine();

                System.out.println("Confirm your password: ");
                String password2 = scanner.nextLine();

                System.out.println("Enter your phone number: ");
                String phoneNumber = scanner.nextLine();

                if (!password1.equals(password2)) result = "Password are different";
                else {
                    boolean register = service.register(new User(name, email, username, password1, phoneNumber));

                    if (register) result = "Successfully registered";
                    else result = "Error occurred";
                }
            }
            if (input == 2){
                System.out.println("Enter your username:");
                String username = scanner.nextLine();

                System.out.println("Enter your password:");
                String password = scanner.nextLine();

                User login = service.login(username, password);
                result = login.toString();
            }

            System.out.println(result);
        }
    }
}