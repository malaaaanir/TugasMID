// Nirmala 13020210242
public class TestErr20242{
    public static void main(String args[]){
        int tot = 0;
        int j = 0;
        for(int i=0; i<10; i++){
            tot += i;
            if(i<j){
                System.out.println(i);
            }
            else{
                System.out.println(j);
            }
        }
        do{
            j++;
        }
        while(j<10);
        while(j<10){
            j++;
        }
    }
}