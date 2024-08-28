package sdet_assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P1 {
    public static void main(String[] args) {
        
        String[] names = {"Mahesh", "Dinesh", "Kamalesh", "Sathish", "Suresh", "Ramesh"};
        int[] weightages = {1, 2, 0, -1, 3, 1};

        List<NameWeightage> positiveList = new ArrayList<>();
        List<NameWeightage> negativeList = new ArrayList<>();

       
        for (int i = 0; i < names.length; i++) {
            if (weightages[i] > 0) {
                positiveList.add(new NameWeightage(names[i], weightages[i]));
            } else if (weightages[i] < 0) {
                negativeList.add(new NameWeightage(names[i], weightages[i]));
            }
        }

        
        Collections.sort(positiveList, new Comparator<NameWeightage>() {
            public int compare(NameWeightage nw1, NameWeightage nw2) {
                return nw2.weightage - nw1.weightage;
            }
        });

       
        List<String> outputList = new ArrayList<>();

       
        for (NameWeightage nw : positiveList) {
            outputList.add(nw.name);
        }

       
        for (NameWeightage nw : negativeList) {
            outputList.add(nw.name);
        }

        
        System.out.println("Output name list: " + outputList);
    }

    
    static class NameWeightage {
        String name;
        int weightage;

        NameWeightage(String name, int weightage) {
            this.name = name;
            this.weightage = weightage;
        }
    }
}
