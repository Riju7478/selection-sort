public class selectionsort {



public static void selectionsort(int array[]){
    for(int i=0;i<array.length-1;i++){
     int minpos = i;
     for(int j=i+1;j<array.length;j++){
     if( array[minpos] > array[j]) {
        minpos=j;
     }
    }

    int temp =array[minpos];
    array [minpos]=array[i];
    array[i]=temp;
      

    }

}

public static void printarr(int array[]){
    for(int k=0;k<array.length;k++){
        System.out.println(array[k]+" ");
    }
    System.out.println();
}


    
    public static void main(String args[]){
        int array[]={4,5,2,1,3};
       
        selectionsort(array);
        printarr(array);
        


    }

}
