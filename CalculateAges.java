import java.util.Scanner;

public class CalculateAges {

    public static void main(String[] args) {
        
        Scanner user = new Scanner (System.in);
        
        String[] names = new String[3];
        byte[] ages = new byte[3];
        
        System.out.println("What is the current year?");
        
        short currentYear = user.nextShort();
        
        System.out.println("Type your name:");
        
        names[0] = user.next();
        
        System.out.println("Now give your age:");
        
        ages[0] = user.nextByte();
        
        System.out.println("Give a second name:");
        
        names[1] = user.next();
        
        System.out.println("Give the age of the second name you gave:");
        
        ages[1] = user.nextByte();
        
        System.out.println("Give the third and last name:");
        
        names[2] = user.next();
        
        System.out.println("And finaly the age of the third person you named:");
        
        ages[2] = user.nextByte();
        
        //Output prints
        
        System.out.println(names[0] +" was born in " + (currentYear - ages[0]));
        System.out.println(names[1] +" was born in " + (currentYear - ages[1]));
        System.out.println(names[2] +" was born in " + (currentYear - ages[2]));
        
        if (ages[0]<60){
            System.out.println("In 1960 "+ names[0] +" was not born yet and in 2040 will be " +
                    ((2040 - currentYear) + ages[0]) + " years old." );
            
        }else{
            System.out.println(names[0]+" in 1960 was "+(ages[0]-(currentYear-1960))+" years old " +" and in 2040 will be " +
                    ((2040 - currentYear) + ages[0]) + " years old.");
        }
        if (ages[1]<60){
            System.out.println("In 1960 "+ names[1] +" was not born yet and in 2040 will be " +
                    ((2040 - currentYear) + ages[1]) + " years old." );
            
        }else{
            System.out.println(names[1]+" in 1960 was "+(ages[1]-(currentYear-1960))+" years old " +" and in 2040 will be " +
                    ((2040 - currentYear) + ages[1]) + " years old.");
        }    
        if (ages[2]<60){
            System.out.println("In 1960 "+ names[2] +" was not born yet and in 2040 will be " +
                    ((2040 - currentYear) + ages[2]) + " years old." );
            
        }else{
            System.out.println(names[2]+" in 1960 was "+(ages[2]-(currentYear-1960))+" years old " +" and in 2040 will be " +
                    ((2040 - currentYear) + ages[2]) + " years old.");
        }
        
        
    }
    
}