package LongestSequenceOfZeros;

public class LongestSequenceOfZeros {

    public static void main(String[] args) {
        int x =  560;
        System.out.println(solution(x));
        System.out.println(solution2(x));

    }

    public static int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        System.out.println(binaryString);
        char[] binaries = binaryString.toCharArray();

        boolean startedSequence = false;

        int currentLength = -1;
        int maxLength = 0;

        for (char bit : binaries) {
            if (bit == '0') {
                if (startedSequence) {
                    currentLength++;
                }
            } else if (bit == '1') {
                if (startedSequence == false) {
                    startedSequence = true;
                } else {
                    if (maxLength < currentLength) {
                        maxLength = currentLength;
                    }
                }
                currentLength = 0;

            }
        }
        return maxLength;
    }


    // by omar fesal
    public static int solution2(int N) {
        String binaryString = Integer.toBinaryString(N);
        System.out.println(binaryString);
        char[] binaries = binaryString.toCharArray();

        boolean startedSequence = false;

        int currentLength = 0;
        int maxLength = 0;

        for (int x = 0; x < binaries.length; x++) {
            char bit = binaries[x];
            if (bit == '0') {
                if (x == binaries.length - 1) {
                    currentLength++;
                    if (maxLength < currentLength) {
                        maxLength = currentLength;
                        break;
                    }
                }
                if (startedSequence == false){
                    startedSequence = true;
                    currentLength = 1;
                }else{
                    currentLength++;
                }
            }else if(bit == '1') {
                if(startedSequence == true){
                    startedSequence = false;
                    if(maxLength < currentLength) {
                        maxLength = currentLength;
                        currentLength = 0;
                    }
                }
            }
        }

        return maxLength;
    }


}

