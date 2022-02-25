package lab6;

import java.util.*;

class Exercise2 {
  static HashMap<Character,Integer> countChar(char[] str){
    HashMap<Character,Integer>map=new HashMap<>();
    for(char c:str)
    if(map.containsKey(c))
      map.put(c,map.get(c) + 1);
    else 
      map.put(c,1);
    return map;
  }


  public static void main(String[] args) {    
    Scanner scan=new Scanner(System.in);
    char[] n=scan.next().toCharArray();
    HashMap<Character,Integer>map=new HashMap<>();
    map=countChar(n);
    for(Map.Entry<Character,Integer>e:map.entrySet()){
      System.out.println(e.getKey()+" "+e.getValue());
    }
  }
}