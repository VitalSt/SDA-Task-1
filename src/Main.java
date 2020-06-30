public class Main {
    public static void main(String[] args){
        int yearNow = 2020;
        int birthYear = 1981;
        int monthNow = 6;
        int monthBirth = 0;
        // > 18
        if(yearNow - birthYear > 18 && yearNow>birthYear && birthYear>1900)  {
            System.out.println("Here you go");
        }
        else{
            // < 18
            if(yearNow - birthYear < 18 && yearNow>birthYear || yearNow==birthYear && monthNow>=monthBirth){
                System.out.println("Too young");
            }
            // = 18
            else {
                // = 18 month <6
                if(yearNow - birthYear == 18 && monthNow>=monthBirth && yearNow>birthYear && birthYear>1900){
                    System.out.println("Here you go");
                }
                else {
                    // = 18 month >6
                    if(yearNow - birthYear == 18 && monthNow<monthBirth && yearNow>birthYear && birthYear>1900){
                        System.out.println("Too young, please wait a little yet!");
                    }
                    else {
                        // Invalid Year case 1
                        if(birthYear>yearNow || birthYear==yearNow && monthNow<monthBirth){
                            System.out.println("Invalid Birth Date entered");
                        }
                        else {
                            // Invalid Year case 2
                            if(birthYear<=1900 ){
                                System.out.println("Human cannot live so long");
                            }
                        }
                    }
                }
            }
        }
    }
}