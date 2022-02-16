function LetVariable (){

    let num = 77;
    var num2 = 44;

    console.log("num = "+num);
    console.log("num2 = "+num2);
    console.log(" let 변수는 hoisting이라는 괴랄한 문제가 발생하지 않는다. ");

    const testNum = 33;

    console.log("testNum = "+ testNum);
    console.log("자바랑 마찬가지로 const는 선언과 동시에 값 설정이 완료되어야한다.");

    console.log("자바스크립트에서 var를 쓰면 안된다! 절대로");

    //let num = 33;
    var num2 = 33;
    console.log("호스팅: "+ num);
    console.log("호스팅: "+ num2);
}