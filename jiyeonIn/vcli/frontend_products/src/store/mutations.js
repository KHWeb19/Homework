import {
    FETCH_PRODUCT,
    FETCH_PRODUCT_LIST
} from './mutation-types'

export default {
    [FETCH_PRODUCT_LIST] (state, products) {
        state.products = products
    },
    [FETCH_PRODUCT] (state, product) {
        state.product = product
        }
}