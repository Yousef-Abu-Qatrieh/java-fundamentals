import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        System.out.println("************************************************************************************");
        flipNHeads(5);
        System.out.println("************************************************************************************");
        while (true) {

            try {
                Thread.sleep(1000);//I use this method to make update every  1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(clock());
        }


    }

    public static String pluralize(String word, int number) {
        if (number == 0 || number > 1) {
            word += "s";


        }
        return word;

    }



    public  static void flipNHeads(int flip){
        Random random= new Random();
        int headCounter=0;
        String [] headTail = new String[flip];

        for (int index = 0; index < headTail.length; index++) {

            for (int secondIndex = index + 1; secondIndex < headTail.length; secondIndex++) {

                double doubleRandom=random.nextDouble();
                if(doubleRandom<0.5){
                    System.out.println("tail");
                    headTail[index]="tail";
                }else if(doubleRandom>0.5){
                    System.out.println("head");

            }

                if (headTail[index] == headTail[secondIndex]) {
                    headCounter++;

                    break;

                }

            }




        }
        System.out.println("It took "+flip +" FLIPS flips to flip" + headCounter +" heads in a row.");
    }


    public static String clock() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        String time;

        while (true) {
            if (second < 10) {
                return time = now.format(DateTimeFormatter.ofPattern(hour + ":" + minute + ":" + 0 + second));


            } else if (minute < 10) {
                return time = now.format(DateTimeFormatter.ofPattern(hour + ":" + 0 + minute + ":" + second));


            }else if (hour < 10) {

                return time = now.format(DateTimeFormatter.ofPattern("0" + hour + ":" + minute + ":" + second));
            }
            else if (minute < 10 && second < 10) {
                return time = now.format(DateTimeFormatter.ofPattern(hour + ":" + 0 + minute + ":" + 0 + second));
            }  else if (hour < 10 && minute < 10) {
                return time = now.format(DateTimeFormatter.ofPattern("0" + hour + ":" + 0 + minute + ":" + second));
            } else if (hour < 10 && second < 10) {
                return time = now.format(DateTimeFormatter.ofPattern("0"+hour + ":" + minute + ":" + 0 + second));
            } else if (hour < 10 && minute < 10 && second < 10) {

                return time = now.format(DateTimeFormatter.ofPattern("0" + hour + ":" + 0 + minute + ":" + 0 + second));
            }

            return time = now.format(DateTimeFormatter.ofPattern(hour + ":" + minute + ":" + second));


        }
    }
}

