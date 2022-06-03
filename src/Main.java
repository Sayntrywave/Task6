import java.util.*;

public class Main {


    public static List<Triple<Integer>> getTriple(List<Integer> list,Integer s){
        HashMap<Integer,Integer> map = getMapFromList(list);
        List<Triple<Integer>> listOfTriples = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                int a = list.get(i);
                int b = list.get(j);
                int c = s - a - b;
                if(a == b){
                    if(map.get(a) == 1){
                        continue;
                    }
                }
//                System.out.print(a + ", " + b + "\t");
                int flag = (c == a & c == b ) ? 2 : (c == a || c == b ) ? 1 : 0;
                if (map.containsKey(c) && (map.get(c) - flag > 0)){
                    if (map.get(c) > 0) {
                        listOfTriples.add(new Triple<>(a, b, c));
                    }
//                    map.put(c, map.get(c) - 1);
                 }
            }
//            System.out.println();
        }


        return listOfTriples;
    }

    public static <T>HashMap<Integer,Integer> getMapFromList(List<Integer> list){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (Integer t : list) {
            if(map.containsKey(t)){
                map.put(t,map.get(t) + 1);
            }
            else {
                map.put(t,1);
            }
        }
        return map;
    }


    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>(Arrays.asList(1,2,3,4,5,9));
        System.out.println(getTriple(integerList, 6));
        System.out.println(getTriple(integerList, 12));



    }
}
