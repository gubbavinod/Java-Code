package one123;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Duplicate {
    public static void main(String[] args){
        String str ="hfjfytdf";
        Set<Character> hashset = new HashSet<>();
        Set<Character> hashset1 = new HashSet<>();
        str.chars().mapToObj(c -> (char) c).filter(ch -> !hashset.add(ch)).forEach(System.out :: print);
        List<Character> list = str.chars().mapToObj(c -> (char) c).filter(ch -> !hashset1.add(ch)).collect(Collectors.toList());
        System.out.println(list);

    }
}
