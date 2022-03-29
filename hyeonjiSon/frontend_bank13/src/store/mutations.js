import {
    FETCH_MARKET_LIST,
    FETCH_MARKET
} from './mutation-types'

//state를 변경시키는 역할을 한다.(mutation이 실행되어야 state도 변경된다.)

export default {
    [FETCH_MARKET_LIST] (state, markets) {
        state.markets = markets
    },
    [FETCH_MARKET] (state, market) {
        state.market = market
    }
}