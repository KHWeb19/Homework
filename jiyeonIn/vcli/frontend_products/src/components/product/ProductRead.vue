<template>
    <div>
        <table>
            <tr>
                <td>게시물 번호</td>
                <td>
                    <input type="text" :value="product.board_no" readonly/>
                </td>
            </tr>
            <tr>
                <td>제품명</td>
                <td>
                    <input type="text" :value="product.product_name" readonly/>
                </td>
            </tr>
            <tr>
                <td>업체명</td>
                <td>
                <input type="text" :value="product.writer" readonly/>
                </td>
            </tr>
            <tr>
                <td>가격</td>
                <td>
                    <input type="text" :value="product.price" readonly/>
                </td>
            </tr>
            <tr>
                <td>등록일자</td>
                <td>
                    <input type="text" :value="product.reg_date" readonly/>
                </td>
            </tr>
            <tr>
                <td>상품설명</td>
                <td>
                <textarea cols="50" rows="20" :value="product.content" readonly></textarea>
                </td>
            </tr>
        </table>
    </div>
</template>

<script>
export default {
name: 'ProductRead',
props: {
    product: {
        type: Object,
        required: true
        }
    }
}
</script>

<style>

input {
    background: #fdeaf7;
}

textarea {
        background: #fdeaf7;
}

</style>