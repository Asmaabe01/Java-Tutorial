package task5;

import java.io.*;
import java.util.*;

public class TransposeScores {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/HP/Desktop/A_S3/Java/Labs/Lab9/task5/scores.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("courses.txt"));
        
        String line;
        String[] courseNames = reader.readLine().split("\\s+");
        
        List<String> studentNames = new ArrayList<>();
        List<List<Double>> scores = new ArrayList<>();
        
        while ((line = reader.readLine()) != null) {
            String[] tokens = line.split("\\s+");
            studentNames.add(tokens[0]);
            
            List<Double> studentScores = new ArrayList<>();
            for (int i = 1; i < tokens.length; i++) {
                studentScores.add(Double.parseDouble(tokens[i]));
            }
            scores.add(studentScores);
        }
        
        reader.close();
        
        writer.write("COURSEs");
        for (String studentName : studentNames) {
            writer.write("\t" + studentName);
        }
        writer.newLine();
        
        for (int i = 0; i < courseNames.length - 1; i++) {
            writer.write(courseNames[i + 1]);
            double courseTotal = 0;
            
            for (int j = 0; j < studentNames.size(); j++) {
                Double score = scores.get(j).get(i);
                writer.write("\t" + score);
                courseTotal += score;
            }
            writer.newLine();
            
            double courseAverage = courseTotal / studentNames.size();
            System.out.println("Average for " + courseNames[i + 1] + ": " + courseAverage);
        }

        writer.write("\nAverage Scores:");
        for (int i = 0; i < studentNames.size(); i++) {
            double studentTotal = 0;
            for (int j = 0; j < scores.get(i).size(); j++) {
                studentTotal += scores.get(i).get(j);
            }
            double studentAverage = studentTotal / courseNames.length - 1;
            writer.write("\n" + studentNames.get(i) + ": " + String.format("%.2f", studentAverage));
        }
        
        writer.close();
    }
}
