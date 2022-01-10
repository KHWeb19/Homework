public class M6Class {
    int num;
    int Max;
    public M6Class(int Max,int num){
        for(int i=0; i<Max; i++){
            if(i%num==0){
                System.out.printf("%d는 %d의 배수입니다\n",i,3);
            }
        }
    }
}
