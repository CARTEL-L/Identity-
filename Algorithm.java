package lcm;

public class Algorithm {

    public String shortedSentenceWord(String sentence){
        String[] get = sentence.split(" ");
        String sample = get[0];
        for (int index = 0; index < get.length; index++) {
                if(sample.length() > get[index].length()){
                    sample = get[index];
                }
            }

        return sample;
    }

    public int[] sortedSquares(int[] numbers){
        for(int index = 0; index < numbers.length; index++){
            numbers[index] = numbers[index] * numbers[index];
        }
        int holder = 0;
        for(int count = 0; count < numbers.length; count++){
            for(int counter = count; counter < numbers.length; counter++){
                if(numbers[count] > numbers[counter]){
                    holder = numbers[count];
                    numbers[count] = numbers[counter];
                    numbers[counter] = holder;
                }
            }
        }

        return numbers;
    }

}
