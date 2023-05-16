import java.util.Scanner;

public class Practice61 {
    public static void main(String[] args) {
        String computer = getRandomRPS();
        String user = getValidInput();

        int result = whoswin(computer, user);

        System.out.println("컴퓨터의 생성: " + computer);
        System.out.println("당신의 입력: " + user);

        if (result == -1) {
            System.out.println("컴퓨터가 이겼습니다.");
        } else if (result == 1) {
            System.out.println("당신이 이겼습니다.");
        } else {
            System.out.println("비겼습니다.");
        }
    }

    public static int whoswin(String com, String you) {
        if (com.equals("가위") && you.equals("바위") ||
            com.equals("바위") && you.equals("보") ||
            com.equals("보") && you.equals("가위")) {
            return 1; // 사용자 승리
        } else if (com.equals(you)) {
            return 0; // 비김
        } else {
            return -1; // 컴퓨터 승리
        }
    }

    public static String getRandomRPS() {
        String[] rps = {"가위", "바위", "보"};
        int index = (int) (Math.random() * rps.length);
        return rps[index];
    }

    public static String getValidInput() {
        Scanner scanner = new Scanner(System.in);
        String input = null;

        while (input == null) {
            try {
                input = getInput(scanner);
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }

        return input;
    }

    public static String getInput(Scanner scanner) throws InvalidInputException {
        System.out.print("당신의 입력: ");
        String input = scanner.next();

        if (!input.equals("가위") && !input.equals("바위") && !input.equals("보")) {
            throw new InvalidInputException("잘못된 입력입니다. 다시 입력하세요.");
        }

        return input;
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
