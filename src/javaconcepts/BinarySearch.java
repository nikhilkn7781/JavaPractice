package javaconcepts;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50,60};
        int key=70;
        int count=0;
        int li=0;
        int hi=a.length-1;

        while (li<=hi){
            int m=li+hi/2;

            if (a[m]==key){
                System.out.println("Founded Element is "+a[m]);
                count++;
                break;
            }
            else if (a[m]<key){
                li=m+1;
            }
            else if (a[m]>key){
                hi=m-1;
            }
        }

        if (count==0){
            System.out.println("No such element found");
        }
    }
}
