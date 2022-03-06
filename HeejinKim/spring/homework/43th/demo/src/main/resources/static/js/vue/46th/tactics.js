let app = new Vue({
    el: '#app',
    data: {
        monsterBook: [
           { monsterId: 1, name: '슬라임', hp: 50, exp: 10, dropMoney: 5 },
           { monsterId: 2, name: '고블린', hp: 80, exp: 15, dropMoney: 10 },
           { monsterId: 3, name: '사슴', hp: 100, exp: 25, dropMoney: 10 },
           { monsterId: 4, name: '리본돼지', hp: 100, exp: 15, dropMoney: 25 },
           { monsterId: 5, name: '오크', hp: 150, exp: 45, dropMoney: 30 },
           { monsterId: 6, name: '멧돼지', hp: 150, exp: 30, dropMoney: 45 },
           { monsterId: 7, name: '스켈레톤', hp: 200, exp: 70, dropMoney: 55 },
           { monsterId: 8, name: '고블린매지션', hp: 200, exp: 150, dropMoney: 100 },
           { monsterId: 9, name: '소', hp: 500, exp: 200, dropMoney: 150 },
           { monsterId: 10, name: '뱀', hp: 350, exp: 100, dropMoney: 250 },
           { monsterId: 11, name: '곰', hp: 1000, exp: 500, dropMoney: 350 },
           { monsterId: 12, name: '토끼', hp: 50, exp: 5, dropMoney: 100 },
           { monsterId: 13, name: '호랑이', hp: 800, exp: 400, dropMoney: 300 },
           { monsterId: 14, name: '스켈레톤 아처', hp: 150, exp: 150, dropMoney: 5 },
           { monsterId: 15, name: '리치', hp: 2000, exp: 2000, dropMoney: 25 },
           { monsterId: 16, name: '죽음의 군주', hp: 100000, exp: 10000, dropMoney: 100000 },
           { monsterId: 17, name: '골렘', hp: 2000, exp: 3500, dropMoney: 500 },
           { monsterId: 18, name: '와이번', hp: 3500, exp: 3000, dropMoney: 200 },
           { monsterId: 19, name: '드레이크', hp: 20000, exp: 5000, dropMoney: 1000 },
           { monsterId: 20, name: '구울', hp: 120, exp: 20, dropMoney: 1 },
           { monsterId: 21, name: '오우거', hp: 1000, exp: 500, dropMoney: 50 },

           { monsterId: 999, name: '드래곤', hp: 100000, exp: 10000, dropMoney: 100000 },
           { monsterId: 1000, name: '옐로 드래곤', hp: 1000000, exp: 20000, dropMoney: 200000 },
           { monsterId: 1001, name: '그린 드래곤', hp: 10000000, exp: 40000, dropMoney: 400000 },
           { monsterId: 1002, name: '레드 드래곤', hp: 100000000, exp: 80000, dropMoney: 800000 },
           { monsterId: 1003, name: '블루 드래곤', hp: 1000000000, exp: 160000, dropMoney: 1600000 },
           { monsterId: 1004, name: '블랙 드래곤', hp: 10000000000, exp: 300000, dropMoney: 3000000 },
           { monsterId: 1005, name: '골드 드래곤', hp: 100000000000, exp: 1000000, dropMoney: 10000000 },
           { monsterId: 1005, name: '데스 드래곤', hp: 999999999999, exp: 2000000, dropMoney: 20000000 },
           { monsterId: 1007, name: '스텔스 드래곤', hp: 9999999999999, exp: 4000000, dropMoney: 40000000 },
           { monsterId: 1008, name: '리무르', hp: 999999999999999999999999999, exp: 1, dropMoney: 1 },
                    ],
        list: [
            { id: 1, monsterId: 1, name: '슬라임', hp: 50 },
            { id: 2, monsterId: 2,name: '고블린', hp: 80 },
            { id: 3, monsterId: 3,name: '사슴', hp: 100 },
            { id: 4, monsterId: 4,name: '리본돼지', hp: 100},
            { id: 5, monsterId: 1,name: '슬라임', hp: 50 }, //몬스터 아이디는 고유하지만 여기는 중복 가능함 //생겨난 생물의 아이디라서
        ],
        name: '고정값:슬라임',
        randomNumber: 0
    },
    methods: {
        generateRandom: function () {
            this.randomNumber = Math.floor(Math.random() * 10) + 1;
        },

        addMonster: function () {
            let max = this.list.reduce(function(a, b) {
                return a > b.id ? a : b.id
            }, 0)

            let randNum = Math.floor(Math.random()* this.monsterBook.length) //+1 배열이니까 할 필요 없음

            this.list.push({
                id: max + 1,
                monsterId:randNum,
                name:this.monsterBook[randNum].name,
                hp:this.monsterBook[randNum].hp

            })
        },

        addManyMonsters: function (){

            for(let i=0; i < 100; i++){
                        let max = this.list.reduce(function(a,b){
                             return a >b.id ? a : b.id
                        },0 )

                let idx = Math.floor(Math.random()* this.monsterBook.length)

                this.list.push({
                    id: max + 1,
                    monsterId:idx,
                    name:this.monsterBook[idx].name,
                    hp:this.monsterBook[idx].hp

                })
            }
        },

        removeMonster: function (index) {
            this.list.splice(index, 1)
        },

        attackMonster: function (index) {
            this.list[index].hp -= BigInt(10)
        },

        myStealthDarkDragonFear: function () {
            console.log("내안의 보이지 않는 어둠의 흑염룡이 울부짖었다!!! " +
                        "스텔스 다크 플레임 드래곤 피어!!!!!")

            for (let i = 0; i < this.list.length; i++) {
               // this.list[i].hp = parseInt(this.list[i].hp - 1000)
               this.list[i].hp = BigInt(this.list[i].hp) - BigInt(1000)
            }
        }

          //myStealthDarkDragonFear가 돌면서 -hp를 떨어뜨리고 beforeUpdate 되면서 음수인거 삭제함
    },    //쓰레드로 돌아가는 거라 적당히 돌게됨 만약 결과를 기다리려면 await를 사용해야함--반응속도가 느려짐
          //2개의 스레드가 돌고 있는중에 -hp가 떨어지는 도중에 변화가 감지되었다고 beforeUpdate가 돌아서
          // parseInt(this.list[i].hp - 1000)이 놓치는 케이스가 존재함
          //myStealthDarkDragonFear를 처리하는 도중에 --얘가 업데이트보다 처리속도가 늦어서 발생하는 문제
          //beforeUpdate가 실행되면 값이 떨어진 애들만 처리되고 다 처리되었다고 생각함


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