public class NumberofSeniorCitizens {
    public static void main(String[] args) {
        String details[]={"9751302862F0693","3888560693F7262","5485983835F0649","2580974299F6042","9976672161M6561","0234451011F8013","4294552179O6482"};
        int count=0;
        for(int i=0;i<details.length;i++) 
        {   
            System.out.println(details[i].substring(details[i].length()-5,details[i].length()-4)+" "+details[i].length());
            if(details[i].length()==15&&(details[i].substring(details[i].length()-5,details[i].length()-4).equals("M")||details[i].substring(details[i].length()-5,details[i].length()-4).equals("F")||details[i].substring(details[i].length()-5,details[i].length()-4).equals("O"))&&Integer.parseInt(details[i].substring(details[i].length()-4,details[i].length()-2))>60)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
