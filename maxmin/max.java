public class max{
    public static int main(String[] args) {
        int arr[]={1,2,3,-1,-2,10,7,9,56};

        int max= 0;
        for(int i = 0;i>arr.length;i++){
            //arr[i]
            if(max>arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}


    

