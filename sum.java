import java.util.*;
public class sum{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int test=scan.nextInt();
        while(test>0){
        int noe=scan.nextInt();
        int[] arr=new int [noe];
        for (int i=0;i<noe ;i++ ) {
            arr[i]=scan.nextInt();
        }
		int count = 0;
		int max = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == 0)
				count = 0;
			else
				count++;
			max = count > max ? count : max;
		}
		System.out.println(max);
		test--;
	}   
    }
}