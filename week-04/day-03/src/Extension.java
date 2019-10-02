import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  int add(int a, int b) {
    return (a + b);
  }

  List<Integer> maxOfThree(int a, int b, int c) {
    List<Integer> max = new ArrayList<>();
    if (a > b) {
      if (a == c){
        max.add(a);
        max.add(c);
      }else if (a > c){
        max.add(a);
        }else {
        max.add(c);
        }
    }else {
      if (b == c){
        max.add(b);
        max.add(c);
      }else if (b > c){
        max.add(b);
      }else {
        max.add(c);
      }
    }
    return max;
  }

  List<Integer> median(List<Integer> pool) {
    Collections.sort(pool);
    List<Integer> median = new ArrayList<>();
    if (pool.size() % 2 != 0){
       median.add(pool.get((pool.size()-1)/2));
    }else {
      median.add(pool.get((pool.size()-1)/2));
      median.add(pool.get((pool.size())/2));
    }
    return median;
  }

  boolean isVowel(char c) {
    return Arrays.asList('a','A','á','Á','e','E','é','É','i','I','o','O','ó','Ó','ö','Ö','ő','Ő','u','U','ü','Ü','ű','Ű').contains(c);
  }

  String translate(String hungarian) {
    String teve = "";
    for (int i = 0; i < hungarian.length(); i++) {
      if (isVowel(hungarian.charAt(i))){
        teve += hungarian.charAt(i) + "v" + hungarian.charAt(i);
      }else {
        teve += hungarian.charAt(i);
      }
    }
    return teve;
  }
}

// Check out the folder. There's a work file and a test file.

//  -  Run the tests, all 10 should be green (passing).
//  -  The implementations though are not quite good.
//  -  Create tests that'll fail, and will show how the implementations are wrong(You can assume that the implementation of join and split are good)
//  -  After creating the tests, fix the implementations
//  -  Check again, if you can create failing tests
//  -  Implement if needed