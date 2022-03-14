import {
    FETCH_MARKET_LIST,
    FETCH_MARKET
} from './mutation-types'

import axios from 'axios'
// npm install axios --save-dev

export default {
    fetchMarketList ({ commit }) {
        return axios.get('http://localhost:7777/13th/market/list') //여기로 정보 요청
                .then((res) => {
                    commit(FETCH_MARKET_LIST, res.data)
                })
    },
    fetchMarket ({ commit }, productNo) {
        return axios.get(`http://localhost:7777/13th/market/list/${productNo}`)
                .then((res) => {
                    commit(FETCH_MARKET, res.data)
                })
    }
}

//fetch 는 데이터 호출 속성이다.
    //서버 사이드 렌더링을 위해 서버에서 화면을 구성할 때 컴포넌트가 생성되고 나서 실행됨
    //브라우저에서 URL 주소를 변경해서 페이지를 이동할 때
