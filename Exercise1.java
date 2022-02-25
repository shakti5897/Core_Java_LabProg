package lab6;

import java.util.*;

class Exercise1 {
  public static List<Integer> getValues(HashMap<String,Integer> map){
    List<Integer>list=new ArrayList<Integer>();
    for(Map.Entry<String,Integer> e:map.entrySet()){
    	//if we do get key then w eget key but if we do value then we get value
      list.add(e.getValue());
    }
    Collections.sort(list);
    return list;
  }

  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    HashMap<String,Integer>map=new HashMap<>();
    while(n>0){
      String str=scan.next();
      int x=scan.nextInt();
      map.put(str,x);
      n--;
    }
    System.out.println(getValues(map));
  }
}