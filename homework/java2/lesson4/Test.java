package homework.java2.lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3 , 4, 5);
       for (Integer x : list) {
           if (x == null) {
               System.out.println(-1);
           } else {
               System.out.println(x);
               return;

       }

      // List<Integer> l = list.stream()
      //         //.limit(1)
      //         .collect(Collectors.toList(x -> ));
      // System.out.println(l);
      // public int search(Integer l, Integer[] list){
      //     for (Integer x : list) {
      //                 if (x == null) {
      //                     System.out.println(-1);
      //                 } else {
      //                     System.out.println(x);
      //                     return;

                    }

  }



//   public int search(Integer n, Integer[] list){
//   }
//
