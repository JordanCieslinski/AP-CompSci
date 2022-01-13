package Assignment3;

public class Quizzes {
    private int[] scoresArray;

    public Quizzes(int[] q) {
        scoresArray = q;
    }

    public int[] getDayScores(String dayOfWeek) {
        int[] ans = new int[scoresArray.length / 5];
        int count = 0;
        switch (dayOfWeek) {
            case "Monday":
                for (int i = 0; i < scoresArray.length; i += 5) {
                    ans[count] = scoresArray[i];
                    count++;
                }
                break;
            case "Tuesday":
                for (int i = 1; i < scoresArray.length; i += 5) {
                    ans[count] = scoresArray[i];
                    count++;
                }
                break;
            case "Wednesday":
                for (int i = 2; i < scoresArray.length; i += 5) {
                    ans[count] = scoresArray[i];
                    count++;
                }
                break;
            case "Thursday":
                for (int i = 3; i < scoresArray.length; i += 5) {
                    ans[count] = scoresArray[i];
                    count++;
                }
                break;
            case "Friday":
                for (int i = 4; i < scoresArray.length; i += 5) {
                    ans[count] = scoresArray[i];
                    count++;
                }
                break;
        }
        return ans;
    }

    public String bestDay(){
        int bestDay = Integer.MIN_VALUE;
        int maxAvg = Integer.MIN_VALUE;
        String [] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        for(int i = 0; i < daysOfWeek.length; i++){
            int sum = 0;
            int avg = 0;
            for(int j = 0; j < getDayScores(daysOfWeek[i]).length; j++){
                sum += getDayScores(daysOfWeek[i])[j];
            }
            avg = sum/getDayScores(daysOfWeek[i]).length;
            if(avg > maxAvg){
                maxAvg = avg;
                bestDay = i;
            }
            
        }
        return daysOfWeek[bestDay];
    }
}
