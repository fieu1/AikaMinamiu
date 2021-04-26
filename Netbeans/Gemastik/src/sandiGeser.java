import java.util.Scanner;
public class sandiGeser {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        char huruf[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' ','1','2','3','4','5','6','7','8','9','0','.',',','!'};

        boolean lanjut=false;
        System.out.print("Masukan Kalimat : ");
        String Kalimat=sc.nextLine();
        char kata[]= Kalimat.toCharArray();
        System.out.print("Berapa angka untuk menggeser huruf : ");
        int geser = sc.nextInt();

        for (int i = 0; i < Kalimat.length(); i++) {
            int j=0;
            do{
                int saveIndex=0;
                if(kata[i]==huruf[j]){
                    if(j<26){
                        saveIndex=j+geser;
                        if(saveIndex < 0){
                            saveIndex=saveIndex*-1;
                            saveIndex=26-saveIndex;
                        }
                        if (saveIndex>25){
                            saveIndex=saveIndex-26;
                        }
                        kata[i]=huruf[saveIndex];
                        lanjut=false;
                    }else{
                        kata[i]=huruf[j];
                        lanjut = false;
                    }
                }else{
                    lanjut=true;
                    j++;
                }
            }while(lanjut);
            System.out.print(kata[i]);
        }
    }
}

