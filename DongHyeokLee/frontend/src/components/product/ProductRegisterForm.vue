<template>
    <form @submit.prevent="onSubmit">
        <table border="1">
            <tr>
                <td>상품명</td>
                <td>
                    <input type="text" v-model="productName"/>
                </td>
            </tr>
            <tr>
                <td>상품등록자</td>
                <td>
                    <input type="text" v-model="registrant"/>
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
            <button type="submit">등록</button>
            <router-link :to="{ name: 'ProductListPage' }">
                취소
            </router-link>
        </div>
    </form>
</template>

<script>

export default {
    name: 'ProductRegisterForm',
    data () {
        return {
            productName: '상품 이름을 작성하세요.',
            registrant: '본인',
            viewDetails: '상품 설명을 작성하세요.'
        }
    },
    methods: {
        onSubmit () {
            const { productName, registrant, viewDetails } = this
            this.$emit('submit', { productName, registrant, viewDetails })
        }
    }
}
</script>