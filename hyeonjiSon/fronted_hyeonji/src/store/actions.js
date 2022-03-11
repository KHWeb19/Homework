import {
    FETCH_BOARD_LIST,
    FETCH_BOARD
} from './mutation-types'

import axios from 'axios'
// npm install axios --save-dev

export default {
    fetchBoardList ({ commit }) {
        return axios.get('http://localhost:7777/order48/vueboard/list') //여기로 정보 요청
                              //스프링 컨트롤러가 정보를 수신한다.
                .then((res) => { //스프링이 return한 결과는 res로 들어간다.
                    commit(FETCH_BOARD_LIST, res.data) //mutations의 인자로 들어간다.
                })
    },
    fetchBoard ({ commit }, boardNo) {
        return axios.get(`http://localhost:7777/order49/vueboard/${boardNo}`)
                .then((res) => {
                    commit(FETCH_BOARD, res.data)
                })
    }
}