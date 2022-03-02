//
function BoolTest (){
    let emptyObj = {}

    let add = function (a,b){
        return a+b;
    }

    //add라는 객체는 function이라는 객체를 담고 있음
    //메서드에 메서드를 하나 더를 담고 있음
    //다른말로 주소를 담고 있는 함수 포인터
    //add 객체에 function이 다 저장되어 있음

   function Fruit (){
        this.name = "tomato"
        this.color = "red"
        this.price = 3000

    }

    Fruit.prototype.getName = function (){
        return this.name
    }
    //prototype에 getName을 연결시킴.--> getName는 리턴이 this.name이며, 입력은 없음
    //자바의 경우는 지정을 해놓고 메서드를 써야한다면 파이썬이나 js는 runtime의 구동이 가능해서
    //필요에 따라 runtime의 메서드들을 추가해서 넣을 수 있음
    // Runtime : 프로그램이 실행되고 있는 때 존재하는 곳
    //메서드는 프로토타입에 해당되기 때문에 이런 프로토타입을 만들겠다라고 적혀있는 프로토타입임

    let fruit = new Fruit(); //객체를 만든다

    console.log("객체(emptyObj): " +emptyObj)
    //뭔가 있긴 있는데 비어있을 뿐
    if (emptyObj){
        console.log("true")
    } else {
        console.log("false")

    }

    console.log("객체(add) : " + add)
    //함수 형태를 객체화 시켜놓은 것도 있음
    if (add) {
        console.log("true")
    } else {
        console.log("false")
    }

    console.log("객체(fruit.name) : " + fruit.name)
    //new해놓은 것은 객체화 되어있음
    if (fruit.name) {
        console.log("true")
    } else {
        console.log("false")
    }

    console.log("fruit prototype getName: " + fruit.getName())
    console.log("fruit.toString: " + fruit.toString())
    //let을 사용해도 그냥 object파일이라고만 함(뭐가있지만 뭐가 있는지는 모름)
    //--->타입스크립트가 도입됨(모호성때문에)


}