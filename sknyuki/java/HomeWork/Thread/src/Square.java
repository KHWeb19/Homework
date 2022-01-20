import java.util.Arrays;

public class Square {

    //사각형을 담당하는 클래스를 만든다.
    //가로변과 세로변의 변수를 만들어준다.
    //critical Section 영역의 정보를 만들어주기위해 가로 길이를 2로 나누어서 두개로 만들어준다.
    //(가로 길이1의 묶음) X (세로) 과 (가로 길이2의 묶음) X (세로) 을 critical Section 영역의 정보인 TotalSum에 번달아가며 추가해준다.





    protected double Height;
    protected double Width;
    protected static final double SplitNumber = 0.0001;


    public Square(double Height, double Width) {
        this.Height = Height;
        this.Width = Width;
    }
}
