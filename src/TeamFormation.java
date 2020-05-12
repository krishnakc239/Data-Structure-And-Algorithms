import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeamFormation {
    public static void main(String[] args) {
        List<Integer> score =new ArrayList<>(Arrays.asList(10,20,10,15,5,30));
        int team_size = 2;
        int k =3;
        long sum = teamFormation(score,team_size,k);
        System.out.println(" sum : "+ sum);
    }

    public static long teamFormation(List<Integer> score, int team_size, int k){
        List<Integer> resultList = new ArrayList<>();

            if ( score.size() < k){
                return score.stream().reduce(0,Integer::sum);
            }
            while (resultList.size() != team_size) {
                int currentmax = Integer.MIN_VALUE;
                for (int i = 0; i < k; i++) {
                    System.out.println(" score.get(i) : "+ score.get(i) +",  "+ " current max ; "+ currentmax);
                    if (score.get(i) > currentmax) {
                        currentmax = score.get(i);
                    }
                }
                System.out.println(" max score: "+ currentmax);
                resultList.add(currentmax);
                score.remove(new Integer(currentmax));
                System.out.println("result List : "+ resultList);
            }
        return resultList.stream().reduce(0,Integer::sum);
    }
}
