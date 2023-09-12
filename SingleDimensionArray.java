package lalita.array;


public class SingleDimensionArray {
    int arr[] = null;

    //creating constructor
    SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
          //  arr[i] = Integer.MIN_VALUE;
            arr[i] = i+1;
        }
    }

    // Print the array
    public void printArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exist");
        }
    }

    //Insert value in the Array
    public void insertValue(int value, int location){
       try {
           if (arr[location] == Integer.MIN_VALUE) {
               arr[location] = value;
               System.out.println("Successfully inserted value " + value + " at location " + location);
               for (int i = 0; i < arr.length; i++) {
                   System.out.println(arr[i] + " ");
               }
           } else {
               System.out.println("Unable to insert value it's already occupied by another value");
           }
       } catch (Exception e){
           System.out.println("array out of bound index");
       }
    }

    //Access a particular element of an array
    public void accessElement(int cellNumber){
        try {
            System.out.println("the element " + arr[cellNumber]);
        } catch (Exception e){
            System.out.println("Invalid index to access");
        }
    }

//Search for an element in the given Array
    public void arrayToSearch(int element){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== element){
                System.out.println("Value found !");
                System.out.println("Index of " + element + " is: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    //Delete value from given Array
    public void deleteValueFromArray(int index){
        try{
            arr[index] = Integer.MIN_VALUE;
        } catch (Exception e){
            System.out.println("Cant delete the value as cell# provided is not in the range of array !");
        }
    }

    //Delete the entire Array

    public void deleteArray(){
        arr = null;
        System.out.println("Array has been succefully deleted");
    }

    public static void main(String[] args) {
        SingleDimensionArray sm = new SingleDimensionArray(5);
      //  sm.printArray();
      // sm.insertValue(555, 3);
      //sm.accessElement(3);
       // sm.deleteValueFromArray(3);
        sm.arrayToSearch(3);
        sm.printArray();
        sm.deleteArray();
        sm.printArray();

    }
}
