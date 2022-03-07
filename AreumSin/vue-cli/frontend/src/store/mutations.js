// states에서 넘어온 정보만 세팅
import {
    FETCH_BOARD_LIST, // 그냥 타입 지정, 없어도 문제는 없다.
    //FETCH_BOARD
} from './mutation-types'

export default {
    [FETCH_BOARD_LIST] (state, boards) {
        state.boards = boards // 넘어온 정보를 state.boards에 저장
    }
}