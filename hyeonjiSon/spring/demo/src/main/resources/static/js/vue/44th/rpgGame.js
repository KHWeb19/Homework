let app = new Vue({
    el: '#app',
    data: {
        list: [
            { id: 1, name: '슬라임', hp: 100 },
            { id: 2, name: '고블린', hp: 200 },
            { id: 3, name: '사슴', hp: 150 },
            { id: 4, name: '리본돼지', hp: 250}
        ],
        name: '일단은 고정값: 키메라다!!!'
    },
    methods: {
        addMonster: function () {
            let max = this.list.reduce(function(a, b) {
                return a > b.id ? a : b.id
            }, 0)

            this.list.push({
                id: max + 1,
                name: this.name,
                hp: Math.ceil(Math.random()*(100*5))
                //랜덤 범위를 변수로 지정하면 더 좋았겠지만 일단 여기까지!
                //1. 그냥 Math.random()으로 값을 적으면 0~1 구간에서 부동 소수점의 난수를 생성한다.
                //2. Math.ceil로 올림을 해준다.
                //Math.floor를 쓰는 방법도 있는 듯?
            })
        },
        removeMonster: function (index) {
            this.list.splice(index, 1)
        },
        attackMonster: function (index) {
            this.list[index].hp -= 10
        }
    },
    beforeUpdate () {
        console.log('VDOM의 변화를 감지하는 루틴')

        let i
        for (i = 0; i < this.list.length; i++) {
            if (this.list[i].hp <= 0) {
                this.list.splice(i, 1)
            }
        }
    }
})