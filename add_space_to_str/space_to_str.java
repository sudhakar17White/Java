public class space_to_str {
    public static void main(String[] args) {
        String s = "icodeinpython";
        int spaces[]= {1,5,7,9};
        String add="";
        int j=0;
        for(int i=0;i<spaces.length;i++)
        {
            int ch=spaces[i];
            for(;j<ch;j++)
            {
                add=add+s.charAt(j);
            }
            j=ch;
            add=add+" ";
            

        }
        System.out.println(add+s.substring(spaces[spaces.length-1],s.length()));

    }
}
