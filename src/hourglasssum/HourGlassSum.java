package hourglasssum;

public class HourGlassSum {

    static int hourglassSum(int[][] arr) {

        int result = -100;
        for(int i=0; i < 4; i++){

            for(int j=0; j < 4; j++){
                int sum = 0;
                for(int k=j; k < j+3; k++){
                    sum = sum + arr[i][k];
                }

                sum = sum + arr[i+1][j+1];

                for(int t=j; t < j+3; t++){
                    System.out.print("" + arr[i+2][t] + ",");
                    sum = sum + arr[i+2][t];
                }

                if(sum > result){
                    result = sum;
                }
            }
        }
        return result;
    }
}
