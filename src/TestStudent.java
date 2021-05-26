
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestStudent{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        List<Student> list = new ArrayList<Student>();
        
        for(int i = 0; i <= 4 ;i++){
            System.out.print("print name: ");
            list.add(new Student(input.nextLine()));
        }
        System.out.println("beep boop printing names");
        for(int i = 0; i <= 4; i++){
            System.out.println(list.get(i).getStudentName());
        }
    }
}
