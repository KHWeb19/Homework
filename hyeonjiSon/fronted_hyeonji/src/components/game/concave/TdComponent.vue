<template>
    <div>
        <!-- @: v-on을 줄여서 대체한 표시
        {{ }} : Mustache(이중 중괄호)는 데이터 바인딩의 가장 기본적인 형태이다.
                이 태그는 해당 데이터 객체의 {{ msg }} msg 속성 값으로 대체된다.
                또한, 데이터 객체의 msg 속성이 변경될 때마다 갱신된다.
        
            td(열)에 '클릭' 이벤트가 발생한다면
                = onClickTd가 실행된다. 이때 값은 cellData 속성 값으로 대체된다는 뜻?
            -->
        <td @click="onClickTd">{{ cellData }}</td>
    </div>
</template>

<script>
export default {
//export default란? export(직역=내보내기) 페이지 당사자(default)가 내보내는 것들...이라는 거겠지?
                    //다른 파일의 있는 내용을 참조 해 오기 위한 방식.
                    //한 모듈당 export default는 한 개만 넣어주자!
    data () { //export될 data
        return { 
            game: {
                propTurn: this.turn, 
                propWin: this.winner
            }
        }
    },
    props: {
        cellData: String,
        cellIndex: Number,
        rowIndex: Number,
        tableData: Array,
        turn: String,
        winner: String
    },
    methods: {
        onClickTd () {
            if (this.cellData) { //이미 말이 놓인 칸을 클릭한 경우
                return //return되는 값이 없음 = 아무 동작도 일어나지 않는다.
            }
                //$set(): "(배열이나 객체의)값이 갱신되었다." 고 요청을 하는 메서드 = Vue.set()
            this.$set(this.tableData[this.rowIndex], this.cellIndex, this.turn)
                    //[해당.열의 인덱스]에 대한 테이블 데이터 값, 셀의 번호, turn('O', 'X')String 값이 갱신되었다고 요청

                //emit: 한칸 위, 상위 폴더로 올린다는 뜻. 여기에서는 tr로 올리게 된다.
            this.$emit('updateWinner', '')
                    //'판정된 승자를 가리키는 String'과 ...이건 뭐지? OX인가 이것도?
                    //아무래도 data의 trun하고 win인 거겠지?

            let win = false
            if (
                this.tableData[this.rowIndex][0] === this.turn &&
                this.tableData[this.rowIndex][1] === this.turn &&
                this.tableData[this.rowIndex][2] === this.turn
            ) {
                win = true
            } else if (
                this.tableData[0][this.cellIndex] === this.turn &&
                this.tableData[1][this.cellIndex] === this.turn &&
                this.tableData[2][this.cellIndex] === this.turn
            ) {
                win = true
            } else if (
                this.tableData[0][0] === this.turn &&
                this.tableData[1][1] === this.turn &&
                this.tableData[2][2] === this.turn
            ) {
                win = true
            } else if (
                this.tableData[0][2] === this.turn &&
                this.tableData[1][1] === this.turn &&
                this.tableData[2][0] === this.turn
            ) {
                win = true
            }
            this.game.propTurn = this.turn === 'O' ? 'X' : 'O' //O가 참인가 라는 조건문에? 참일때 X : 거짓일 때 O
            if (win) { //이긴 경우
                this.game.propWin = this.turn
                this.$emit('updateWinner', this.game.propWin)
                this.$emit('updateTurn', this.game.propTurn)
                this.$emit('updateTableData')
            } else { //그 외(무승부) //머리가 안돌아가서 지금 이부분 이해하기가 좀 어렵네...
                let all = true
                this.tableData.forEach(row => {
                    row.forEach(cell => {
                        if (!cell) {
                            all = false
                        }
                    })
                })
                if (all) {
                    this.propWin = ''
                    this.$emit('updateTurn', this.game.propTurn)
                    this.$emit('updateTableData')
                } else {
                    this.$emit('updateTurn', this.game.propTurn)
                }
            }
        }
    }
}
</script>

<style scoped>
table {
    border-collapse: collapse;
}
td {
    border: 1px solid black;
    width: 80px;
    height: 80px;
    text-align: center;
}
</style>