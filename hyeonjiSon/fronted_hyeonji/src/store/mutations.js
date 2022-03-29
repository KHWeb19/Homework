import { 
    FETCH_BOARD_LIST,
    FETCH_BOARD
} from './mutation-types'

//state를 변경시키는 역할을 한다.(mutation이 실행되어야 state도 변경된다.)

export default {
    [FETCH_BOARD_LIST] (state, boards) {
        state.boards = boards // 변수 boards 는 boards 다?
                   //변경되는 건 없는 건가
    },
    [FETCH_BOARD] (state, board) {
        state.board = board
    }
}