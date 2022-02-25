package lab6;

import java.util.*;

class Exercise4 {
  static HashMap<Integer,String> getStudents(HashMap<Integer,Integer>map){
    HashMap<Integer,String>mp=new HashMap<>();
    for(Map.Entry<Integer,Integer>e:map.entrySet()){
      int x=e.getValue();
      int y=e.getKey();
      if(x>=90)
      mp.put(y,"Gold");
      else if(x>=80)
      mp.put(y,"Silver");
      else 
      mp.put(y,"Bronze");
    }
    return mp;
  }
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<n;i++){
      int f=scan.nextInt();
      int s=scan.nextInt();
      map.put(f,s);
    }
    HashMap<Integer,String> s=getStudents(map);
    for(Map.Entry<Integer,String>e:s.entrySet()){
      System.out.println(e.getKey()+" "+e.getValue());
    }
  }
}