<template>
    <form @submit.prevent="onsubmit">
        <table>
            <tr>
                <td>제품명</td>
                <td>
                    <input type="text" v-model="product_name"/>
                </td>
            </tr>
            <tr>
                <td>업체명</td>
                <td>
                <input type="text" v-model="writer"/>
                </td>
            </tr>
            <tr>
                <td>가격</td>
                <td>
                    <input type="text" v-model="price"/>
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
            <button type="submit">등록하기</button>
            <router-link :to="{ name: 'ProductListPage'}">돌아가기</router-link>
        </div>
    </form>
</template>


<script>
    export default {
        name: 'ProductRegisterForm',
        data () {
            return {
                product_name: '제품명을 입력하시오',
                writer: '업체명 입력하시오',
                price: '가격을 입력하시오',
                content: '상품 설명을 입력하시오'
            }
        },
        methods: {
            onsubmit () {
                const { product_name, writer, price, content } = this
                this.$emit('submit', {product_name, writer, price, content })
            }
        }
        
    }
</script>