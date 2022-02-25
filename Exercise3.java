package lab6;

import java.util.*;

class Exercise3 {
  static HashMap<Integer,Integer> getSquares(int[] str){
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int c:str)
      map.put(c,c*c);
    return map;
  }
  public static void main(String[] args) {    
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=scan.nextInt();
    }
    HashMap<Integer,Integer>m=new HashMap<>();
    m=getSquares(arr);
    for(Map.Entry<Integer,Integer>e:m.entrySet())
    System.out.println(e.getKey()+" "+e.getValue());

  }
} 