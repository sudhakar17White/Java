package KnowYourNeighbor;
import java.util.*;

public class KnoWYourNeighbor {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String word=s.nextLine();
    ArrayList<Integer> index=new ArrayList<Integer>();
    for(int i=0;i<word.length();i++)
    {
        if(Character.isLetterOrDigit(word.charAt(i)))
        {
            index.add(i);
        }
    }   
    int ir=0;
    for(int i=0;i<index.size();i++)
    {
        int in=index.get(i);
        if(in==0)
        {
            break;
        }
        else if(!Character.isLetterOrDigit(word.charAt(in-1))&&!Character.isLetterOrDigit(word.charAt(in+1)))
        {
            ir++;
        }

    }
    if(ir==index.size())
    {
        System.out.println("True");
    }
    else
    {
        System.out.println("False");
    }

    }
}
