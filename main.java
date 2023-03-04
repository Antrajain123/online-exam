
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class main {
    public static void main(String args[])
    {
       Quiz q = new Quiz();
       q.logic();
    }
}
class Quiz
{
    Scanner sc=new Scanner(System.in);
    int correct = 0;
    int wrong = 0;
    public void logic()
    {
       questions q1 = new questions("what ststement is true about java?","A.java is sequence dependent","B.java is code dependent","C.java is plateform dependent","D.java is plateform independent");
       questions q2 = new questions("who invented java programming?","A.Guido van Rossum","B.James Gosling","C.Dennis Ritchie","D.Non of the above");
       questions q3 = new questions("What is default data type in java to store desimal numbers","A.int","B.double","C.float","D.long");
       questions q4 = new questions("How much byte does long data type store","A.8 bytes","B.4 bytes","C.2 bytes","D.1 bytes");
       questions q5 = new questions("extension to store java file?","A. .txt","B. .java","C. .cpp","D. .html");
       Map<questions,Character> hmap=new HashMap<>();
       hmap.put(q1,'D');
       hmap.put(q2,'B');
       hmap.put(q3,'B');
       hmap.put(q4,'A');
       hmap.put(q5,'B');
       for(Map.Entry<questions,Character> map:hmap.entrySet())
       {
        System.out.println(map.getKey().getQuestions());
        System.out.println(map.getKey().getOption1());
        System.out.println(map.getKey().getOption2());
        System.out.println(map.getKey().getOption3());
        System.out.println(map.getKey().getOption4());
        System.out.println("Enter your answer");
        Character ans=sc.next().charAt(0);
        int cans = Character.compare(ans,map.getValue());
        if(cans==0)
        {
            System.out.println("Correct");
            correct++;
        }
        else
        {
            System.out.println("wrong");
            wrong++;
        }
       }
       System.out.println();
       System.out.println("-----Result-----");
       System.out.println("Total Questions:"+hmap.size());
       System.out.println("Coeerct answer:"+correct);
       System.out.println("Wrong Answer:"+wrong);
       System.out.println("Percentage:"+(100*correct)/hmap.size());
       
    }
}
