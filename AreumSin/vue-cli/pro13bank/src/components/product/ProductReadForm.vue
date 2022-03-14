<template>
  <div>
    <table>
      <tr>
        <td>상품 번호</td>
        <td>
          <input type="text" name="productNo" :value="product.productNo" readonly="readonly"/>
        </td>
      </tr>
      <tr>
        <td>상품명</td>
        <td>
          <input type="text" name="title" :value="product.title" readonly="readonly"/>
        </td>
      </tr>
      <tr>
        <td>작성자</td>
        <td>
          <input type="text" name="writer" :value="product.writer" readonly="readonly"/>
        </td>
      </tr>
      <tr>
        <td>가격</td>
        <td>
          <input type="text" name="price" :value="product.price" readonly="readonly"/>
        </td>
      </tr>
      <tr>
        <td>등록일자</td>
        <td>
          <input type="text" :value="product.regDate" readonly/>
        </td>
      </tr>
      <tr>
        <td>제품 상세 설명</td>
        <td>
          <input type="text" name="description" :value="product.description" readonly="readonly"/>
        </td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  name: "ProductReadForm",
  props: {
    product: {
      type: Object,
      require: true
    }
  }
}
</script>

<style scoped>

</style>