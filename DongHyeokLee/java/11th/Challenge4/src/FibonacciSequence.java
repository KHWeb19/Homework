public class FibonacciSequence {

    int sequence_start ,sequence_end;

    int[] sequence;
    int result;

    public FibonacciSequence(final int sequence_start ,final int sequence_end){
        this.sequence_start = sequence_start;
        this.sequence_end = sequence_end;

        sequence = new int[sequence_end];

    }

    public void sequenceGenerate(){

        sequence[0] = 1;
        sequence[1] = 1;

        for(int i = sequence_start ; i < sequence_end; i++){
            sequence[i] = sequence[i-1] + sequence[i-2];
            System.out.println(sequence[i]);
        }
        result = sequence[sequence_end-1];

    }

    @Override
    public String toString() {
        return "FibonacciSequence{" +
                "result=" + result +
                '}';
    }
}
