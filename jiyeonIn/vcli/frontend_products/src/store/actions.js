import {
    FETCH_PRODUCT_LIST,
    FETCH_PRODUCT
} from './mutation-types'

import axios from 'axios'

export default {
    fetchProductList ({ commit }) {
        return axios.get('http://localhost:7777/vueproduct/list')
            .then((res) => {
                commit(FETCH_PRODUCT_LIST, res.data)
            })
    },
    fetchProduct ({ commit }, board_no) {
        return axios.get(`http://localhost:7777/vueproduct/${board_no}`)
                        .then((res) => {
                            commit(FETCH_PRODUCT, res.data)
                        })
    }
}