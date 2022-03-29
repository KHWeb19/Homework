import {
    FETCH_BOARD_LIST,
    
} from './mutation-types'

export default {
    [FETCH_BOARD_LIST] (state, boards) {
        state.boards = boards
    }
}