public class multiArray {

    private final int rowLength;
    private final int  columnLength;

    private final String[][] myArray;

    public multiArray(int num1, int num2){
        this.rowLength = num1;
        this.columnLength = num2;

        this.myArray = new String[this.rowLength][this.columnLength];

        for (int i =0; i< this.rowLength; i++){
            for (int j=0; j <this.columnLength; j++){
                this.myArray[i][j] = "myArray[" + i + "]" + "[" + j + "]";
            }
        }

            }

    public void printMyArray(){
        for (int i =0; i< this.rowLength; i++){
            for (int j=0; j <this.columnLength; j++){
                System.out.println(this.myArray[i][j]);
            }
        }
    }
}



