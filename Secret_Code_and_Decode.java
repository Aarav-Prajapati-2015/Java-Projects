import java.util.Scanner;

class Secret_Code_and_Decode{
    public static void main(String[] args){
        Start();
    }
    
    static void Start(){
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your choice");
        System.out.println("1. Secret Code");
        System.out.println("2. Decode");
        System.out.println("3. Exit");
        System.out.println("Type 1, 2 or 3 to choose your specific choice");
        int choice = sc.nextInt();
        
        if  (choice == 1){
            Secret_Code();
        }
        else if (choice == 2){
            Decode();
        }
        else if (choice == 3){
            System.out.println("Programme Exited");
        }
        else {
            System.out.println("Invalid choice");
        }
    }
    static void Secret_Code(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You type any letter, I will code it");
        char letter = sc.next().charAt(0);
        
        if (letter == 'a' || letter == 'A') {
            System.out.println("The secret code for this letter is 2");
            Start();
        }
        
        else if (letter == 'b' || letter == 'B'){
            System.out.println("The secret code for this letter is 4");
            Start();
        }
        
        else if (letter == 'c' || letter == 'C'){
            System.out.println("The secret code for this letter is 6");
            Start();
        }
        
        else if (letter == 'd' || letter == 'D'){
            System.out.println("The secret code for this letter is 8");
            Start();
        }
        
        else if (letter == 'e' || letter == 'E'){
            System.out.println("The secret code for this letter is 10");
            Start();
        }
        
        else if (letter == 'f' || letter == 'F'){
            System.out.println("The secret code for this letter is 12");
            Start();
        }
        
        else if (letter == 'g' || letter == 'G'){
            System.out.println("The secret code for this letter is 14");
            Start();
        }
        
        else if (letter == 'h' || letter == 'H'){
            System.out.println("The secret code for this letter is 16");
            Start();
        }
        
        else if (letter == 'i' || letter == 'I'){
            System.out.println("The secret code for this letter is 18");
            Start();
        }
        
        else if (letter == 'j' || letter == 'J'){
            System.out.println("The secret code for this letter is 20");
            Start();
        }
        
        else if (letter == 'k' || letter == 'K'){
            System.out.println("The secret code for this letter is 22");
            Start();
        }
        
        else if (letter == 'l' || letter == 'L'){
            System.out.println("The secret code for this letter is 24");
            Start();
        }
        
        else if (letter == 'm' || letter == 'M'){
            System.out.println("The secret code for this letter is 26");
            Start();
        }
        
        else if (letter == 'n' || letter == 'N'){
            System.out.println("The secret code for this letter is 28");
            Start();
        }
        
        else if (letter == 'o' || letter == 'O'){
            System.out.println("The secret code for this letter is 30");
            Start();
        }
        
        else if (letter == 'p' || letter == 'P'){
            System.out.println("The secret code for this letter is 32");
            Start();
        }
        
        else if (letter == 'q' || letter == 'Q'){
            System.out.println("The secret code for this letter is 34");
            Start();
        }
        
        else if (letter == 'r' || letter == 'R'){
            System.out.println("The secret code for this letter is 36");
            Start();
        }
        
        else if (letter == 's' || letter == 'S'){
            System.out.println("The secret code for this letter is 38");
            Start();
        }
        
        else if (letter == 't' || letter == 'T'){
            System.out.println("The secret code for this letter is 40");
            Start();
        }
        
        else if (letter == 'u' || letter == 'U'){
            System.out.println("The secret code for this letter is 42");
            Start();
        }
        
        else if (letter == 'v' || letter == 'V'){
            System.out.println("The secret code for this letter is 44");
            Start();
        }
        
        else if (letter == 'w' || letter == 'W'){
            System.out.println("The secret code for this letter is 46");
            Start();
        }
        
        else if (letter == 'x' || letter == 'X'){
            System.out.println("The secret code for this letter is 48");
            Start();
        }
        
        else if (letter == 'y' || letter == 'Y'){
            System.out.println("The secret code for this letter is 50");
            Start();
        }
        
        else if (letter == 'z' || letter == 'Z'){
            System.out.println("The secret code for this letter is 52");
            Start();
        }
        
        else{
            System.out.println("Invalid letter");
            Start();
        }
    }
    
    static void Decode(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You type a number that is a Secret code, I will Decode it");
        int number = sc.nextInt();
        
        if (number == 2){
            System.out.println("The Decoded letter for this number is A");
            Start();
        }
        
        else if (number == 4){
            System.out.println("The Decoded letter for this number is B");
            Start();
        }
        
        else if (number == 6){
            System.out.println("The Decoded letter for this number is C");
            Start();
        }
        
        else if (number == 8){
            System.out.println("The Decoded letter for this number is D");
            Start();
        }
        
        else if (number == 10){
            System.out.println("The Decoded letter for this number is E");
            Start();
        }
        
        else if (number == 12){
            System.out.println("The Decoded letter for this number is F");
            Start();
        }
        
        else if (number == 14){
            System.out.println("The Decoded letter for this number is G");
            Start();
        }
        
        else if (number == 16){
            System.out.println("The Decoded letter for this number is H");
            Start();
        }
        
        else if (number == 18){
            System.out.println("The Decoded letter for this number is I");
            Start();
        }
        
        else if (number == 20){
            System.out.println("The Decoded letter for this number is J");
            Start();
        }
        
        else if (number == 22){
            System.out.println("The Decoded letter for this number is K");
            Start();
        }
        
        else if (number == 24){
            System.out.println("The Decoded letter for this number is L");
            Start();
        }
        
        else if (number == 26){
            System.out.println("The Decoded letter for this number is M");
            Start();
        }
        
        else if (number == 38){
            System.out.println("The Decoded letter for this number is N");
            Start();
        }
        
        else if (number == 30){
            System.out.println("The Decoded letter for this number is O");
            Start();
        }
        
        else if (number == 32){
            System.out.println("The Decoded letter for this number is P");
            Start();
        }
        
        else if (number == 34){
            System.out.println("The Decoded letter for this number is Q");
            Start();
        }
        
        else if (number == 36){
            System.out.println("The Decoded letter for this number is R");
            Start();
        }
        
        else if (number == 38){
            System.out.println("The Decoded letter for this number is S");
            Start();
        }
        
        else if (number == 40){
            System.out.println("The Decoded letter for this number is T");
            Start();
        }
        
        else if (number == 42){
            System.out.println("The Decoded letter for this number is U");
            Start();
        }
        
        else if (number == 44){
            System.out.println("The Decoded letter for this number is V");
            Start();
        }
        
        else if (number == 46){
            System.out.println("The Decoded letter for this number is W");
            Start();
        }
        
        else if (number == 48){
            System.out.println("The Decoded letter for this number is X");
            Start();
        }
        
        else if (number == 50){
            System.out.println("The Decoded letter for this number is Y");
            Start();
        }
        
        else if (number == 52){
            System.out.println("The Decoded letter for this number is Z");
            Start();
        }
        
        else{
            System.out.println("Invalid number");
        }
    }
}