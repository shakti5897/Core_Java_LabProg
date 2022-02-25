package lab6;
import java.util.*;
public class Exercise6 {




	  static List<Integer> votersList(HashMap<Integer,Integer>map){
	    List<Integer> s=new ArrayList<>();
	    for(Map.Entry<Integer,Integer>e:map.entrySet()){
	      int x=e.getValue();
	      if(x>18)
	      s.add(e.getKey());
	    }
	    return s;
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
	    List<Integer> s=votersList(map);
	    for(int x:s){
	      System.out.println(x);
	    }
	  }

}
