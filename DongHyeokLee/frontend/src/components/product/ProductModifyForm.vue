<template>
    <div>
        <form @submit.prevent="onSubmit">
            <table border="1">
                <tr>
                    <td>게시물 번호</td>
                    <td>
                        <input type="text" :value="product.boardNo" disabled/>
                    </td>
                </tr>
                <tr>
                    <td>상품명</td>
                    <td>
                        <input type="text" v-model="productName"/>
                    </td>
                </tr>
                <tr>
                    <td>상품등록자</td>
                    <td>
                        <input type="text" :value="product.registrant" disabled/>
                    </td>
                </tr>
                <tr>
                    <td>등록일자</td>
                    <td>
                        <input type="text" :value="product.regDate" disabled/>
                    </td>
                </tr>
                <tr>
                    <td>상세설명</td>
                    <td>
                        <textarea cols="50" rows="20" v-model="viewDetails">
                        </textarea>
                    </td>
                </tr>
            </table>

            <div>
                <button type="submit">수정 완료</button>
                <router-link :to="{ name: 'ProductReadPage', 
                                    params: { boardNo: product.boardNo.toString() } }">
                    취소
                </router-link>
            </div>
        </form>
    </div>
</template>

<script>

export default {
    name: 'ProductModifyForm',
    props: {
        product: {
            type: Object,
            required: true
        }
    },
    data () {
        return {
            productName: '',
            viewDetails: ''
        }
    },
    methods: {
        onSubmit () {
            const { productName, viewDetails } = this
            this.$emit('submit', { productName, viewDetails })
        }
    },
    created () {
        this.productName = this.product.productName
        this.viewDetails = this.product.viewDetails
    }
}
</script>