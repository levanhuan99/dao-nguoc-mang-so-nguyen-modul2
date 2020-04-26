public class ReverseStack {
    public int[] arr;
    private int currentIndex=0;
    public int size;

    public ReverseStack(int size){
        this.size=size;
        arr=new int[size];
    }
    public boolean isEmpty(){
        if (currentIndex ==0){
            return  true;
        }
        return false;
    }

    public boolean isFull(){
        if (currentIndex ==size){
            return true;
        }
        return false;
    }

    public  void push(int element){
        if (isFull()){
            throw new IndexOutOfBoundsException("out of index");
        }
        arr[currentIndex]=element;
        currentIndex++;
        System.out.println("pushed "+element);
    }

    public int pop(){
        if (isEmpty()){
            throw new IndexOutOfBoundsException("out of index");
        }
        return arr[--currentIndex];
    }

    public int[] reverseArray(){
      int[] newArr=new  int[arr.length];
      int j=arr.length-1;
      for (int i=0;i<arr.length;i++){
          newArr[j]=arr[i];
          j--;
      }
      arr=newArr;
      return arr;
    }

}
