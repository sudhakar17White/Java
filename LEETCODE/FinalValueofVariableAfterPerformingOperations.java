public class FinalValueofVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String operations[]={"--X","X++","X++"};
        int x=0;
        for(int i=0;i<operations.length;i++)
        {
            operations[i]=(operations[i].replace('X', ' ').trim());
        }
        for(int i=0;i<operations.length;i++)
        {
             if(operations[i].equals("--"))
            {
                x--;
            }    
            else{
                x++;
            }
        }
        System.out.println(x);
    }
}
