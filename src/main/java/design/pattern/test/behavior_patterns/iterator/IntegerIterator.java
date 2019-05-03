package design.pattern.test.behavior_patterns.iterator;

import java.util.List;

/**
 * Through Iterator pattern can get each value of Array
 **/
public class IntegerIterator {

    private List<Integer> list;
    private int index;

    public IntegerIterator(List<Integer> list) {
        this.list = list;
    }

    public boolean hasNext(){
        if(++index < list.size()){
            return true;
        }
        return false;
    }

    public Integer next(){
        return list.get(index);
    }
}