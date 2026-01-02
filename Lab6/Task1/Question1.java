package Task1;

import java.util.Scanner;

class ReadScore {
	private Scanner input;
	public ReadScore() {
		input = new Scanner(System.in);
	}
	public double[] readInput() {
		double[] score;
		System.out.print("Enter the number of the scores: ");
		int size = input.nextInt();
		score = new double[size];
		System.out.println("Enter the scores: ");
		for(int i=0; i<size; i++) {
			score[i] = input.nextDouble();
		}
		return score;
	}
}

class EstimateScore {

	private int numberPass;
	private double max, mean;
	private double[] score;
    
	public EstimateScore(double[] score) {
		this.score=score;
	}
	public void calculatePassNumber() {
		numberPass=0;
        for(int i=0;i<score.length;i++){
            if(score[i]>=60){
                numberPass++;
            }
        }
	}
	public void calculateMax() {
		max=score[0];
        for(int i=0;i<score.length;i++){
            if(score[i]>max){
                max=score[i];
            }

        }

	}
	public void calculateMean() {
		double sum=0;
        for(int i=0;i<score.length;i++){
            sum+=score[i];
            }
        mean=sum/score.length;
        

	}
	public void displayResults() {
		System.out.println("There're " + numberPass + " scores that are not less than 60");
		System.out.println("The maximum score is " + max);
		System.out.println("The mean value is " + mean);
	}
}

public class Question1 {
    public static void main(String[] args) {
		
        ReadScore r1=new ReadScore();
        double[] scores = r1.readInput();
        EstimateScore estimator = new EstimateScore(scores);
        estimator.calculatePassNumber();
        estimator.calculateMax();
        estimator.calculateMean();
        estimator.displayResults();    

    }
}
