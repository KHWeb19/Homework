new Vue({
    el: '#app',
    data: {
        list: [
            { id: 1, name: '슬라임', hp: 100 },
            { id: 2, name: '고블린', hp: 200 },
            { id: 3, name: '사슴', hp: 150 },
            { id: 4, name: '리본돼지', hp: 250}
        ],
        name: ' ',
    },
    methods: {
        addMonster: function (){
            let max = this.list.reduce(function (a, b){
               return a > b.id ? a : b.id;
            },0)
            // 200 ~ 500
            // 500 - 200 +1
            let mHp = Math.floor(Math.random()* 301 + 200);
            // Math.floor 소수점 1번째 자리를 버림하여 정수를 리턴

            // 0, 1(0.di)
            // 1, 2
            // 2, 3
            // 3, 4
            // 4
            this.list.push({
                id: max+1,
                name: this.name,
                hp: mHp,
            })
        },
        hitMonster: function(index) {
            this.list[index].hp -= 10;
        },
    },
    beforeUpdate () {
        console.log('VDOM의 변화를 감지하는 루틴 -> 화면에 값이 변화하는걸 감지')

        let i
        for (i = 0; i < this.list.length; i++) {
            if (this.list[i].hp <= 0){
                this.list.splice(i,1);
            }
        }
    }
})