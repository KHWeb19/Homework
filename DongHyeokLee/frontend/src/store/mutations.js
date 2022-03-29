import {
    FETCH_PRODUCT_LIST,
    FETCH_PRODUCT
} from './mutation-types'

export default {
    [FETCH_PRODUCT_LIST] (state, products) {
        state.products = products
    },
    [FETCH_PRODUCT] (state, product) {
        state.product = product
    }
}