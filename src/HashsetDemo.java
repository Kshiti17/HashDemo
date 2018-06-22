import java.util.*;
class HashsetDemo{
 public static void main(String args[]){
  
 HashSet<String> hset=new HashSet<String>(); 
 hset.add("Riya");                 
 hset.add("Nisha");
 hset.add("Priya");
 hset.add("Riya");
 hset.add(null);
 
 Iterator<String> itr=hset.iterator();
 while(itr.hasNext()){
 System.out.println(itr.next());
 }
 }
 }
