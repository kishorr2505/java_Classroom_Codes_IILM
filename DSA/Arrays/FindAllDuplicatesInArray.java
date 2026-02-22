import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer>list = new ArrayList<>();

        for(int num:nums){
            if(set.contains(num)){
                list.add(num);
            }

            set.add(num);
        }

        return list;
    }
}

