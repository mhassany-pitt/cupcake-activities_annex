public class BubbleSort {
  
    static void Sorting(int[] list) {

        int n = list.length;
        int temp = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
		
                if (list[j - 1] > list[j]) { 

                    temp = list[j - 1]; 
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
    
        int UnsortedList[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        System.out.println("Array Before Bubble Sort");

        for (int i = 0; i < UnsortedList.length; i++) {
            System.out.print(UnsortedList[i] + " ");
        }
        System.out.print('\n' + "Array after Bubble Sort" + '\n');
        
        Sorting(UnsortedList); 

        for (int i = 0; i < UnsortedList.length; i++) {
            System.out.print(UnsortedList[i] + " ");
        }

    }
}