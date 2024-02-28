import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Do you want the program to continue ? ");
            choice = sc.next().charAt(0);
            if (choice=='n' || choice=='N'){
                break;  
            }
            else {
                int patternChoice;
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Choose a pattern : ");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("1.\n11111\n11111\n11111");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("2.\n11111\n22222\n33333\n44444\n55555");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("3.\n1\n12\n123\n1234\n12345");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("4.\n    5\n   45\n  345\n 2345\n12345");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("5.\n1\n23\n456\n78910");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Enter a choice (0 to exit): ");
                System.out.println("-------------------------------------------------------------------------");
                patternChoice = sc.nextInt();
                switch (patternChoice){
                    case 0:
                        System.exit(1);
                    break;
                    case 1:
                        System.out.println("Enter row : ");
                        int row = sc.nextInt();
                        for (int i = 1; i<=row; i++){
                            for(int j = 1; j<=row; j++){
                                System.out.print("1 ");
                            }

                            System.out.println();
                        }
                    break;

                    case 2:
                        System.out.println("Enter row : ");
                        row = sc.nextInt();
                        for (int i = 1; i<=row; i++){

                            for (int j = 1; j<=row; j++){
                                System.out.print(i);
                            }

                            System.out.println();
                        }
                    break;

                    case 3:
                        System.out.println("Enter row : ");
                        row = sc.nextInt();
                        for (int i = 1; i<=row; i++){
                            for (int j = 1; j<=i; j++){
                                System.out.print(j);
                            }
                            System.out.println();
                        }
                    break;

                    case 4:
                        System.out.println("Enter row : ");
                        row = sc.nextInt();
                        for (int i = 1; i<=row; i++){
                            for (int j = 1; j<=row; j++){
                                if(j>=row+1-i){
                                    System.out.print(j);
                                }
                                else{
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
                    break;

                    case 5:
                        System.out.println("Enter row : ");
                        row = sc.nextInt();
                        int count = 1;
                        for (int i = 1; i<=row; i++){
                            for(int j = 1; j<=i; j++){
                                System.out.print(count);
                                count = count + 1;
                            }
                            System.out.println();
                        }
                    break;

                    default:
                        System.out.println("Enter again");
                    break;
                }
            }
        }while (choice=='Y' || choice =='y');

    }
}