import {
    FETCH_BOARD_LIST,
    //FETCH_BOARD
} from './mutation-types'

import axios from 'axios'
// npm install axios --save-dev

export default {
    fetchBoardList ({ commit }) {
        return axios.get('http://localhost:7777/48th/vueboard/list')
            // service repository에 가서 db정보를 가지고 온다?
            // 그 결과가 res에 저장이 된다.
            .then((res) => {
                commit(FETCH_BOARD_LIST, res.data) // 그정보를 commit 하면서 mutation로 가져간다
                // res.data에 db에서 가져온 정보가 들어있다.
            })
    }
}