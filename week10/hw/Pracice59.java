import java.util.Random;

class NotFoundException extends Exception {
    NotFoundException(String message) {
        super(message);
    }
}

public class Pracice59 {
    public static int searchArray(int[] array, int key) throws NotFoundException {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        throw new NotFoundException("입력된 숫자 " + key + "는 배열에 존재하지 않습니다.");
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        System.out.println("\n숫자를 하나 입력하세요: ");
        int key = Integer.parseInt(System.console().readLine());

        try {
            int index = searchArray(array, key);
            System.out.println("입력된 숫자 " + key + "는 인덱스 " + index + "번에 존재합니다.");
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}