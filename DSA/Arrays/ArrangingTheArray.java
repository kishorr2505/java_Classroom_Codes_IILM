 import java.util.*;
 class ArrangingTheArray {
    

    public void Rearrange(int a[], int n) {
        // Your code goes here
        int negative=0;
        List<Integer>list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(a[i]<0){
                a[negative] = a[i];
                negative++;
                
            }else{
                list.add(a[i]);
            }
            
        }
        
        for(int num:list){
            a[negative++]= num;
        }
    }
 }