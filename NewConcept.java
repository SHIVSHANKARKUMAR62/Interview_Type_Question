package Interview_Question;

public class NewConcept {
    public static void main(String[] args) {
        int [] arr ={6,5,4,2,7,8,1};
        int count =0;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length-1;j++){
                if (arr[i]>arr[j]){
                    arr[i]=arr[j];
                }
//                if  (arr[i]<arr[j]){
//                    System.out.print(arr[j]+" ");
//                }
            }
            System.out.println(arr[i]);
        }
    }
}
