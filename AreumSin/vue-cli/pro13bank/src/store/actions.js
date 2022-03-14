import {
    FETCH_PRODUCT_LIST,
    FETCH_PRODUCT
} from './mutation-types'

import axios from 'axios'

export default {
    fetchProductList ({ commit }) {
        return axios.get('http://localhost:7777/homework/list')
            .then((res) => {
                commit(FETCH_PRODUCT_LIST, res.data)
            })
    },    fetchProduct ({ commit }, productNo) {
        return axios.get(`http://localhost:7777/homework/${productNo}`)
            .then((res) => {
                commit(FETCH_PRODUCT, res.data)
            })
    }
}