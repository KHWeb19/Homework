let app = new Vue({
    el: '#app',
    data: {
        list: [
            { id: 1, name: '슬라임', hp: 30 },
            { id: 2, name: '고블린', hp: 70 },
            { id: 3, name: '사슴', hp: 50 },
            { id: 4, name: '리본돼지', hp: 80}
        ]
    },
    methods: {
        addMonster: function () {
            let max = this.list.reduce(function(a, b) {
                return a > b.id ? a : b.id
            }, 0)

            let rand = Math.floor(Math.random()*this.list.length)

            this.list.push({
                id: max + 1,
                name: this.list[rand].name,
                hp: this.list[rand].hp
            })
        },
        attackMonster: function (index) {
            this.list[index].hp -= 10
            if (this.list[index].hp <= 0) {
                this.list.splice(index, 1)
            }
        }
        // 광역 스킬 사용시 몬스터가 반씩없어짐
        // 스킬사용이랑 hp업데이트가 스레드이기때문
    }
})