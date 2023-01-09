package bkashapp;

import java.util.Scanner;

public class BkashApp {
    static Scanner sc = new Scanner(System.in);
    static int ballance = 15000;
    public static void main(String[] args) {
        System.out.println("Enter bkash dial number");
        String num = sc.nextLine();
        String num1 = "*247#";
        
        if(num.equals(num1)){
            String[] arr = {
                "1. Send Money",
                "2. Mobile Recharge",
                "3. Payment",
                "4. Cash Out",
                "5. pay Bill",
                "6. My Bkash",
                "7. Reset Pin"
            };
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
            System.out.println("enter input");
        }
        else System.out.println("Connection problem or invalid MMI code");
        
        int menu = sc.nextInt();
        switch(menu){
            case 1:
                sendMoney();
                break;
            case 2:
                mobileRecharge();
                break;
            case 3:
                payment();
                break;
            case 4:
                cashout();
                break;
            case 5:
                payBill();
                break;
            case 6:
                myBkash();
                break;
            case 7:
                resetPin();
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    private static void sendMoney() {
        System.out.println("Enter your account");
        sc.nextLine();
        String accountNum = sc.nextLine();
        if(accountNum.length() != 11){
            System.out.println("Your account number is invalid");
            System.exit(0);
        }
        System.out.println("Enter your amount");
        int amount = sc.nextInt();
        if(amount > 25000){
            System.out.println("Transaction limit over");
            System.exit(0);
        } else if(amount > ballance){
            System.out.println("Insufficent balance");
            System.exit(0);
        }
        System.out.println("Enter your bkash pin");
        sc.nextLine();
        String pinNum = sc.nextLine();
        if(pinNum.length() != 4 && pinNum.length() != 5){
            System.out.println("Your bkash account pin is invalid");
            System.exit(0);
        }
        
        System.out.println(amount + " taka sent successfully to "+ accountNum);
        
    }

    private static void mobileRecharge() {
        String[] arr = {
                "1. Grameenphone",
                "2. Robi",
                "3. Airtel",
                "4. Banglalink",
                "5. Teletalk"
            };
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
            System.out.println("enter input");
            
            int menuRecharge = sc.nextInt();
            switch(menuRecharge){
            case 1:
                Grameenphone();
                break;
            case 2:
                Robi();
                break;
            case 3:
                Airtel();
                break;
            case 4:
                Banglalink();
                break;
            case 5:
                Teletalk();
                break;
            default:
                System.out.println("Invalid input");    
        }
    }
    
    private static void Grameenphone() {
        System.out.println("Enter your mobile number");
        sc.nextLine();
        String accountNum = sc.nextLine();
        if(accountNum.length() != 11){
            System.out.println("Your mobile number is invalid");
            System.exit(0);
        }
        System.out.println("Enter recharge amount");
        int amount = sc.nextInt();
        if(amount > 1000){
            System.out.println("Invalid recharge amount");
            System.exit(0);
        } else if(amount > ballance){
            System.out.println("Insufficent balance");
            System.exit(0);
        }else if(amount < 10){
            System.out.println("Invalid recharge amount");
            System.exit(0);
        }
        System.out.println("Enter your bkash pin");
        sc.nextLine();
        String pinNum = sc.nextLine();
        if(pinNum.length() != 4 && pinNum.length() != 5){
            System.out.println("Your bkash account pin is invalid");
            System.exit(0);
        }
        
        System.out.println(amount + " taka recharged successfully to "+ accountNum);
        
    }

    private static void Robi() {
        System.out.println("Enter your mobile number");
        sc.nextLine();
        String accountNum = sc.nextLine();
        if(accountNum.length() != 11){
            System.out.println("Your mobile number is invalid");
            System.exit(0);
        }
        System.out.println("Enter recharge amount");
        int amount = sc.nextInt();
        if(amount > 1000){
            System.out.println("Invalid recharge amount");
            System.exit(0);
        } else if(amount > ballance){
            System.out.println("Insufficent balance");
            System.exit(0);
        }else if(amount < 10){
            System.out.println("Invalid recharge amount");
            System.exit(0);
        }
        System.out.println("Enter your bkash pin");
        sc.nextLine();
        String pinNum = sc.nextLine();
        if(pinNum.length() != 4 && pinNum.length() != 5){
            System.out.println("Your bkash account pin is invalid");
            System.exit(0);
        }
        
        System.out.println(amount + " taka recharged successfully to "+ accountNum);
    }

    private static void Airtel() {
        System.out.println("Enter your mobile number");
        sc.nextLine();
        String accountNum = sc.nextLine();
        if(accountNum.length() != 11){
            System.out.println("Your mobile number is invalid");
            System.exit(0);
        }
        System.out.println("Enter recharge amount");
        int amount = sc.nextInt();
        if(amount > 1000){
            System.out.println("Invalid recharge amount");
            System.exit(0);
        } else if(amount > ballance){
            System.out.println("Insufficent balance");
            System.exit(0);
        }else if(amount < 10){
            System.out.println("Invalid recharge amount");
            System.exit(0);
        }
        System.out.println("Enter your bkash pin");
        sc.nextLine();
        String pinNum = sc.nextLine();
        if(pinNum.length() != 4 && pinNum.length() != 5){
            System.out.println("Your bkash account pin is invalid");
            System.exit(0);
        }
        
        System.out.println(amount + " taka recharged successfully to "+ accountNum);
    }

    private static void Banglalink() {
        System.out.println("Enter your mobile number");
        sc.nextLine();
        String accountNum = sc.nextLine();
        if(accountNum.length() != 11){
            System.out.println("Your mobile number is invalid");
            System.exit(0);
        }
        System.out.println("Enter recharge amount");
        int amount = sc.nextInt();
        if(amount > 1000){
            System.out.println("Invalid recharge amount");
            System.exit(0);
        } else if(amount > ballance){
            System.out.println("Insufficent balance");
            System.exit(0);
        }else if(amount < 10){
            System.out.println("Invalid recharge amount");
            System.exit(0);
        }
        System.out.println("Enter your bkash pin");
        sc.nextLine();
        String pinNum = sc.nextLine();
        if(pinNum.length() != 4 && pinNum.length() != 5){
            System.out.println("Your bkash account pin is invalid");
            System.exit(0);
        }
        
        System.out.println(amount + " taka recharged successfully to "+ accountNum);
    }

    private static void Teletalk() {
        System.out.println("Enter your mobile number");
        sc.nextLine();
        String accountNum = sc.nextLine();
        if(accountNum.length() != 11){
            System.out.println("Your mobile number is invalid");
            System.exit(0);
        }
        System.out.println("Enter recharge amount");
        int amount = sc.nextInt();
        if(amount > 1000){
            System.out.println("Invalid recharge amount");
            System.exit(0);
        } else if(amount > ballance){
            System.out.println("Insufficent balance");
            System.exit(0);
        }else if(amount < 10){
            System.out.println("Invalid recharge amount");
            System.exit(0);
        }
        System.out.println("Enter your bkash pin");
        sc.nextLine();
        String pinNum = sc.nextLine();
        if(pinNum.length() != 4 && pinNum.length() != 5){
            System.out.println("Your bkash account pin is invalid");
            System.exit(0);
        }
        
        System.out.println(amount + " taka recharged successfully to "+ accountNum);
    }

    private static void payment() {
        System.out.println("Enter merchant bkash account number");
        sc.nextLine();
        String accountNum = sc.nextLine();
        if(accountNum.length() != 11){
            System.out.println("Your merchant bkash account number is invalid");
            System.exit(0);
        }
        System.out.println("Enter your amount");
        int amount = sc.nextInt();
        if(amount > ballance){
            System.out.println("Insufficent balance");
            System.exit(0);
        }
        System.out.println("Enter your bkash pin");
        sc.nextLine();
        String pinNum = sc.nextLine();
        if(pinNum.length() != 4 && pinNum.length() != 5){
            System.out.println("Your bkash account pin is invalid");
            System.exit(0);
        }
        
        System.out.println(amount + " taka payment successfull to "+ accountNum);
    }

    private static void cashout() {
        String[] arr = {
                "1. From Agent",
                "2. From ATM"
            };
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
            System.out.println("enter input");
            
            int menuCashOut = sc.nextInt();
            switch(menuCashOut){
            case 1:
                fromAgent();
                break;
            case 2:
                fromAtm();
                break;   
            default:
                System.out.println("Invalid input");
        }
    }
    
    private static void fromAgent() {
        System.out.println("Enter your agent number");
        sc.nextLine();
        String accountNum = sc.nextLine();
        if(accountNum.length() != 11){
            System.out.println("Your agent number is invalid");
            System.exit(0);
        }
        System.out.println("Enter cash out amount");
        int amount = sc.nextInt();
        if(amount > 25000){
            System.out.println("Limit is Over");
            System.exit(0);
        } else if(amount > ballance){
            System.out.println("Insufficent balance");
            System.exit(0);
        }else if(amount < 50){
            System.out.println("Invalid cash out amount");
            System.exit(0);
        }
        System.out.println("Enter your bkash pin");
        sc.nextLine();
        String pinNum = sc.nextLine();
        if(pinNum.length() != 4 && pinNum.length() != 5){
            System.out.println("Your bkash account pin is invalid");
            System.exit(0);
        }
        
        System.out.println(amount + " taka cash out successfully to "+ accountNum);
    }

    private static void fromAtm() {
        System.out.println("ATM is not available yet");
    }

    private static void payBill() {
        String[] arr = {
                "1. gas",
                "2. electricity"
            };
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
            System.out.println("enter input");
            
            int menuPayBill = sc.nextInt();
            switch(menuPayBill){
            case 1:
                gas();
                break;
            case 2:
                electricity();
                break;   
            default:
                System.out.println("Invalid input");
        }
    }
    
    private static void electricity() {
        System.out.println("Enter consumer number");
        sc.nextLine();
        String accountNum = sc.nextLine();
        if(accountNum.length() != 7){
            System.out.println("Your consumer number is invalid");
            System.exit(0);
        }
        System.out.println("Enter payable  amount");
        double amount = sc.nextDouble();
        if(amount > 20000){
            System.out.println("Limit over amount");
            System.exit(0);
        } else if(amount > ballance){
            System.out.println("Insufficent balance");
            System.exit(0);
        }else if(amount < 50){
            System.out.println("Invalid payment amount");
            System.exit(0);
        }
        System.out.println("Enter your bkash pin");
        sc.nextLine();
        String pinNum = sc.nextLine();
        if(pinNum.length() != 4 && pinNum.length() != 5){
            System.out.println("Your bkash account pin is invalid");
            System.exit(0);
        }
        
        System.out.println(amount + " taka bill paid successfully");
    }

    private static void gas() {
        System.out.println("Enter consumer number");
        sc.nextLine();
        String accountNum = sc.nextLine();
        if(accountNum.length() != 7){
            System.out.println("Your consumer number is invalid");
            System.exit(0);
        }
        System.out.println("Enter payable  amount");
        double amount = sc.nextDouble();
        if(amount > 20000){
            System.out.println("Limit over amount");
            System.exit(0);
        } else if(amount > ballance){
            System.out.println("Insufficent balance");
            System.exit(0);
        }else if(amount < 50){
            System.out.println("Invalid payment amount");
            System.exit(0);
        }
        System.out.println("Enter your bkash pin");
        sc.nextLine();
        String pinNum = sc.nextLine();
        if(pinNum.length() != 4 && pinNum.length() != 5){
            System.out.println("Your bkash account pin is invalid");
            System.exit(0);
        }
        
        System.out.println(amount + " taka bill paid successfully");
    }

    private static void myBkash() {
        String[] arr = {
                "1. Check Balance",
                "2. Statement",
                "3. Change Pin"
            };
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
            System.out.println("enter input");
            
            int menuMyBkash = sc.nextInt();
            switch(menuMyBkash){
            case 1:
                checkBalanace();
                break;
            case 2:
                statement();
                break;
            case 3:
                changePin();
                break;    
            default:
                System.out.println("Invalid input");
        }
    }

    private static void resetPin() {
        System.out.println("enter your old bkash pin");
        sc.nextLine();
        String pinOld = sc.nextLine();
        if(pinOld.length() != 4 && pinOld.length() != 5){
            System.out.println("Your bkash account pin is invalid");
            System.exit(0);
        } else
            System.out.println("enter a new bkash pin");
        
        String pinNew = sc.nextLine();
        if(pinNew.length() != 4 && pinNew.length() != 5){
            System.out.println("Your bkash pin should be 4 or 5 digit");
            System.exit(0);
        }
        System.out.println("pin reset successful");
    }

    private static void checkBalanace() {
        System.out.println("enter your bkash pin");
        sc.nextLine();
        String pinNum = sc.nextLine();
        if(pinNum.length() != 4 && pinNum.length() != 5){
            System.out.println("Your bkash account pin is invalid");
            System.exit(0);
        }        
        System.out.println("Your account balance is " + ballance);
    }

    private static void statement() {
        System.out.println("enter your bkash pin");
        sc.nextLine();
        String pinNum = sc.nextLine();
        if(pinNum.length() != 4 && pinNum.length() != 5){
            System.out.println("Your bkash account pin is invalid");
            System.exit(0);
        }        
        System.out.println("No transaction yet ");
    }

    private static void changePin() {
        System.out.println("enter your old bkash pin");
        sc.nextLine();
        String pinOld = sc.nextLine();
        if(pinOld.length() != 4 && pinOld.length() != 5){
            System.out.println("Your bkash account pin is invalid");
            System.exit(0);
        } else
            System.out.println("enter a new bkash pin");
        
        String pinNew = sc.nextLine();
        if(pinNew.length() != 4 && pinNew.length() != 5){
            System.out.println("Your bkash pin should be 4 or 5 digit");
            System.exit(0);
        }
        System.out.println("pin changed successful");
    }    
}
