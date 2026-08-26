package Day6.HomeTask;

public class DistributeCandies {
    public int[] distributeCandies(int candies, int num_people) {

        int[] result = new int[num_people];
        int give = 1;

        while (candies > 0) {


            int person = (give - 1) % num_people;


            if (candies < give) {
                result[person] += candies;
                candies = 0;
            } else {
                result[person] += give;
                candies -= give;
            }

            give++;
        }

        return result;
    }
}
