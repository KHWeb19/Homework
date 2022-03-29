<template>
    <div>
        <table border="1">
            <tr>
                <td>게시물 번호</td>
                <td>
                    <input type="text" :value="product.boardNo" readonly/>
                </td>
            </tr>
            <tr>
                <td>상품명</td>
                <td>
                    <input type="text" :value="product.productName" readonly/>
                </td>
            </tr>
            <tr>
                <td>상품등록자</td>
                <td>
                    <input type="text" :value="product.registrant" readonly/>
                </td>
            </tr>
            <tr>
                <td>등록일자</td>
                <td>
                    <input type="text" :value="product.regDate" readonly/>
                </td>
            </tr>
            <tr>
                <td>상세설명</td>
                <td>
                    <textarea cols="50" rows="20" :value="product.viewDetails" readonly>
                    </textarea>
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