import {
    FETCH_BOARD_LIST,
    FETCH_BOARD,
    FETCH_JPA_BOARD_LIST,
    FETCH_JPA_BOARD,
    FETCH_BUSINESS_MEMBER,
    CRAWL_START
} from './mutation-types'

import axios from 'axios'
import router from '@/router'
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
    },
    fetchJpaBoardList ({ commit }) {
        return axios.get('http://localhost:7777/62th/board/list')
            .then((res) => {
                commit(FETCH_JPA_BOARD_LIST, res.data)
            })
    },
    fetchJpaBoard ({ commit }, boardNo) {
        return axios.get(`http://localhost:7777/62th/board/${boardNo}`)
            .then((res) => {
                commit(FETCH_JPA_BOARD, res.data)
            })
    },
    fetchBusinessMember ({ commit }) {
        return axios.get('http://localhost:7777/63th/jpaMember/checkBusiness')
            .then((res) => {
                commit(FETCH_BUSINESS_MEMBER, res.data)
            })
    },
    async crawlFind ({ commit }, category) {
        axios.get('http://localhost:7777/64th/crawl/' + `${category}`)
            .then(({ data }) => {
                commit(CRAWL_START, data)

                if (window.location.pathname !== '/daumNewsCrawl') {
                    router.push('/daumNewsCrawl')
                }
            })
    }
}