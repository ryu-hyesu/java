import java.util.Scanner;

class NoSuchAccountException extends Exception {
    public NoSuchAccountException(String message) {
        super(message);
    }
}

class NoSuchOperationException extends Exception {
    public NoSuchOperationException(String message) {
        super(message);
    }
}

class NegativeBalanceException extends Exception {
    public NegativeBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private String owner; // 계좌주 이름
    private int balance; // 은행잔고

    public BankAccount() {
        this.owner = "모름";
        this.balance = -1;
    }

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) throws NegativeBalanceException {
        if (amount < 0) {
            throw new NegativeBalanceException("입금액은 음수일 수 없습니다.");
        }
        balance += amount;
    }

    public void withdraw(int amount) throws NegativeBalanceException {
        if (amount < 0) {
            throw new NegativeBalanceException("출금액은 음수일 수 없습니다.");
        }
        if (amount > balance) {
            throw new NegativeBalanceException("출금액이 잔고보다 많습니다.");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return owner + " " + balance;
    }

    public static void Practice63(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount[] accounts = new BankAccount[3];

        for (int i = 0; i < accounts.length; i++) {
            System.out.print("예금주 이름을 입력하세요: ");
            String owner = scanner.nextLine();
            System.out.print("잔고를 입력하세요: ");
            int balance = scanner.nextInt();
            scanner.nextLine();

            accounts[i] = new BankAccount(owner, balance);
        }

        System.out.println("현재 잔고현황입니다.");
        System.out.println("계좌번호 계좌주 잔고");
        for (int i = 0; i < accounts.length; i++) {
            System.out.println((i + 1) + " " + accounts[i].toString());
        }

        while (true) {
            System.out.print("업데이트할 계좌번호를 입력하세요 (종료-0): ");
            int accountNumber = scanner.nextInt();
            scanner.nextLine();

            if (accountNumber == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("원하는 작업은 선택하세요 (1-입금/2-출금): ");
            int operation = scanner.nextInt();
            scanner.nextLine();

            System.out.print("금액을 입력하세요: ");
            int amount = scanner.nextInt();
            scanner.nextLine();

            BankAccount account = accounts[accountNumber - 1];

            if (operation == 1) {
                account.deposit(amount);
                System.out.println("입금이 완료되었습니다.");
            } else if (operation == 2) {
                account.withdraw(amount);
                System.out.println("출금이 완료되었습니다.");
            }

            System.out.println("현재 잔고현황입니다.");
            System.out.println("계좌번호 계좌주 잔고");
            for (int i = 0; i < accounts.length; i++) {
                System.out.println((i + 1) + " " + accounts[i].toString());
            }
        }

        scanner.close();
    }
}
