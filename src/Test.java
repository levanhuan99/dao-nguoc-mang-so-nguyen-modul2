import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ReverseStack reverseStack=new ReverseStack(10);
        int[] array={3,2,1,6,4,4,3,2,5,8};

        for (int i=0;i<array.length;i++){
            reverseStack.push(array[i]);
        }
        reverseStack.reverseArray();
        System.out.println(Arrays.toString(reverseStack.arr));









//        for (int i=0;i<array.length;i++){
//            reverseStack.push(array[i]);
//        }
//        reverseStack.reverseArray();
//        for (int i=0;i<array.length;i++){
//            System.out.print (reverseStack.arr[i]+" ");
//        }
    }
}
