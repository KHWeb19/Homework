function SpreadTest(){

    let arrColor = ["red", "green", "blue"];
    let newArrColor = [...arrColor, "purple"]; // ...을 통해서 풀어헤칠 수 있다.

    console.log(arrColor);
    console.log(newArrColor);

    let arrNum = [2, 3, 4];
    let newArrNum = [1, ...arrNum, 5];

    console.log(arrNum);
    console.log(newArrNum);

    function arrPrint (a, b, c){
        console.log(a)
        console.log(b)
        console.log(c)
    }

    // 배열도 가능함.
    let arr = [1,2,3]

    console.log(arr)
    arrPrint(...arr) // 순서대로 넣는다.

    function arrSpreadingPrint (a, b, c, ...remain){
        console.log(a)
        console.log(b)
        console.log(c)
        console.log(remain) // 번거롭지만 다 따로 따로 나오기를 바란다면 따로 찍어줘야한다.
    }

    let arrSpread = [1,2,3,4,5,6,7,8,9]

    console.log(arrSpread)
    arrSpreadingPrint(...arrSpread)

    //문자열도 가능함.
    let arrStr = [..."xyz"]

    console.log(arrStr)
    arrPrint(...arrStr)

    let testArr = ["a", "b", "c"]
    testArr.push(...["d","e"])

    console.log(testArr)

    arr = [10, 20, 40, 90, 30]

    console.log(Math.max(...arr))

    //객체도 가능함.
    let newObj = {
        name: "newObj",
        number: 3
    }

    let newObj2 = {
        nick: "Tick"
    }

    let newObj3 = {...newObj, ...newObj2}

    console.log(newObj3)
    console.log(newObj3.name)
    console.log(newObj3.number)
    console.log(newObj3.nick)

    // 자바는 html에 대응이 되지 않는다.
    // 서비스 작업을 할때는 생산성을 제대로 생각하고 해야한다!

    // 리액트가 뷰보다 먼저 나왔다.
    // 리액트의 단점을 보완해서 뷰가 나왔다.
    // 리액트도 생산성이 낮지는 않다.
}