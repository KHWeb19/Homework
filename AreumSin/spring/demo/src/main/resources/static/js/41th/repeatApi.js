function repeatApiTest(){

    let arr = [1, 3, 8, 10, 7, 11, 19, 77, 33];
    let txt = "";

    arr.forEach(testFunc)

    function testFunc(value){
        txt = txt + value + "<br/>"
    }

    console.log(txt)

    let sequence = [1, 2, 3, 4, 5];
    let squareSeq = sequence.map(squareFunc);

    function squareFunc(value){
        return value*value;
    }

    console.log("sequence: "+ sequence)
    console.log("squareSeq: "+ squareSeq)

    let over3 = sequence.filter(filterFunc);

    function filterFunc(value){
        return value > 3;
    }

    console.log("3보다 큰 것: "+ over3);

    let reduceNum = sequence.reduce(reduceFunc);

    function reduceFunc (total, value){
        console.log("total: "+total+"value: "+value);
        return total + value;
    }

    console.log(reduceNum)

    let reduceTest = sequence.reduce(reduceFunc, 777);
    console.log(reduceTest);

    console.log("sequence: "+sequence)

    let andTest = sequence.every(andTestFunc);

    function andTestFunc(value){
        return value > 3
    }

    console.log("andTest : "+ andTest)

    let orTest = sequence.some(orTestFunc);

    function orTestFunc (value){
        return value > 3;
    }

    console.log("orTest : "+ orTest);

    let vendors = ["kai", "joingin", "baekhyen", "suho", "d.o", "sehun", "xiumin"];
    let idx = vendors.lastIndexOf("xiumin");

    console.log(vendors);
    console.log(idx);

    let firstFind = sequence.find(firstFindFunc);

    function firstFindFunc(value) {
        return value > 3
    }

    console.log(firstFind);

    let firstFindIdx = squareSeq.findIndex(firstFindIdxFunc);

    function firstFindIdxFunc(value){
        return value > 5;
    }

    console.log("sequence"+ squareSeq);
    console.log(firstFindIdx);

}