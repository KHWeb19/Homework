public class MyCat {
    int age;
    float weight;
    final String defaultSound = "Meow";

    final int FEED = 1;
    final int TRAINING = 2;
    final int RANGE = TRAINING - FEED + 1;

    final int SCHEDULE_NUM = 3;

    int scheduleNum;

    int simulationCnt;

    //inintMyCat안에 있는(int age float weight를 뭐하러 넣어줄까 그냥  int age = 3  float weight = 8.2f 를 만들면
    //안되는 걸까?
    public void initMyCat (int age, float weight) {
        this.age = age;
        this.weight = weight;

        simulationCnt = 0;
    }
    // 그럼 initMyCat 명령문 부터 쭈욱 내려가서 명령문을 읽는 건가?
    private void feed () {
        System.out.println("고오급 사료를 먹습니다!");

        weight += 0.1f;

        System.out.println("운동 하세요!");
    }
    private void warningMessage () {
        System.out.println(defaultSound);

        if (weight > 8) {
            System.out.printf("운동 안하면 고양이 비만 됩니다: %.1f\n", weight);
        } else if (weight < 6) {
            System.out.printf("너무 많이 빼도 위험합니다: %.1f\n", weight);
        } else {
            System.out.printf("현재 고양이는 정상입니다: %.1f\n", weight);
        }
    }
    private void training () {
        weight -= 0.1f;

        System.out.println("몸무게를 조금 뺀것 같습니다!");
    }
    //왜이 getRandomPattren()에서는 retuen을 써주는 걸까?
    private int getRandomPattern () {
        return (int) (Math.random() * RANGE + FEED);
    }

    public void simulation () {
        boolean endFlag = false;
        int cnt = 0;

        while (true) {
            System.out.println("오늘은 무엇을 할까요 ? (하루 일과는 3가지를 선택합니다)");

            for (int i = 0; i < SCHEDULE_NUM; i++) {
                // 이거는 1~2까지 랜덤으로 나오는 조건이니깐 FOOD Traning둘중 하나를 무작위로 선택하는건가?
                scheduleNum = getRandomPattern();

                switch (scheduleNum) {
                    case FEED:
                        feed();
                        break;
                    case TRAINING:
                        training();
                        break;
                }

                //cnt++무한 반복인가? 365까지 반복해야하니
                warningMessage();
                cnt++;

                if (cnt > 365) {
                    System.out.println("냥이는 가족들과 함께 오래오래 햄볶하게 살았답니다 ^^");
                    // endFlag이게 왜 필요한거지 그냥 break나면 끝나는거 아닌가?
                    endFlag = true;
                    break;
                } else if (weight > 12.0f) {
                    System.out.println("병원 ㅠ");
                    endFlag = true;
                    break;
                } else if (weight < 5.1f) {
                    System.out.println("병원 가요 ㅠ");
                    endFlag = true;
                    break;
                }
            }
            //if(endFlag)가 왜필요하지 평상시에는 false이었다가 위에있는 if문이 끝나면 true로 바뀌어 break문이 멈추는 건가?
            if (endFlag) {
                break;

            }
        }
    }

    private boolean checkSimulation () {
        boolean checkSim = false;

        // simulationCnt++ 이게 왜필요하지? %d 일차!메세지는 나오지 않는데 1일차 2일차 ~ 365일차까지 나오게 할려고 한건가?
        simulationCnt++;
        System.out.printf("%d 일차!", simulationCnt);

        // 이걸왜 한번더 쓰는거지? 위에 한번쓰지 않았나? 기능은 똑같은것같은데
        if (simulationCnt > 365) {
            System.out.println("냥이는 가족들과 함께 오래오래 햄볶하게 살았답니다 ^^");
        } else if (weight > 12.0f) {
            System.out.println("병원 ㅠ");
        } else if (weight < 5.1f) {
            System.out.println("병원 가요 ㅠ");
        } else {
            //return이 정확히 무슨기능이 있는거지? 이것도 위에 endFlag같은 기능으로쓴건가?
            checkSim = true;
            return checkSim;
        }

        return checkSim;
    }

    //이것도 simulation1의 반복인데 이것을 왜쓴거지?
    public void simulation2 () {
        boolean endFlag = false;
        int cnt = 0;

        while (checkSimulation()) {
            System.out.println("오늘은 무엇을 할까요 ? (하루 일과는 3가지를 선택합니다)");

            for (int i = 0; i < SCHEDULE_NUM; i++) {
                scheduleNum = getRandomPattern();

                switch (scheduleNum) {
                    case FEED:
                        feed();
                        break;
                    case TRAINING:
                        training();
                        break;
                }

                warningMessage();
            }
        }
    }
}