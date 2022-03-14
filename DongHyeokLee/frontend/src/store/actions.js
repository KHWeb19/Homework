import {
    FETCH_PRODUCT_LIST,
    FETCH_PRODUCT
} from './mutation-types'

import axios from 'axios'

export default {
    fetchProductList ({ commit }) {
        return axios.get('http://localhost:7777/13th/product/list')
                .then((res) => {
                    commit(FETCH_PRODUCT_LIST, res.data)
                })
    },
    fetchProduct ({ commit }, boardNo) {
        return axios.get(`http://localhost:7777/13th/product/${boardNo}`)
                .then((res) => {
                    commit(FETCH_PRODUCT, res.data)
                })
    }
}