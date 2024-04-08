import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAndPasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o email
        System.out.print("Insira seu endereço de email: "); // imprime na tela 
        String email = scanner.nextLine(); // lendo a variável 

        // Solicita ao usuário que insira a senha
        System.out.print("Insira sua senha: ");
        String password = scanner.nextLine();

        // Valida o email
        if (isValidEmail(email)) {
            System.out.println("Email válido.");
        } else {
            System.out.println("Email inválido.");
        }

        // Valida a senha
        if (isValidPassword(password)) {
            System.out.println("Senha válida.");
        } else {
            System.out.println("Senha inválida. A senha deve ter pelo menos 8 caracteres.");
        }
    }

    // Método para validar o email usando expressões regulares
    private static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // Método para validar a senha
    private static boolean isValidPassword(String password) {
        return password.length() >= 8;
    }
}
