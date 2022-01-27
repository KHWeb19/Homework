public class Deviation {
 static float dev;
 public void initDeviationScore(){
  dev=(float)Math.sqrt(Variance.var);
  System.out.printf("표준편차값은 %f입니다.\n",dev);
 }
 }

