import java.util.Scanner;

public class mini_proj {
    public static void welcome() {
        System.out.println("///***     WELCOME TO NUMBER GUESSER   **//");
    }
    public static String signup() {
        System.out.println("//    TO PLAY SIGNUP FIRST    //");
        System.out.println("Enter your name: ");

        Scanner sc = new Scanner((System.in));
        String name = sc.nextLine();
        System.out.println("Hello "+name);

        return name;
    }
    public static void exit() {
        System.out.println("Thanks for playing sayonara");
    }
    public static void play_game(String name) {
        System.out.println("Lets play the game "+name);

        int sysNum = (int) (Math.random()*100);
        System.out.println(sysNum);
        System.out.println("Guess any numbe b/w 1 and 100. ");
        System.out.println(" Type 0 to exit.");

        Scanner sc = new Scanner((System.in));
        boolean guess_quit = false;
        while( !guess_quit ){
            try {
                int guess = sc.nextInt();

                if (guess==sysNum) {
                    System.out.println("    Congrats you won the game.!!!!!!!!!   ");
                    exit();
                    guess_quit = true;
                }
                else if (guess> sysNum){
                    System.out.println("Your guess isn't correct try again but lower.");
                }
                else if (guess == 0){
                    exit();
                    guess_quit = true;
                    break;
                }
                else if (guess<sysNum){
                    System.out.println("Your guess isn't correct try agin but higher.");
                }
            }
            catch (Exception exception){
                System.out.println("Wrong choice. Play again");
                exit();
                play_game(name);
            }
        }
    }

    public static void main(String[] args) {

        //welcome
        welcome();
        String name = signup();
        play_game(name);
    }
}
