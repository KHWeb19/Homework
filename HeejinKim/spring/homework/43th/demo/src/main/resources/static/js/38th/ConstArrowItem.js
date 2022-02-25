//constArrowItem () {}  과 같음

const ConstArrowItem = () => {
    const itemArr = [
        {
            name: "berry",
            price:3000,
            count:1,
        },
        {
            name:"blueberry",
            price:2000,
            count:2,
        },
    ]
    /*
    화살표 함수는 함수를 선언할 때 this 자체에 맵핑될 객체가 정적으로 결정됨
    화살표 함수의 this는 언제나 정적으로 불변임을 의미함
    내부에서 변수값을 바꾸더라도 화살표를 쓰면 신경 안쓴다는 것을 의미하며
    화살표가 아닌 애들은 내부값의 변경에 영향을 받음을 의미함

    합수 내부를 변경할수 없을 때는 arrow를 사용
    */

    for(let i=0; i<2; i++){
        console.log("name: " + itemArr[i].name + " price: " + itemArr[i].price +
         " count: " + itemArr[i].count)
    }

}