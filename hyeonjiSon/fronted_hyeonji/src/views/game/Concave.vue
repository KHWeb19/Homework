<template>
    <div>
        <!-- trun <- O, X가 번갈아가며 값으로 출력된다. -->
        <div>{{ turn }} 님의 턴입니다.</div>
        <!-- 판떼기 클릭 상황 고려 -->
        <table-component :table-data="tableData" 
                        :turn="turn"
                        :winner="winner"
                        v-on:updateTurn="updateTurn"
                        v-on:updateTableData="updateTableData"
                        v-on:updateWinner="updateWinner">
                    <!-- 테이블-블록의 화면 구성
                        1. 테이블 데이터가 출력
                        2. turn의 값을 출력
                        3. winner 값을 출력
                    v-on: 이벤트="메소트이름" 즉,
                        - 턴 순서를 업데이트하여 안내하는 메소드
                        - 테이블 데이터를 업데이트하는 메소드
                        - 승자를 판정하는 업데이트 메소드
                     -->
        </table-component>
        <div v-if="winner">{{ winner }} 님의 승리!</div>
    </div>
</template>

<script>
import TableComponent from '@/components/game/concave/TableComponent.vue'
 //가져오기 - TableComponent라는 파일을 from 작은 따옴표 내의 경로에서.
 //views의 vue 파일 내부에서 component로 호출하는 vue파일들은 모두 component폴더에 위치해야 한다.
export default {
    components: {
        TableComponent
    },
    data () { //TableComponent의 data들
        return {
            turn: 'O',
            winner: '', //이 작은 따옴표 안의 내용이 그냥 빈 게 아니라 가변적으로 값이 출력될 수 있는 듯.
            tableData: [
                ['', '', ''],
                ['', '', ''],
                ['', '', '']
            ]
        }
    },
    methods: {
        updateTurn (val) {
            this.turn = val
        },
        updateTableData () {
            this.tableData = [
                ['', '', ''],
                ['', '', ''],
                ['', '', '']
            ]
        },
        updateWinner (val) {
            this.winner = val
        }
    }
}
</script>