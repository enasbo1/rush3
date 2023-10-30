import java.util.*;


public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static boolean c = true;
    public static void main(String[] args) {
        Map<String, Integer> attack = new HashMap<>();
        attack.put("Ultralaser", 15);
        attack.put("pistolet à eau", 1);
        attack.put("Die", 10000);
        Alter perso1 = new Alter("toto", 25, 1, 0.3, attack);
        Alter perso2 = new Alter("titi", 25,2,1, attack);
        while (c){
            perso1.turn(perso2);
            c = c & perso2.alive();
            if (c){
                perso2.turn(perso1);
                c = c & perso1.alive();
            }
        }
    }

    public static String choose(ArrayList<String> choice){
        System.out.println("what do you want?");
        for(int i = 0; i < choice.size(); ++i) {
            System.out.println(i + " => " + choice.get(i));
        }
        System.out.println("> ");
        int m = scan.nextInt();
        if (m>=choice.size()) {
            return(choose(choice));
        }else{
            return(choice.get(m));
        }
    }
}