public class findMin {
    public static int minValue(int array[]){
        int min= array[0];
        int index = 0;

        for (int i=0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
                index=i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[]={4,12,5,6,2,5,2,1};
        int index= minValue(arr);
        System.out.println("The smallest element in the array is : "+arr[index]);
    }
}
