import {
    FETCH_BOARD_LIST,
    FETCH_BOARD
} from '/mutation-types'

import axios from 'axios';
// npm install axios --save-dev

export default {
    fetchBoardList ({ commit }) {
        return axios.get('http://localhost:7777/48th/vueboard/list') //spring에서 받아옴
                .then((res) => { 
                    commit(FETCH_BOARD_LIST, res.data) // commit하면 mutation.js로 데이터가 넘어간다. 
                })
    }
}