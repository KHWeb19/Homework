let app = new Vue({
    el: '#app',
    data: {
        monsterBook: [
            { monsterId: 1, name: '슬라임', hp: 100, exp: 10, dropMoney: 5 },
            { monsterId: 2, name: '고블린', hp: 80, exp: 15, dropMoney: 15 },
            { monsterId: 3, name: '사슴', hp: 100, exp: 25, dropMoney: 10 },
            { monsterId: 4, name: '리본돼지', hp: 100, exp: 15, dropMoney: 25 },
            { monsterId: 5, name: '오크', hp: 150, exp: 30, dropMoney: 40 },
            { monsterId: 6, name: '멧돼지', hp: 150, exp: 30, dropMoney: 45 },
            { monsterId: 7, name: '스켈레톤', hp: 200, exp: 70, dropMoney: 55 },
            { monsterId: 8, name: '코블린매지션', hp: 200, exp: 150, dropMoney: 100 },
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
            { monsterId: 19, name: '드레이크', hp: 10000, exp: 5000, dropMoney: 1000 },
            { monsterId: 20, name: '구울', hp: 120, exp: 20, dropMoney: 1 },
            { monsterId: 21, name: '오우거', hp: 1000, exp: 500, dropMoney: 50 },

            { monsterId: 999, name: '드래곤', hp: 100000, exp: 10000, dropMoney: 100000 },
            { monsterId: 1000, name: '옐로 드래곤', hp: 1000000, exp: 20000, dropMoney: 200000 },
            { monsterId: 1001, name: '그린 드래곤', hp: 10000000, exp: 40000, dropMoney: 400000 },
            { monsterId: 1002, name: '레드 드래곤', hp: 100000000, exp: 80000, dropMoney: 800000 },
            { monsterId: 1003, name: '블루 드래곤', hp: 1000000000, exp: 160000, dropMoney: 1600000 },
            { monsterId: 1004, name: '블랙 드래곤', hp: 10000000000, exp: 300000, dropMoney: 3000000 },
            { monsterId: 1005, name: '콜드 드래곤', hp: 100000000000, exp: 1000000, dropMoney: 1000000 },
            { monsterId: 1005, name: '데스 드래곤', hp: 99999999999999, exp: 2000000, dropMoney: 2000000 },
            { monsterId: 1006, name: '스텔스 드래곤', hp: 999999999999999, exp: 4000000, dropMoney: 5000000 },
            { monsterId: 1006, name: '리무르', hp: 99999999999999999999999, exp: 1, dropMoney: 9999999999999 },
        ],
        list: [
            { id: 1, monsterId: 1, name: '슬라임', hp: 50 },
            { id: 2, monsterId: 2, name: '고블린', hp: 80 },
            { id: 3, monsterId: 3,name: '사슴', hp: 100 },
            { id: 4, monsterId: 4, name: '리본돼지', hp: 100},
            { id: 5, monsterId: 1, name: '슬라임', hp: 50 },
        ],
        name: '알아서 생성됨',
        randomNumber: 0,
        characterStatus:{ // 캐릭터 상태 정보
            level: 1,
            hp: 70,
            mp: 30,
            itemAtk: 0,
            defaultAtk: 10,
            atk: 10,
            str: 10,
            intelligence: 10,
            dex: 10,
            vit: 10,
            def: 10,
            men: 0,
            totalLevelBar: 10,
            currentLevelBar: 0,
            money: 0,
            selectJob: '모험가',
        },
        shopView: false,
        shopList: [],
        shopListValue: [],
        itemBook: [
            { name: 'HP 포션 I', price: 50, effect: { desc: 'hp 200 회복', amount: 200 }},
            { name: 'HP 포션 II', price: 200, effect: { desc: 'hp 700 회복', amount: 700 }},
            { name: '낡은 검', price: 500000, effect: { desc: '무기 공격력 100', atk: 100 }},
            { name: '검', price: 2500000, effect: { desc: '무기 공격력 200', atk: 200 }},
            { name: '강철 검', price: 15000000, effect: { desc: '무기 공격력 350', atk: 350 }},
            { name: '발라리아 강철 검', price: 150000000, effect: { desc: '무기 공격력 500', atk: 500 }},
            { name: '화열검', price: 1500000000, effect: { desc: '무기 공격력 700', atk: 700 }},
            { name: '칠지도', price: 150000000000, effect: { desc: '무기 공격력 1000', atk: 1000 }},
        ],
        inventoryView: false,
        myInventory: [],
        myInventoryValue: []
    },
    methods: {
        shuffleShopList: function () {
            if (!this.shopView) { // 이게 뭘까? // 해제하면 다 없어지는 부분! 
                this.shopListValue = []
                console.log(this.shopListValue)
            }

            for (let i = 0; i < 10; i++) {
                let randIdx = Math.floor(Math.random() * this.itemBook.length)
                this.shopList[i] = this.itemBook[randIdx]
            }
        },
        calcBuy: function(){
          let tmpSum = 0;

          console.log('calcBuy() : '+ this.shopListValue.length); // 4 (선택한 아이템 갯수)
          console.log('shopList Length : '+ this.shopList.length); // 10 (보여지는 아이템 갯수)

            for (let i = 0; i < this.shopListValue.length; i++) { // 4번 반복
                console.log('외곽 루프 - 선택 값: '+ this.shopListValue[i]);

                for (let j = 0; j < this.shopList.length; j++) {
                    console.log('내부 루프')

                    if (this.shopListValue[i] === j) {
                        console.log(this.shopListValue[i])
                        tmpSum += this.shopList[j].price
                        break
                    }
                }
            }

            if(this.characterStatus.money - tmpSum >= 0 ){
                this.characterStatus.money -= tmpSum;

                for (let i = 0; i < this.shopListValue.length; i++) {
                    this.myInventory.push({
                        name: this.shopList[this.shopListValue[i]].name,
                        effect: this.shopList[this.shopListValue[i]].effect,
                    })
                }
            }else{
                alert('돈없다 돈 벌어와!');
            }
        },
        equipItem () {
            let tmpSum = 0

            console.log('equipItem(): ' + this.myInventoryValue.length)
            console.log('myInventory Length: ' + this.myInventory.length)

            for (let i = 0; i < this.myInventoryValue.length; i++) {
                console.log('외곽 루프 - 선택된 값: ' + this.myInventoryValue[i])

                for (let j = 0; j < this.myInventory.length; j++) {
                    console.log('내부 루프')

                    if (this.myInventoryValue[i] === j) {
                        console.log('매칭 완료')
                        tmpSum += this.myInventory[j].effect.atk
                        break
                    }
                }
            }

            this.characterStatus.itemAtk = tmpSum
            this.characterStatus.atk = this.characterStatus.defaultAtk + tmpSum
        },
        generateRandom: function () {
            this.randomNumber = Math.floor(Math.random() * 10) + 1;
        },
        addMonster: function () {
            let max = this.list.reduce(function (a, b) {
                return a > b.id ? a : b.id
            }, 0)
            console.log(max);
            let randNum = Math.floor(Math.random() * this.monsterBook.length) + 1

            this.list.push({
                id: max + 1,
                monsterId: randNum,
                name: this.monsterBook[randNum].name,
                hp: this.monsterBook[randNum].hp,
            })
        },
        attackMonster: function (index) {
            // 현재와 같은 문제가 시스템이 커지면서 매우 복잡해짐
            // 이와 같은 사항 때문에 강타입을 강제적으로 지정할 수 있는 typeScript가 부각된것임.
            this.list[index].hp = BigInt(this.list[index].hp) - BigInt(this.characterStatus.atk)

        },
        myDarknessDeathDestinyTypoonBlade: function (index) {
            console.log("어둠의 다크에서 죽음의 데스를 느끼며 " +
                "서쪽에서 불어오는 태풍을 맞았으니 " +
                "간닷! 다크니스 데스 데스티니 타이푼 블레이드!!!!!!!!!!!!")

            this.list[index].hp =
                BigInt(this.list[index].hp) -
                BigInt(
                    Math.floor(
                        this.characterStatus.atk * 50 +
                        this.characterStatus.str * 24 +
                        this.characterStatus.dex * 33 +
                        this.characterStatus.intelligence * 33
                    )
                )
        },
        myStealthDarkFlameDragonFear: function () {
            console.log("내안의 보이지 않는 어둠의 흑염룡이 울부짖었다!!! " +
                "스텔스 다크 플레임 드래곤 피어!!!!!")

            for (let i = 0; i < this.list.length; i++) {
                //this.list[i].hp = parseInt(this.list[i].hp - 1000) // 소수점 처리

                this.list[i].hp = BigInt(this.list[i].hp) - BigInt(100 * this.characterStatus.atk)
            }
            // 돌고있다가 beforeUpdate가 실행되서 사라지지않는게 있다.
        },
        addManyMonster: function() {
            for (let i = 0; i < 100; i++) {
                let max = this.list.reduce(function(a, b) {
                    return a > b.id ? a : b.id
                }, 0)

                let idx = Math.floor(Math.random() * this.monsterBook.length);

                console.log(max);

                this.list.push({
                    id: max + 1,
                    monsterId: idx,
                    name: this.monsterBook[idx].name,
                    hp: this.monsterBook[idx].hp,
                })
            }
        },
        removeMonster: function (index) {
            this.list.splice(index, 1)
        },
    },
    beforeUpdate () {
        console.log('VDOM의 변화를 감지하는 루틴')

        let i
        for (i = 0; i < this.list.length; i++) {
            if (this.list[i].hp <= 0) {
                for(let j = 0; j< this.monsterBook.length; j++){
                    if(this.list[i].monsterId === this.monsterBook[j].monsterId){
                        this.characterStatus.currentLevelBar += this.monsterBook[j].exp;
                        this.characterStatus.money += this.monsterBook[j].dropMoney;
                    }
                }
                this.list.splice(i, 1)
            }
        }

        let criteria = this.characterStatus.currentLevelBar

        for (; this.characterStatus.currentLevelBar >= this.characterStatus.totalLevelBar; ) {
            this.characterStatus.currentLevelBar =
                parseInt(this.characterStatus.currentLevelBar - this.characterStatus.totalLevelBar)

            this.characterStatus.level += 1
            this.characterStatus.hp *= 1.2
            this.characterStatus.mp *= 1.2
            this.characterStatus.defaultAtk += 3
            this.characterStatus.atk += 3
            this.characterStatus.def += 1
            this.characterStatus.str *= 1.2
            this.characterStatus.intelligence *= 1.2
            this.characterStatus.dex *= 1.2
            this.characterStatus.vit *= 1.2
            this.characterStatus.def *= 1.2
            this.characterStatus.men *= 1.2

            if (this.characterStatus.level < 10) {
                this.characterStatus.totalLevelBar =
                    parseInt(this.characterStatus.totalLevelBar * 1.1)
            } else if (this.characterStatus.level < 30) {
                this.characterStatus.totalLevelBar =
                    parseInt(this.characterStatus.totalLevelBar * 1.2)
            } else if (this.characterStatus.level < 50) {
                this.characterStatus.totalLevelBar =
                    parseInt(this.characterStatus.totalLevelBar * 1.3)
            } else if (this.characterStatus.level < 70) {
                this.characterStatus.totalLevelBar =
                    parseInt(this.characterStatus.totalLevelBar * 1.4)
            } else if (this.characterStatus.level < 80) {
                this.characterStatus.totalLevelBar =
                    parseInt(this.characterStatus.totalLevelBar * 1.5)
            } else if (this.characterStatus.level < 100) {
                this.characterStatus.totalLevelBar =
                    parseInt(this.characterStatus.totalLevelBar * 1.8)
            }
        }
    }
})