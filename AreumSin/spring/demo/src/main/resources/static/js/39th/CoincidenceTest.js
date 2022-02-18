function CoincidenceTest(){
    let name = "Test"

    if(name){
        console.log("true")
    }else{
        console.log("false");
    }

    if(name === "Test"){
        console.log("equal")
    }else{
        console.log("not equal");
    }

    if(name === "go"){
        console.log("equal")
    }else{
        console.log("not equal");
    }

    if(name === null){
        console.log("equal")
    }else{
        console.log("not equal");
    }

    if(name === true){
        console.log("equal")
    }else{
        console.log("not equal");
    }

    if(name === undefined){
        console.log("equal")
    }else{
        console.log("not equal");
    }

    console.log("특이점 발생!")

    let a = 1;
    let b = "1";

    console.log(a == b) // 1이라는 것 자체에 집중을 함.
    console.log(a === b)  // Integer === String => 데이터 타입에서 사용함.

    console.log(null == undefined)
    console.log(null === undefined) //그릇이 비어있는거랑 그릇자체가 없는 차이

    console.log(true == 1)
    console.log(true === 1)
}