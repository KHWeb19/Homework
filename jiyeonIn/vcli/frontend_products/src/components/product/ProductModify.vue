<template>
    <div>
        <form @submit.prevent="onSubmit">
            <table>
                <tr>
                    <td>게시물 번호</td>
                    <td>
                        <input type="text" :value="product.board_no" disabled/>
                    </td>
                </tr>
                <tr>
                    <td>제품명</td>
                    <td>
                        <input type="text" v-model="product_name" />
                    </td>
                </tr>
                <tr>
                    <td>업체명</td>
                    <td>
                    <input type="text" v-model="writer" />
                    </td>
                </tr>
                <tr>
                    <td>가격</td>
                    <td>
                        <input type="text" v-model="price" />
                    </td>
                </tr>
                 <tr>
                    <td>등록일자</td>
                    <td>
                    <input type="text" :value="product.reg_date" disabled/>
                    </td>
                </tr>
                <tr>
                    <td>상품설명</td>
                    <td>
                    <textarea cols="50" rows="20" v-model="content"></textarea>
                    </td>
                </tr>
        </table>

        <div>
            <button type="submit">수정완료</button>
            <router-link :to="{ name: 'ProductReadPage',
                                params: {board_no : product.board_no.toString()} }">
                    취소
            </router-link>
        </div>
        </form>
    </div>
</template>

<script>
    export default {
        name: 'ProductModify',
        props: {
            product: {
                type: Object,
                required: true
            }
        },
        data () {
            return {
                writer: '',
                product_name: '',
                price: '',
                content: ''
            }
        },
        methods: {
            onSubmit () {
                const { writer, product_name, price, content} = this
                this.$emit('submit',{writer,product_name, price, content})
            }
        },
        created () {
            this.writer = this.product.writer
            this.product_name = this.product.product_name
            this.price = this.product.price
            this.content = this.product.content
        }
    }
</script>
