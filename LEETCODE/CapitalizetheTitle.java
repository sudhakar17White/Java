public class CapitalizetheTitle {
    public static void main(String[] args) {
        String title = "capiTalIze tHe titLe";
        title=title.toLowerCase();
        String ar[]=title.split(" ");
        String str="";
        for(int i=0;i<ar.length;i++)
        {
            str=str+(""+ar[i].charAt(0)).toUpperCase()+ar[i].substring(1, ar[i].length())+" ";
        }
        System.out.println(str);
    }
}
