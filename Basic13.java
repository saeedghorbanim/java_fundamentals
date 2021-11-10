public class Basic13 {
    public static void main(String[] args){
        // basic1();
        // basic2(25);

        int[] new_arr ={-1, 2, 5, -3, 7};
        smallest(new_arr);
    }

    public static void basic1()
    {
        int num = 25;
        for(int i = 1; i < num+1; i++)
        {
            System.out.println(i);
        }
    }

    public static void basic2(int x){
        int sum = 0;
        for(int i = 0; i < x+1; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void smallest(int arr[]){
        int min = 0;
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}