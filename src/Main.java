import java.util.*;

public class Main {


    public static List<Triple<Integer>> getTriple(List<Integer> list,Integer s){
        HashMap<Integer,Integer> map = getMapFromList(list);
        List<Triple<Integer>> listOfTriples = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                int a = list.get(i);
                int b = list.get(j);
//                System.out.print(a + ", " + b + "\t");
                int c = s - a - b;

                int flag = (c == a & c == b ) ? 2 : (c == a || c == b ) ? 1 : 0;
                if (map.containsKey(c)){
                    map.put(c,map.get(c) - flag);
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
        List<Integer> integerList = new LinkedList<>(Arrays.asList(1,2,3,4,5,2,2));
/*        System.out.println(integerList);
        System.out.println(getMapFromList(integerList));*/
        System.out.println(getTriple(integerList, 6));

      /*  HashMap<Integer,Integer> map = new HashMap();
        map.put(1,1);
        map.put(2,2);
        System.out.println(map.entrySet());
        for (Map.Entry<Integer,Integer> o : map.entrySet()) {

        }*/
    }
}
